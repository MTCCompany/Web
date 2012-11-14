package helloWorld.service;

import javax.annotation.Generated;
import org.seasar.extension.unit.S2TestCase;

/**
 * {@link FishingDataService}のテストクラスです。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.45", "org.seasar.extension.jdbc.gen.internal.model.ServiceTestModelFactoryImpl"}, date = "2012/10/24 17:37:03")
public class FishingDataServiceTest extends S2TestCase {

    private FishingDataService fishingDataService;

    /**
     * 事前処理をします。
     * 
     * @throws Exception
     */
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        include("app.dicon");
    }

    /**
     * {@link #fishingDataService}が利用可能であることをテストします。
     * 
     * @throws Exception
     */
    public void testAvailable() throws Exception {
        assertNotNull(fishingDataService);
    }
}