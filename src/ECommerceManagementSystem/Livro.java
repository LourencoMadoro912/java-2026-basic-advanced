package ECommerceManagementSystem;

public class Livro extends Produto{
    public Livro(String name,double preco){
        super(name,preco);
    }

    @Override
    public String toString(){
        return "Livros: " +super.toString();
    }
}
