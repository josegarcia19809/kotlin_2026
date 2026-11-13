package org.example.p09_colecciones

import java.io.File

data class Alpinista(
    var nombre: String,
    var fecha: String,
    var edad: Float,
    var expedicion: String,
    var nacionalidad: String,
    var causaMuerte: String,
    var ubicacion: String
)

var alpinistas = ArrayList<Alpinista>()

fun leerDatosArchivoEverest() {
    val archivo = File("muertes_everest.txt")
    val lineas = archivo.readLines()

    for (linea in lineas) {
        val campos = linea.split("|")

        val nombrex = campos[0]
        val fechax = campos[1]
        val edadx = campos[2].toFloat()
        val expedicionx = campos[3]
        val nacionalidadx = campos[4]
        val causaMuertex = campos[5]
        val ubicacionx = campos[6]

        val nuevoAlpinista = Alpinista(
            nombrex, fechax,
            edadx, expedicionx, nacionalidadx, causaMuertex,
            ubicacionx
        )
        alpinistas.add(nuevoAlpinista)

    }
}

fun mostrarTodosAlpinistas() {
    println("-".repeat(100))
    alpinistas.forEach { println(it) }
    println()
}

fun mostrarAlpinistasDeUK() {
    println("Personas que pertenecieron a United Kingdom")
    println(".".repeat(100))
    alpinistas
        .filter { it.nacionalidad.equals("United Kingdom", ignoreCase = true) }
        .forEach { println("🧗🏼 Nombre: ${it.nombre}, nacionalidad: ${it.nacionalidad}") }
    println()
}

fun mostrarAlpinistasEntre18y21() {
    println("Personas que cuya edad esté entre 18 y 21 años")
    println(".".repeat(100))
    alpinistas
        .filter { it.edad in 18.0..21.0 }
        .forEach { println("🧗🏼 Nombre: ${it.nombre}, edad: ${it.edad}") }
}

fun mostrarAlpinistas50_oMas() {
    println("Personas que cuya edad no sea menor a los 50 años")
    println(".".repeat(100))
    alpinistas
        .filter { it.edad >= 50 }
        .forEach { println("🧗🏼 Nombre: ${it.nombre}, edad: ${it.edad}") }
}

fun mostrarAlpinistasRusosOEdad25() {
    println("Personas rusas o de 25 años")
    println(".".repeat(100))
    alpinistas
        .filter { it.edad == 25.0f || it.nacionalidad.equals("Russia", ignoreCase = true) }
        .forEach {
            println(
                "👨🏼👩🏼‍🦱 Nombre: ${it.nombre}, edad: ${it.edad}, " +
                        "nacionalidad: ${it.nacionalidad}"
            )
        }
}

fun contarNacionalidades() {
    val nacionalidadesUnicas = alpinistas
        .map { it.nacionalidad }
        .filter { it.isNotBlank() }
        .toSet()
    println("⛳️ Hay ${nacionalidadesUnicas.size} nacionalidades diferentes")
    println()
    println(".".repeat(100))
}

fun menuAlpinistas() {

    var opcion: Int

    do {
        println("\n" + "=".repeat(60))
        println("🧗🏼 MENÚ DE ALPINISTAS - MONTE EVEREST")
        println("=".repeat(60))

        println("1. Mostrar todos los alpinistas")
        println("2. Mostrar alpinistas de United Kingdom")
        println("3. Mostrar alpinistas entre 18 y 21 años")
        println("4. Mostrar alpinistas de 50 años o más")
        println("5. Mostrar alpinistas rusos o de 25 años")
        println("6. Contar nacionalidades diferentes")
        println("0. Salir")

        println("-".repeat(60))
        print("Selecciona una opción: ")

        opcion = readln().toIntOrNull() ?: -1

        println()

        when (opcion) {
            1 -> mostrarTodosAlpinistas()
            2 -> mostrarAlpinistasDeUK()
            3 -> mostrarAlpinistasEntre18y21()
            4 -> mostrarAlpinistas50_oMas()
            5 -> mostrarAlpinistasRusosOEdad25()
            6 -> contarNacionalidades()
            0 -> println("👋 ¡Hasta pronto!")
            else -> println("❌ Opción no válida. Intenta nuevamente.")
        }

    } while (opcion != 0)
}


fun main() {
    leerDatosArchivoEverest()
    menuAlpinistas()

}