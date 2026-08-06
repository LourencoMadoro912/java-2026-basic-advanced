package ECommerceManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Repository <T> {
    private List <T> dados= new ArrayList<>();

    public void listar(T obj){
        dados.add(obj);
    }

    public List<T> getDados(){
         return dados;
}
}