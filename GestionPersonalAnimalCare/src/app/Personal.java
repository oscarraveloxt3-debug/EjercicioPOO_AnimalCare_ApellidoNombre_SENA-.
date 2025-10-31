package app;

public class Personal {
    private String nombre;
    private String identificacion;
    private int edad;


    public Personal(String nombre, String identificacion, int edad) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.edad = edad;


    }

    public String getNombre() {
        return nombre;
    }

    public String getIdentificasion() {
        return identificacion;
    }

    public int getEdad() {
        return edad;
    }
}
