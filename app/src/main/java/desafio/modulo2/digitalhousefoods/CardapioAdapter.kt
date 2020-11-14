package desafio.modulo2.digitalhousefoods

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.RecyclerView
import com.example.digitalhousefoods.domain.RestaurantAdapter
import kotlinx.android.synthetic.main.cardapio_itens.view.*

class CardapioAdapter(val listCardapios: MutableList<Cardapios>, val listener : CardapioAdapter.OnClickCardapioListener) : RecyclerView.Adapter<CardapioAdapter.CardapioViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardapioViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.cardapio_itens, parent, false)
        return CardapioViewHolder(view)
    }

    override fun getItemCount() = listCardapios().size

    override fun onBindViewHolder(holder: CardapioViewHolder, position: Int) {
        holder.bind(listCardapios[position])
    }


    inner class CardapioViewHolder(itemView: View): RecyclerView.ViewHolder(itemView), View.OnClickListener{
        var imgPrato : ImageView = itemView.findViewById(R.id.img_prato)
        var txtNomePrato : TextView = itemView.findViewById(R.id.txt_nome_prato)


        init {
            itemView.setOnClickListener(this)
        }

        override fun onClick(v: View?) {
            val position = adapterPosition
            if (position != RecyclerView.NO_POSITION) {
                listener.onClickCardapio(position)
            }
        }

        fun bind(cardapios: Cardapios){
            itemView.txt_nome_prato.text = cardapios.nomeCardapio.toString()
            itemView.img_prato.setImageResource(cardapios.imagemCardapio)
        }
    }



    interface OnClickCardapioListener{
        fun onClickCardapio(position: Int)
    }


}