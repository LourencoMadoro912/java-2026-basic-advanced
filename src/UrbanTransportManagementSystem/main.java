package UrbanTransportManagementSystem;

import java.util.*;

public class main {
    public static void main(String[] args) {
        Veiculo v1=new Taxi("x-y",16);
        Veiculo v2=new Taxi("z-p",8);

        Passageiro p1=new Passageiro("madoro","centro");
        Passageiro p2=new Passageiro("ferreira","dondo");
        Passageiro p3=new Passageiro("lourenco","dondo");

        List<Passageiro> passageiros=List.of(p1,p2,p3);

        //embarque
        Queue<Passageiro> filaEmbarque=new LinkedList<>(passageiros);
        while (!filaEmbarque.isEmpty()){
            System.out.println("Embarcou: "+filaEmbarque.poll());
        }

        //Registar rota pelo nome
        Rota rota1=new Rota("centro");
        rota1.adionarParagens("dondo");
        rota1.adionarParagens("dondo");

        Map<String,Rota> rotaMap=new HashMap<>();
        rotaMap.put("centro",rota1);

        //evitar destinos duplicados
        Set<String> destinosUnicos=new HashSet<>();
        passageiros.forEach(p->destinosUnicos.add(p.getDestino()));
        System.out.println("Destinos unicos; "+destinosUnicos);

    }
}
