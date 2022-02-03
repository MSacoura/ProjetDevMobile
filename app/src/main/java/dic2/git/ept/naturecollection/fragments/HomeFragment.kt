package dic2.git.ept.naturecollection.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import dic2.git.ept.naturecollection.ContactModel
import dic2.git.ept.naturecollection.MainActivity
import dic2.git.ept.naturecollection.R
import dic2.git.ept.naturecollection.adapter.ContactAdapter
import dic2.git.ept.naturecollection.adapter.ContactItemDecoration

class HomeFragment(
    private val context: MainActivity
) : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        //Créons la liste qui va stocker les contacts
        val contactList = arrayListOf<ContactModel>()

        //Enregistrons un premier contact à notre liste
        contactList.add(
            ContactModel(
            "Mame Diarra",
            "Sow",
            "mamediarrasow@makeitgroup.com",
            "https://cdn.pixabay.com/photo/2021/04/08/09/14/singer-6161119_960_720.png",
            false
            )
        )

        //Enregistrons un deuxième contact à notre liste
        contactList.add(
            ContactModel(
                "Mamadou",
                "Sow",
                "mamadousow@makeitgroup.com",
                "https://cdn.pixabay.com/photo/2014/09/17/11/47/man-449406_960_720.jpg",
                false
            )
        )

        //Enregistrons un troisième contact à notre liste
        contactList.add(
            ContactModel(
                "Alioune",
                "Sarr",
                "aliounesarr@makeitgroup.com",
                "https://cdn.pixabay.com/photo/2014/09/17/11/47/man-449406_960_720.jpg",
                false
            )
        )

        //Enregistrons un quatrième contact à notre liste
        contactList.add(
            ContactModel(
                "Fallou",
                "Diakhaté",
                "falloudiakhate@makeitgroup.com",
                "https://cdn.pixabay.com/photo/2014/09/17/11/47/man-449406_960_720.jpg",
                false
            )
        )

        //Enregistrons un premier contact à notre liste
        contactList.add(
            ContactModel(
                "Khadidjatou Zahra",
                "Gueye",
                "khadidjatouzahragueye@makeitgroup.com",
                "https://cdn.pixabay.com/photo/2021/04/08/09/14/singer-6161119_960_720.png",
                false
            )
        )

        //Recupérons le recyclerView
        val horizontalRecyclerView = view.findViewById<RecyclerView>(R.id.horizontal_recycler_view)
        horizontalRecyclerView.adapter = ContactAdapter(context, contactList, R.layout.item_horizontal_contact)

        val verticalRecyclerView = view.findViewById<RecyclerView>(R.id.vertical_recycler_view)
        verticalRecyclerView.adapter = ContactAdapter(context, contactList, R.layout.item_vertical_contact)
        verticalRecyclerView.addItemDecoration(ContactItemDecoration())


        return view
    }
}