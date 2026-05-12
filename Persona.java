public class Persona {

    // Atributos
    private String nombre;
    private String correo;
    private int edad;
    private String salario;

    // Constructor
    public Persona(String nombre, String correo, int edad) {
        this.nombre = nombre;
        this.correo = correo;
        this.edad = edad;
    }

    // Getter y Setter de nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getter y Setter de correo
    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    // Getter y Setter de edad
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Método para mostrar datos
    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Correo: " + correo);
        System.out.println("Edad: " + edad);
    }

    // Método main
    public static void main(String[] args) {

        Persona persona1 = new Persona(
                "Daniel",
                "daniel@gmail.com",
                19
        );

        persona1.mostrarDatos();
    }
}