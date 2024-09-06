import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("*****************¡¡¡¡BIENVENIDO!!!!********************");
        System.out.println("Seleccioná el Area a calcular");
        System.out.println("1. Circulo");
        System.out.println("2. Triángulo");
        System.out.println("3 Salir");
        System.out.println("****************************************************");

        int opcion = scanner.nextInt();
        switch (opcion){
            case 1:
                Circulo calcularCirculo = new Circulo();
                System.out.println("Digitá en centimetros el radio del Circulo: ");
                calcularCirculo.setRadio((double) scanner.nextInt());
                double areaCirculo = calcularCirculo.calcularArea();
                System.out.println("El Area del Circulo es: " + areaCirculo);
                break;
            case 2:
                Triangulo calcularTriangulo = new Triangulo();
                System.out.println("Digitá en centimetros la altura del Triángulo: ");
                calcularTriangulo.setAltura((double) scanner.nextInt());
                System.out.println("Digitá el valor en centimetros de la base del Triángulo: ");
                calcularTriangulo.setBase((double) scanner.nextInt());
                double areaTriangulo = calcularTriangulo.calcularArea();
                System.out.println("El Area del Triángulo es: " + areaTriangulo);
                break;
            case 3:
                System.out.println("Hasta la proxima!");
                break;
        }
    }
}