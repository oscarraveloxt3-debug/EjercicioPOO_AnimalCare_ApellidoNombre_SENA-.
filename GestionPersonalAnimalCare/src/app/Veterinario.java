package app;

public class Veterinario {
    private String especialidad;
    private double salarioBase;
    private String nombreVeterinario;


    public Veterinario (String especialidad,double salarioBase ){
        this.especialidad = especialidad;
        this.salarioBase = salarioBase;

    }
    public String getEspecialidad(){
        return especialidad;
    }
    public double getSalarioBase(){
        return salarioBase;
    }
    public String getNombreVeterinario(){
        return nombreVeterinario;
    }

}
