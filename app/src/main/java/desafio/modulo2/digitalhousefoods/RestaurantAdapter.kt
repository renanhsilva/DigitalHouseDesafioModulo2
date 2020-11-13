package com.example.digitalhousefoods.domain

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import desafio.modulo2.digitalhousefoods.R
import desafio.modulo2.digitalhousefoods.Restaurants
import kotlinx.android.synthetic.main.restaurant_itens.view.*

class RestaurantAdapter(val listRestaurants: MutableList<Restaurants>, val listener : OnClickRestaurantListener) : RecyclerView.Adapter<RestaurantAdapter.RestaurantViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RestaurantViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.restaurant_itens, parent, false)
        return RestaurantViewHolder(view)
    }

    override fun getItemCount() = listRestaurants.size

    override fun onBindViewHolder(holder: RestaurantViewHolder, position: Int) {
        holder.bind(listRestaurants[position])
    }

    interface OnClickRestaurantListener{
        fun onClickRestaurant(position: Int)
    }

    inner class RestaurantViewHolder(itemView: View): RecyclerView.ViewHolder(itemView), View.OnClickListener{
        var imgRest : ImageView = itemView.findViewById(R.id.img_restaurant)
        var txtNameRest : TextView = itemView.findViewById(R.id.txt_nome_restaurant)
        var txtEndRest : TextView = itemView.findViewById(R.id.txt_endereço)
        var txtHoraRest : TextView = itemView.findViewById(R.id.txt_horario_fechamento)

        init {
            itemView.setOnClickListener(this)
        }

        override fun onClick(v: View?) {
            val position = adapterPosition
            if (position != RecyclerView.NO_POSITION) {
                listener.onClickRestaurant(position)
            }
        }

        fun bind(restaurants: Restaurants) {
            itemView.txt_nome_restaurant.text = restaurants.nomeRestaurant.toString()
            itemView.txt_endereço.text = restaurants.endereco.toString()
            itemView.txt_horario_fechamento.text = restaurants.horaFechamento.toString()
            itemView.img_restaurant.setImageResource(restaurants.bannerRestaurant)
        }
    }

}