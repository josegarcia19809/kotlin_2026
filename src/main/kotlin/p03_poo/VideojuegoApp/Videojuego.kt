package p03_poo.VideojuegoApp

class Videojuego(
    val titulo: String,
    val genero: String,
    val plataforma: String,
    val anio: Int
) {
    fun mostrarDatos(): String {
        var mensaje = ""
        mensaje += "Videojuego: $titulo \n"
        mensaje += "Genero: $genero \n"
        mensaje += "Plataforma: $plataforma \n"
        mensaje += "Año: $anio \n"
        return mensaje
    }
}