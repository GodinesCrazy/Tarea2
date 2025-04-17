
// Motocicleta.java
public class Motocicleta extends Vehiculo { // Inicio de la clase Motocicleta que hereda de Vehiculo
    private boolean tieneSidecar; // Atributo para indicar si tiene sidecar
    public Motocicleta(String marca, String modelo, int anio, boolean tieneSidecar) { // Constructor de Motocicleta
        super(marca, modelo, anio); // Llama al constructor de la clase padre Vehiculo
        this.tieneSidecar = tieneSidecar; // Asigna el parámetro tieneSidecar al atributo
    } // Fin del constructor de Motocicleta
    public void hacerCaballito() { // Método específico para hacer un caballito
        System.out.println("La motocicleta está haciendo un caballito"); // Imprime mensaje de caballito
    } // Fin del método hacerCaballito
    public void conducir(int velocidad) { // Sobrecarga de conducir con velocidad
        System.out.println("La motocicleta está siendo conducida a " + velocidad + " km/h"); // Imprime velocidad de conducción
    } // Fin del método conducir(int)
} // Fin de la clase Motocicleta