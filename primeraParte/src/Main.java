public class Main {
    public static void main(String[] args) {
        //llamo la función y le doy valores
        int num = suma(1,2,3);
        //imprimo por pantalla el resultado
        System.out.println("El resultado es: " + num);
    }
    //función que recibe 3 parametros los suma y devuelve el resultado
    public static int suma(int num1, int num2, int num3)
    {
        int resultado = num1 + num2 + num3;
        return resultado;
    }
}