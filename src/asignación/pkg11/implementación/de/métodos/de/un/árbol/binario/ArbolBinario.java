package asignación.pkg11.implementación.de.métodos.de.un.árbol.binario;

public class ArbolBinario<T> {

             private Nodo<T> raiz;

             public ArbolBinario() {
                          raiz = null;
             }

             public void insertarRaiz(T dato) {
                          raiz = new Nodo<>(dato);
             }

             public Nodo<T> getRaiz() {
                          return raiz;
             }

             public void insertarIzquierdo(Nodo<T> padre, T dato) {
                          padre.izquierdo = new Nodo<>(dato);
             }

             public void insertarDerecho(Nodo<T> padre, T dato) {
                          padre.derecho = new Nodo<>(dato);
             }

             public void preorden(Nodo<T> nodo) {
                          if (nodo != null) {
                                       System.out.println(nodo.dato);
                                       preorden(nodo.izquierdo);
                                       preorden(nodo.derecho);
                          }
             }

             public void postorden(Nodo<T> nodo) {
                          if (nodo != null) {
                                       postorden(nodo.izquierdo);
                                       postorden(nodo.derecho);
                                       System.out.println(nodo.dato);
                          }
             }
}
