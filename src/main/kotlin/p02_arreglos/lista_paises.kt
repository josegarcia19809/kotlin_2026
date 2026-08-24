package p03_colecciones

fun main() {
    // Crear lista de países
    val paises: Array<String> =
        arrayOf(
            "Argentina", "México", "España",
            "Estados Unidos", "Canadá", "Francia"
        )

    // Imprimir cada elemento por línea
    for (pais in paises) {
        println(pais)
    }

    // Acceso a países por su índice
    println()
    println(paises[0])
    println(paises[1])
    println(paises[2])
    println(paises[3])
    println(paises[4])
    println(paises[5])

    println()
    println("Cantidad de países: ${paises.size}")

    // Quiero cambiar el elemento que está
    // en el índice 3. Cambiar Estados Unidos
    // y poner Brasil
    paises[3] = "Brasil"

    // Imprimir el arreglo sin for
    println(paises.contentToString())

}