package com.generation;

import com.generation.paquete1.Person;

public class Main {

    public static void main(String[] args) {
        /* write your code here */


        Person person= new Person();
        person.setName("Santiago");
        person.setAge(33);
        person.setId("102045455");
        System.out.println( "Name: " + person.getName());
        System.out.println( "Age: "+ person.getAge());
        System.out.println( "Id: " +  person.getId());

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
