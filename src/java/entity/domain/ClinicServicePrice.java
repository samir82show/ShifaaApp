/**
 * This file was generated by the Jeddict
 */
package entity.domain;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * @author sawad
 */
@Entity
public class ClinicServicePrice {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Basic
    private String price;

    @Basic
    private String discount;

    @ManyToOne
    private ClinicService clinicService;

    @ManyToOne
    private Clinic clinic;

    @ManyToOne
    private Hospital hospital;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPrice() {
        return this.price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDiscount() {
        return this.discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public ClinicService getClinicService() {
        return this.clinicService;
    }

    public void setClinicService(ClinicService clinicService) {
        this.clinicService = clinicService;
    }

    public Clinic getClinic() {
        return this.clinic;
    }

    public void setClinic(Clinic clinic) {
        this.clinic = clinic;
    }

    public Hospital getHospital() {
        return this.hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

}