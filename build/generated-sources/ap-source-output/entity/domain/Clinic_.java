package entity.domain;

import entity.domain.Category;
import entity.domain.ClinicService;
import entity.domain.Doctor;
import entity.domain.Hospital;
import entity.domain.Offer;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-04-11T00:10:57")
@StaticMetamodel(Clinic.class)
public class Clinic_ { 

    public static volatile ListAttribute<Clinic, Offer> offers;
    public static volatile SingularAttribute<Clinic, String> workingDaysHoursArabic;
    public static volatile ListAttribute<Clinic, ClinicService> clinicServices;
    public static volatile ListAttribute<Clinic, Doctor> doctors;
    public static volatile SingularAttribute<Clinic, String> workingDaysHours;
    public static volatile SingularAttribute<Clinic, Long> id;
    public static volatile SingularAttribute<Clinic, Hospital> hospital;
    public static volatile SingularAttribute<Clinic, Category> category;

}