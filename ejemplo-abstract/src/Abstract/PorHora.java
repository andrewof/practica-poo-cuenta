package Abstract;

public class PorHora extends Empleado {
    private int horast, valorh, horase;

    public PorHora(String nombre, String id, int horast, int valorh) {
        super(nombre, id);
        this.horast = horast;
        this.valorh = valorh;
        this.horase = 0;
    }

    public double calcularSalario() {
        double salario;
        if (horast > 40) {
            this.horase = this.horast - 40;
            salario = (this.horase * this.valorh*1.5) + (40 * this.horast);
        } else  salario = this.horast * this.valorh;

        return salario;
    }

    public int getHorast() {
        return horast;
    }

    public int getHorase() {
        return horase;
    }

    @Override
    public String toString() {
        return "Empleado por hora "+
                super.toString()+
                "\nhoras trabajadas: "+horast+
                "\nvalor horas: " +valorh+
                "\nhoras extras: "+horase+
                "\nSalario total: "+this.calcularSalario();
    }

    
}
