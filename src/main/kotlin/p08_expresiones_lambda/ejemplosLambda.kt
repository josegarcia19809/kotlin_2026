package org.example.p08_expresiones_lambda

import org.example.p05_funciones.imprimirLineaDivision
import java.util.Locale.getDefault

data class EmployeeL(
    var firstName: String = "",
    var lastName: String = "",
    var startYear: Int = 0
)

var saludarL = {
    println("Hola mundo")
}

val sumarL = { a: Int, b: Int -> a + b }

fun imprimirNumerosV() {
    val numeros = listOf(100, 200, 300, 400, 500, 600, 700, 800, 900)
    numeros.forEach { print("$it ") }
    println()
}

fun topLevel() = println("Top Level")

fun despedirse() {
    println("Adiós")
}

fun ejecutar(funcion: () -> Unit) {
    funcion()
}

fun construccionCadenas() {
    fun countTo100() = StringBuilder().apply {
        for (x in 1..12) {
            append(x)
            append(", ")
        }
        append(13)
    }.toString()

    print(countTo100())
    println()
}

fun EmployeeLApp() {
    /*
        val empleado = EmployeeL()
        empleado.firstName = "John"
        empleado.lastName = "G"
        empleado.startYear = 2026
     */
    // Se evita repetir el nombre de la variable (empleado) en cada línea.
    val employeeL = EmployeeL().apply {
        firstName = "John"
        lastName = "g"
        startYear = 2026
    }
    println(employeeL)
}

fun textoWith() {
    /*
    ¿Qué ocurre internamente?

    Es parecido a escribir:

    fun textoWith() {

        val sb = StringBuilder()

        sb.append("Hola ")
        sb.append("Kotlin")

        val texto = sb.toString()

        println(texto)

    }
     */
    val texto = with(StringBuilder()) {
        append("Hola ")
        append("Kotlin")
        toString()
    }
    println(texto)
}

fun labels() {

    listOf(1, 2, 3, 4, 5).forEach salir@{
        if (it == 3)
            return@salir
        print("$it ")
    }
    println()
    println("Fin")
}

fun labelConThis() {
    /*
    Aquí existen dos objetos String.

    Sin etiquetas sería difícil saber a cuál this se hace referencia.

    this@etiqueta indica explícitamente el objeto del bloque externo.
     */
    "Some String".apply etiqueta@{
        "Another String".apply {
            println(lowercase(getDefault()))
            println(this@etiqueta.uppercase(getDefault()))
        }
    }
}

fun buscarEnLista() {
    fun buscar(
        lista: List<String>,
        nombre: String
    ) {
        lista.forEach {
            if (it == nombre) {
                println("Encontrado $it")
                return
            }
        }
        println("No encontrado")
    }

    val listaNombre = listOf("Carlos", "Rebeca", "Carolina")
    buscar(listaNombre, "Carlos")
    buscar(listaNombre, "Karla")
}

fun funcionOrdenSuperior() {
    fun operar(a: Int, b: Int, operacion: (Int, Int) -> Int): Int {
        return operacion(a, b)
    }

    val resultado = operar(12, 2) { x, y -> x * y }
    println(resultado)
}

fun main() {
    saludarL()
    imprimirLineaDivision()
    println(sumarL(8, 5))
    imprimirLineaDivision()
    imprimirNumerosV()
    imprimirLineaDivision()
    run(::topLevel)
    imprimirLineaDivision()
    run { println("Ejecutando dentro de run") }
    imprimirLineaDivision()
    ejecutar(::despedirse)
    imprimirLineaDivision()
    EmployeeLApp()
    imprimirLineaDivision()
    textoWith()
    imprimirLineaDivision()
    construccionCadenas()
    imprimirLineaDivision()
    labels()
    imprimirLineaDivision()
    labelConThis()
    imprimirLineaDivision()
    buscarEnLista()
    imprimirLineaDivision()
    funcionOrdenSuperior()
    imprimirLineaDivision()
    imprimirLineaDivision()

    imprimirLineaDivision()
    imprimirLineaDivision()

    imprimirLineaDivision()
    imprimirLineaDivision()

    imprimirLineaDivision()
    imprimirLineaDivision()

    imprimirLineaDivision()

}