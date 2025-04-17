

// Main.java
public class Main { // Inicio de la clase Main con método principal
    
    
    
    public static void main(String[] args) { // Método principal que inicia la aplicación
        Vehiculo miVehiculo = new Vehiculo("Toyota", "Corolla", 2020); // Crea instancia de Vehiculo
        Auto miAuto = new Auto("Honda", "Civic", 2019, "Automático"); // Crea instancia de Auto
        Motocicleta miMotocicleta = new Motocicleta("Harley-Davidson", "Street 750", 2018, false); // Crea instancia de Motocicleta
        miVehiculo.arrancar(); // Llama a arrancar() en Vehiculo
        miVehiculo.conducir(); // Llama a conducir() en Vehiculo
        miVehiculo.detener(); // Llama a detener() en Vehiculo
        miAuto.arrancar("llave"); // Llama a arrancar("llave") en Auto
        miAuto.encenderRadio(); // Llama a encenderRadio() en Auto
        miAuto.detener(); // Llama a detener() heredado en Auto
        miMotocicleta.arrancar(); // Llama a arrancar() heredado en Motocicleta
        miMotocicleta.hacerCaballito(); // Llama a hacerCaballito() en Motocicleta
        miMotocicleta.conducir(60); // Llama a conducir(60) en Motocicleta
        miMotocicleta.detener(); // Llama a detener() heredado en Motocicleta
    } // Fin del método main
} // Fin de la clase Main
