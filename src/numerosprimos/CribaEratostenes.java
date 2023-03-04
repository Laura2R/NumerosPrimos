/**
 * Clase para generar todos los números primos de 1 hasta
 * un número máximo especificado por el usuario.
 */
package numerosprimos;

import java.util.Arrays;

public class CribaEratostenes {

    /**
     * Generar números primos de 1 a max
     *
     * @param max es el valor máximo
     * @return Vector de números primos
     */

    public static int[] generarPrimos(int max) {

        if (max < 2) {
            return new int[0];//no hay primos, devuelve array vacio
        }
        boolean[] esPrimo = new boolean[max + 1];
        Arrays.fill(esPrimo, true);//rellenamos el array como primo(true) excepto el 0 y el 1
        esPrimo[0] = false;
        esPrimo[1] = false;

//se implementa el algoritmo de la criba de eratostenes
        for (int i = 2; i * i <= max; i++) {
            if (esPrimo[i]) {
                for (int j = i * i; j <= max; j += i) {
                    esPrimo[j] = false;
                }
            }
        }

//se cuenta el numero de primos que hay
        int cuenta = 0;
        for (boolean primo : esPrimo) {
            if (primo) {
                cuenta++;
            }
        }

//se crea el array de primos
        int[] primos = new int[cuenta];
        int idx = 0;
        for (int i = 0; i <= max; i++) {
            if (esPrimo[i]) {//si es primo se agrega al array
                primos[idx++] = i;
            }
        }

        return primos;

    }
}
