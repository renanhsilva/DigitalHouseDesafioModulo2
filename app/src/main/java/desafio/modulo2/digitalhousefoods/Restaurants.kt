package desafio.modulo2.digitalhousefoods

data class Restaurants(
    val nomeRestaurant: String,
    val endereco: String,
    val horaFechamento: String,
    val bannerRestaurant: Int
)

class RestaurantsBuild {
    var nomeRestaurant: String = ""
    var endereco: String = ""
    var horaFechamento: String = ""
    var bannerRestaurant: Int = R.drawable.image1

    fun build(): Restaurants = Restaurants(nomeRestaurant,endereco,horaFechamento,bannerRestaurant)
}

fun restaurants(block: RestaurantsBuild.() -> Unit): Restaurants = RestaurantsBuild().apply(block).build()

fun listaRestaurants(): MutableList<Restaurants> = mutableListOf(
    restaurants {
        nomeRestaurant="Tony Romas's"
        endereco="Av. Lavandisca, 717 - Indianópolis, SP"
        horaFechamento="Fecha às 22:00"
        bannerRestaurant= R.drawable.image1
    },
    restaurants {
        nomeRestaurant="Aoyama - Moema"
        endereco="Alameda dos Arapanés, 532 - Moema"
        horaFechamento="Fecha às 00:00"
        bannerRestaurant= R.drawable.image4
    },
    restaurants {
        nomeRestaurant="Outback - Moema"
        endereco="Av. Moaci, 187, 187 - Moema, São Paulo"
        horaFechamento="Fecha às 00:00"
        bannerRestaurant= R.drawable.image5
    },
    restaurants {
        nomeRestaurant = "Sí Señor!"
        endereco = "Alameda Jauaperi, 626 - Moema"
        horaFechamento = "Fecha as 00:00"
        bannerRestaurant = R.drawable.image3
    })

