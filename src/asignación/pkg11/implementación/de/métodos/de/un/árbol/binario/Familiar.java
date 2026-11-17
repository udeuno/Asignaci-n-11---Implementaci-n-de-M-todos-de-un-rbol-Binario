package asignación.pkg11.implementación.de.métodos.de.un.árbol.binario;

public class Familiar {

             private String nombre;
             private int edad;
             private String ocupacion;
             private boolean finado;
             private String lugarNacimiento;

             public Familiar(String nombre, int edad, String ocupacion, boolean finado, String lugarNacimiento) {
                          this.nombre = nombre;
                          this.edad = edad;
                          this.ocupacion = ocupacion;
                          this.finado = finado;
                          this.lugarNacimiento = lugarNacimiento;
             }

             @Override
             public String toString() {
                          return "Nombre: " + nombre
                                  + ", Edad: " + edad
                                  + ", Ocupacion: " + ocupacion
                                  + ", Finado: " + finado
                                  + ", Lugar de nacimiento: " + lugarNacimiento;
             }
}
