//EjercicioRepositorio1
import java.util.Scanner;
public class EjercicioRepositorio1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, aleatorio, contadorPares = 0, contadorImpares = 0;
        
        System.out.println("Ingrese un numero entero");
        numero = entrada.nextInt();
        
        for (int i = 1; i <= numero; i++) {
            aleatorio = (int) (Math.random() * (100 + 1));
            System.out.println("El numero es: " + aleatorio);
            
            if (aleatorio % 2 == 0) {
                ++contadorPares;
                
            }   else    {
                ++contadorImpares;
            }

        }
 
        System.out.println("Cantidad de numeros pares: " + contadorPares); 
        System.out.println("Cantidad de numeros impares: " + contadorImpares); 
    }
}