package org.example.p03_poo.herencia

fun main() {

    val usuario1 = Usuario("Ana", "ana@gmail.com")
    usuario1.mostrarDatos()

    val usuario2 = Usuario("Luis")
    usuario2.mostrarDatos()
}


private class Usuario(val nombre: String, val correo: String) {

    init {
        println("Usuario creado: $nombre")
    }

    // Constructor secundario
    constructor(nombre: String) : this(nombre, generarCorreo(nombre)) {
        println("Se generó un correo automáticamente")
    }

    fun mostrarDatos() {
        println("Nombre: $nombre - Correo: $correo")
    }

    companion object {
        fun generarCorreo(nombre: String): String {
            return "${nombre.lowercase()}@escuela.com"
        }
    }
}
