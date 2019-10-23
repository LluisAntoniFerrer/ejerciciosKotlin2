import Actividad1.Actividad1.controlador.Banco
import Actividad2.controlador.actividad2

fun main(){
    //actividad1();
    actividad2().menu();


}
fun actividad1(){
    // Pruebas actividad 1
    var banco = Banco();
    var cuenta1 = banco.createAcount(1000);
    banco.mostrar(banco.getBalance(cuenta1).toString(),"ln");
    banco.deposit(cuenta1,5000);
    banco.withdrar(cuenta1, 500);
    banco.mostrar(banco.getBalance(cuenta1).toString(),"ln");
    cuenta1.toString();
}