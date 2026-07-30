import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Colecoes {

    List<String> alunos=new ArrayList<>();

    public  void adicionarAluno(String nome){
        alunos.add(nome);
    }

    public List<?> mostrarAlunos(){
        return alunos;
    }



    public static void main(String[] args) {
        Colecoes c=new Colecoes();

        c.adicionarAluno("Maria");
        c.adicionarAluno("pedro");
        c.adicionarAluno("joao");

        System.out.println(c.mostrarAlunos());
    }
}
