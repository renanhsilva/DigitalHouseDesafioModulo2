package desafio.modulo2.digitalhousefoods

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.example.digitalhousefoods.domain.RestaurantAdapter
import kotlinx.android.synthetic.main.activity_cardapio.*
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.activity_register.*
import kotlinx.android.synthetic.main.restaurant_itens.*

class CardapioActivity : AppCompatActivity(), CardapioAdapter.OnClickCardapioListener {
    val pratosList = listCardapios()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cardapio)
        recycler_cardapio.adapter = CardapioAdapter(listCardapios(), this)
        recycler_cardapio.layoutManager = GridLayoutManager (this, 2)
        setSupportActionBar(tb_cardapio)

        img_superiorcardapio.setImageResource(intent.getIntExtra("imgRestaurante",0))
        txt_nome_restaurant_cardapio.text = intent.getStringExtra("nomeRestaurante")



    }
    override fun onClickCardapio(position: Int) {
        val pratos = pratosList[position]
        val intent = Intent(this, PratosActivity::class.java)
        intent.putExtra("txtNomePrato", pratos.nomeCardapio)
        intent.putExtra("imgPrato", pratos.imagemCardapio)
        startActivity(intent)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}