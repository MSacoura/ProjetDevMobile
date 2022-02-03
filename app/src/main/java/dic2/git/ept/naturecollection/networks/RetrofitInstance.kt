package dic2.git.ept.naturecollection.networks

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {
    const val BASE_URL = "http://185.98.128.121"

    private val retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
        fun buildContactsService() : ContactsService = retrofit.create(ContactsService::class.java)
    }
