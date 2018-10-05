package entity.domain;

import entity.domain.ClinicServicePrice;
import entity.domain.Doctor;
import entity.domain.Hospital;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-05T12:49:27")
@StaticMetamodel(Clinic.class)
public class Clinic_ { 

    public static volatile SingularAttribute<Clinic, String> image;
    public static volatile ListAttribute<Clinic, Hospital> hospitals;
    public static volatile ListAttribute<Clinic, ClinicServicePrice> clinicServicePrices;
    public static volatile ListAttribute<Clinic, Doctor> doctors;
    public static volatile SingularAttribute<Clinic, String> name;
    public static volatile SingularAttribute<Clinic, Long> id;

}