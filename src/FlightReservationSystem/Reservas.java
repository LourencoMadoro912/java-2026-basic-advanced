package FlightReservationSystem;

public class Reservas {
    private String cliente;
    private String voo;

    public Reservas(String cliente, String voo) {
        this.cliente = cliente;
        this.voo = voo;
    }

    public String getCliente(){return cliente;}
    public String getVoo(){return voo;}
}