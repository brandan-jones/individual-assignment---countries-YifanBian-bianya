package app.plantdiary.individualassignment304832

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

//singleton pattern
object RetrofitClientInstance {
    private var retrofit: Retrofit? = null
    private val BASE_URL = "https://pkgstore.datahub.io/"

    val retrofitInstance : Retrofit?
    //When retrofitInstance is used, check whether it is created or not, create if not create
        get() {
            if (retrofit == null) {
                retrofit = retrofit2.Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
            }
            return retrofit
        }
}