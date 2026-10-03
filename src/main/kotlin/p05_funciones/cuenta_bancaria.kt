package org.example.p05_funciones


fun actualizarSaldo(saldo: Double, movimiento: Double, tipo: String): Double {
    var saldoActual = 0.0
    if (tipo == "deposito") {
        saldoActual = saldo + movimiento
    } else {
        saldoActual = saldo - movimiento
    }
    return saldoActual
}

fun main() {
    println(actualizarSaldo(5000.0, 1000.0, "deposito"))
    println(actualizarSaldo(5000.0, 1500.0, "retiro"))
}


