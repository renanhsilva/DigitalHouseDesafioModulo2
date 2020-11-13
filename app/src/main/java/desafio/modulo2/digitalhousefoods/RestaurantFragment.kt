package desafio.modulo2.digitalhousefoods

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.digitalhousefoods.domain.RestaurantAdapter

class RestaurantFragment : Fragment() {
    private var listRestaurants = mutableListOf<Restaurants>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_restaurant, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



        val recicleView = view.findViewById<RecyclerView>(R.id.recyclerRestaurante)
        recicleView.adapter = RestaurantAdapter(listRestaurants)
        recicleView.layoutManager = LinearLayoutManager(view.context)

    }

    private fun populateList() {
        listRestaurants.clear()
        listRestaurants.add(Restaurants("Tony Roma's", "Av. Lavandisca, 717 - Indianópolis, SP", "22:00", R.drawable.image1))
        listRestaurants.add(Restaurants("Aoyama - Moema", "Alameda do Arapanés, 532 - Moema", "00:00", R.drawable.image4))
        listRestaurants.add(Restaurants("Outback - Moema", "Av. Moacir, 187 - Moema", "00.00", R.drawable.image2))
        listRestaurants.add(Restaurants("Sí Señor!", "Alameda Juaperi, 626 - Moema", "01:00", R.drawable.image3))
    }
}