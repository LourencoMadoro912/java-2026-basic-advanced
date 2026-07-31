package CourseManagementSystem;

public class Pessoa {
    private  String nome;
    private  int idade;

    public  Pessoa(String nome, int idade){
        if (idade<=0) throw new IllegalArgumentException("idade menor que 18");
        if(nome==null || nome.isBlank()) throw new IllegalArgumentException("nome nao pode ser vazio");
        
        this.nome=nome;
        this.idade=idade;
    }

    public String getNome() {
        return nome;
    }



    public  void  apresentar(){
    }
}
