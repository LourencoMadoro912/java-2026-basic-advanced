package StudentManagement;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StudentManagement {
        public static void main(String[] args) {
            Repositorio<Aluno> repo=new Repositorio<Aluno>();

            try {
                repo.inserir(new Aluno("fabio",-1));
                repo.inserir(new Aluno("jery",22));
                repo.inserir(new Aluno("jose",25));
                repo.inserir(new Aluno("antonio",50));

            }catch (IllegalArgumentException e){
                System.out.println("erro ao inserir aluno:  "+e.getMessage());
            }

            List<Aluno> maior=repo.listar().stream()
                    .filter(a->a.getIdade()>=18)
                    .collect(Collectors.toList());

            maior.forEach(a-> System.out.println(a.getNome()));


        }


}


