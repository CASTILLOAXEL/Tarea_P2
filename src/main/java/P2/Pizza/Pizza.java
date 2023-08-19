package P2;
import java.util.Calendar;
import java.util.List;
public class Pizza {
    // Atributos privados de la clase Pizza
        private String nombre;
        private double precio;
        private List<String> ingredientes;
// getter y setter de los atributos de la clase pizza
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public List<String> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<String> ingredientes) {
        this.ingredientes = ingredientes;
    }
//constructor de la clase pizza que resibe los atributos de la pizza
    public Pizza(String nombre, double precio, List<String> ingredientes) {
            this.nombre = nombre;
            this.precio = precio;
            this.ingredientes = ingredientes;
        }
//metodo preparar de la clase pizza
        public void preparar() {
            System.out.println("La pizza está lista para ser servida.");
        }
// metodo toString de la clase pizza
        @Override
        public String toString() {
            return "nombre de la pizza: " + nombre + ", y su precio es: " + precio +  "     Quetzales ";
        }


}

