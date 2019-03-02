package entity.domain;

import entity.domain.Category;
import entity.domain.ClinicService;
import entity.domain.Doctor;
import entity.domain.Hospital;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-03-03T00:09:59")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-02-21T16:08:07")
>>>>>>> f240c93a6a45d7eb88cd0113d6b11de1c79b60ea
@StaticMetamodel(Clinic.class)
public class Clinic_ { 

    public static volatile SingularAttribute<Clinic, String> workingDaysHoursArabic;
    public static volatile ListAttribute<Clinic, ClinicService> clinicServices;
    public static volatile ListAttribute<Clinic, Doctor> doctors;
    public static volatile SingularAttribute<Clinic, String> workingDaysHours;
    public static volatile SingularAttribute<Clinic, Long> id;
    public static volatile SingularAttribute<Clinic, Hospital> hospital;
    public static volatile SingularAttribute<Clinic, Category> category;

}