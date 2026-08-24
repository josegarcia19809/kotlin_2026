package p03_colecciones

fun main() {
    // Crear una lista de 4 nombres
    val nombres: Array<String> = arrayOf("Ana", "Luis", "Pedro", "Sofía")
    // Imprimir los nombres en pantalla, uno por renglón
    for (nombre in nombres) {
        println(nombre)
    }
}