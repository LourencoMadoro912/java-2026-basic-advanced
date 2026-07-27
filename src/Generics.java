import java.util.ArrayList;
import java.util.List;

public class Generics {

    //funcao generica
    public <T> void imprimir(T conteudo){
        System.out.println(conteudo);
    }

    public static void main(String[] args){

        Generics g= new Generics();

        //Lista com Generics
        List<String> name= new ArrayList<>();
        name.add("joao");
        name.add("jose");

        System.out.println(name.get(1));


        //imprimir
        g.imprimir(10);
        g.imprimir("lice");
        g.imprimir(1.1);

    }
}
