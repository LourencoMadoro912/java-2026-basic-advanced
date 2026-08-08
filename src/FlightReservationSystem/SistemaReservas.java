package FlightReservationSystem;

import java.util.ArrayList;
import java.util.List;

public class SistemaReservas {
    private List<Reservas> reservas=new ArrayList<>();

    public void addReservas(Reservas r){
        boolean existeReserva=reservas.stream()
                .anyMatch(res->res.getCliente().equals(r.getCliente())
                 && res.getVoo().equals(r.getVoo()));

        if (existeReserva){
            throw  new ReservaDuplicadaException("Reserva ja existe");
        }

        reservas.add(r);
    }

    public List<Reservas> getReservas(){
        return reservas;
    }


}
