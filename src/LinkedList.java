public class LinkedList {
    class Node {
        int value;
        Node next = null;
        Node(int value){
            this.value = value;
        }
    }
    protected Node head = null;
    protected Node tail = null;

    public void agregarValorAlInicio(int value){
        Node nuevoNodo = new Node(value);
        nuevoNodo.next = head;
        head = nuevoNodo;
        if(nuevoNodo.next==null){
            tail = nuevoNodo;
        }
    }

    public void agregarFinal(int value){
        Node nuevoNodo = new Node(value);
        if(tail == null){
            head = nuevoNodo;
        } else{
            tail.next = nuevoNodo;
            tail = nuevoNodo;
        }
    }

    public void agregarPorPosicion(int posicion, int value){
        if(posicion<0){
            throw new IndexOutOfBoundsException();
        } else if(posicion==0){
            agregarValorAlInicio(value);
        } else {
            Node nuevoNodo = new Node(value);
            Node actual = head;
            for (int i = 0; i < posicion-1; i++) {
                if(actual == null){
                    throw new IndexOutOfBoundsException();
                }
                actual = actual.next;
            }
            if(actual.next == null){
                agregarFinal(value);
            } else {
                nuevoNodo.next = actual.next;
                actual.next = nuevoNodo;
            }
        }
    }
    public boolean contiene(int value){
        Node actual = head;
        while(actual!=null){
            if(actual.value == value){
                return true;
            }
            actual = actual.next;
        }
        return false;
    }
    public Node obtenerPorPosicion(int posicion){
        Node nodoActual = head;
        for (int i = 0; i < posicion; i++) {
            nodoActual = nodoActual.next;
        }
        return nodoActual;
    }
    public void eliminarFrente(){
        head = head.next;
    }
    public void eliminarFinal(){
        Node actual = head;
        Node anterior = null;
        while(actual.next!=null){
            anterior = actual;
            actual = actual.next;
        }
        tail = anterior;
        anterior.next = null;
    }
    public void eliminarPorPosicion(int posicion){
        Node actual = head;
        Node anterior = null;
        int i = 0;
        while(i!=posicion-1){
            anterior = actual;
            actual = actual.next;
            if(actual==null){
                throw new IndexOutOfBoundsException();
            }
            i++;
        }
        anterior.next = actual.next;
    }
    public void mostrarLista(){
        Node actual = head;
        while(actual!=null){
            System.out.println(actual.value);
            actual = actual.next;
        }
    }
}
