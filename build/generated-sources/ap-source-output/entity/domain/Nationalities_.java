package entity.domain;

import entity.domain.Doctor;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-04-11T00:10:57")
@StaticMetamodel(Nationalities.class)
public class Nationalities_ { 

    public static volatile SingularAttribute<Nationalities, String> inarabic;
    public static volatile ListAttribute<Nationalities, Doctor> doctors;
    public static volatile SingularAttribute<Nationalities, String> name;

}