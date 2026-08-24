package p02_condicionales

fun main() {
    println("Noche de cine")

    val precioBoleto = 75.0
    println("cuantos boletos compro el usuario:")

    val boletos = readln().toInt()

    val total = precioBoleto * boletos
    println("Total: $total")
    if (total > 300.00) {
        println("¡Felicidades!Recibes palomitas gratis.")
    } else {
        println("No hay promocion disponible.")
    }
}