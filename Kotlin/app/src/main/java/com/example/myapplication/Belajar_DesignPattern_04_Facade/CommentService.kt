package Belajar_DesignPattern_04_Facade

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface CommentService {
    @POST("v1/comment")
    fun createComment(@Body request:Comment):Call<EmptyResult>

    @GET("v1/comment")
    fun getComment(@Body request:Comment):Call<MutableList<Comment>>
}