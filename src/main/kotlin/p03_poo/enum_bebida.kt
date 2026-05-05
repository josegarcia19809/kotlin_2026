package org.example.p03_poo

enum class BebidaCafeteria(val nombreCompleto: String, val precio: Double) {
    CAFE("café", 12.00),
    TE("té", 25.00),
    CHOCOLATE("chocolate", 32.00),
    FRAPPE("frappe", 42.00);

    fun obtenerDescripcion(): String {
        return "La bebida $nombreCompleto cuesta $precio pesos"
    }

    fun esCara(): Boolean {
        if (precio > 50) return true
        return false
    }
}

fun main() {
    val bebida = BebidaCafeteria.CHOCOLATE
    println(bebida.obtenerDescripcion())
    if (bebida.esCara()) {
        println("Es cara")
    } else {
        println("Es económica")
    }
}