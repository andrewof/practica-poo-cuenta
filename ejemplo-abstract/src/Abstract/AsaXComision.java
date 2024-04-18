package Abstract;

public class AsaXComision extends Comision {
    private double sueldo_base, bono;

    public AsaXComision(String nombre, String id, double ventas, double porc, double sueldo_base, double bono) {
        super(nombre, id, ventas, porc);
        this.sueldo_base = sueldo_base;
        this.bono = bono;
    }

    public double calcularSalario() {
        double salario = sueldo_base + ((sueldo_base*bono)/100) + super.calcularSalario();
        return salario;
    }

    @Override
    public String toString() {
        return "Empleado asalariado por comisión"+
                super.toString()+
                "\nSueldo base: "+sueldo_base+
                "\nbono: "+bono+
                "\nSalario total: "+this.calcularSalario();
    }

    
}
