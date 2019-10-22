package Actividad1

data class Cuenta(var saldo: Int){
    override fun toString():String{
        println(saldo);
        return saldo.toString();
    }
};