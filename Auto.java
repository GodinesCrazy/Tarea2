//Auto C.java
public class Auto extends Vehiculo { // Inicio de la clase Auto que hereda de Vehiculo
    private String tipoCajaCambio; // Atributo para almacenar el tipo de caja de cambios
    public Auto(String marca, String modelo, int anio, String tipoCajaCambio) { // Constructor de Auto
        super(marca, modelo, anio); // Llama al constructor de la clase padre Vehiculo
        this.tipoCajaCambio = tipoCajaCambio; // Asigna el parámetro tipoCajaCambio al atributo
    } // Fin del constructor de Auto
    public void encenderRadio() { // Método específico para encender la radio
        System.out.println("La radio del Auto está encendida"); // Imprime mensaje de radio encendida
    } // Fin del método encenderRadio
    public void arrancar(String metodo) { // Sobrecarga de arrancar con método de arranque
        if (metodo.equals("llave")) { // Verifica si el método es "llave"
            System.out.println("El vehículo está arrancando con la llave"); // Imprime arranque con llave
        } else if (metodo.equals("boton")) { // Verifica si el método es "boton"
            System.out.println("El vehículo está arrancando con el botón"); // Imprime arranque con botón
        } else { // Cualquier otro caso
            System.out.println("El vehículo está arrancando, pero se desconoce el método"); // Imprime arranque con método desconocido
        } // Fin de la estructura de control if
    } // Fin del método arrancar(String)
} // Fin de la clase Auto