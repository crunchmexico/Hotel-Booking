public class App {
    public static void main(String[] args) throws Exception {
        // Crear una instancia de GestorReservas
        GestorReservas gestorReservas = new GestorReservas();
        // Crear una nueva reserva
        Reserva reserva1 = new Reserva(123, "2025-05-03", "2025-05-06", "25/12/24", "Ivan", "Ramirez", "Doble", 3, 3000, "Tarjeta de Credito");
        Reserva reserva2 = new Reserva(321, "2025-05-06", "2025-05-11", "25/01/01", "Eduardo", "Ramirez", "Sencilla", 5, 0, "Transferencia Bancaria");
        Reserva reserva3 = new Reserva(987, "2025-06-19", "2025-06-25", "2024/12/01", "Heydi", "May", "Sencilla", 8, 0, "Efectivo");
        Reserva reserva4 = new Reserva(987, "2025-09-09", "2025-09-15", "2025-01-31", "Salatiel", "Ramirez", "Doble", 9, 15000, "Tarjeta Credito");

        // Crear un nuevo huesped
        //Huesped huesped1 = new Huesped("Heydi", "May", 37, "1988-08-08", "Mexicana", "Reg. 92, lt. 31, Ma. 24", "Cancun", "Q.Roo", "Mexico", "123MAMH", "9981605636", "heydi@hotmail.com");

        // Agregar la reserva al gestor
        gestorReservas.agregarReserva(reserva1);
        gestorReservas.agregarReserva(reserva2);
        gestorReservas.agregarReserva(reserva3);

        reserva2.setPrecioTotal(25000.0);
    
        // Mostrar la información de la reserva
        //gestorReservas.mostrarReservas();
        gestorReservas.agregarReserva(reserva4);
        
        // Crear una nueva habitación
        Habitacion habitacion1 = new Habitacion(8063, "King", true, false, true);
        
        // Mostrar la información de la habitación
        habitacion1.mostrarInformacionHab();
        System.out.println("Huesped de la reserva: " + reserva4.getNumeroReserva() + ": " + reserva4.getNombreHuesped() + " " + reserva4.getApellidoHuesped());
        System.out.println("=====================================");
        System.out.println("Numero de noches de "+ reserva4.getNombreHuesped() + ": " + reserva4.getNumeroNoches());
        //gestorReservas.mostrarReservas();

        gestorReservas.eliminarReserva(123);
        gestorReservas.mostrarReservas();

        // Buscar una reserva por el nombre del huesped
        Reserva resultado = gestorReservas.buscarReservaPorNombreHuesped("Eduardo");
        if (resultado != null) {
            System.out.println("Huesped " + resultado.getNombreHuesped() + " encontrado.");
        } else {
            System.out.println("Huesped no encontrado.");
        }

        Reserva resultado2 = gestorReservas.buscarReservaPorNombreHuesped("Heydi");
        if (resultado2 != null) {
            System.out.println("Huesped " + resultado2.getNombreHuesped() + " encontrado.");
        } else {
            System.out.println("Huesped no encontrado.");
        }
    }
}