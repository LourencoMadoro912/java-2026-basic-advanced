package ECommerceManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private Cliente cliente;
    List<Produto> produtos=new ArrayList<>();

    public Pedido(Cliente cliente){
        this.cliente=cliente;
    }

    public void adicionarProduto(Produto p){
        produtos.add(p);
    }

    public List<Produto> getProdutos(){
        return produtos;
    }

    public double calcularTotal(){
        return produtos.stream().mapToDouble(Produto::getPreco).sum();
    }

    @Override
    public String toString() {
        return "Pedido do cliente: " + cliente.getNome() +
                ", Produtos: " + produtos;
    }
}
