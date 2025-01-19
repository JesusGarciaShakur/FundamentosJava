import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int resultado = suma(12,25);
        System.out.println(resultado);

    }
    //Nombre es un parametro y el valor que le pasasmos es un argumento
    static int suma(int a, int b){
        return a+b;
    }
}