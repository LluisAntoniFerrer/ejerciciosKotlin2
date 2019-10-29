package Actividad3.modelo

class CajaAhorra(titular: String, monto: Int, interes: Int = 0) : Cuenta(titular, monto) {
    override fun imprimir() {
        println("Esto es una caja de ahorros")
        super.imprimir()
    }

}