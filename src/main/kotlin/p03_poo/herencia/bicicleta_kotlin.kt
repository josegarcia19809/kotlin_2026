package org.example.p03_poo.herencia


open class BicicletaKotlin(
    var cadencia: Int,
    var velocidad: Int,
    var engranaje: Int
) {

    fun aplicarFreno(decremento: Int) {
        velocidad -= decremento
    }

    fun acelerar(incremento: Int) {
        velocidad += incremento
    }

    open fun imprimirDescripcion() {
        println(
            "La bicicleta está en el engranaje $engranaje con una cadencia de $cadencia " +
                    "y viaja a una velocidad de $velocidad."
        )
    }

}

class BicicletaMontanaKotlin(
    var alturaAsiento: Int,
    cadencia: Int,
    velocidad: Int,
    engranaje: Int
) : BicicletaKotlin(cadencia, velocidad, engranaje) {

    override fun imprimirDescripcion() {
        super.imprimirDescripcion()
        println("La bicicleta de montaña tiene una altura de asiento de $alturaAsiento pulgadas.")
    }

}

class BicicletaRutaKotlin(
    val anchoLlanta: Int,
    cadencia: Int,
    velocidad: Int,
    engranaje: Int
) : BicicletaKotlin(cadencia, velocidad, engranaje) {

    override fun imprimirDescripcion() {
        super.imprimirDescripcion()
        println("La bicicleta de ruta tiene un ancho de llanta de $anchoLlanta MM.")
    }
}

fun main() {

    // 🚵 Bicicleta de montaña
    val biciMontana = BicicletaMontanaKotlin(
        alturaAsiento = 25,
        cadencia = 90,
        velocidad = 20,
        engranaje = 3
    )

    biciMontana.imprimirDescripcion()

    println("-------------")

    // 🚴 Bicicleta de ruta
    val biciRuta = BicicletaRutaKotlin(
        anchoLlanta = 28,
        cadencia = 100,
        velocidad = 35,
        engranaje = 5
    )

    biciRuta.imprimirDescripcion()

    println("-------------")

    // 🔧 Probando métodos
    biciMontana.acelerar(10)
    biciMontana.aplicarFreno(5)

    biciMontana.imprimirDescripcion()
}