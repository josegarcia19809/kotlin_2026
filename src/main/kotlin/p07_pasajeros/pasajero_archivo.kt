package org.example.p07_pasajeros
//
//import java.io.File
//
//data class Pasajero(
//    var clave: Int,
//    var nombre: String,
//    var origen: String,
//    var destino: String,
//    var pasaje: Double
//)
//
//var pasajero1 = Pasajero(0, "", "", "", 0.0)
//val nombreArchivo = "pasajeros2.txt"
//
//fun main() {
//
////    crearArchivoSiNoExiste()
////
////    pedirDatos()
////
////    escribirEnArchivo()
//
//    recuperarDeArchivo()
//    mostrarDatosPasajero()
//
//}
//
//fun pedirDatos() {
//
//    println("Escribe los datos del pasajero")
//
//    print("Dame la clave: ")
//    val clavex = readln().toInt()
//
//    print("Dame el nombre: ")
//    val nombrex = readln()
//
//    print("Dame origen: ")
//    val origenx = readln()
//
//    print("Dame destino: ")
//    val destinox = readln()
//
//    print("Dame precio del pasaje: ")
//    val pasajex = readln().toDouble()
//
//    insertar(clavex, nombrex, origenx, destinox, pasajex)
//
//}
//
//fun insertar(
//    clavex: Int,
//    nombrex: String,
//    origenx: String,
//    destinox: String,
//    pasajex: Double
//) {
//    pasajero1.clave = clavex
//    pasajero1.nombre = nombrex
//    pasajero1.origen = origenx
//    pasajero1.destino = destinox
//    pasajero1.pasaje = pasajex
//
//}
//
//fun mostrarDatosPasajero() {
//
//    println("..................................")
//    println("Datos del pasajero:")
//    println("Clave: ${pasajero1.clave}")
//    println("Nombre: ${pasajero1.nombre}")
//    println("Origen: ${pasajero1.origen}")
//    println("Destino: ${pasajero1.destino}")
//    println("Pasaje: ${pasajero1.pasaje}")
//
//}
//
//fun crearArchivoSiNoExiste() {
//
//    val archivo = File(nombreArchivo)
//
//    if (!archivo.exists()) {
//        archivo.createNewFile()
//        println("Archivo creado")
//    } else {
//        println("El archivo ya existe")
//    }
//}
//
//fun dividirEnTokens(linea: String, delimitador: Char): List<String> {
//    return linea.split(delimitador)
//}
//
//fun escribirEnArchivo() {
//
//    val archivo = File(nombreArchivo)
//    archivo.writeText(
//        "${pasajero1.clave}|${pasajero1.nombre}|${pasajero1.origen}|${pasajero1.destino}|${pasajero1.pasaje}\n"
//    )
//}
//
//fun recuperarDeArchivo() {
//
//    val archivo = File(nombreArchivo)
//
//    if (!archivo.exists()) {
//        println("No se pudo abrir el archivo")
//        return
//    }
//
//    archivo.forEachLine { linea ->
//        val campos = dividirEnTokens(linea, '|')
//        if (campos.size == 5) {
//            val clavex = campos[0].toInt()
//            val nombrex = campos[1]
//            val origenx = campos[2]
//            val destinox = campos[3]
//            val pasajex = campos[4].toDouble()
//
//            insertar(clavex, nombrex, origenx, destinox, pasajex)
//        }
//    }
//
//}