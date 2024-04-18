package Abstract;

public class Comision extends Empleado {
    protected double ventas, porc;

    public Comision(String nombre, String id, double ventas, double porc) {
        super(nombre, id);
        this.ventas = ventas;
        this.porc = porc;
    }

    public double calcularSalario() {
        return (ventas * porc) / 100;
    }

    @Override
    public String toString() {
        return "\nEmpleado por comisión"+
                super.toString()+
                "\nventas: "+ventas+
                "\nporc: "+porc+
                "\nSalario total: "+this.calcularSalario();
    }

    
}
