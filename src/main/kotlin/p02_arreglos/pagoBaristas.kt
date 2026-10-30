package p02_arreglos

/*
 * Elaborado por José L. García M
 * Fecha: martes 27 de octubre de 2026
 * Este programa calcula el salario total de cada uno de los baristas de Megan.
 */

fun main() {
    val empleados = 6
    val horas = IntArray(empleados)

    // Pedir las horas trabajadas de cada empleado
    println("Horas de los empleados")

    for (i in 0 until empleados) {
        print("Empleado #${i + 1}: ")
        horas[i] = readln().toInt()
    }

    print("Dame pago por hora: ")
    val pago_por_hora = readln().toDouble()

    println("\nPagos de los empleados de MEGAN")

    // Calcular el salario de cada trabajador
    for (i in 0 until empleados) {
        val pago_total = horas[i] * pago_por_hora
        println("Pago del empleado ${i + 1}: $${"%.2f".format(pago_total)}")
    }
}