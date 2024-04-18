package Abstract;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Compania {
    static String nombre, cc;

    static void datos() {
        nombre = JOptionPane.showInputDialog("Nombre");
        cc = JOptionPane.showInputDialog("Identificación");
    }

    public static void main(String[] args) {
        ArrayList<Empleado> listaEmp = new ArrayList<>();

        Comision emp1 = null;
        PorHora emp2 = null;
        Asalariado emp3 = null;
        AsaXComision emp4 = null;

        int opc, horast, valorh;
        int sueldo_base;
        double salario, ventas, porc, bono;

        while (true) {
            String input = JOptionPane.showInputDialog("MENU"+
                                    "\n1. Agregar empleado asalariado"+
                                    "\n2. Agregar empleado por horas"+
                                    "\n3. Agregar empleado por comisión"+
                                    "\n4. Agregar empleado asalariado por comisión"+
                                    "\n5. Consultar salario"+
                                    "\n6. Ver empleado"+
                                    "\nPara salir haga clic en cancelar o cierre la ventana");

            if (input == null) {
                JOptionPane.showMessageDialog(null, "Programa finalizado");
                return;
            }

           opc = Integer.parseInt(input);

            switch (opc) {
                case 1: datos();
                        salario = Double.parseDouble(JOptionPane.showInputDialog("Salario"));
                        emp3 = new Asalariado(nombre, cc, salario);
                        listaEmp.add(emp3);
                        JOptionPane.showMessageDialog(null, "Empleado creado");
                    break;
                case 2:
                        datos();
                        horast = Integer.parseInt(JOptionPane.showInputDialog("Horas trabajadas"));
                        valorh = Integer.parseInt(JOptionPane.showInputDialog("Valor horas"));
                        emp2 = new PorHora(nombre, cc, horast, valorh);
                        listaEmp.add(emp2);
                        JOptionPane.showMessageDialog(null, "Empleado creado");
                    break;
                case 3:
                        datos();
                        ventas = Double.parseDouble(JOptionPane.showInputDialog("ventas"));
                        porc = Double.parseDouble(JOptionPane.showInputDialog("Porcentaje"));
                        emp1 = new Comision(nombre, cc, ventas, porc);
                        listaEmp.add(emp1);
                        JOptionPane.showMessageDialog(null, "Empleado creado");
                        break;
                case 4:
                        datos();
                        ventas = Double.parseDouble(JOptionPane.showInputDialog("ventas"));
                        porc = Double.parseDouble(JOptionPane.showInputDialog("Porcentaje"));
                        sueldo_base = Integer.parseInt(JOptionPane.showInputDialog("Sueldo base"));
                        bono = Double.parseDouble(JOptionPane.showInputDialog("Bono"));
                        emp4 = new AsaXComision(nombre, cc, ventas, porc, sueldo_base, bono);
                        listaEmp.add(emp4);
                        JOptionPane.showMessageDialog(null, "Empleado creado");
                        break;
                case 5:
                        cc = JOptionPane.showInputDialog("Consultar salario\nIdentificacion");
                        for (Empleado e: listaEmp) {
                            if (e.getId().equalsIgnoreCase(cc)) {
                                JOptionPane.showMessageDialog(null, "Salario: "+e.calcularSalario());
                            } else JOptionPane.showMessageDialog(null, "Identificación incorrecta");
                        }
                        break;
                case 6:
                        cc = JOptionPane.showInputDialog("Consultar salario\nIdentificacion");
                        for (Empleado e: listaEmp) {
                            if (e.getId().equalsIgnoreCase(cc)) {
                                JOptionPane.showMessageDialog(null, e);
                            } else JOptionPane.showMessageDialog(null, "Identificación incorrecta");
                        }
                        break;
                default: JOptionPane.showMessageDialog(null, "Opción incorrecta");
            }
        }
    }
}
