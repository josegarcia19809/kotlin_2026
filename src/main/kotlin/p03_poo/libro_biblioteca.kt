package org.example.p03_poo

class LibroBiblioteca(
    val titulo: String,
    var ejemplaresDisponibles: Int
) {
    fun prestarLibro(cantidad: Int) {
        if (cantidad <= ejemplaresDisponibles) {
            ejemplaresDisponibles -= cantidad
        }
        else{
            println("No alcanzan los libros para prestar esa cantidad")
        }
    }

    fun devolverLibro(cantidad: Int) {
        ejemplaresDisponibles += cantidad
    }

    fun obtenerEjemplares(): Int {
        return ejemplaresDisponibles
    }

    override fun toString(): String {
        return "Titulo: $titulo, ejemplares: $ejemplaresDisponibles"
    }
}

fun main() {
    println("📚 Sistema de Gestión de Libros en una Biblioteca")
    val libro = LibroBiblioteca("El principito", 5)

    libro.prestarLibro(2)
    libro.prestarLibro(2)
    println("Ejemplares disponibles: ${libro.obtenerEjemplares()}")

    libro.devolverLibro(3)
    libro.devolverLibro(2)
    libro.devolverLibro(1)
    println("Ejemplares disponibles: ${libro.obtenerEjemplares()}")
    println()
    println("📖 Datos del libro: ")
    println(libro)
}