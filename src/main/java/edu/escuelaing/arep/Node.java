package edu.escuelaing.arep;

public class Node {
    private double valor; // Valor que va a albergar el nodo
    private Node nextNode; // El nodo poterior al que se va a apuntar
    private Node priorNode; // El nodo anterrior al que se va a apuntar


    /**
     * Constructor de la clase Node
     * @param valor El valor que el nodo va a albergar
     * @param nextNode El nodo poterior al que se va a apuntar
     * @param priorNode El nodo anterrior al que se va a apuntar
     */
    public Node(double valor, Node nextNode, Node priorNode) {
        this.valor = valor;
        this.nextNode = nextNode;
        this.priorNode = priorNode;
    }

    /**
     * Metodo que retorna el valor del nodo
     * @return retorna un numero tipo double, que es valor del nodo
     */
    public double getValor() {
        return valor;
    }

    /**
     * Metodo que le asigna un valor al nodo
     * @param valor el valor que se le va a asignar al nodo
     */
    public void setValor(double valor) {
        this.valor = valor;
    }

    /**
     * Metodo que retorna el nodo siguiente al que se le apunta
     * @return un nodo que es el siguiente al actual
     */
    public Node getNextNode() {
        return nextNode;
    }

    /**
     * Metodo que asigna el nodo siguiente al actual nodo
     * @param nextNode el nodo que sigue
     */
    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }

    /**
     * Metodo que retorna el nodo anterior al que se le apunta
     * @return un nodo que es el anterior al actual
     */
    public Node getPriorNode() {
        return priorNode;
    }

    /**
     * Metodo que asigna el nodo anterior al actual nodo
     * @param priorNode el nodo anterior
     */
    public void setPriorNode(Node priorNode) {
        this.priorNode = priorNode;
    }
}