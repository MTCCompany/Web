package helloWorld.entity;

import helloWorld.entity.FishingDataNames._FishingDataNames;
import javax.annotation.Generated;

/**
 * 名前クラスの集約です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.45", "org.seasar.extension.jdbc.gen.internal.model.NamesAggregateModelFactoryImpl"}, date = "2012/11/14 15:03:20")
public class Names {

    /**
     * {@link FishingData}の名前クラスを返します。
     * 
     * @return FishingDataの名前クラス
     */
    public static _FishingDataNames fishingData() {
        return new _FishingDataNames();
    }
}