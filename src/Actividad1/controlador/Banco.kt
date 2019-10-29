package Actividad1.Actividad1.controlador

import Actividad1.Actividad1.modelo.Cuenta
import Actividad1.Actividad1.vista.Ventanilla

public class Banco(){
    fun createAcount(saldo: Int): Cuenta = Cuenta(saldo);
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
    fun main(){
        // Pruebas actividad 1
        var banco = Banco();
        var cuenta1 = banco.createAcount(1000);
        banco.mostrar(banco.getBalance(cuenta1).toString(),"ln");
        banco.deposit(cuenta1,5000);
        banco.withdrar(cuenta1, 500);
        banco.mostrar(banco.getBalance(cuenta1).toString(),"ln");
        cuenta1.toString();
    }
}