import java.util.ArrayList;
import java.util.List;

public class GestorHuespedes {
    private List<Huesped> listaHuespedes;

    public GestorHuespedes() {
        this.listaHuespedes = new ArrayList<>();
    }

    public void agregarHueped(Huesped huesped) {
        this.listaHuespedes.add(huesped);
    }

    public List<Huesped> obtenerTodosLosHuespedes() { //
        return new ArrayList<>(this.listaHuespedes);
    }

    // Metodo para buscar un huesped por su nombre
    public Huesped buscarHuespedPorNombre (String nombre) {
        for (Huesped huesped : listaHuespedes) {
            if (huesped.getNombre().equalsIgnoreCase(nombre)) {
                return huesped;
            }
        }
        return null;
    }
}
