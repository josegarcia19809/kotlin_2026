package org.example.p03_poo

class Mascota(
    val nombre: String, val tipo: String,
    val edad: Int
) {
    fun mostrarDatos(): String {
        return "Nombre: $nombre \n" +
                "Tipo: $tipo \n" +
                "Edad: $edad"
    }
}

fun main() {
    val mascota1 = Mascota("Luna", "Perro", 3)
    val mascota2 = Mascota("Milo", "Gato", 2)
    val mascota3 = Mascota("Max", "Perro", 4)
    val mascota4 = Mascota("Nina", "Gato", 1)

    val listaMascotas = ArrayList<Mascota>()
    listaMascotas.add(mascota1)
    listaMascotas.add(mascota2)
    listaMascotas.add(mascota3)
    listaMascotas.add(mascota4)

    for (mascota in listaMascotas){
        println("-".repeat(100))
        println(mascota.mostrarDatos())
    }
}