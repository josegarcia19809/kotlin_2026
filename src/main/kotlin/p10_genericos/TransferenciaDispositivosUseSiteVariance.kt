package org.example.p10_genericos

/*
Este archivo trata el tema de la Varianza en el sitio de uso (Use-Site Variance) en Kotlin.
A diferencia de out e in declarados en una clase, aquí la varianza se especifica al utilizar
un tipo genérico en una función. El ejemplo usa MutableList<out T> para indicar que la lista
de origen solo proporcionará elementos, permitiendo copiar objetos desde listas de subclases
hacia listas de la clase base de forma segura.
 */

// Clase base para todos los dispositivos.
open class Dispositivo(val nombre: String)

// Clases derivadas.
class Laptop(nombre: String) : Dispositivo(nombre)

class Tablet(nombre: String) : Dispositivo(nombre)

// Copia dispositivos de una lista origen a una lista destino.
fun <T : Dispositivo> transferirDispositivos(
    origen: MutableList<out T>,
    destino: MutableList<T>
) {
    for (dispositivo in origen) {
        destino.add(dispositivo)
    }
}

// Crea una lista con laptops.
fun crearLaptops(): MutableList<Laptop> {
    return mutableListOf(
        Laptop("Dell XPS"),
        Laptop("MacBook Air")
    )
}

// Crea una lista vacía de dispositivos.
fun crearInventarioGeneral(): MutableList<Dispositivo> {
    return mutableListOf()
}

// Muestra los dispositivos almacenados.
fun imprimirInventario(inventario: List<Dispositivo>) {
    println("Inventario disponible:")

    for (dispositivo in inventario) {
        println(dispositivo.nombre)
    }

    println()
}

fun main() {

    val laptops = crearLaptops()

    val inventario = crearInventarioGeneral()

    transferirDispositivos(laptops, inventario)

    imprimirInventario(inventario)
}

/*
¿Qué aprenderá el estudiante?
Comprender qué es la Use-Site Variance, es decir, aplicar out o in directamente al usar un
tipo genérico en una función.
Entender que MutableList<out T> indica que la colección solo será utilizada como origen de
datos (productora), por lo que es seguro leer sus elementos.
Aprender que una lista de una subclase (MutableList<Laptop>) puede copiarse a una lista de
la clase base (MutableList<Dispositivo>), siempre que la función utilice correctamente la
varianza en el sitio de uso.
Diferenciar la varianza declarada (out o in en una clase genérica) de la varianza en el
sitio de uso, donde la restricción se aplica únicamente al parámetro específico de una función.
 */