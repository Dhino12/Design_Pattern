package Belajar_DesignPattern_04_Facade

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class API_Build {
    companion object{
        // contoh implement dari facade
        var retrofit = Retrofit.Builder()
            .baseUrl("https://www.yourappurl.com") // proses request
            .addConverterFactory(GsonConverterFactory.create()) // proses parsing
            .build()
        val api = retrofit.create(CommentService::class.java)
    }
}