
package busquedabinaria;

import java.util.ArrayList;



public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> Lista = new ArrayList<>();
        
        Lista.add(1);
        Lista.add(2);
        Lista.add(22);
        Lista.add(36);
        Lista.add(90);
        Lista.add(115);
        
        int posicion = BusquedaBinaria.realizarBusqueda(Lista, 1);
        if(posicion == -1){
            System.out.println("No se encontró el objetivo");
        }else{
            System.out.println("La busqueda da como resultado que el objetivo dado está en la posición: "+posicion);
        }
        
    }
    
}
