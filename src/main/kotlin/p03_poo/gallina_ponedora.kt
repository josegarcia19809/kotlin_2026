package org.example.p03_poo

class Gallina(
    val nombre: String,
    val especie: String
) {
    var huevos: Int = 0

    fun ponerHuevo() {
        huevos++
    }

    fun obtenerCantidadHuevos(): Int {
        return huevos
    }

    fun obtenerDatos(): String {
        return "Nombre: $nombre, " +
                "especie: $especie, " +
                "huevos: $huevos"
    }
}

fun main() {
    //------------------gallina 1
    val gallina1 = Gallina("Lola", "Leghorn")
    gallina1.ponerHuevo()
    gallina1.ponerHuevo()
    println(gallina1.obtenerDatos())

    //------------------gallina 2
    println("-".repeat(100))
    val gallina2 = Gallina("Turuleka", "Silkie")
    repeat(10) {
        gallina2.ponerHuevo()
        println(
            "La gallina ${gallina2.nombre} " +
                    "ha puesto ${gallina2.obtenerCantidadHuevos()} " +
                    " huevos"
        )
    }

    //------------------gallina 3->Agregar
    println("-".repeat(100))
}