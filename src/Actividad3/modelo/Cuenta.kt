package Actividad3.modelo

abstract class Cuenta(var titular:String,var monto:Int){
    open fun imprimir() {
        println("El titular de la cuenta es: $titular y tiene un monto de: $monto")
    }
};