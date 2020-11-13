package com.example.digitalhousefoods.domain

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import desafio.modulo2.digitalhousefoods.R
import desafio.modulo2.digitalhousefoods.Restaurants

class RestaurantAdapter(private val listRestaurants: List<Restaurants>) : RecyclerView.Adapter<RestaurantAdapter.RestaurantViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RestaurantViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.recycler_restaurant_cards, parent, false)
        return RestaurantViewHolder(view)
    }

    override fun getItemCount() = listRestaurants.size

    override fun onBindViewHolder(holder: RestaurantViewHolder, position: Int) {
        var restaurant = listRestaurants[position]
        holder.txtName.text = restaurant.nomeRestaurant
        holder.txtAdress.text = restaurant.endereco
        holder.txtHour.text = "Horário de fechamento ${restaurant.horaFechamento}"
        holder.imgRestaurat.setImageResource(restaurant.bannerRestaurant)
    }

    interface OnClickRestaurantListener{
        fun onClickRestaurant(position: Int)
    }

    inner class RestaurantViewHolder(itemView: View): RecyclerView.ViewHolder(itemView), View.OnClickListener{
        var imgRestaurat: ImageView = itemView.findViewById(R.id.img_restaurant)
        var txtName: TextView = itemView.findViewById(R.id.txt_nome_restaurant)
        var txtAdress: TextView = itemView.findViewById(R.id.txt_endereço)
        var txtHour: TextView = itemView.findViewById(R.id.txt_horario_funcionamento)

        init {
            itemView.setOnClickListener(this)
        }

        override fun onClick(v: View?) {

        }
    }
}