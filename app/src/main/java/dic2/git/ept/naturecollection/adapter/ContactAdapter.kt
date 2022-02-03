package dic2.git.ept.naturecollection.adapter

import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import dic2.git.ept.naturecollection.ContactModel
import dic2.git.ept.naturecollection.MainActivity
import dic2.git.ept.naturecollection.R
import dic2.git.ept.naturecollection.networks.RetrofitInstance
import retrofit2.Retrofit

class ContactAdapter(
    private val context: MainActivity,
    private val contactlist: List<ContactModel>,
    private val layoutId: Int) : RecyclerView.Adapter<ContactAdapter.ViewHolder>(){

    //Boite pour ranger tous les composants à controler
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view){
        // Image du contact
        val contactImage = view.findViewById<ImageView>(R.id.image_item)
        val contactFirstname:TextView? = view.findViewById<TextView>(R.id.contact_firstname_item)
        val contactEmail:TextView? = view.findViewById<TextView>(R.id.contact_email_item)
        val phoneIcone = view.findViewById<ImageView>(R.id.phone_icon)

    }




    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(layoutId, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(p0: ViewHolder, p1: Int) {
        // Recupérons les infos sur le contact
        val  currentContact = contactlist[p1]

        // Utilisons glide pour recup l'image à partir de son lien
        Glide.with(context).load(Uri.parse(currentContact.imageUrl)).into(p0.contactImage)

        //Mettre à jour le prenom du contact
        p0.contactFirstname?.text = currentContact.firstname

        //Mettre à jour la description du contact
        p0.contactEmail?.text = currentContact.email

        //Mettre un favori
        if(currentContact.called){
            p0.phoneIcone.setImageResource(R.drawable.ic_star)
        }
        else{
            p0.phoneIcone.setImageResource((R.drawable.ic_phone))
        }
    }

    override fun getItemCount(): Int = contactlist.size
}