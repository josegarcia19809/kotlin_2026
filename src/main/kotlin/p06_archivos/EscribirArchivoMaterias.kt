package p06_archivos

// EscribirArchivoMaterias

import java.io.File

fun main() {
    println("Programa para registrar materias 📕")

    print("¿En cuántas materias te inscribiste este semestre? ")
    val numMaterias = readln().toInt()

    val materias = arrayListOf<String>()

    for (i in 1..numMaterias) {
        print("Dame el nombre de la materia #$i: ")
        val materia = readln()

        materias.add(materia)
    }

    val archivo = File("materias.txt")
    archivo.writeText(materias.joinToString("\n"))
    println("✅ La lista de materias se ha guardado en materias.txt")
}
