package com.yztcedu.a10_17_retrofit;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by My on 2016/10/17.
 */
public interface MyRetrofitApi {

    //此接口包含所有进行网络连接的方法，方法包含三个主要内容
    //GET是注解，表示下面的网络连接使用的方法是GET
    @GET("square/retrofit")
    Call<ResponseBody> getHttp();
}
