import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        cerrar : while (true){
        mostrarOpciones();
            int numero = scanner.nextInt();
            switch (numero) {
                case 1:
                    int resultado = calculadora(scanner);
                    System.out.println("Tu resultado es: " + resultado);
                    break;
                case 2:
                    hackearNasa();
                    break;
                case 3:
                    System.out.println("saliendo");
                    break cerrar;
                default:
                    System.out.println("Seleccione una opcion correcta");
            }
        }
    }

    private static int calculadora(Scanner scanner) {
        System.out.println("Ingresa el primer numero");
        int numero1 = scanner.nextInt();
        System.out.println("Ingresa el segundo numero");
        int numero2 = scanner.nextInt();
        int solucion = numero1 + numero2;
        return solucion;
    }

    private static void hackearNasa() {
        System.out.println("Estas hackeando la nasa");
        System.out.println("Eres un pro");
    }

    private static void mostrarOpciones(){
        System.out.println("Ingrese una opcion");
        System.out.println("1.Calculadora");
        System.out.println("2.Hackear la NASA");
        System.out.println("3.Salir");
    }
}