package p03_poo

// nueva_clase_alumno

class Alumno(val nombre: String, val carrera: String) {
    fun obtenerDatos(): String {
        return "Nombre: $nombre, carrera: $carrera"
    }
}

fun main() {
    val alumno1 = Alumno("José García", "Ing. en Computación")
    println(alumno1.obtenerDatos())

    // Crear otra instancia: alumna2
    val alumno2 = Alumno("María Sánchez", "Arquitectura")
    println(alumno2.obtenerDatos())
}