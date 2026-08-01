package org.example.p10_genericos


/*
Este archivo trata principalmente sobre Restricciones de tipos genéricos (Upper Bounds) en
Kotlin. Muestra cómo limitar los tipos que puede recibir un genérico utilizando T : Tipo y
la cláusula where. También incluye ejemplos de Star Projection (List<*>), conversión de tipos y
comprobación de tipos en tiempo de ejecución.
 */
// Clase que representa un producto del inventario.
data class ProductoInventario(
    val nombre: String,
    val precio: Double
)

// Función que muestra cualquier colección cuyos elementos no sean nulos.
fun <T : Any> mostrarColeccion(datos: List<T>) {
    println("Contenido de la colección:")
    for (dato in datos) {
        println(dato)
    }
    println()
}

// Función que calcula el total de una lista de cantidades numéricas.
fun <T : Number> calcularTotal(cantidades: List<T>) {
    var total = 0.0

    for (cantidad in cantidades) {
        total += cantidad.toDouble()
    }

    println("Total: $total")
    println()
}

// Función que concatena dos objetos que sean texto y además puedan modificarse.
fun <T> unirTextos(texto1: T, texto2: T)
        where T : CharSequence, T : Appendable {

    texto1.append(texto2)
    println("Texto unido: $texto1")
    println()
}

// Función que verifica si una variable contiene una lista.
fun verificarLista(objeto: Any) {
    if (objeto is List<*>) {
        println("La variable contiene una lista con ${objeto.size} elementos.")
    } else {
        println("La variable no es una lista.")
    }

    println()
}

// Función que muestra una lista de productos.
fun mostrarProductoInventarios() {
    val productos = listOf(
        ProductoInventario("Monitor", 4200.0),
        ProductoInventario("Impresora", 3150.0)
    )

    mostrarColeccion(productos)
}

fun main() {

    val existencias = listOf(15, 20, 12, 30)
    calcularTotal(existencias)

    val builder1 = StringBuilder("Inventario ")
    val builder2 = StringBuilder("Actualizado")
    unirTextos(builder1, builder2)

    verificarLista(listOf("Teclado", "Mouse", "Laptop"))
    verificarLista("No soy una lista")

    mostrarProductoInventarios()
}

/*
¿Qué aprenderá el estudiante?
Upper Bound (<T : Any>): restringe el tipo genérico para que solo acepte ciertos tipos
(por ejemplo, valores no nulos).
Restricción numérica (<T : Number>): permite crear funciones que trabajen únicamente con tipos
numéricos (Int, Double, Float, etc.). Se basa en la misma idea que el ejemplo convertToInt.
Múltiples restricciones (where): un parámetro genérico puede estar limitado a implementar más
de un tipo o interfaz al mismo tiempo.
Star Projection (List<*>): permite comprobar si un objeto es una lista sin importar el tipo
de elementos que contiene.
 */