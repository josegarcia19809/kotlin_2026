package org.example.p03_poo

open class Veterinario {
    open val nombre = "Dra. Ana Torres"
    val especialidad = "Cuidado de mascotas"

    open fun mostrarInfo() {
        println("El (La) veterinario (a) $nombre atiende el área de $especialidad")
    }
}

class VeterinarioAuxiliar : Veterinario() {
    override val nombre = "Miguel Flores"

    override fun mostrarInfo() {
        println(
            "El auxiliar veterinario $nombre apoya en el área de $especialidad, " +
                    "bajo la supervisión del (de la) veterinario (a) ${super.nombre}"
        )
    }
}

fun main() {
    val v1 = Veterinario()
    val vaux = VeterinarioAuxiliar()

    v1.mostrarInfo()
    vaux.mostrarInfo()
}