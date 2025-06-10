public class Huesped {
    private String nombre;
    private String apellido;
    private int edad;
    private String fechaDeNacimiento;
    private String nacionalidad;
    private String direccion;
    private String ciudad;
    private String provincia;
    private String pais;    
    private String dni;
    private String telefono;
    private String email;

    // Constructor
    public Huesped(String nombre, String apellido, int edad, String fechaDeNacimiento, String nacionalidad,
    String direccion, String ciudad, String provincia, String pais, String dni, String telefono, String email) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.nacionalidad = nacionalidad;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.provincia = provincia;
        this.pais = pais;
        this.dni = dni;
        this.telefono = telefono;
        this.email = email;
    }

    public Huesped(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }
    
    public String getFechaDeNacmimiento() {
        return fechaDeNacimiento;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCidad() {
        return ciudad;
    }

    public String getProvincia() {
        return provincia;
    }

    public String getPais() {
        return pais;
    }

    public String getDni() {
        return dni;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setFechaDeNacimiento(String fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // toString
    @Override
    public String toString() {
        return "Huesped [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", fechaDeNacimiento="
        + fechaDeNacimiento + ", nacionalidad=" + nacionalidad + ", direccion=" + direccion + ", ciudad="
        + ciudad + ", provincia=" + provincia + ", pais=" + pais + ", dni=" + dni + ", telefono=" + telefono
        + ", email=" + email + "]";
    
    }
    
    // Metodos
    public void checkIn() {
        // Logica para establecer el dia de check-in
    }

    public void checkOut() {
        // Logica para establecer el dia de check-out
    }

    public void pagarReserva() {
        // Logica para realizar el pago de la reserva
    }

    public void mostrarInfoHuesped() {

    }
}