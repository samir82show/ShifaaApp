package entity.domain;

import entity.domain.DaysOfWeek;
import entity.domain.Gender;
import entity.domain.Hospital;
import entity.domain.Shift;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-08T11:41:59")
@StaticMetamodel(Appointment.class)
public class Appointment_ { 

    public static volatile SingularAttribute<Appointment, Gender> gender;
    public static volatile SingularAttribute<Appointment, String> phone;
    public static volatile SingularAttribute<Appointment, String> DOB;
    public static volatile SingularAttribute<Appointment, String> name;
    public static volatile SingularAttribute<Appointment, String> description;
    public static volatile SingularAttribute<Appointment, Gender> doctorGender;
    public static volatile SingularAttribute<Appointment, Long> id;
    public static volatile SingularAttribute<Appointment, Hospital> hospital;
    public static volatile ListAttribute<Appointment, DaysOfWeek> daysOfWeeks;
    public static volatile SingularAttribute<Appointment, String> email;
    public static volatile SingularAttribute<Appointment, Shift> morningOrEvening;

}