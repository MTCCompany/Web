package helloWorld.entity;

import java.io.Serializable;
import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;

/**
 * FishingDataエンティティクラス
 * 
 */
@Entity
@Generated(value = {"S2JDBC-Gen 2.4.45", "org.seasar.extension.jdbc.gen.internal.model.EntityModelFactoryImpl"}, date = "2012/10/24 17:36:52")
public class FishingData implements Serializable {

    private static final long serialVersionUID = 1L;

    /** dateプロパティ */
    @Id
    @Column(length = 10, nullable = false, unique = false)
    public String date;

    /** pointプロパティ */
    @Lob
    @Column(length = 65535, nullable = true, unique = false)
    public String point;

    /** todayWeatherプロパティ */
    @Column(length = 20, nullable = true, unique = false)
    public String todayWeather;

    /** prevWeatherプロパティ */
    @Column(length = 20, nullable = true, unique = false)
    public String prevWeather;

    /** todayTempプロパティ */
    @Column(length = 6, nullable = true, unique = false)
    public String todayTemp;

    /** prevTempプロパティ */
    @Column(length = 6, nullable = true, unique = false)
    public String prevTemp;

    /** waterTempプロパティ */
    @Column(length = 6, nullable = true, unique = false)
    public String waterTemp;

    /** fishCodeプロパティ */
    @Id
    @Column(length = 4, nullable = false, unique = false)
    public String fishCode;

    /** fishNameプロパティ */
    @Column(length = 50, nullable = true, unique = false)
    public String fishName;

    /** fishCountプロパティ */
    @Column(precision = 10, nullable = true, unique = false)
    public Integer fishCount;

    /** tackleプロパティ */
    @Lob
    @Column(length = 65535, nullable = true, unique = false)
    public String tackle;

    /** remarkプロパティ */
    @Lob
    @Column(length = 65535, nullable = true, unique = false)
    public String remark;
}