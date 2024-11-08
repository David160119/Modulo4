import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            GestorEmpleados gestor = new GestorEmpleados();
            
            OUTER:
            while (true) {
                System.out.println("\n--- Bienvenido al Sistema de Gestion de Empleados ---");
                System.out.println("1. Agregar un empleado");
                System.out.println("2. Mostrar empleados");
                System.out.println("3. Salir");
                System.out.print("Elige una opcion: ");
                int opcion = scanner.nextInt();
                switch (opcion) {
                    case 1 -> {
                        
                        scanner.nextLine(); 
                        System.out.print("Nombre: ");
                        String nombre = scanner.nextLine();
                        System.out.print("Edad: ");
                        int edad = scanner.nextInt();
                        System.out.print("Salario: ");
                        double salario = scanner.nextDouble();
                        Empleado empleado = new Empleado(nombre, edad, salario);
                        gestor.agregarEmpleado(empleado);
                    }
                    case 2 -> 
                        gestor.mostrarEmpleados();
                    case 3 -> {
                        System.out.println("Saliendo del sistema");
                        break OUTER;
                    }
                    default -> System.out.println("Opcion rechazada. Intente de nuevo.");
                }
            }
        }
    }
}

