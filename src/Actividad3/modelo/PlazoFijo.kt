package Actividad3.modelo

class PlazoFijo(titular: String, monto: Int,var plazo: Int, var interes: Double) : Cuenta(titular, monto) {
    override fun imprimir() {
        println("Cuenta de plazo fijo: el plazo en dias es: $plazo y tiene un interes de: $interes")
        super.imprimir()
    }
}