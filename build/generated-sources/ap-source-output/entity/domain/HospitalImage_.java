package entity.domain;

import entity.domain.Hospital;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-12-13T08:48:35")
@StaticMetamodel(HospitalImage.class)
public class HospitalImage_ { 

    public static volatile SingularAttribute<HospitalImage, String> image;
    public static volatile SingularAttribute<HospitalImage, Long> id;
    public static volatile SingularAttribute<HospitalImage, Hospital> hospital;
    public static volatile SingularAttribute<HospitalImage, String> imageType;

}