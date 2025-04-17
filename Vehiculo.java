// Vehiculo.java
public class Vehiculo { // Inicio de la clase Vehiculo
    protected String marca; // Atributo para almacenar la marca del vehículo
    protected String modelo; // Atributo para almacenar el modelo del vehículo
    protected int anio; // Atributo para almacenar el año de fabricación del vehículo
    public Vehiculo(String marca, String modelo, int anio) { // Constructor que inicializa marca, modelo y año
        this.marca = marca; // Asigna el parámetro marca al atributo marca
        this.modelo = modelo; // Asigna el parámetro modelo al atributo modelo
        this.anio = anio; // Asigna el parámetro año al atributo anio
    } // Fin del constructor de Vehiculo
    public void arrancar() { // Método que arranca el vehículo
        System.out.println("El vehículo está arrancando"); // Imprime mensaje de arranque
    } // Fin del método arrancar
    public void detener() { // Método que detiene el vehículo
        System.out.println("El vehículo se ha detenido"); // Imprime mensaje de detención
    } // Fin del método detener
    public void conducir() { // Método que conduce el vehículo
        System.out.println("El vehículo está siendo conducido"); // Imprime mensaje de conducción
    } // Fin del método conducir
} // Fin de la clase Vehiculo



