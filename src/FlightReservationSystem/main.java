package FlightReservationSystem;

public class main {
    public static void main(String[] args) {
        SistemaReservas sistemaReservas=new SistemaReservas();
        try {
            Reservas reservas=new Reservas("madoro","355");

            sistemaReservas.addReservas(reservas);
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }catch (ReservaDuplicadaException e){
            System.out.println(e.getMessage());
        }

        sistemaReservas.getReservas().stream()
                .map(p->p.getCliente().toUpperCase())
                .forEach(System.out::println);
    }
}
