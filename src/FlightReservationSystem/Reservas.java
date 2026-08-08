package FlightReservationSystem;

public class Reservas {
    private String cliente;
    private String voo;

    public Reservas(String cliente, String voo) {
        if (cliente==null || cliente.isBlank()) throw new IllegalArgumentException("cliente invaido");
        this.cliente = cliente;
        this.voo = voo;
    }

    public String getCliente(){return cliente;}
    public String getVoo(){return voo;}

    @Override
    public String toString(){
        return "reservas--cliente:  "+cliente+", voo: "+voo;
    }
}