package UrbanTransportManagementSystem;

public class Veiculo {
    private String placa;
    private int capacidade;

    public  Veiculo(String placa, int capacidade){
        if(capacidade<=0)throw new IllegalArgumentException("capacidade invalida");
        this.placa=placa;
        this.capacidade=capacidade;
    }

    public String getPlaca(){
        return placa;
    }

    public int getCapacidade(){
        return capacidade;
    }

    @Override
    public String toString(){
        return "placa: "+placa+", capacidade: "+capacidade;
    }
}
