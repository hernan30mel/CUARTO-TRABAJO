public class Tarea4 {

    public static void main(String[] args) {
        int numeros[] = {63,82,36,49,56,64,59,35,78,43,51,70,57,62,43,68,62,26,64,72,52,51,62,60,
                71,61,55,59,60,67,57,67,61,67,51,81,50,64,76,44,73,56,62,63,60};

        int total = numeros.length; // total
        int mayor = numeros[0]; // 1
        int menor = numeros[0]; // 1
        for (int i = 0; i < total; i++) {
            System.out.print("\t" + numeros[i]);
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }
        int rango = mayor - menor;
        int intervalo = (int) Math.ceil(1 + (Math.log(total) / Math.log(2)));
        int amplitud = (int) rango / intervalo;

        System.out.print("\n");
        System.out.println("Datos: " + total);
        System.out.println("Mayor: " + mayor);
        System.out.println("Menor: " + menor);
        System.out.println("Rango: " + rango);
        System.out.println("Intervalo: " + intervalo);
        System.out.println("Amplitud: " + amplitud);
    }
}

