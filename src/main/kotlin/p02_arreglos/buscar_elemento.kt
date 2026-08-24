package p03_colecciones

fun main() {
    val productos = arrayOf("Pan", "Leche", "Huevos", "Arroz")

    val buscado = "Leche"
    if (buscado in productos) {
        println("Producto encontrado")
    } else {
        println("Producto no encontrado")
    }
}