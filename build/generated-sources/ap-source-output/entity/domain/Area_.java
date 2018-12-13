package entity.domain;

import entity.domain.Hospital;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-12-12T17:54:41")
@StaticMetamodel(Area.class)
public class Area_ { 

    public static volatile ListAttribute<Area, Hospital> hospitals;
    public static volatile SingularAttribute<Area, String> inArabic;
    public static volatile SingularAttribute<Area, String> name;
    public static volatile SingularAttribute<Area, Long> id;

}