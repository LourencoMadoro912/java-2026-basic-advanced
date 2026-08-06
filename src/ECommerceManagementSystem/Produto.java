package ECommerceManagementSystem;

public class Produto {
    private String name;
    private double preco;

    public Produto(String name, double preco){
        if (name.isBlank() || name==null){throw new IllegalArgumentException("nome invalido");}
        if (preco<=0){throw new IllegalArgumentException("preco invalido");}
        this.name=name;
        this.preco=preco;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public double getPreco(){
        return preco;
    }

    public void  setPreco(double preco){
        this.preco=preco;
    }

    @Override
    public String toString(){
        return name+"-"+preco+" MT";
    }
}
