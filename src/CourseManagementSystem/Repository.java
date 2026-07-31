package CourseManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Repository <T>{
    List<T> lista=new ArrayList<>();

    public void inserir(T obj){
        lista.add(obj);
    }

    public List<T> listar(){
        return lista;
    }
}
