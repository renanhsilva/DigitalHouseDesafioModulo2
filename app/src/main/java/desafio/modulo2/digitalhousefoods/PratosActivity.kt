package desafio.modulo2.digitalhousefoods

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_cardapio.*
import kotlinx.android.synthetic.main.activity_pratos.*
import kotlinx.android.synthetic.main.activity_register.*

class PratosActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pratos)
        setSupportActionBar(tb_prato)
        txt_nome_prato_detalhe.text = intent.getStringExtra("txtNomePrato")
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}