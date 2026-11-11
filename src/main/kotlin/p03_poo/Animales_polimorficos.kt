package org.example.p03_poo

// La clase Animal representa un animal genérico
open class Animal(private val especie: String){
    fun mostrarEspecie(){
        println("Soy un(a) $especie")
    }

    open fun hacerSonido(){
        print("📢Grrr ")
    }
}

class Perro: Animal("Perro"){
    override fun hacerSonido(){
        println("Guau, guau")
    }
}

class Gato: Animal("Gato"){
    override fun hacerSonido(){
        println("Miau, Meow")
    }
}

class Vaca: Animal("Vaca"){
    override fun hacerSonido(){
        println("Muuu")
    }
}

fun probarPerro(){
    println("Animal Perro 🐶")
    val firulais = Perro()
    firulais.mostrarEspecie()
    firulais.hacerSonido()
    println("-".repeat(100))
    println()
}

fun probarGato(){
    println("Animal Gato 🐈")
    val mixi = Gato()
    mixi.mostrarEspecie()
    mixi.hacerSonido()
    println("-".repeat(100))
    println()
}

fun probarVaca(){
    println("Animal Vaca 🐄")
    val lola = Vaca()
    lola.mostrarEspecie()
    lola.hacerSonido()
    println("-".repeat(100))
    println()
}

fun main() {
    probarVaca()
    probarPerro()
    probarGato()
}
