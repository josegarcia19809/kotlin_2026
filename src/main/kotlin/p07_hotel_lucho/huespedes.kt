package org.example.p07_hotel_lucho

import java.io.File

data class Huesped(
    var nombre: String,
    var telefono: String,
    var dias: Int,
    var nacionalidad: String
)

val huespedes = mutableListOf<Huesped>()

val nombreArchivoHuesped = "huespedes.txt"

fun insertarDatosHuesped(
    nombrex: String,
    telefonox: String,
    diasx: Int,
    nacionalidadx: String
) {

    val nuevoHuesped = Huesped(
        nombrex,
        telefonox,
        diasx,
        nacionalidadx
    )

    huespedes.add(nuevoHuesped)
}

fun pedirDatosHuesped() {
    println("Datos del huésped")

    print("Dame nombre: ")
    val nombrex = readln()

    print("Dame teléfono: ")
    val telefonox = readln()

    print("Dame días de estancia: ")
    val diasx = readln().toInt()

    print("Dame nacionalidad: ")
    val nacionalidadx = readln()

    insertarDatosHuesped(nombrex, telefonox, diasx, nacionalidadx)
}

fun mostrarDatosHuesped(indice: Int) {
    println("Datos del huésped")

    println("Nombre: ${huespedes[indice].nombre}")
    println("Teléfono: ${huespedes[indice].telefono}")
    println("Días: ${huespedes[indice].dias}")
    println("Nacionalidad: ${huespedes[indice].nacionalidad}")
}

fun mostrarDatosHuespedes() {
    println("Lista de huéspedes")

    if (huespedes.isEmpty()) {
        println("No hay huéspedes registrados")
        return
    }

    println()

    println(
        "%-25s %-18s %-10s %-15s".format(
            "NOMBRE",
            "TELÉFONO",
            "DÍAS",
            "NACIONALIDAD"
        )
    )

    for (huesped in huespedes) {
        println(
            "%-25s %-18s %-10d %-15s".format(
                huesped.nombre,
                huesped.telefono,
                huesped.dias,
                huesped.nacionalidad
            )
        )
    }
}

fun escribirHuespedEnArchivo() {
    val archivo = File(nombreArchivoHuesped)
    archivo.writeText("")

    for (huesped in huespedes) {
        val texto =
            "${huesped.nombre}|" +
                    "${huesped.telefono}|" +
                    "${huesped.dias}|" +
                    "${huesped.nacionalidad}\n"

        archivo.appendText(texto)
    }

    println("Archivo escrito correctamente")
}

fun leerDatosDesdeArchivoHuesped() {

    val archivo = File(nombreArchivoHuesped)

    val lineas = archivo.readLines()

    for (linea in lineas) {

        val campos = linea.split("|")

        val nombrex = campos[0]
        val telefonox = campos[1]
        val diasx = campos[2].toInt()
        val nacionalidadx = campos[3]

        insertarDatosHuesped(nombrex, telefonox, diasx, nacionalidadx)
    }
}

fun crearArchivoHuespedSiNoExiste() {
    val archivo = File(nombreArchivoHuesped)

    if (!archivo.exists()) {
        archivo.createNewFile()
        println("Archivo creado")
    } else {
        println("El archivo ya existe")
    }
}

fun menuHuespedes() {

    println()
    println("-".repeat(100))
    println("         SISTEMA DE HUÉSPEDES")
    println("1.- ➕ ALTA DE HUÉSPED")
    println("2.- 📋 REPORTE GENERAL")
    println("3.- 🔍 BUSCAR HUÉSPED POR NOMBRE")
    println("4.- 🌎 FILTRAR POR NACIONALIDAD")
    println("5.- 📅 ORDENAR POR DÍAS")
    println("0.- 🚪 SALIR")

    print("👉 Elige una opción: ")
}

fun buscarHuespedPorNombre() {
    if (huespedes.isEmpty()) {
        println("No hay huéspedes registrados")
        return
    }

    print("Dame el nombre a buscar: ")
    val nombreBuscar = readln()

    var encontrado = false

    for (i in huespedes.indices) {
        if (huespedes[i].nombre.lowercase() == nombreBuscar.lowercase()) {
            println()
            println("Huésped encontrado ✅")
            mostrarDatosHuesped(i)
            encontrado = true
            break
        }
    }

    if (!encontrado) {
        println("No se encontró el huésped ❌")
    }
}

fun filtrarPorNacionalidad() {
    if (huespedes.isEmpty()) {
        println("No hay huéspedes registrados")
        return
    }

    print("Dame la nacionalidad: ")
    val nacionalidadBuscar = readln()

    var encontrado = false

    println()

    println(
        "%-25s %-18s %-10s %-15s".format(
            "NOMBRE",
            "TELÉFONO",
            "DÍAS",
            "NACIONALIDAD"
        )
    )

    for (huesped in huespedes) {
        if (huesped.nacionalidad.lowercase() == nacionalidadBuscar.lowercase()) {
            println(
                "%-25s %-18s %-10d %-15s".format(
                    huesped.nombre,
                    huesped.telefono,
                    huesped.dias,
                    huesped.nacionalidad
                )
            )

            encontrado = true
        }
    }

    if (!encontrado) {

        println("No se encontraron huéspedes ❌")
    }
}

fun ordenarPorDias() {
    if (huespedes.isEmpty()) {
        println("No hay huéspedes registrados")
        return
    }

    val huespedesOrdenados = huespedes.sortedBy { it.dias }

    println()
    println("Huéspedes ordenados por días 📅")

    println(
        "%-25s %-18s %-10s %-15s".format(
            "NOMBRE",
            "TELÉFONO",
            "DÍAS",
            "NACIONALIDAD"
        )
    )

    for (huesped in huespedesOrdenados) {
        println(
            "%-25s %-18s %-10d %-15s".format(
                huesped.nombre,
                huesped.telefono,
                huesped.dias,
                huesped.nacionalidad
            )
        )
    }
}

fun main() {
    crearArchivoHuespedSiNoExiste()
    leerDatosDesdeArchivoHuesped()
    mostrarDatosHuespedes()

    var opcion: Int
    do {
        menuHuespedes()
        opcion = readln().toInt()

        when (opcion) {

            1 -> {
                pedirDatosHuesped()

                escribirHuespedEnArchivo()
            }

            2 -> mostrarDatosHuespedes()

            3 -> buscarHuespedPorNombre()

            4 -> filtrarPorNacionalidad()

            5 -> ordenarPorDias()

            0 -> println("Saliendo...")

            else -> println("Opción no válida")
        }

    } while (opcion != 0)
}