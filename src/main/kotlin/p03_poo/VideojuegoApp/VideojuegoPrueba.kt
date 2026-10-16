package p03_poo.VideojuegoApp

fun main() {
    val juego1 = Videojuego("The legend of Zelda", "Aventura", "Nintendo Switch", 2017)
    val juego2 = Videojuego("God of War", "Acción", "PlayStation 4", 2018)
    val juego3 = Videojuego("Halo Infinite", "Shooter", "Xbox Series X", 2021)

    // Crear lista de videojuegos
    val listaVideojuegos = ArrayList<Videojuego>()
    listaVideojuegos.add(juego1)
    listaVideojuegos.add(juego2)
    listaVideojuegos.add(juego3)

    println("-".repeat(100))

    println("**************Mi colección de videojuegos 🎮")
    for (juego in listaVideojuegos) {
        println(juego.mostrarDatos())
    }
}