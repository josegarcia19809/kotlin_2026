package org.example.p09_colecciones

/*
Este archivo es un reto integrador que combina varios conceptos de Kotlin:

Operaciones sobre colecciones (filter, map, zip, contains).
Funciones de alcance (also).
Desestructuración mediante componentN().
Genéricos y contravarianza (in).
 */

// Representa a un empleado de la empresa.
class Empleado(
    val nombre: String,
    val departamento: String,
    val antiguedad: Int
) {

    // Permite desestructurar un objeto Empleado.
    operator fun component1() = nombre
    operator fun component2() = departamento
    operator fun component3() = antiguedad
}

// Clase base para los equipos.
open class Equipo

class Laptop : Equipo()

class ComputadoraEscritorio : Equipo()

// Clase genérica contravariante.
class Almacen<in T>

// Crea un mapa de empleados.
fun registrarEmpleados(): Map<String, Empleado> {

    val empleado1 = Empleado("Ana", "Ventas", 5)
    val empleado2 = Empleado("Luis", "Sistemas", 8)
    val empleado3 = Empleado("María", "Soporte", 3)
    val empleado4 = Empleado("Carlos", "Sistemas", 10)
    val empleado5 = Empleado("Laura", "Recursos Humanos", 6)

    return mapOf(
        empleado1.nombre to empleado1,
        empleado2.nombre to empleado2,
        empleado3.nombre to empleado3,
        empleado4.nombre to empleado4,
        empleado5.nombre to empleado5
    )
}

// Cuenta los empleados de un departamento.
fun contarDepartamento(empleados: Map<String, Empleado>) {

    val total = empleados.filter {
        it.value.departamento == "Sistemas"
    }.count()

    println("Empleados en Sistemas: $total")
    println()
}

// Forma pares nombre-departamento.
fun generarPares(empleados: Map<String, Empleado>) {

    val pares = empleados.map {
        Pair(it.value.nombre, it.value.departamento)
    }

    println(pares)
    println()
}

// Combina dos listas utilizando zip.
fun combinarDatos(empleados: Map<String, Empleado>) {

    val nombres = empleados.map { it.value.nombre }
    val departamentos = empleados.map { it.value.departamento }

    println(nombres.zip(departamentos))
    println()
}

// Muestra información utilizando also.
fun mostrarResumen(empleados: Map<String, Empleado>) {

    empleados.also {
        it.forEach { empleado ->
            println("${empleado.value.nombre} tiene ${empleado.value.antiguedad} años en la empresa.")
        }
    }

    println()
}

// Demuestra la desestructuración.
fun desestructurarEmpleado(empleado: Empleado) {

    val (nombre, departamento, antiguedad) = empleado

    println("Nombre: $nombre")
    println("Departamento: $departamento")
    println("Antigüedad: $antiguedad")
    println()
}

// Obtiene los elementos comunes entre dos listas.
fun localizarCoincidencias() {

    val listaA = listOf(101, 102, 103, 104, 105)
    val listaB = listOf(100, 102, 104, 200)

    val comunes = listaA.filter { listaB.contains(it) }

    println("Elementos comunes: $comunes")
    println()
}

// Demuestra la contravarianza.
fun probarAlmacen() {

    var almacenLaptop = Almacen<Laptop>()
    var almacenGeneral = Almacen<Equipo>()

    almacenLaptop = almacenGeneral

    println("Asignación válida gracias a la contravarianza.")
}

fun main() {

    val empleados = registrarEmpleados()

    contarDepartamento(empleados)

    generarPares(empleados)

    combinarDatos(empleados)

    mostrarResumen(empleados)

    desestructurarEmpleado(empleados["Ana"]!!)

    localizarCoincidencias()

    probarAlmacen()
}

/*¿Qué aprenderá el estudiante?
Utilizar filter() para seleccionar elementos y count() para contarlos.
Transformar colecciones mediante map() y combinar listas con zip().
Emplear la función de alcance also para realizar acciones sobre un objeto sin modificarlo.
Implementar desestructuración mediante component1(), component2() y component3().
Encontrar elementos comunes entre dos listas utilizando filter() y contains().
Comprender la contravarianza (in) y cómo permite asignar un Almacen<Equipo> a una variable de tipo Almacen<Laptop>.

 */