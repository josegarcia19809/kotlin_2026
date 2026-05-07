package org.example.p03_poo.herencia


fun main() {

    // 🚲 Bicicleta urbana
    val biciCiudad = BicicletaBase(
        cadencia = 10,
        velocidad = 3
    )
    biciCiudad.imprimirDescripcion()

    println("---------------")

    // 🚵 Bicicleta todo terreno
    val biciMontana = BicicletaTodoTerreno(
        alturaAsiento = 20,
        cadencia = 10,
        velocidad = 10
    )
    biciMontana.imprimirDescripcion()

    println("---------------")

    // 🚴 Bicicleta deportiva
    val biciDeportiva = BicicletaDeportiva(
        anchoLlanta = 10,
        cadencia = 10,
        velocidad = 10
    )
    biciDeportiva.imprimirDescripcion()

    println("---------------")

    // 🎨 Constructor secundario
    val biciColor = BicicletaTodoTerreno(
        "Azul",
        10,
        10,
        10
    )
    biciColor.imprimirDescripcion()

    println("---------------")

    // 🎨 Colores disponibles
    BicicletaTodoTerreno.coloresDisponibles.forEach {
        println(it)
    }
}

open class BicicletaBase(
    var cadencia: Int,
    var velocidad: Int,
    var engranaje: Int = 10
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

class BicicletaTodoTerreno(
    var alturaAsiento: Int,
    cadencia: Int,
    velocidad: Int,
    engranaje: Int = 10
) : BicicletaBase(cadencia, velocidad, engranaje) {

    constructor(
        color: String,
        alturaAsiento: Int,
        cadencia: Int,
        velocidad: Int,
        engranaje: Int = 20
    ) : this(alturaAsiento, cadencia, velocidad, engranaje) {

        println("La bicicleta es color $color 🎨")
    }

    companion object {

        val coloresDisponibles = listOf(
            "Azul",
            "Rojo",
            "Blanco",
            "Negro",
            "Verde",
            "Café"
        )
    }

    override fun imprimirDescripcion() {
        super.imprimirDescripcion()
        println("La bicicleta todo terreno tiene una altura de asiento de $alturaAsiento pulgadas.")
    }
}

class BicicletaDeportiva(
    val anchoLlanta: Int,
    cadencia: Int,
    velocidad: Int,
    engranaje: Int = 10
) : BicicletaBase(cadencia, velocidad, engranaje) {

    override fun imprimirDescripcion() {
        super.imprimirDescripcion()
        println("La bicicleta deportiva tiene un ancho de llanta de $anchoLlanta MM.")
    }
}