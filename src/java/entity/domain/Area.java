package entity.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Area implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Basic
    private String name;

    @Basic
    private String inArabic;

    @OneToMany(mappedBy = "area")
    private List<Hospital> hospitals;

    public Area() {
    }

    public String getInArabic() {
        return inArabic;
    }

    public void setInArabic(String inArabic) {
        this.inArabic = inArabic;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Hospital> getHospitals() {
        if (hospitals == null) {
            hospitals = new ArrayList<>();
        }
        return this.hospitals;
    }

    public void setHospitals(List<Hospital> hospitals) {
        this.hospitals = hospitals;
    }

    public void addHospital(Hospital hospital) {
        getHospitals().add(hospital);
        hospital.setArea(this);
    }

    public void removeHospital(Hospital hospital) {
        getHospitals().remove(hospital);
        hospital.setArea(null);
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Area other = (Area) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return name;
    }

    
}