package edu.escuelaing.arep;
public class LinkedList {
    private Node cabeza; //Se reifiere a la cabeza de la lista
    private Node cola; //Se reifiere a la cola de la lista
    private int tamano; //Se reifiere al tamaño de la lista
    private Node nextNode; //Se reifiere al nodo siguinete en la lista
    private Node priorNode; //Se reifiere al nodo anterior en la lista

    /**
     * Constructor de la clase LinkedList
     */
    public LinkedList() {
        this.cabeza = null;
        this.cola = null;
        this.tamano = 0;

    }

    /**
     * Funcion para agregar un nodo al final de la lista
     * @param value el valor que va a guardar el nodo
     */
    public void addNode(double value){
        Node nuevo = new Node(value, null, null);
        if (tamano == 0){
            cabeza = nuevo;
            cola = nuevo;
            this.nextNode = cabeza;
            this.priorNode = null;
        }
        else{
            cola.setNextNode(nuevo);
            nuevo.setPriorNode(cola);
            cola = nuevo;
        }
        tamano = tamano + 1;
    }

    /**
     * Metodo que remueve un nodo del final de la lista
     */
    public void removeNode(){
        if (tamano == 1){
            cabeza = null;
            cola = null;
        }
        else if(tamano > 1){
            Node nuevo = cola.getPriorNode();
            nuevo.setNextNode(null);
            cola = nuevo;
        }
        tamano = tamano - 1;
    }

    /**
     * Metodo que retorna el siguente nodo de la lista
     * @return un nodo que esta en la posicion de siguiente
     */
    public Node nextNode(){
        if (nextNode != null){
            priorNode = nextNode;
            nextNode = nextNode.getNextNode();
            return priorNode;
        }
        else{

        }
        return null;
    }

    /**
     * Metodo que retorna el anterior nodo de la lista
     * @return un nodo que esta en la posicion de anterior
     */
    public Node priorNode(){
        if (priorNode != null){
            Node retorno = priorNode;
            nextNode = priorNode.getNextNode();
            priorNode = priorNode.getPriorNode();
            return retorno;
        }
        return null;
    }

    /**
     * Metodo que retorna la cabeza de la lista
     * @return El nodo que es la cabeza de la lista
     */
    public Node getCabeza() {
        return cabeza;
    }

    /**
     * asigna la cabeza de la lista
     * @param cabeza un Nodo el cual se desea asignar como cabeza
     */
    public void setCabeza(Node cabeza) {
        this.cabeza = cabeza;
    }

    /**
     * Metodo que retrona la cola de la lista
     * @return Un nodo el cual es la cola de la lista
     */
    public Node getCola() {
        return cola;
    }

    /**
     * Metodo que asigna la cola de la lista
     * @param cola Nodo que va a ser la cola de la lista
     */
    public void setCola(Node cola) {
        this.cola = cola;
    }

    /**
     * Metodo que retorna el tamaño de la lista
     * @return un entero que se refiere al tamaño de la lista
     */
    public int getTamano() {
        return tamano;
    }

    /**
     * Metodo que le asigna el tamaño a la lista
     * @param tamano un entero que es el tamaño de la lista
     */
    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    /**
     * Metodo que reinicia la posicion del nodo siguiente y el anterior
     */
    public void reiniciar(){
        nextNode = cabeza;
        priorNode = null;
    }

}