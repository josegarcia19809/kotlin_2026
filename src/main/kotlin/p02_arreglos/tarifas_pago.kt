package org.example.p02_arreglos

fun main() {
    val tarifasPago = DoubleArray(12)
    tarifasPago[1] = 1.2
    tarifasPago[2] = 10.0
    for (i in 0..11) {
        println(tarifasPago[i])
    }
}