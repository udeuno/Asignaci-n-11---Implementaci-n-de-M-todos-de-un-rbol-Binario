package asignación.pkg11.implementación.de.métodos.de.un.árbol.binario;

public class Asignación11ImplementaciónDeMétodosDeUnÁrbolBinario {

             public static void main(String[] args) {

                          ArbolBinario<Familiar> arbol = new ArbolBinario<>();

                          // Raiz
                          arbol.insertarRaiz(new Familiar(
                                  "tung tung sahor", 105, "beisbolista", false, "imalaya"
                          ));

                          Nodo<Familiar> abuelo = arbol.getRaiz();

                          // Hijos del abuelo
                          arbol.insertarIzquierdo(abuelo, new Familiar(
                                  "balelina capuchina", 20, "bailarina", false, "salvanistang"
                          ));

                          arbol.insertarDerecho(abuelo, new Familiar(
                                  "tralalelo tralala", 42, "nadador", true, "Hermosillo"
                          ));

                          // Nietos
                          arbol.insertarIzquierdo(abuelo.izquierdo, new Familiar(
                                  "pint patapin", 80, "guardabosques", false, "el desierto del sahara"
                          ));

                          arbol.insertarDerecho(abuelo.izquierdo, new Familiar(
                                  "bonbardilo crocodrilo", 17, "pricionero por crimenes de guerra", false, "sinaloa"
                          ));

                          // Recorrido preorden
                          System.out.println("RECORRIDO PREORDEN");
                          arbol.preorden(arbol.getRaiz());

                          // Recorrido postorden
                          System.out.println("\nRECORRIDO POSTORDEN");
                          arbol.postorden(arbol.getRaiz());
             }

}
