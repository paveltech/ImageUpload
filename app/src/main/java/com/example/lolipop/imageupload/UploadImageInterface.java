package com.example.lolipop.imageupload;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

public interface UploadImageInterface {

    @Multipart
    @POST("imageupload/index.php")
    Call<UploadObject> uploadFile(@Part MultipartBody.Part file, @Part("issue_photo") RequestBody name);
}
