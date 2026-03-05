package org.example.p01_fundamentos

fun main() {
    // Definir los precios de los boletos y porcentajes de ganancias
    val precioBoletoAdulto: Double = 10.00
    val precioBoletoNinio: Double = 6.00
    val porcentajeCine: Double = 0.20
    val porcentajeDistribuidor: Double = 0.80

    print("Dame el nombre de la película: ")
    val nombrePelicula: String = readln()

    print("Dame número de entradas de adulto vendidas: ")
    val entradasAdulto: Int = readln().toInt()

    print("Dame número de entradas de niño vendidas: ")
    val entradasNinio: Int = readln().toInt()

    // Calcular ganancia bruta y neta de taquilla
    val gananciaBruta: Double = (entradasAdulto * precioBoletoAdulto) +
            (entradasNinio * precioBoletoNinio)
    val gananciaNeta: Double = gananciaBruta * porcentajeCine
    val montoDistribuidor: Double = gananciaBruta * porcentajeDistribuidor

    // Mostrar el informe
    println("Nombre de la película: $nombrePelicula ")
    println("Entradas para adultos vendidas: \t\t\t$entradasAdulto")
    println("Entradas para niños vendidas: \t\t\t\t$entradasNinio")
    println("Ganancia bruta de taquilla: \t\t\t$$gananciaBruta")
    println("Ganancia neta de taquilla: \t\t\t\t$$gananciaNeta")
    println("Monto pagado al distribuidor: \t\t\t$$montoDistribuidor")

}