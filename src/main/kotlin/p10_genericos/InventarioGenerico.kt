package org.example.p10_genericos

data class Producto(
    val nombre: String,
    val precio: Double
)

// Función genérica que imprime todos los elementos de una colección.
/*
Esta función es una función de extensión genérica. Se puede dividir en tres partes:

fun <T> List<T>.mostrarElementos() {
fun: Indica que se está declarando una función.
<T>: Significa que la función es genérica.
    La letra T representa cualquier tipo de dato (String, Int, Double, objetos, etc.).
List<T>: Indica que esta función pertenece a cualquier lista (List) cuyo tipo de elementos sea T.
.mostrarElementos(): Es el nombre de la función de extensión. Gracias a esto, cualquier
        lista puede llamar a esta función como si fuera un método propio.

En el cuerpo de la función :

for (elemento in this) {
    println(elemento)
}
this hace referencia a la lista sobre la que se llamó la función.
Recorre todos sus elementos e imprime cada uno.
 */
fun <T> List<T>.mostrarElementos() {
    println("Elementos de la colección:")
    for (elemento in this) {
        println(elemento)
    }
    println()
}

// Función que crea una lista de nombres de estudiantes.
fun mostrarEstudiantes() {
    val estudiantes = listOf(
        "Ana",
        "Carlos",
        "María",
        "José"
    )

    estudiantes.mostrarElementos()
}

// Función que crea una lista de calificaciones.
fun mostrarCalificaciones() {
    val calificaciones = listOf(
        95,
        88,
        76,
        100
    )
    calificaciones.mostrarElementos()
}

// Función que crea una lista de productos.
fun mostrarProductos() {
    val productos = listOf(
        Producto("Laptop", 18500.0),
        Producto("Mouse", 450.0),
        Producto("Teclado", 820.0)
    )

    productos.mostrarElementos()
}

fun main() {
    mostrarEstudiantes()
    mostrarCalificaciones()
    mostrarProductos()
}