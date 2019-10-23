package Actividad2.controlador

import Actividad2.modelo.Persona
import Actividad2.modelo.Empresa

class actividad2() {
    var empresas = mutableListOf<Empresa>();
    var empleados = mutableListOf<Persona>();
    fun menu() {
        do {
            println("Elija la opcion: ");
            println("1: Crear nueva empresa");
            println("2: Crear empleado");
            println("3: Añadir empleado a empresa existente");
            println("4: Listado de empresas");
            println("5: Listado de empleados de una empresa");
            println("6: Informacion de una empresa en particular");
            println("7: Información de un empleado en particular");
            println("8: Salir");
            var opcion = readLine()!!.toInt();
            when (opcion) {
                1 -> createCompany()
                2 -> createPerson()
                3 -> assignEmployee()
                4 -> companyList()
                5->personList()
                6->companyInfo()
                7->employeeInfo()
            }
        } while (opcion != 8)
    }

    fun createCompany() {
        println("Como se llama la empresa?");
        var name = readLine().toString();
        println("Año de funcacion?");
        var anyodefundacion = readLine().toString();
        empresas.add(Empresa(name, anyodefundacion))
    }

    fun createPerson() {
        println("Cual es nombre del usuario?");
        var name = readLine().toString();
        println("Apellidos del usuario?");
        var coname = readLine().toString();
        println("Fecha de nacimiento?");
        var fechanacimiento = readLine().toString();
        println("Fecha de contrato?");
        var fechaContrato = readLine().toString();
        empleados.add(Persona(name, coname, fechanacimiento, fechaContrato))
    }

    fun assignEmployee() {
        println("Que usuario quieres asignar (solo el identificador)?")
        for ((indice, item) in empleados.withIndex()) {
            println("Empleado $indice : "+item.nombre+" "+item.apellidos)
        }
        var usuario = readLine()!!.toInt();

        println("A que empresa quieres añadirlo (solo el identificador)?")
        for ((indice, item) in empresas.withIndex()) {
            println("Empresa $indice : "+item.nombre)
        }
        var empresa = readLine()!!.toInt();
        empresas[empresa].personas.add(empleados[usuario]);
        empleados.removeAt(usuario);

    }
    fun companyList(){
        println("Listado de empresas")
        for ((indice, item) in empresas.withIndex()) {
            println("Empresa $indice : "+item.nombre)
        }
    }

    fun personList(){
        println("Listado de empleados")
        println("Seleccione una empresa (solo el identificador)?")
        for ((indice, item) in empresas.withIndex()) {
            println("Empresa $indice : "+item.nombre)
        }
        var empresa = readLine()!!.toInt();
        for ((indice, item) in empresas[empresa].personas.withIndex()) {
            println("Empleado $indice : "+item.nombre+" "+item.apellidos)
        }
    }
    fun companyInfo(){
        println("selecciona una de las empresas (solo el identificador)")
        for ((indice, item) in empresas.withIndex()) {
            println("Empresa $indice : "+item.nombre)
        }
        var empresa = readLine()!!.toInt();
            println("La empresa "+empresas[empresa].nombre+" se creo en el año "+empresas[empresa].anyodefundacion)

    }
    fun employeeInfo(){
        println("selecciona una de las empresas (solo el identificador)")
        for ((indice, item) in empresas.withIndex()) {
            println("Empresa $indice : "+item.nombre)
        }
        var empresa = readLine()!!.toInt();
        println("selecciona uno de los empleados (solo el identificador)")
        for ((indice, item) in empresas[empresa].personas.withIndex()) {
            println("Empleado $indice : "+item.nombre+" "+item.apellidos)
        }
        var usuario = readLine()!!.toInt();
        println("El empleado se llama "+empresas[empresa].personas[usuario].nombre+" "+empresas[empresa].personas[usuario].apellidos
                +" nacio el "+empresas[empresa].personas[usuario].fechanacimiento+" y fue contratado en "+empresas[empresa].personas[usuario].fechaContrato);
    }
}