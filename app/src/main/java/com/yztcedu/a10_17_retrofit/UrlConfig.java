package com.yztcedu.a10_17_retrofit;

/**
 * Created by My on 2016/10/17.
 */
public class UrlConfig {

    public static final String BASE_URL="http://qt.qq.com/";

    public static class path{
        public static final String GET_NEWS="php_cgi/news/php/varcache_getnews.php";
    }
    public static class param{
        public static final String ID="id";
        public static final String PAGE="page";
        public static final String PLAT="plat";
        public static final String VERSION="version";
    }
    public static class DefaultValue{
        public static final String PAGE="0";
        public static final String PLAT="ios";
        public static final String VERSION="33";
    }
}
