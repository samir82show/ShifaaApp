package entity.domain;

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
@StaticMetamodel(Insurance.class)
public class Insurance_ { 

    public static volatile SingularAttribute<Insurance, String> image;
    public static volatile ListAttribute<Insurance, Hospital> hospitals;
    public static volatile SingularAttribute<Insurance, String> inArabic;
    public static volatile SingularAttribute<Insurance, String> name;
    public static volatile SingularAttribute<Insurance, Long> id;

}