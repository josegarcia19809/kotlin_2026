package p02_arreglos

fun main() {
    val alumnos = 5
    val calificaciones = IntArray(alumnos)

    for (i in 0 until alumnos) {
        print("Dame calificación del alumno ${i + 1}: ")
        calificaciones[i] = readln().toInt()
    }

    println()
    println("Resultados:")

    for (i in 0 until alumnos) {
        print("${calificaciones[i]}: ")

        if (calificaciones[i] < 60) {
            println("Reprobado 😩")
        } else if (calificaciones[i] <= 69) {
            println("Suficiente 😤")
        } else if (calificaciones[i] <= 89) {
            println("Buen desempeño 😊")
        } else {
            println("Excelente desempeño 😎")
        }
    }
}
