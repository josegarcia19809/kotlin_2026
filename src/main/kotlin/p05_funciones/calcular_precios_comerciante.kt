package p05_funciones

fun calcularPrecioMenudeo(precioMayoreo: Double, margenGanancia: Int): Double {
    val ganancia = precioMayoreo * (margenGanancia / 100.00)
    val precioMenudeo = precioMayoreo + ganancia
    return precioMenudeo
}

fun main() {
    println("Calculando precios como todo un comerciante🧔🏻‍♂️")

    print("Dame el precio del producto al mayoreo: ")
    val precioMayoreo = readln().toDouble()

    print("Dame el margen de ganancia en porcentaje: ")
    val margenGanancia = readln().toInt()

    val precioAlMenudeo = calcularPrecioMenudeo(precioMayoreo, margenGanancia)
    println("🖥️El precio del producto al menudeo es: $precioAlMenudeo")
}