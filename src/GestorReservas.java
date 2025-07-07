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

    // Metodo para buscar una reserva por el nombre del huesped
    public Reserva buscarReservaPorNombreHuesped(String nombreHuesped) {
        for (Reserva reserva : listaDeReservas) {
            if (reserva.getNombreHuesped().equalsIgnoreCase(nombreHuesped)) {
                return reserva; // Devuelve la primera reserva que coincida
            }
        }
        return null; // Devuelve null si no se encuentra ninguna reserva
    }

    public void mostrarHuespedesOrdenados() {
        List<String> nombresHuespedes = new ArrayList<>();
        for (Reserva reserva : listaDeReservas) {
            nombresHuespedes.add(reserva.getNombreHuesped() + " " + reserva.getApellidoHuesped());
        }
        nombresHuespedes.sort(String::compareToIgnoreCase);
        System.out.println("Lista de huéspedes ordenados alfabéticamente:");
        for (String nombre : nombresHuespedes) {
            System.out.println(nombre);
        }
    }
}