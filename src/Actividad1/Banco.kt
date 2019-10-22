package Actividad1

public class Banco(){
    fun createAcount(saldo: Int):Cuenta= Cuenta(saldo);
    fun getBalance(cuenta: Cuenta)= cuenta.saldo;
    fun deposit(cuenta: Cuenta, money: Int){ cuenta.saldo += money};
    fun withdrar(cuenta: Cuenta, money: Int){ cuenta.saldo -= money};
    fun mostrar(dato:String,tipo:String){
        val ventanilla = Ventanilla();
        when{
            tipo =="ln"-> ventanilla.mostrarEnLinea(dato);
            else -> ventanilla.mostrar(dato);
        }
    }
}