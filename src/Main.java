import  java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Se invoca la clase Scanner.
        Scanner sc = new Scanner(System.in);

        //Aquí se pedirá los datos del objeto Persona que se va a crear.
        System.out.println("Ingrese el nombre de la persona: ");
        String nombre = sc.nextLine();
        System.out.println("Ingrese la edad de la persona: ");
        int edad = sc.nextInt();
        System.out.println("Ingrese el DNI de la persona: ");
        int dni = sc.nextInt();

        //Se crea el objeto añadiendo los datos que se ingresaron anteriormente.
        Persona p1 = new Persona(nombre, edad, dni);


        //Se invoca el método mostrarDatos proveniente de la case Persona, para mostrar la información.
        p1.mostrarDatos();
    }
}
