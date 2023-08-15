package busquedabinaria;

import java.util.ArrayList;

public class BusquedaBinaria {

    public static int realizarBusqueda(ArrayList lista, int objetivo) {
        int limDerecha = lista.size() - 1;
        int limIzquierda = 0;
        int medio;

        while (limIzquierda <= limDerecha) {

            medio = (limIzquierda + limDerecha) / 2;
            int puntoMedio = (int) lista.get(medio);

            if (puntoMedio == objetivo) {
                return medio;
            } else if (puntoMedio < objetivo) {
                limIzquierda = medio + 1;
            } else {
                limDerecha = medio - 1;
            }

        }

        return -1;
    }

}
