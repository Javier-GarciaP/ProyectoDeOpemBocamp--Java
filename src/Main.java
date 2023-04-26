import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        coche puertasCoche = new coche();
        Scanner sc = new Scanner(System.in);
        int reinicio;


        do {
            System.out.println("Que quiere probar primero: ");
            System.out.println("Presione el numero correspondiente: ");
            System.out.println("1. Primera parte (Sumar Numeros)");
            System.out.println("2. Sengunda parte (Puertas del coche)");
            System.out.println("3. Salir");
            int respuesta = sc.nextInt();

            if (respuesta == 1) {
                System.out.println("Ingrese el primer numero a sumar: ");
                int num1 = sc.nextInt();
                System.out.println("Ingrese el segundo numero a sumar: ");
                int num2 = sc.nextInt();
                System.out.println("Ingrese el tercer numero a sumar: ");
                int num3 = sc.nextInt();
                int resultado;
                resultado = sumar(num1, num2, num3);

                System.out.println("La suma de los tres números es :" + resultado);
            }else if (respuesta == 2) {
                puertasCoche.incrementarPuertas();
                System.out.println("Se a incrementado una puerta al coche");
                System.out.println("Ahora el coche tiene: " + puertasCoche.numPuertas + " puertas");
                int temp = (puertasCoche.numPuertas % 2);

                if (temp == 0){
                    System.out.println("Buen numero de puertas, porque es par");
                }else {
                    System.out.println("Esta bien pero son puertas impares a cada lado");
                }
            }else if (respuesta == 3){
                System.exit(0);
            }else {
                System.out.println("Opción invalida / ingrese una opción correcta");
            }

            System.out.println("Si desea regresar al menu principal ingrese: 1 / si no ingrese cualquier numero");
            reinicio = sc.nextInt();
        } while (reinicio == 1);
    }

    static class coche{
        public int numPuertas = 2;

        public void incrementarPuertas(){
            this.numPuertas++;
        }
    }
    public static int sumar(int a, int b, int c){
        return a + b + c;
    }
}



