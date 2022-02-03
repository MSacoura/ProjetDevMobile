package dic2.git.ept.naturecollection

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import dic2.git.ept.naturecollection.adapter.ContactAdapter
import dic2.git.ept.naturecollection.fragments.HomeFragment
import dic2.git.ept.naturecollection.networks.ContactsService
import java.util.*

class MainActivity : AppCompatActivity() {
    lateinit var mService : ContactsService
    lateinit var layoutManager : LinearLayoutManager
    lateinit var adapter : ContactAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //injecter notre fragment dans la boite (fragment_container)
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.fragment_container, HomeFragment(this))
        transaction.addToBackStack(null)
        transaction.commit()
    }
}