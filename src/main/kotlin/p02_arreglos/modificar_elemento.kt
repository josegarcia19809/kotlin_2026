package p03_colecciones

fun main() {
    val precios = arrayOf(25.50, 40.00, 15.00)

    // Cambiar el segundo precio
    precios[1] = 30.0
    // Imprimir precios, uno por renglón
    for (precio in precios) {
        println(precio)
    }
}