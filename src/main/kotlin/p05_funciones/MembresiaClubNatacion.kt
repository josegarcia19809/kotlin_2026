package org.example.p05_funciones

fun mostrarNombreMiembro() {
    println("José L. García")
}

fun mostrarTarifas() {
    println("Tarifas")
    println("👦🏻👧🏻Niños: $300.00")
    println("👱🏻‍♀️👱🏻‍♂️Jóvenes: $600.00")
    println("🧔🏻👩🏻‍🦳Adultos: $800.00")
}

fun verFechaRegistro() {
    println("Fecha de registro:")
    println("25/09/2025📆")
}

fun verFechaCaducidad() {
    println("Fecha de caducidad:")
    println("25/04/2026📆")
}

fun imprimirLineaDivision() {
    println("-".repeat(100))
}

fun main() {
    println("Membresía del club de 🏊")
    println("Bienvenido")
    imprimirLineaDivision()
    mostrarNombreMiembro()
    imprimirLineaDivision()
    mostrarTarifas()
    imprimirLineaDivision()
    verFechaRegistro()
    imprimirLineaDivision()
    verFechaCaducidad()
}