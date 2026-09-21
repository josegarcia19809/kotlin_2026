package p05_funciones

fun calcularVentas(ventasTotales: Double, porcentaje: Int): Double {
    return ventasTotales * (porcentaje / 100.0)
}

fun mostrarVentas(nombreDivision: String, ventas: Double) {
    println("-".repeat(100))
    println("✅ Nombre de la división: $nombreDivision")
    println("💰 Ventas calculadas: $ventas")
}

fun main() {
    println("Predicción de ventas 📝📊📈")

    val ventasEste = calcularVentas(200000.0, 60)
    mostrarVentas("Este", ventasEste)

    val ventasOeste = calcularVentas(200000.0, 20)
    mostrarVentas("Oeste", ventasOeste)

    val ventasNorte = calcularVentas(200000.0, 10)
    mostrarVentas("Norte", ventasNorte)

    val ventasSur = calcularVentas(200000.0, 10)
    mostrarVentas("Sur", ventasSur)
}