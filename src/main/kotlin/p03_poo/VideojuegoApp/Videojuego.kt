package p03_poo.VideojuegoApp

class Videojuego(
    val titulo: String,
    val genero: String,
    val plataforma: String,
    val anio: Int
) {
    fun mostrarDatos(): String {
        return """
            
            Título: $titulo
            Genero: $genero
            Plataforma: $plataforma
            Año: $anio
            ${"-".repeat(100)}
        """.trimIndent()
    }
}