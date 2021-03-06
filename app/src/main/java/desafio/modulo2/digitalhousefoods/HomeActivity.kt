package desafio.modulo2.digitalhousefoods

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.digitalhousefoods.domain.RestaurantAdapter
import kotlinx.android.synthetic.main.activity_cardapio.*
import kotlinx.android.synthetic.main.activity_home.*



class HomeActivity : AppCompatActivity(), RestaurantAdapter.OnClickRestaurantListener {
    val restaurantList = listaRestaurants()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        recycler_home.adapter = RestaurantAdapter(listaRestaurants(), this)
        recycler_home.layoutManager = LinearLayoutManager(this)

    }

    override fun onClickRestaurant(position: Int) {
        val restaurante = restaurantList[position]
        val intent = Intent(this, CardapioActivity::class.java)
        intent.putExtra("imgRestaurante", restaurante.bannerRestaurant)
        intent.putExtra("nomeRestaurante", restaurante.nomeRestaurant)
        startActivity(intent)
    }
}
