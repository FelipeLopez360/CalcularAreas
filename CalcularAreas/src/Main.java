import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcionMenu = 0;
        boolean opcionValida = false;

        while (!opcionValida){
            try {
                System.out.println("*****************¡¡¡¡BIENVENIDO!!!!********************");
                System.out.println("Seleccioná el Area a calcular");
                System.out.println("1. Circulo");
                System.out.println("2. Triángulo");
                System.out.println("3 Salir");
                System.out.println("****************************************************");
                opcionMenu = scanner.nextInt();
                if(opcionMenu >= 1 && opcionMenu <= 3) {
                    opcionValida = true;
                } else {
                    System.out.println("Por favor, seleccioná una opción válida del menú (1-3).");
                }
            } catch (InputMismatchException e) {
                System.out.println("Por favor, ingresa un número válido.");
                scanner.next();
            }
        }

        switch (opcionMenu){
            case 1:
                Circulo calcularCirculo = new Circulo();
                double radio = 0;
                boolean validarRadio = false;
                while (!validarRadio){
                    try {
                        System.out.println("Digitá en centimetros el radio del Circulo: ");
                        radio = scanner.nextDouble();
                        validarRadio = true;
                    } catch (InputMismatchException e) {
                        System.out.println("Por favor, ingresa un número válido.");
                        scanner.next();
                    }
                }
                calcularCirculo.setRadio(radio);
                double areaCirculo = calcularCirculo.calcularArea();
                System.out.println("El Area del Circulo es: " + String.format ("%.3f", areaCirculo) + " cm2");
                break;
            case 2:
                Triangulo calcularTriangulo = new Triangulo();
                double altura = 0;
                double base = 0;
                boolean validarAltura = false;
                boolean validarBase = false;
                while (!validarAltura){
                    try {
                        System.out.println("Digitá en centimetros la 'Altura' del Triángulo: ");
                        altura = scanner.nextDouble();
                        validarAltura = true;
                    } catch (InputMismatchException e) {
                        System.out.println("Por favor, ingresa un número válido.");
                        scanner.next();
                    }
                }
                while (!validarBase){
                    try {
                        System.out.println("Digitá en centimetros la 'Base' del Triángulo: ");
                        base = scanner.nextDouble();
                        validarBase = true;
                    } catch (InputMismatchException e) {
                        System.out.println("Por favor, ingresa un número válido.");
                        scanner.next();
                    }
                }
                calcularTriangulo.setAltura(altura);
                calcularTriangulo.setBase(base);
                double areaTriangulo = calcularTriangulo.calcularArea();
                System.out.println("El Area del Triángulo es: " + String.format("%.3f",areaTriangulo) + " cm2");
                break;
            case 3:
                System.out.println("Hasta la proxima!");
                break;
        }
    }
}