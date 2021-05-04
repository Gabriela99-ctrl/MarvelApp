package edu.itesm.marvelapp



import retrofit2.Response
import retrofit2.http.GET


interface APIService {
    @GET("https://gateway.marvel.com:443/v1/public/comics?apikey=f8ff535fa14318b8deb1e35e79906ba7")
    suspend fun getComics(): Response<Results>
}