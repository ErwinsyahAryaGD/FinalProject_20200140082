/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UAS.C.webserviceuas;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author USER
 */
@Entity
@Table(name = "biodata")
@NamedQueries({
    @NamedQuery(name = "Biodata.findAll", query = "SELECT b FROM Biodata b"),
    @NamedQuery(name = "Biodata.findById", query = "SELECT b FROM Biodata b WHERE b.id = :id"),
    @NamedQuery(name = "Biodata.findByName", query = "SELECT b FROM Biodata b WHERE b.name = :name"),
    @NamedQuery(name = "Biodata.findByNik", query = "SELECT b FROM Biodata b WHERE b.nik = :nik"),
    @NamedQuery(name = "Biodata.findByAddress", query = "SELECT b FROM Biodata b WHERE b.address = :address")})
public class Biodata implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Id")
    private Integer id;
    @Column(name = "Name")
    private String name;
    @Column(name = "NIK")
    private Integer nik;
    @Column(name = "Address")
    private String address;
    @Lob
    @Column(name = "Photo")
    private byte[] photo;

    public Biodata() {
    }

    public Biodata(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNik() {
        return nik;
    }

    public void setNik(Integer nik) {
        this.nik = nik;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Biodata)) {
            return false;
        }
        Biodata other = (Biodata) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "UAS.C.webserviceuas.Biodata[ id=" + id + " ]";
    }
    
}
