public class Persona {

    //Atributos de la clase Persona----->
    private String nombre;
    private int edad;
    private int dni;

    //Método constructor---->
    public Persona(String nombre, int edad, int dni) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
    }


    //Getter & Setters------>
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }



    /**
     * Método la cual va a mostrar los datos de la persona ingresada.
     * Al mismo tiempo, al mostrar verifica si la persona es mayor de edad, o no.
     */

    public void mostrarDatos(){
        System.out.println("\nLos datos de la persona ingresada son:");
        System.out.println("Nombre: "+nombre);
        System.out.println("DNI: "+dni);

        //Condicional para validar si la persona es mayor de edad o no.
        if (edad<=17){
            System.out.println("Edad: "+edad+"\nLa persona es menor de edad.");
        } else
        System.out.println("Edad: "+edad+"\nLa persona es mayor de edad.");
    }
}
