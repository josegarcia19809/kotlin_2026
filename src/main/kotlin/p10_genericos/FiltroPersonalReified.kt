package org.example.p10_genericos

/*
Este archivo trata el tema de los parámetros de tipo reificados (Reified Type Parameters).
Muestra cómo una función genérica inline puede conocer el tipo real (T) durante la ejecución
para filtrar elementos de una lista mediante is T, algo que normalmente no es posible con los
genéricos debido al type erasure.
 */

data class Empleado(
    val nombre: String,
    val puesto: String
)

// Obtiene todos los elementos de un tipo específico dentro de una lista.
inline fun <reified T> filtrarPorTipo(elementos: List<Any>): List<T> {

    val resultado = mutableListOf<T>()

    for (elemento in elementos) {
        if (elemento is T) {
            resultado.add(elemento)
        }
    }

    return resultado
}

// Crea una lista con diferentes tipos de datos.
fun crearRegistroMixto(): List<Any> {
    return listOf(
        "Recursos Humanos",
        25,
        18500.50,
        Empleado("Laura", "Gerente"),
        "Ventas",
        Empleado("Carlos", "Analista"),
        true,
        9800.75
    )
}

// Muestra únicamente los valores de tipo String.
fun visualizarDepartamentos(registro: List<Any>) {
    val departamentos = filtrarPorTipo<String>(registro)

    println("Departamentos:")
    departamentos.forEach { println(it) }
    println()
}

// Muestra únicamente los objetos Empleado.
fun visualizarEmpleados(registro: List<Any>) {
    val empleados = filtrarPorTipo<Empleado>(registro)

    println("Empleados:")
    empleados.forEach { println(it) }
    println()
}

// Muestra únicamente los valores Double.
fun visualizarSalarios(registro: List<Any>) {
    val salarios = filtrarPorTipo<Double>(registro)

    println("Salarios:")
    salarios.forEach { println(it) }
    println()
}

fun main() {

    val registro = crearRegistroMixto()

    visualizarDepartamentos(registro)
    visualizarEmpleados(registro)
    visualizarSalarios(registro)
}

/*
¿Qué aprenderá el estudiante?
inline: inserta el código de la función directamente donde se invoca, permitiendo optimizaciones.
reified: conserva el tipo genérico durante la ejecución para poder utilizar expresiones como is T.
Crear una función genérica que filtre elementos de cualquier tipo sin necesidad de realizar
conversiones manuales.
Reutilizar la misma función para obtener listas de String, Double, Empleado o cualquier otro
tipo de objeto.
 */