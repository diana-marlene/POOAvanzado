package com.generation;

import com.generation.paquete1.Person;

public class Main {

    public static int numerador = 10;
    public static int denominador =0;
    public static float  division;

    public static void main(String[] args) {
        /* write your code here */

        System.out.println("Antes de hacer la división");
        try{
            division = numerador /denominador;
        }catch (NullPointerException ex) {
            System.out.println("Null pointer");
            System.out.println(ex.getMessage());
        }

        System.out.println("Después de la división");

        /*Person person= new Person();
        person.setName("Santiago");
        person.setAge(33);
        person.setId("102045455");
        System.out.println( "Name: " + person.getName());
        System.out.println( "Age: "+ person.getAge());
        System.out.println( "Id: " +  person.getId());*/

        /*CuentaBancaria cuenta = new CuentaBancaria();
        cuenta.setNombre("Diana Sánchez");
        cuenta.setClave("ABC-1002791");
        cuenta.setSaldo(-5000);
        System.out.println(cuenta.getNombre());

        cuenta.mostrarSaldo();*/
        /*
        Persona persona = new Persona();
        persona.nombre ="Diana";
        persona.edad =22;
        persona.saludar();
        Animal animal = new Animal();
        animal.nombre = "Iguana";*/

    }
}
