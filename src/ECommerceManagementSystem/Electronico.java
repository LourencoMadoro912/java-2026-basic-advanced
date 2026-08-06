package ECommerceManagementSystem;

public class Electronico extends  Produto{
    public Electronico(String name, double preco){
        super(name,preco);
    }

    @Override
    public String toString(){
        return "Electronicos: " +super.toString();
    }

}
