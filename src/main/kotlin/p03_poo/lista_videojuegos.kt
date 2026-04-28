package org.example.p03_poo

class Videojuego(
    var titulo: String, var genero: String,
    var plataforma: String, var anio: Int
) {
    fun mostrarDatos(): String {
        return "Videojuego: $titulo, genero: $genero, plataforma: $plataforma, año: $anio"
    }
}

fun main() {
    val videojuego1 = Videojuego("The legend of Zelda", "Aventura", "Nintendo Switch", 2017)
    val videojuego2 = Videojuego("God of war", "Acción", "PlayStation 4", 2018)
    val videojuego3 = Videojuego("Halo Infinite", "Shooter", "Xbox Series X", 2021)
    val videojuego4 = Videojuego("Minecraft", "Sandbox", "PC", 2011)

    // Crear lista de videojuegos
    val listaVideojuegos = ArrayList<Videojuego>()
    listaVideojuegos.add(videojuego1)
    listaVideojuegos.add(videojuego2)
    listaVideojuegos.add(videojuego3)
    listaVideojuegos.add(videojuego4)

    println("-".repeat(100))

    for (juego in listaVideojuegos) {
        println(juego.mostrarDatos())
    }

}