package Actividad5.controlador
import Actividad5.modelo.Dado
class Actividad5 {
    fun main(){
        println("Valor del dado");
        var valor = readLine()!!.toInt();
        val dado = Dado(valor);
        println(dado.toString());
    }
}