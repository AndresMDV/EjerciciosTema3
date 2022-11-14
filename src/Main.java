public class Main {
    public static void main(String[] args) {
        int num1 = 1, num2 = 3, num3 = 5;
        int sum = suma(num1, num2, num3);
        System.out.println(sum);


        coche nuevoCoche = new coche(2);
        System.out.println(nuevoCoche.puertas);
        nuevoCoche.añadirPuertas(1);
        System.out.println(nuevoCoche.puertas);
    }

    public static int suma(int a, int b, int c) {
        return a + b + c;
    }
}

