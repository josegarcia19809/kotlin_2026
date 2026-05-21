package org.example.p07_hotel_lucho

// Separar_palabras
fun main() {
    val linea = "Carolina|300|400|trabajo"
    val campos = linea.split("|")

    val nombre = campos[0]
    val ingresos = campos[1].toDouble()
    val egresos = campos[2].toDouble()
    val fuente = campos[3]

    val saldoFinal = ingresos - egresos
    println("Nombre: $nombre")
    println("Saldo final: $saldoFinal")
    println("Fuente de los ingresos: $fuente")
}