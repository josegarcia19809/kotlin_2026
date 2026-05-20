package org.example.p07_hotel_lucho

import java.io.File

data class Habitacion(
    var numero: Int,
    var tipo: String,
    var precioNoche: Double,
    var disponible: String
)

val habitaciones = mutableListOf<Habitacion>()
val nombreArchivoHabitacion = "habitaciones.txt"

fun insertarHabitacion(
    numerox: Int, tipox: String, precioNochex: Double, disponiblex: String
) {
    val nuevaHabitacion = Habitacion(
        numerox, tipox, precioNochex,
        disponiblex
    )
    habitaciones.add(nuevaHabitacion)
}

fun pedirDatosHabitacion() {
    println("Dame los datos de la habitación")

    print("Dame el número: ")
    val numerox = readln().toInt()

    print("Dame el tipo: ")
    val tipox = readln()

    print("Dame el precio por noche: ")
    val precioNochex = readln().toDouble()

    print("Dime si está disponible (si/no): ")
    val disponiblex = readln()

    insertarHabitacion(numerox, tipox, precioNochex, disponiblex)
}

fun mostrarDatosHabitacion(indice: Int) {
    println("Datos de la habitación")
    println("Número: ${habitaciones[indice].numero}")
    println("Tipo: ${habitaciones[indice].tipo}")
    println("Precio por noche: ${habitaciones[indice].precioNoche}")
    println("Disponible?: ${habitaciones[indice].disponible}")
}

fun mostrarDatosTodasHabitaciones() {
    println("Datos de las habitaciones")
    if (habitaciones.isEmpty()) {
        println("No hay habitaciones registradas")
        return
    }

    println()

    println(
        "%-8s %-25s %-10s %-12s".format(
            "NUMERO",
            "TIPO",
            "PRECIO",
            "DISPONIBLE"
        )
    )
    for (habitacion in habitaciones) {
        println(
            "%-8d %-25s %-10.2f %-12s".format(
                habitacion.numero,
                habitacion.tipo,
                habitacion.precioNoche,
                habitacion.disponible
            )
        )
    }
}

fun escribirEnArchivoHabitacion() {
    val archivo = File(nombreArchivoHabitacion)
    archivo.writeText("") // limpia el archivo antes de escribir
    for (habitacion1 in habitaciones) {
        val texto = "${habitacion1.numero}|${habitacion1.tipo}|" +
                "${habitacion1.precioNoche}|${habitacion1.disponible}\n"
        archivo.appendText(texto)
    }
    println("El archivo $nombreArchivoHabitacion se ha escrito correctamente")
}

fun recuperarDeArchivoHabitacion() {
    val archivo = File(nombreArchivoHabitacion)

    val lineas = archivo.readLines()

    for (linea in lineas) {
        val campos = linea.split("|")

        val numerox = campos[0].toInt()
        val tipox = campos[1]
        val preciox = campos[2].toDouble()
        val disponiblex = campos[3]

        insertarHabitacion(
            numerox, tipox,
            preciox, disponiblex
        )
    }
}

fun crearArchivoHabitacionSiNoExiste() {

    val archivo = File(nombreArchivoHabitacion)

    if (!archivo.exists()) {
        archivo.createNewFile()
        println("Archivo creado")
    } else {
        println("El archivo ya existe")
    }
}

fun menuHabitaciones() {
    println()
    println("🏨---------------------------------------------------------------🏨")
    println("           SISTEMA DE HABITACIONES 🛏️")
    println("1.- ➕ ALTA DE HABITACIONES")
    println("2.- 📋 REPORTE GENERAL")
    println("3.- 🔍 BUSCAR POR NÚMERO DE HABITACIÓN")
    println("4.- 🛌 FILTRAR HABITACIONES POR TIPO")
    println("5.- 💰 ORDENAR HABITACIONES POR PRECIO")
    println("0.- 🚪 SALIR")
    print("👉 Elige una opción: ")
}
fun buscarPorNumeroDeHabitacion() {

    if (habitaciones.isEmpty()) {
        println("No hay habitaciones registradas")
        return
    }

    print("Dame el número de habitación a buscar: ")
    val numeroBuscar = readln().toInt()

    var encontrado = false

    for (i in habitaciones.indices) {

        if (habitaciones[i].numero == numeroBuscar) {

            println()
            println("Habitación encontrada ✅")
            mostrarDatosHabitacion(i)

            encontrado = true
            break
        }
    }

    if (!encontrado) {
        println("No se encontró la habitación ❌")
    }
}

fun filtrarHabitacionesPorTipo() {

    if (habitaciones.isEmpty()) {
        println("No hay habitaciones registradas")
        return
    }

    print("Dame el tipo de habitación a buscar: ")
    val tipoBuscar = readln()

    var encontrado = false

    println()
    println(
        "%-8s %-25s %-10s %-12s".format(
            "NUMERO",
            "TIPO",
            "PRECIO",
            "DISPONIBLE"
        )
    )

    for (habitacion in habitaciones) {

        if (habitacion.tipo.lowercase() == tipoBuscar.lowercase()) {

            println(
                "%-8d %-25s %-10.2f %-12s".format(
                    habitacion.numero,
                    habitacion.tipo,
                    habitacion.precioNoche,
                    habitacion.disponible
                )
            )

            encontrado = true
        }
    }

    if (!encontrado) {
        println("No se encontraron habitaciones de ese tipo ❌")
    }
}

fun ordenarHabitacionesPorPrecio() {

    if (habitaciones.isEmpty()) {
        println("No hay habitaciones registradas")
        return
    }

    val habitacionesOrdenadas = habitaciones.sortedBy { it.precioNoche }

    println()
    println("Habitaciones ordenadas por precio 💰")
    println(
        "%-8s %-25s %-10s %-12s".format(
            "NUMERO",
            "TIPO",
            "PRECIO",
            "DISPONIBLE"
        )
    )

    for (habitacion in habitacionesOrdenadas) {

        println(
            "%-8d %-25s %-10.2f %-12s".format(
                habitacion.numero,
                habitacion.tipo,
                habitacion.precioNoche,
                habitacion.disponible
            )
        )
    }
}

fun main() {
    crearArchivoHabitacionSiNoExiste()
    recuperarDeArchivoHabitacion()
    mostrarDatosTodasHabitaciones()

    var opcion: Int

    do {
        menuHabitaciones()
        opcion = readln().toInt()

        when (opcion) {
            1 -> {
                pedirDatosHabitacion()
                escribirEnArchivoHabitacion()
            }

            2 -> mostrarDatosTodasHabitaciones()

            3 -> buscarPorNumeroDeHabitacion()

            4 -> filtrarHabitacionesPorTipo()

            5 -> ordenarHabitacionesPorPrecio()

            0 -> println("Saliendo...")

            else -> println("Opción no válida")
        }

    } while (opcion != 0)
}
