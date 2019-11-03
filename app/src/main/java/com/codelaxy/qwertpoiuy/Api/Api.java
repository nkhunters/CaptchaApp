package com.codelaxy.qwertpoiuy.Api;

import com.codelaxy.qwertpoiuy.Models.DefaultResponse;
import com.codelaxy.qwertpoiuy.Models.MessageResponse;
import com.codelaxy.qwertpoiuy.Models.OrderHistoryResponse;
import com.codelaxy.qwertpoiuy.Models.RateResponse;
import com.codelaxy.qwertpoiuy.Models.UserCountResponse;
import com.codelaxy.qwertpoiuy.ModelsNew.CaptchaResponse;
import com.codelaxy.qwertpoiuy.ModelsNew.LoginResponse;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface Api {

    @FormUrlEncoded
    @POST("loginNewv3")
    Call<LoginResponse> login(@Field("user_id") String user_id,
                              @Field("password") String password,
                              @Field("unique_id") String unique_id);

    @FormUrlEncoded
    @POST("getCaptcha")
    Call<CaptchaResponse> getCaptcha(@Field("user_id") String user_id);

    @FormUrlEncoded
    @POST("skipCaptcha")
    Call<CaptchaResponse> skipCaptcha(@Field("user_id") String user_id);

    @FormUrlEncoded
    @POST("submitCaptcha")
    Call<CaptchaResponse> submitCaptcha(@Field("user_id") String user_id,
                                        @Field("captcha_id") String captcha_id,
                                        @Field("captcha_text") String captcha_text,
                                        @Field("captcha_type") String captcha_type);

    @FormUrlEncoded
    @POST("updateUserCount")
    Call<DefaultResponse> updateUserCount(@Field("user_id") String user_id,
                                          @Field("right_count") String right_count,
                                          @Field("wrong_count") String wrong_count,
                                          @Field("skip_count") String skip_count);

    @FormUrlEncoded
    @POST("getUserCount")
    Call<UserCountResponse> getUserCount(@Field("user_id") String user_id);

    @GET("getRates")
    Call<RateResponse> getRates();

    @GET("getMessages")
    Call<MessageResponse> getMessages();

    @FormUrlEncoded
    @POST("createNextOrder")
    Call<DefaultResponse> createNextOrder(@Field("user_id") String user_id);

    @FormUrlEncoded
    @POST("updateUniqueId")
    Call<DefaultResponse> updateUniqueId(@Field("user_id") String user_id, @Field("unique_id") String unique_id);

    @FormUrlEncoded
    @POST("autoApproveOrder")
    Call<DefaultResponse> autoApproveOrder(@Field("user_id") String user_id);

    @FormUrlEncoded
    @POST("getOrderHistory")
    Call<OrderHistoryResponse> getOrderHistory(@Field("user_id") String user_id);
}
