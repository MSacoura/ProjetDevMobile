package dic2.git.ept.naturecollection.networks

import dic2.git.ept.naturecollection.ContactModel
import retrofit2.Call
import retrofit2.http.GET
import kotlin.collections.List

interface ContactsService {


    @GET("/api/{key}/personnes")
     fun getContacts(): Call<List<ContactModel>>
}