package P2;

public class Topping {
    // Atributo privado para el nombre del ingrediente
    public String nombre;


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    // Constructor que recibe el nombre del ingrediente
    public Topping(String nombre) {
        this.nombre = nombre;
    }

    // Método para agregar el ingrediente a una pizza
    public void agregar(Pizza pizza) {
        pizza.getIngredientes().add(nombre);
    }
}

