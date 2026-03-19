package org.example.p01_fundamentos

import java.text.DecimalFormat

fun main() {
    println("Calcular el 💰 salario bruto de varios empleados")

    // Crear un objeto para formatear números
    val formatoPeso = DecimalFormat("#,##0.00")

    val empleados = 5

    // crear un arreglo para guardar las horas trabajadas de cada empleado
    val horas = IntArray(empleados)

    // Pedir las horas trabajadas de cada empleado
    println(
        "Introduce las horas trabajadas de los $empleados empleados quienes ganan lo mismo " +
                "por cada hora trabajada"
    )
    for (i in 0 until empleados) {
        print("Empleado #${i + 1}: ")
        horas[i] = readln().toInt()
    }

    // Pedir la tarifa de pago por cada hora trabajada
    print("Dime el salario por hora: ")
    val salario = readln().toDouble()

    // Muestra el salario bruto de cada empleado
    println(".".repeat(100))
    println("Esto es lo que gana cada empleado:")
    for (i in 0 until empleados) {
        val sueldoBruto = horas[i] * salario
        println("Empleado #${i + 1} gana $${formatoPeso.format(sueldoBruto)}")
    }
}