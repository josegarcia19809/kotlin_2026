package org.example.p10_genericos

/*
Este archivo aborda el tema de la Covarianza (Covariance) en Kotlin mediante la palabra
clave out. Demuestra que si un tipo genérico solo produce objetos (los devuelve, pero no los
recibe), entonces una clase como Garden<Rose> puede utilizarse donde se espera un Garden<Flower>.
También muestra que List es covariante, por lo que una List<Short> puede pasarse a una
función que recibe List<Number>.
 */

// Clase base para todas las mascotas.
open class Mascota(val nombre: String)

// Clases derivadas.
class Perro(nombre: String) : Mascota(nombre)

class Gato(nombre: String) : Mascota(nombre)

// Función que muestra el nombre de cualquier mascota.
fun mostrarMascotas(mascotas: List<Mascota>) {
    println("Mascotas registradas:")

    for (mascota in mascotas) {
        println(mascota.nombre)
    }

    println()
}

// Función que recibe un refugio exclusivo de perros.
fun revisarRefugioPerros(refugio: Refugio<Perro>) {
    atenderRefugio(refugio)
}

// Función que puede atender cualquier refugio de mascotas.
fun atenderRefugio(refugio: Refugio<Mascota>) {
    val mascota = refugio.obtenerMascota(0)
    println("Atendiendo a: ${mascota.nombre}")
    println()
}

// Clase genérica covariante.
// Solo produce objetos de tipo T.
class Refugio<out T : Mascota>(private val mascotas: List<T>) {

    // Devuelve una mascota de la colección.
    fun obtenerMascota(indice: Int): T {
        return mascotas[indice]
    }
}

fun main() {

    val perros = listOf(
        Perro("Max"),
        Perro("Rocky"),
        Perro("Luna")
    )

    mostrarMascotas(perros)

    val refugioPerros = Refugio(perros)

    revisarRefugioPerros(refugioPerros)
}