package UrbanTransportManagementSystem;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class main {
    public static void main(String[] args) {
        Veiculo v1=new Taxi("x-y",16);
        Veiculo v2=new Taxi("z-p",8);

        Passageiro p1=new Passageiro("madoro","centro");
        Passageiro p2=new Passageiro("ferreira","norte");
        Passageiro p3=new Passageiro("lourenco","dondo");

        List<Passageiro> passageiros=List.of(p1,p2,p3);

        //embarque
        Queue<Passageiro> filaEmbarque=new LinkedList<>(passageiros);
        while (!filaEmbarque.isEmpty()){
            System.out.println("Embarcou: "+filaEmbarque.poll());
        }

    }
}
