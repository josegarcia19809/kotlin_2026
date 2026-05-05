package org.example.p03_poo

interface SistemaPedido {
    fun calcularTotal(pizzas: Int): String
}

fun procesarPedido(sistema: SistemaPedido) {
    println("Sistema pedido: ${sistema.calcularTotal(5)}")
}

fun main() {
    procesarPedido(object : SistemaPedido {
        override fun calcularTotal(pizzas: Int): String {
            val pagoPorPizza = 200
            return "El pago por las $pizzas pizzas es ${pagoPorPizza * pizzas} pesos"
        }
    })
}