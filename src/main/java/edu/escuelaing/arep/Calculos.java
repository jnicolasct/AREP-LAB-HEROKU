package edu.escuelaing.arep;
public class Calculos {
    LinkedList lista; //Una lista doblemente enlazada, que contiene todos los valores
    double mean; // la media de los valores de la lista

    /**
     * Constructor de la clase Calculos
     * @param lista una lista doblemente enlazada que contiene todos los valores
     */
    public Calculos(LinkedList lista) {
        this.lista = lista;
    }

    /**
     * Metodo que calcula la media de los valores de la lista
     * @return retorna un numero tipo double que se refiere a la media de la lista
     */
    public double mean(){
        lista.reiniciar();
        double contador = 0.0;
        for (int i=0; i<lista.getTamano(); i++){
            contador = contador + lista.nextNode().getValor();
        }
        double tamano2 = (double) lista.getTamano();
        double respuesta = contador/tamano2;
        this.mean = respuesta;

        return respuesta;
    }

    /**
     * Metodo que calcula la desviacion estandar de los valores de la lista
     * @return retrona un numero tipo double que rerpresnea la desviacion estandar
     */
    public double deviation(){
        lista.reiniciar();
        double contador = 0.0;
        for (int i=0; i<lista.getTamano(); i++){
            double vNodo= lista.nextNode().getValor();
            double resta = vNodo-this.mean;
            double aSumar = resta * resta;
            contador = contador + aSumar;
        }
        double tamano2 = (double) lista.getTamano()-1;
        double resp = contador/tamano2;
        double respuesta = Math.sqrt(resp);
        return respuesta;
    }


}