package Actividad3.controlador

import Actividad3.modelo.CajaAhorra
import Actividad3.modelo.PlazoFijo

class BancoAhorro() {
    fun main() {
        val cajaAhorro = CajaAhorra("juan", 10000)
        cajaAhorro.imprimir()
        val plazoFijo = PlazoFijo("Ana", 5000, 30, 1.23)
        plazoFijo.imprimir()
    }
}