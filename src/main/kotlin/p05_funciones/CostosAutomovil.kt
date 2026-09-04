package p05_funciones

fun calcularGastosIncurridos(
    mensualidad: Double, seguro: Double, gasolina: Double,
    aceite: Double, llantas: Double, mantenimiento: Double
) {
    val costoTotalMensual = mensualidad + seguro + gasolina + aceite + llantas + mantenimiento
    val costoAnual = costoTotalMensual * 12

    println("El costo mensual es de $$costoTotalMensual")
    println("El costo anual es de $$costoAnual")
}

fun main() {
    println("Calculando gastos del automóvil")

    print("Dime los gastos de la mensualidad: ")
    val mensualidad = readln().toDouble()

    print("Dime los gastos del seguro: ")
    val seguro = readln().toDouble()

    print("Dime los gastos de la gasolina: ")
    val gasolina = readln().toDouble()

    print("Dime los gastos del aceite: ")
    val aceite = readln().toDouble()

    print("Dime los gastos de las llantas: ")
    val llantas = readln().toDouble()

    print("Dime los gastos del mantenimiento: ")
    val mantenimiento = readln().toDouble()

    calcularGastosIncurridos(mensualidad, seguro, gasolina, aceite, llantas, mantenimiento)
}