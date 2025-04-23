package views;

import java.util.Scanner;
import models.Person;

public class View {
    
    private Scanner scanner= new Scanner(System.in);

    public int showMenu(){
        System.out.println("----Menu de seleccion----");
        System.out.println("1. Agregar persona");
        System.out.println("2. Ordenar persona");
        System.out.println("3. Buscar persona");
        System.out.println("4. Salir");
        return scanner.nextInt();
    }

    public Person inputPerson(){
        scanner.nextLine();
        System.out.println("Ingrese el nombre: ");
        String name= scanner.nextLine();

        System.out.println("Ingrese la edad: ");
        int age= scanner.nextInt();

        return new Person(name, age);

    }

    public int selectionSortingMethod(){
        System.out.println("----Seleccion del metodo de busqueda----");
        System.out.println("1. Metodo burbuja");
        System.out.println("2. Metodo de insercion");
        System.out.println("3. Metodo de Seleccion");
        return scanner.nextInt();
    }

    public int selectionSortCriterion(){
        System.out.println("----Seleccion de criterio de ordenamiento----");
        System.out.println("1. Nombre");
        System.out.println("2. Edad");
        return scanner.nextInt();
    }
    public int selectionSortCriterion2(){
        System.out.println("----Seleccion de criterio de ordenamiento----");
        System.out.println("1. Ascendente");
        System.out.println("2. Descendente");
        return scanner.nextInt();
    }

    public int selectionSearchCriterion(){
        System.out.println("----Seleccion de criterio de busqueda----");
        System.out.println("1. Por nombre");
        System.out.println("2. Por edad");
        return scanner.nextInt();
    }

    public void displayPersons(Person[] persons) {
        for (Person p : persons) {
            if (p != null)
                System.out.println(p);
        }
    }

    public void displaySearchResult(Person p) {
        System.out.println(p != null ? p.toString() : "Persona no encontrada.");
    }

    public int inputAge() {
        System.out.print("Ingrese la edad que quiere buscar: ");
        return scanner.nextInt();
    }

    public String inputName() {
        scanner.nextLine(); 
        System.out.print("Ingrese el nombre que quiere buscar: ");
        return scanner.nextLine();
    }
}
