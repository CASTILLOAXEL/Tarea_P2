package P2;

import java.util.List;

public class PizzaItaliana  extends Pizza{
    // Atributos adicionales específicos de las pizzas italianas
    private String salsa;
    private int tiempoEnHorno;


//Getter y Setter de la clase PizzaItaliana
    public String getSalsa() {
        return salsa;
    }

    public void setSalsa(String salsa) {
        this.salsa = salsa;
    }

    public int getTiempoEnHorno() {
        return tiempoEnHorno;
    }

    public void setTiempoEnHorno(int tiempoEnHorno) {
        this.tiempoEnHorno = tiempoEnHorno;
    }
    // Constructor de la clase PizzaItaliana que recibe atributos de la pizza base y atributos adicionales
    public PizzaItaliana(String nombre, double precio, List<String> ingredientes, String salsa, int tiempoEnHorno) {
        // Llamar al constructor de la superclase para inicializar los atributos heredados
        super(nombre, precio, ingredientes);
        // Inicializar atributos específicos de las pizzas italianas
        this.salsa = salsa;
        this.tiempoEnHorno = tiempoEnHorno;
    }

    // Sobrescribir el método preparar para incluir pasos específicos de la preparación de pizzas italianas
    @Override
    public void preparar() {
        super.preparar(); // Llamar al método preparar de la superclase
        System.out.println("Agregando salsa " + salsa + " a la pizza.");
        System.out.println("La pizza italiana se hornea durante " + tiempoEnHorno + " minutos.");
    }

    // Sobrescribir el método toString para mostrar información adicional de las pizzas italianas
    @Override
    public String toString() {
        return super.toString() + ", salsa: " + salsa + ", tiempo en horno: " + tiempoEnHorno + " minutos";
    }


    }

