package org.example.p03_poo


fun menuVideojuegos() {
    println("\n🎮 MENÚ DE VIDEOJUEGOS")
    println("1. Añadir videojuego")
    println("2. Mostrar videojuegos")
    println("3. Buscar videojuego")
    println("4. Editar videojuego")
    println("5. Borrar videojuego")
    println("0. Salir")
    print("Elige una opción: ")
}

fun agregarVideojuego(listaVideojuegos: ArrayList<Videojuego>) {
    print("Título: ")
    val titulo = readln()

    print("Género: ")
    val genero = readln()

    print("Plataforma: ")
    val plataforma = readln()

    print("Año: ")
    val anio = readln().toInt()

    val nuevo = Videojuego(titulo, genero, plataforma, anio)
    listaVideojuegos.add(nuevo)

    println("✅ Videojuego agregado")
}

fun mostrarVideojuego(listaVideojuegos: ArrayList<Videojuego>) {
    println("\n📋 LISTA DE VIDEOJUEGOS")
    for (juego in listaVideojuegos) {
        println(juego.mostrarDatos())
    }
}

fun buscarVideojuego(listaVideojuegos: ArrayList<Videojuego>) {
    print("Ingresa el título a buscar: ")
    val buscar = readln()

    var encontrado = false

    for (juego in listaVideojuegos) {
        if (juego.titulo.equals(buscar, ignoreCase = true)) {
            println("🎯 Encontrado:")
            println(juego.mostrarDatos())
            encontrado = true
        }
    }

    if (!encontrado) {
        println("❌ No se encontró el videojuego")
    }
}

fun borrarVideojuego(listaVideojuegos: ArrayList<Videojuego>) {
    print("Título del videojuego a eliminar: ")
    val buscar = readln()

    val iterator = listaVideojuegos.iterator()

    while (iterator.hasNext()) {
        val juego = iterator.next()
        if (juego.titulo.equals(buscar, ignoreCase = true)) {
            iterator.remove()
            println("🗑️ Videojuego eliminado")
        }
    }
}

fun editarVideojuego(listaVideojuegos: ArrayList<Videojuego>) {
    print("Título del videojuego a editar: ")
    val buscar = readln()

    for (juego in listaVideojuegos) {
        if (juego.titulo.equals(buscar, ignoreCase = true)) {

            print("Nuevo título: ")
            juego.titulo = readln()


            print("Nuevo género: ")
            juego.genero = readln()


            print("Nueva plataforma: ")
            juego.plataforma = readln()


            print("Nuevo año: ")
            juego.anio = readln().toInt()

            println("✏️ Videojuego actualizado")
        }
    }
}

fun leerVideojuegos(listaVideojuegos: ArrayList<Videojuego>){
    val videojuego1 = Videojuego("The legend of Zelda", "Aventura", "Nintendo Switch", 2017)
    val videojuego2 = Videojuego("God of war", "Acción", "PlayStation 4", 2018)
    val videojuego3 = Videojuego("Halo Infinite", "Shooter", "Xbox Series X", 2021)
    val videojuego4 = Videojuego("Minecraft", "Sandbox", "PC", 2011)

    listaVideojuegos.add(videojuego1)
    listaVideojuegos.add(videojuego2)
    listaVideojuegos.add(videojuego3)
    listaVideojuegos.add(videojuego4)
}


fun main() {

    val listaVideojuegos = ArrayList<Videojuego>()
    leerVideojuegos(listaVideojuegos)


    var opcion: Int

    do {

        menuVideojuegos()
        opcion = readln().toInt()

        when (opcion) {

            // ➕ AÑADIR
            1 -> {
                agregarVideojuego(listaVideojuegos)
            }

            // 📋 MOSTRAR
            2 -> {
                mostrarVideojuego(listaVideojuegos)
            }

            // 🔍 BUSCAR
            3 -> {
                buscarVideojuego(listaVideojuegos)
            }

            // ✏️ EDITAR
            4 -> {
                editarVideojuego(listaVideojuegos)
            }

            // 🗑️ BORRAR
            5 -> {
                borrarVideojuego(listaVideojuegos)
            }

            0 -> println("👋 Saliendo del programa...")

            else -> println("❗ Opción inválida")
        }

    } while (opcion != 0)
}