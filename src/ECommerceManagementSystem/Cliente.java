package ECommerceManagementSystem;

public class Cliente {
    private String nome;
    private int idade;

    public Cliente(String nome, int idade){
        this.nome=nome;
        this.idade=idade;
    }

    //Nome: get and set
    public  String getNome(){return  nome;}
    public  void setNome(String nome){this.nome=nome;}

    //Idade: get and set
    public  int getIdade(){return  idade;}
    public void setIdade(int idade){this.idade=idade;}

}
