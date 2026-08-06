package ECommerceManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Repository <T> {
    private List <T> dados= new ArrayList<>();

    public void guardarDados(T obj){
        dados.add(obj);
    }

    public List<T> listar(){
         return dados;
}
}