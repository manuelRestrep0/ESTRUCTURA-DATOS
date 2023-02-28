public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.agregarValorAlInicio(10);
        linkedList.agregarFinal(50);
        linkedList.agregarPorPosicion(1,20);
        linkedList.agregarPorPosicion(2,30);
        linkedList.agregarPorPosicion(3,40);

        //funcion contener
        System.out.println("contiene");
        System.out.println(linkedList.contiene(30));
        System.out.println(linkedList.contiene(32));
        System.out.println("-----------------");
        //obtener por posicion
        System.out.println("posicion");
        System.out.println(linkedList.obtenerPorPosicion(3).value);
        System.out.println(linkedList.obtenerPorPosicion(1).value);
        System.out.println(linkedList.obtenerPorPosicion(2).value);
        System.out.println(linkedList.obtenerPorPosicion(4).value);
        System.out.println(linkedList.obtenerPorPosicion(0).value);
        System.out.println("-----------------");
        //eliminar frente
        System.out.println("eliminar frente");
        linkedList.eliminarFrente();
        System.out.println(linkedList.head.value);
        System.out.println("-----------------");
        //eliminar final
        System.out.println("eliminar final");
        linkedList.eliminarFinal();
        linkedList.mostrarLista();
        System.out.println("-----------------");
        //eliminar por posicion
        System.out.println("eliminar posicion");
        linkedList.eliminarPorPosicion(2);
        linkedList.mostrarLista();
    }
}