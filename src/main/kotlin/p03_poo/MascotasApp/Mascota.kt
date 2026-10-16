package p03_poo.MascotasApp

class Mascota(
    val nombre: String,
    val tipo: String,
    val edad: Int
) {
    fun mostrarDatos(): String{
        return "Nombre: $nombre, tipo: $tipo, edad: $edad"
    }
}