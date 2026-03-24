package org.example.p02_arreglos

fun main() {
    println("🏋Pago de membresías en un gimnasio")

    val usuarios = 4
    val mesesInscripcion = IntArray(usuarios)

    for (i in 0 until usuarios) {
        print("Ingrese el numero de meses de membresia de usuario ${i + 1}: ")
        mesesInscripcion[i] = readln().toInt()
    }
    println()

    print("Ingrese el costo mensual: ")
    val costo = readln().toDouble()
    println("-".repeat(100))

    for (i in 0 until usuarios) {
        val pagoMembresia = mesesInscripcion[i] * costo
        println("El costo total para el cliente ${i + 1} es: $pagoMembresia pesos")
    }
}