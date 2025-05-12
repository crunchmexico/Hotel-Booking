import java.util.ArrayList;
import java.util.List;

public class GestorReservas {
    private List<Reserva> listaDeReservas;

    public GestorReservas() {
        this.listaDeReservas = new ArrayList<>();
    }

    public void agregarReserva(Reserva nuevaReserva) {
        this.listaDeReservas.add(nuevaReserva);
    }

    public void mostrarReservas() {
        for (Reserva reserva : listaDeReservas) {
            System.out.println("Reserva: " + reserva.getNumeroReserva());
            System.out.println("Nombre del Huesped: " + reserva.getNombreHuesped() + " " + reserva.getApellidoHuesped());
        }
    }

    public void eliminarReserva(int numeroReserva) {
        for (int i = 0; i < listaDeReservas.size(); i++) {
            if (listaDeReservas.get(i).getNumeroReserva() == numeroReserva) {
                listaDeReservas.remove(i);
                System.out.println("Reserva " + numeroReserva + " eliminada.");
                return;
            }
        }
    }
}
