package Actividad1.Actividad1.modelo

data class Cuenta(var saldo: Int){
    override fun toString():String{
        println(saldo);
        return saldo.toString();
    }
};