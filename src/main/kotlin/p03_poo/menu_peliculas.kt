package org.example.p03_poo

class PeliculaCine(
    var id: Int, var titulo: String, var genero: String,
    var duracion: String, var clasificacion: String
) {
    fun mostrarDatos(): String {
        return "Id: $id, titulo: $titulo, genero: $genero, " +
                "duración: $duracion, " +
                "clasificación: $clasificacion"
    }
}

fun menuPeliculas() {
    println("-".repeat(100))
    println("Nombre: José Luis García")
    println("\n🎥MENÚ DE PELÍCULAS")
    println("1.- Agregar película ➕")
    println("2.- Mostrar películas 🎞️")
    println("3.- Buscar película 🔎")
    println("4.- Editar película ✏️")
    println("5.- Borrar película ❌")
    println("0.- Salir 🚶🏻‍♂️")
    print("Elige tu opción: ")
}

fun agregarPeliculas(listaPeliculas: ArrayList<PeliculaCine>) {
    print("Dame el id de la película: ")
    val id = readln().toInt()

    print("Dame título: ")
    val titulo = readln()

    print("Dame género: ")
    val genero = readln()

    print("Dame duración: ")
    val duracion = readln()

    print("Dame clasificación: ")
    val clasificacion = readln()

    val nuevaPelicula = PeliculaCine(
        id, titulo, genero,
        duracion, clasificacion
    )
    listaPeliculas.add(nuevaPelicula)
}

fun mostrarPeliculas(listaPeliculas: ArrayList<PeliculaCine>) {
    println("Lista de películas")
    for (pelicula in listaPeliculas) {
        println(pelicula.mostrarDatos())
    }
    println(".".repeat(100))
}

fun editarPelicula(listaPeliculas: ArrayList<PeliculaCine>) {
    // TODO: editar
}

fun buscarPelicula(listaPeliculas: ArrayList<PeliculaCine>) {
    // TODO: buscar
}

fun borrarPelicula(listaPeliculas: ArrayList<PeliculaCine>) {
    // TODO: borrar
}

fun main() {
    val listaPeliculas = ArrayList<PeliculaCine>()
    val peli1 = PeliculaCine(1, "Avatar", "Acción", "120 min", "B")
    val peli2 = PeliculaCine(2, "Coco", "Animación", "105 min", "A")
    val peli3 = PeliculaCine(3, "It", "Terror", "110 min", "C")
    val peli4 = PeliculaCine(4, "Batman", "Acción", "130 min", "B")

    listaPeliculas.add(peli1)
    listaPeliculas.add(peli2)
    listaPeliculas.add(peli3)
    listaPeliculas.add(peli4)

    mostrarPeliculas(listaPeliculas)

    var opcion: Int
    do {
        menuPeliculas()
        opcion = readln().toInt()

        when (opcion) {
            1 -> {
                agregarPeliculas(listaPeliculas)
            }

            2 -> {
                mostrarPeliculas(listaPeliculas)
            }

            3 -> {
                buscarPelicula(listaPeliculas)
            }

            4 -> {
                editarPelicula(listaPeliculas)
            }

            5 -> {
                borrarPelicula(listaPeliculas)
            }

            0 -> {
                println("Saliendo...👋🏼")
            }

            else -> {
                println("Opción no válida 😠")
            }
        }
    } while (opcion != 0)
}