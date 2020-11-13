package desafio.modulo2.digitalhousefoods

data class Cardapios (
    val nomeCardapio : String,
    val imagemCardapio : Int
)
class CardapiosBuild {
    var nomeCardapio : String = ""
    var imagemCardapio : Int = R.drawable.image1

    fun build(): Cardapios = Cardapios(nomeCardapio,imagemCardapio)
}

fun cardapios(block: CardapiosBuild.() -> Unit): Cardapios = CardapiosBuild().apply(block).build()

fun listCardapios(): MutableList<Cardapios> = mutableListOf(
    cardapios {
        nomeCardapio = "Salada com molho de Gemgibre"
        imagemCardapio = R.drawable.image4
    },
    cardapios {
        nomeCardapio = "Macarrão"
        imagemCardapio = R.drawable.image4
    },
    cardapios {
        nomeCardapio = "Espaguete"
        imagemCardapio = R.drawable.image4
    }
)