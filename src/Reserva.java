import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Reserva {
    private int numeroReserva;
    private LocalDate checkIn;
    private LocalDate checkOut;
    private String fechaDeReserva;
    private Huesped huesped;
    private String tipoHabitacion;
    private int numeroNoches;
    private double precioTotal;
    private String formaDePago;

    public Reserva(int numeroReserva, String checkIn, String checkOut, String fechaDeReserva, String nombreHuesped, String apellidoHuesped, String tipoHabitacion, int numeroNoches, double precioTotal, String formaDePago) {
        this.numeroReserva = numeroReserva;
        this.checkIn = LocalDate.parse(checkIn);
        this.checkOut = LocalDate.parse(checkOut);
        this.fechaDeReserva = fechaDeReserva;
        this.huesped = new Huesped(nombreHuesped, apellidoHuesped);
        this.tipoHabitacion = tipoHabitacion;
        this.numeroNoches = (int) ChronoUnit.DAYS.between(this.checkIn, this.checkOut);
        this.precioTotal = precioTotal;
        this.formaDePago = formaDePago;
    }

    public int getNumeroReserva() {
        return this.numeroReserva;
    }

    public LocalDate getCheckIn() {
        return this.checkIn;
    }

    public LocalDate getCheckOut() {
        return this.checkOut;
    }

    public String getFechaDeReserva() {
        return this.fechaDeReserva;
    }

    public Huesped getHuesped() {
        return this.huesped;
    }

    public String getNombreHuesped() {
        return this.huesped.getNombre();
    }

    public String getApellidoHuesped() {
        return this.huesped.getApellido();
    }

    public String getTipoHabitacion() {
        return this.tipoHabitacion;
    }

    public int getNumeroNoches() {
        return this.numeroNoches;
    }

    public double getPrecioTotal() {
        return this.precioTotal;
    }

    public String getFormaDePago() {
        return this.formaDePago;
    }

    public void setNumeroReserva(int numeroReserva) {
        this.numeroReserva = numeroReserva;
    }

    public void setCheckIn(LocalDate checkIn) {
        this.checkIn = checkIn;
    }

    public void setCheckOut(LocalDate checkOut) {
        this.checkOut = checkOut;
    }

    public void setFechaDeReserva(String fechaDeReserva) {
        this.fechaDeReserva = fechaDeReserva;
    }

    public void setNombreHuesped(String nombreHuesped) {
        this.huesped.setNombre(nombreHuesped);
    }

    public void setApellidoHuesped(String apellidoHuesped) {
        this.huesped.setApellido(apellidoHuesped);
    }

    public void setTipoHabitacion(String tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }

    public void setNumeroNoches(int numeroNoches) {
        this.numeroNoches = numeroNoches;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }

    public void setFormaDePago(String formaDePago) {
        this.formaDePago = formaDePago;
    }
}