package p03_poo.VideojuegoApp

fun main() {
    println("👱🏼 Plataforma de videojuegos 🎮")
    val v1 = Videojuego("The legend of Zelda", "Aventura", "Nintendo switch", 2017)
    val v2 = Videojuego("God of War", "Acción", "PlayStation 4", 2018)
    val v3 = Videojuego("Halo Infinite", "Shooter", "XBox Series X", 2021)

    // Crear una lista de videojuegos
    val listaVideojuegos = ArrayList<Videojuego>()

    // Agregamos los 3 videojuegos a la lista
    listaVideojuegos.add(v1)
    listaVideojuegos.add(v2)
    listaVideojuegos.add(v3)

    // Recorrer la lista para imprimir los juegos
    for (juego in listaVideojuegos) {
        println(juego.mostrarDatos())
    }
}