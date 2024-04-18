package Abstract;

public class Asalariado extends Empleado {
    private double salario;

    public Asalariado(String nombre, String id, double salario) {
        super(nombre, id);
        this.salario = salario;
    }

    public double calcularSalario() {
        return this.salario;
    }

    @Override
    public String toString() {
        return "Empleado asalariado"+
                "\nSalario total: "+salario;
    }

    
}
