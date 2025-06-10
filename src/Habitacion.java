public class Habitacion {
    private int numeroHabitacion;
    private String tipoCama;
    private final boolean vistaMar; // Se establece como final para que no se pueda modificar
    private boolean estaOcupada;
    private boolean estaLimpia;
    private double precioPorNoche;

    // Constructor
    public Habitacion(int numeroHabitacion, String tipoCama, boolean vistaMar, boolean estaOcupada, boolean estaLimpia) {
        this.numeroHabitacion = numeroHabitacion;
        this.tipoCama = tipoCama;
        this.vistaMar = vistaMar;
        this.estaOcupada = estaOcupada;
        this.estaLimpia = estaLimpia;
        establecerPrecioPorNoche(vistaMar); // Establece el precio basado en la vista al crear la habitacion.
    }

    // Getters
    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public String getTipoCama() {
        return tipoCama;
    }

    public boolean isVistaMar() {
        return vistaMar;
    }

    public boolean isEstaOcupada() {
        return estaOcupada;
    }

    public boolean isEstaLimpia() {
        return estaLimpia;
    }

    public double getPrecioPorNoche() {
        return precioPorNoche;
    }

    // Setters
    public void setNumeroHabitacion(int numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }

    public void setTipoCama(String tipoCama) {
        this.tipoCama = tipoCama;
    }

    // No necesitamos un setter para vistaMar ya que es final
    // public void setVistaMar(boolean vistaMar) {
    //     this.vistaMar = vistaMar;
    // }

    public void setEstaOcupada(boolean estaOcupada) {
        this.estaOcupada = estaOcupada;
    }

    public void setEstaLimpia(boolean estaLimpia) {
        this.estaLimpia = estaLimpia;
    }

    // Podríamos tener un setter para el precio si en algún momento necesitamos ajustarlo por otras razones
    public void setPrecioPorNoche(double precioPorNoche) {
        this.precioPorNoche = precioPorNoche;
    }

    // Metodos

    private void establecerPrecioPorNoche(boolean vistaMar) {
        this.precioPorNoche = vistaMar ? 20000.0 : 14000.0;
    }

    public void limpiarHabitacion() {
        this.estaLimpia = true;
    }

    public void ocuparHabitacion() {
        this.estaOcupada = true;
    }

    public void desocuparHabitacion() {
        this.estaOcupada = false;
    }

    public void mostrarInformacionHab() {
        System.out.println("Numero de Habitacion: " + numeroHabitacion);
        System.out.println("Tipo de Cama: " + tipoCama);
        System.out.println("Vista al Mar: " + (vistaMar ? "Si" : "No"));
        System.out.println("Esta Ocupada: " + (estaOcupada ? "Si" : "No"));
        System.out.println("Esta Limpia: " + (estaLimpia ? "Si" : "No"));
        System.out.println("Precio por Noche: $ " + precioPorNoche);
        System.out.println("=====================================");
    }
}