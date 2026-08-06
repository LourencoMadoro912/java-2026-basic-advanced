package ECommerceManagementSystem;

import java.util.List;
import java.util.stream.Collectors;

public class main {
    public static void main(String[] args){
        Cliente cliente=new Cliente("lourenco",22);
        Pedido pedido=new Pedido(cliente);

        try {
            pedido.adicionarProduto(new Livro("pray",90));
            pedido.adicionarProduto(new Electronico("mobile",80));

        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        pedido.getProdutos().stream()
                .filter(a->a.getPreco()>80)
                .map(p->p.getName().toUpperCase())
                .forEach(System.out::println);

        System.out.println(pedido.calcularTotal());

        Repository<Pedido> repository=new Repository<>();
        repository.guardarDados(pedido);
        repository.listar().stream().forEach(System.out::println);


    }
}
