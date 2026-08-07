package UrbanTransportManagementSystem;

public class Passageiro {
    private String nome;
    private String destino;

    public Passageiro(String nome, String destino){
        this.nome=nome;
        this.destino=destino;
    }

    public  String toString(){
        return "nome: "+nome+", destino: "+destino;
    }
}
