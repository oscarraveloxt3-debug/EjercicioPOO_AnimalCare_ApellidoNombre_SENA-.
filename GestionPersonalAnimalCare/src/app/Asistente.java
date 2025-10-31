package app;

public class Asistente {
    private int turnosTrabajados;
    private double pagoPorTurno;


    public Asistente (int turnosTrabajados, double pagoPorTurno){
        this.turnosTrabajados = turnosTrabajados;
        this.pagoPorTurno = pagoPorTurno;
    }
    public int getTurnosTrabajados(){
        return turnosTrabajados;
    }
    public double getPagoPorTurno(){
        return pagoPorTurno;
    }

}
