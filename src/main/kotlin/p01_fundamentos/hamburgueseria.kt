package p02_condicionales

fun main() {
    println("Pedido en hamburguesería 🍔")
    val precio = 60.0

    print("Cuántas hamburguesas compró el cliente: ")
    val hamburguesas = readln().toInt()

    print("El cliente es miembro de la hamburguesería (si/no): ")
    val esCliente = readln().lowercase()
    // val esCliente = "si"

    val total = precio * hamburguesas
    println("Total: $$total")

    if (total <= 300 && esCliente == "si") {
        println("Tu pedido es pequeño y tienes un beneficio.")
    } else {
        println("Tu pedido es grande o no tienes membresia")
    }
}