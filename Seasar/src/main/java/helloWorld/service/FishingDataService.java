//package helloWorld.service;
//
//import helloWorld.entity.FishingData;
//import java.util.List;
//import javax.annotation.Generated;
//
//import static helloWorld.entity.FishingDataNames.*;
//import static org.seasar.extension.jdbc.operation.Operations.*;
//
///**
// * {@link FishingData}のサービスクラスです。
// * 
// */
//@Generated(value = {"S2JDBC-Gen 2.4.45", "org.seasar.extension.jdbc.gen.internal.model.ServiceModelFactoryImpl"}, date = "2012/10/24 17:36:59")
//public class FishingDataService extends AbstractService<FishingData> {
//
//    /**
//     * 識別子でエンティティを検索します。
//     * 
//     * @param date
//     *            識別子
//     * @param fishCode
//     *            識別子
//     * @return エンティティ
//     */
//    public FishingData findById(String date, String fishCode) {
//        return select().id(date, fishCode).getSingleResult();
//    }
//
//    /**
//     * 識別子の昇順ですべてのエンティティを検索します。
//     * 
//     * @return エンティティのリスト
//     */
//    public List<FishingData> findAllOrderById() {
//        return select().orderBy(asc(date()), asc(fishCode())).getResultList();
//    }
//}


package helloWorld.service;

import org.seasar.extension.jdbc.service.S2AbstractService;
import helloWorld.entity.FishingData;
import java.util.List;
import javax.annotation.Generated;

import static helloWorld.entity.FishingDataNames.*;
import static org.seasar.extension.jdbc.operation.Operations.*;
public class FishingDataService extends S2AbstractService<FishingData> {
    /**
     * 識別子でエンティティを検索します。
     * 
     * @param date
     *            識別子
     * @param fishCode
     *            識別子
     * @return エンティティ
     */
    public FishingData findById(String date, String fishCode) {
        return select().id(date, fishCode).getSingleResult();
    }

    /**
     * 識別子の昇順ですべてのエンティティを検索します。
     * 
     * @return エンティティのリスト
     */
    public List<FishingData> findAllOrderById() {
        return select().orderBy(asc(date()), asc(fishCode())).getResultList();
    }
}
