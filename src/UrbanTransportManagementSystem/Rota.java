package UrbanTransportManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Rota {
    private String nome;
    List<String> paragens=new ArrayList<>();

    public Rota(String nome){
        this.nome=nome;
    }

    public void adionarParagens(String p){
        paragens.add(p);
    }

    public List<String> getParagens(){
        return paragens;
    }

    @Override
    public String toString(){
        return "nome: "+nome;
    }
}
