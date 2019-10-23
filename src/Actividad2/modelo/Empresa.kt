package Actividad2.modelo

data class Empresa(var nombre:String,var anyodefundacion:String, var personas: MutableList<Persona> = arrayListOf());