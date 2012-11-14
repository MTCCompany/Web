package helloWorld.entity;

import javax.annotation.Generated;
import org.seasar.extension.jdbc.name.PropertyName;

/**
 * {@link FishingData}のプロパティ名の集合です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.45", "org.seasar.extension.jdbc.gen.internal.model.NamesModelFactoryImpl"}, date = "2012/11/14 15:03:20")
public class FishingDataNames {

    /**
     * dateのプロパティ名を返します。
     * 
     * @return dateのプロパティ名
     */
    public static PropertyName<String> date() {
        return new PropertyName<String>("date");
    }

    /**
     * pointのプロパティ名を返します。
     * 
     * @return pointのプロパティ名
     */
    public static PropertyName<String> point() {
        return new PropertyName<String>("point");
    }

    /**
     * todayWeatherのプロパティ名を返します。
     * 
     * @return todayWeatherのプロパティ名
     */
    public static PropertyName<String> todayWeather() {
        return new PropertyName<String>("todayWeather");
    }

    /**
     * prevWeatherのプロパティ名を返します。
     * 
     * @return prevWeatherのプロパティ名
     */
    public static PropertyName<String> prevWeather() {
        return new PropertyName<String>("prevWeather");
    }

    /**
     * todayTempのプロパティ名を返します。
     * 
     * @return todayTempのプロパティ名
     */
    public static PropertyName<String> todayTemp() {
        return new PropertyName<String>("todayTemp");
    }

    /**
     * prevTempのプロパティ名を返します。
     * 
     * @return prevTempのプロパティ名
     */
    public static PropertyName<String> prevTemp() {
        return new PropertyName<String>("prevTemp");
    }

    /**
     * waterTempのプロパティ名を返します。
     * 
     * @return waterTempのプロパティ名
     */
    public static PropertyName<String> waterTemp() {
        return new PropertyName<String>("waterTemp");
    }

    /**
     * fishCodeのプロパティ名を返します。
     * 
     * @return fishCodeのプロパティ名
     */
    public static PropertyName<String> fishCode() {
        return new PropertyName<String>("fishCode");
    }

    /**
     * fishNameのプロパティ名を返します。
     * 
     * @return fishNameのプロパティ名
     */
    public static PropertyName<String> fishName() {
        return new PropertyName<String>("fishName");
    }

    /**
     * fishCountのプロパティ名を返します。
     * 
     * @return fishCountのプロパティ名
     */
    public static PropertyName<Integer> fishCount() {
        return new PropertyName<Integer>("fishCount");
    }

    /**
     * tackleのプロパティ名を返します。
     * 
     * @return tackleのプロパティ名
     */
    public static PropertyName<String> tackle() {
        return new PropertyName<String>("tackle");
    }

    /**
     * remarkのプロパティ名を返します。
     * 
     * @return remarkのプロパティ名
     */
    public static PropertyName<String> remark() {
        return new PropertyName<String>("remark");
    }

    /**
     * @author S2JDBC-Gen
     */
    public static class _FishingDataNames extends PropertyName<FishingData> {

        /**
         * インスタンスを構築します。
         */
        public _FishingDataNames() {
        }

        /**
         * インスタンスを構築します。
         * 
         * @param name
         *            名前
         */
        public _FishingDataNames(final String name) {
            super(name);
        }

        /**
         * インスタンスを構築します。
         * 
         * @param parent
         *            親
         * @param name
         *            名前
         */
        public _FishingDataNames(final PropertyName<?> parent, final String name) {
            super(parent, name);
        }

        /**
         * dateのプロパティ名を返します。
         *
         * @return dateのプロパティ名
         */
        public PropertyName<String> date() {
            return new PropertyName<String>(this, "date");
        }

        /**
         * pointのプロパティ名を返します。
         *
         * @return pointのプロパティ名
         */
        public PropertyName<String> point() {
            return new PropertyName<String>(this, "point");
        }

        /**
         * todayWeatherのプロパティ名を返します。
         *
         * @return todayWeatherのプロパティ名
         */
        public PropertyName<String> todayWeather() {
            return new PropertyName<String>(this, "todayWeather");
        }

        /**
         * prevWeatherのプロパティ名を返します。
         *
         * @return prevWeatherのプロパティ名
         */
        public PropertyName<String> prevWeather() {
            return new PropertyName<String>(this, "prevWeather");
        }

        /**
         * todayTempのプロパティ名を返します。
         *
         * @return todayTempのプロパティ名
         */
        public PropertyName<String> todayTemp() {
            return new PropertyName<String>(this, "todayTemp");
        }

        /**
         * prevTempのプロパティ名を返します。
         *
         * @return prevTempのプロパティ名
         */
        public PropertyName<String> prevTemp() {
            return new PropertyName<String>(this, "prevTemp");
        }

        /**
         * waterTempのプロパティ名を返します。
         *
         * @return waterTempのプロパティ名
         */
        public PropertyName<String> waterTemp() {
            return new PropertyName<String>(this, "waterTemp");
        }

        /**
         * fishCodeのプロパティ名を返します。
         *
         * @return fishCodeのプロパティ名
         */
        public PropertyName<String> fishCode() {
            return new PropertyName<String>(this, "fishCode");
        }

        /**
         * fishNameのプロパティ名を返します。
         *
         * @return fishNameのプロパティ名
         */
        public PropertyName<String> fishName() {
            return new PropertyName<String>(this, "fishName");
        }

        /**
         * fishCountのプロパティ名を返します。
         *
         * @return fishCountのプロパティ名
         */
        public PropertyName<Integer> fishCount() {
            return new PropertyName<Integer>(this, "fishCount");
        }

        /**
         * tackleのプロパティ名を返します。
         *
         * @return tackleのプロパティ名
         */
        public PropertyName<String> tackle() {
            return new PropertyName<String>(this, "tackle");
        }

        /**
         * remarkのプロパティ名を返します。
         *
         * @return remarkのプロパティ名
         */
        public PropertyName<String> remark() {
            return new PropertyName<String>(this, "remark");
        }
    }
}