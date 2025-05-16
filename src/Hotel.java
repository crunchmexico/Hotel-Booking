import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private GestorHuespedes gestorHuespedes = new GestorHuespedes();
    private List<Reserva> reservas = new ArrayList<>();

    public void agregarReserva(Reserva reserva) {
        this.reservas.add(reserva);
        this.gestoHuespedes.agregarHueped(reserva.getHuesped()); // Agregamos el huesped a la lista de huespedes
    }

    public List<Huesped> obtenerListaHuespedesHotel() {
        return this.gestorHuespedes.obtenerTodosLosHuespedes();
    }
}
