package entity.domain;

import entity.domain.DaysOfWeek;
import entity.domain.Gender;
import entity.domain.Hospital;
import entity.domain.Shift;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-03-03T00:09:59")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-02-21T16:08:07")
>>>>>>> f240c93a6a45d7eb88cd0113d6b11de1c79b60ea
@StaticMetamodel(Appointment.class)
public class Appointment_ { 

    public static volatile SingularAttribute<Appointment, Gender> gender;
    public static volatile SingularAttribute<Appointment, String> phone;
    public static volatile SingularAttribute<Appointment, String> inArabic;
    public static volatile SingularAttribute<Appointment, Date> DOB;
    public static volatile SingularAttribute<Appointment, String> name;
    public static volatile SingularAttribute<Appointment, String> description;
    public static volatile SingularAttribute<Appointment, Gender> doctorGender;
    public static volatile SingularAttribute<Appointment, Long> id;
    public static volatile SingularAttribute<Appointment, Hospital> hospital;
    public static volatile ListAttribute<Appointment, DaysOfWeek> daysOfWeeks;
    public static volatile SingularAttribute<Appointment, String> email;
    public static volatile SingularAttribute<Appointment, Shift> morningOrEvening;

}