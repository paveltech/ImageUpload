package com.example.lolipop.imageupload;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Query;

public interface UploadImageInterface {

    @Multipart
    @POST("reconcilation_uploader.php")
    Call<UploadObject> uploadFile(@Part MultipartBody.Part file, @Part("issue_photo") RequestBody name , @Query("user_id") String user_id , @Query("lat") String lat , @Query("lon") String lon , @Query("campaign") String campaign);

}
