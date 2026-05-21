package org.example.p07_hotel_lucho

import java.io.File

data class ServicioHotel(
    var nombreServicio: String,
    var costo: Double,
    var disponible: String,
    var horario: String
)

val servicio = ServicioHotel("", 0.0, "", "")
val servicios = mutableListOf<ServicioHotel>()
val nombreArchivoServicio = "servicios.txt"

fun insertarServicio(nombrex: String, costox: Double, disponiblex: String, horariox: String) {
    val nuevoServicio = ServicioHotel(nombrex, costox, disponiblex, horariox)
    servicios.add(nuevoServicio)
}

fun mostrarDatosServicio(indice: Int) {
    println("Datos del servicio 💶")
    println("Nombre del servicio: ${servicios[indice].nombreServicio}")
    println("Costo: ${servicios[indice].costo}")
    println("¿Está disponible? ${servicios[indice].disponible}")
    println("Horario: ${servicios[indice].horario}")
}

fun mostrarTodosLosServicios() {
    println("Lista de servicios 💶")

    if (servicios.isEmpty()) {
        println("No hay servicios registrados")
        return
    }

    println()
    println(
        "%-25s %-12s %-15s %-20s".format(
            "SERVICIO",
            "COSTO",
            "DISPONIBLE",
            "HORARIO"
        )
    )

    for (servicio in servicios) {
        println(
            "%-25s %-12.2f %-15s %-20s".format(
                servicio.nombreServicio,
                servicio.costo,
                servicio.disponible,
                servicio.horario
            )
        )
    }
}

fun pedirDatosServicio() {
    println("Datos de un nuevo servicio del Hotel 💶")

    print("Dame nombre: ")
    val nombrex = readln()

    print("Dame costo: ")
    val costox = readln().toDouble()

    print("¿Está disponible (si/no)? ")
    val disponiblex = readln()

    print("Dame horario: ")
    val horariox = readln()

    insertarServicio(nombrex, costox, disponiblex, horariox)
}

fun crearArchivoServicioSiNoExiste() {

    val archivo = File(nombreArchivoServicio)
    if (!archivo.exists()) {
        archivo.createNewFile()
        println("Archivo creado")
    } else {
        println("El archivo ya existe")
    }
}

fun menuServicios() {

    println()
    println("🏨---------------------------------------------🏨")
    println("          SISTEMA DE SERVICIOS")
    println("1.- ➕ ALTA DE SERVICIO")
    println("2.- 📋 REPORTE GENERAL")
    println("3.- 🔍 BUSCAR SERVICIO")
    println("4.- ✅ FILTRAR DISPONIBLES")
    println("5.- 💰 ORDENAR POR COSTO")
    println("0.- 🚪 SALIR")

    print("👉 Elige una opción: ")
}

fun buscarServicioPorNombre() {
    if (servicios.isEmpty()) {
        println("No hay servicios registrados")
        return
    }

    print("Dame el nombre del servicio: ")
    val nombreBuscar = readln()

    var encontrado = false

    for (i in servicios.indices) {
        if (servicios[i].nombreServicio.lowercase() == nombreBuscar.lowercase()) {
            println()
            println("Servicio encontrado ✅")

            mostrarDatosServicio(i)
            encontrado = true

            break
        }
    }

    if (!encontrado) {
        println("Servicio no encontrado ❌")
    }
}

fun filtrarServiciosDisponibles() {
    if (servicios.isEmpty()) {
        println("No hay servicios registrados")
        return
    }

    println()
    println("Servicios disponibles ✅")

    println(
        "%-25s %-12s %-15s %-20s".format(
            "SERVICIO",
            "COSTO",
            "DISPONIBLE",
            "HORARIO"
        )
    )

    for (servicio in servicios) {
        if (servicio.disponible.lowercase() == "si") {
            println(
                "%-25s %-12.2f %-15s %-20s".format(
                    servicio.nombreServicio,
                    servicio.costo,
                    servicio.disponible,
                    servicio.horario
                )
            )
        }
    }
}

fun ordenarServiciosPorCosto() {
    if (servicios.isEmpty()) {
        println("No hay servicios registrados")
        return
    }

    val serviciosOrdenados = servicios.sortedBy { it.costo }

    println()
    println("Servicios ordenados por costo 💰")

    println(
        "%-25s %-12s %-15s %-20s".format(
            "SERVICIO",
            "COSTO",
            "DISPONIBLE",
            "HORARIO"
        )
    )

    for (servicio in serviciosOrdenados) {
        println(
            "%-25s %-12.2f %-15s %-20s".format(
                servicio.nombreServicio,
                servicio.costo,
                servicio.disponible,
                servicio.horario
            )
        )
    }
}

fun escribirServicioEnArchivo() {
    val archivo = File(nombreArchivoServicio)
    archivo.writeText("") // Limpiar el archivo
    for (servicio in servicios) {
        val texto = "${servicio.nombreServicio}|" +
                "${servicio.costo}|" +
                "${servicio.disponible}|" +
                "${servicio.horario}\n"
        archivo.appendText(texto)
    }
    println("El archivo $nombreArchivoServicio se ha guardado")
}

fun leerServiciosDesdeArchivo() {
    val archivo = File(nombreArchivoServicio)

    val lineas = archivo.readLines()
    for (linea in lineas) {
        val campos = linea.split("|")

        val nombrex = campos[0]
        val costox = campos[1].toDouble()
        val disponiblex = campos[2]
        val horariox = campos[3]
        insertarServicio(nombrex, costox, disponiblex, horariox)
    }
}

fun main() {

    crearArchivoServicioSiNoExiste()
    leerServiciosDesdeArchivo()
    mostrarTodosLosServicios()

    var opcion: Int
    do {

        menuServicios()
        opcion = readln().toInt()

        when (opcion) {

            1 -> {
                pedirDatosServicio()
                escribirServicioEnArchivo()
            }

            2 -> mostrarTodosLosServicios()

            3 -> buscarServicioPorNombre()

            4 -> filtrarServiciosDisponibles()

            5 -> ordenarServiciosPorCosto()

            0 -> println("Saliendo...")

            else -> println("Opción no válida")
        }

    } while (opcion != 0)
}