import java.util.ArrayList;
import java.util.List;

public class GestorEmpleados {
   
    private final List<Empleado> empleados;

    
    public GestorEmpleados() {
        empleados = new ArrayList<>();
    }

    
    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
        System.out.println("Empleado agregado correctamente.");
    }

    
    public void mostrarEmpleados() {
        if (empleados.isEmpty()) {
            System.out.println("Aun no hay empleados para mostrar.");
        } else {
            for (Empleado empleado : empleados) {
                empleado.mostrarInfo();
                System.out.println("--------------------");
            }
        }
    }
}

