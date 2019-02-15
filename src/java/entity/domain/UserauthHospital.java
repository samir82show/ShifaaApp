/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity.domain;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Samir
 */
@Entity
@Table(name = "userauth_hospital")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UserauthHospital.findAll", query = "SELECT u FROM UserauthHospital u")
    , @NamedQuery(name = "UserauthHospital.findById", query = "SELECT u FROM UserauthHospital u WHERE u.id = :id")
    , @NamedQuery(name = "UserauthHospital.findByEmail", query = "SELECT u FROM UserauthHospital u WHERE u.email = :email")
    , @NamedQuery(name = "UserauthHospital.findByEmailPassword", query = "SELECT u FROM UserauthHospital u WHERE u.email = :email AND u.password = :password")
    , @NamedQuery(name = "UserauthHospital.findByPassword", query = "SELECT u FROM UserauthHospital u WHERE u.password = :password")
    , @NamedQuery(name = "UserauthHospital.findByHospitalName", query = "SELECT u FROM UserauthHospital u WHERE u.hospitalName = :hospitalName")})
public class UserauthHospital implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "id")
    @Id
    private BigInteger id;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 255)
    @Column(name = "email")
    private String email;
    @Size(max = 255)
    @Column(name = "password")
    private String password;
    @Size(max = 255)
    @Column(name = "hospital_name")
    private String hospitalName;

    public UserauthHospital() {
    }

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }
    
}
