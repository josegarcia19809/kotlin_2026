package p02_condicionales

fun main() {
    println("Tienda refrescos")

    val precio = 20.0
    println("cuantos refrescos pidio el cliente: ")
    val refrescos = readln().toInt()

    val total = precio * refrescos
    println("Tienda refrescos: $total")

    if (total != 100.00) {
        println("El total no coincide con la promocion especial")

    } else {
        println("Exacto obtienes un refresco gratis.")
    }
}