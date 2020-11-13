package desafio.modulo2.digitalhousefoods

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.example.digitalhousefoods.domain.RestaurantAdapter
import kotlinx.android.synthetic.main.activity_cardapio.*
import kotlinx.android.synthetic.main.activity_home.*

class CardapioActivity : AppCompatActivity(), CardapioAdapter.OnClickCardapioListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cardapio)
        recycler_cardapio.adapter = CardapioAdapter(listCardapios(), this)
        recycler_cardapio.layoutManager = GridLayoutManager (this, 2)
    }
    override fun onClickCardapio(position: Int) {
        startActivity(Intent(this, PratosActivity::class.java))
    }
}