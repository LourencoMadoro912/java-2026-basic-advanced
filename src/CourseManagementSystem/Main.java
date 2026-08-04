package CourseManagementSystem;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Repository<Aluno> alunoRepository =new Repository<>();
        try {

        alunoRepository.inserir(new Aluno("lourenco",10));
        alunoRepository.inserir(new Aluno("paulito",18));
        alunoRepository.inserir(new Aluno("antonio",10));
        alunoRepository.inserir(new Aluno("osvaldo",10));

        Repository<Professor> professorRepository=new Repository<>();
        professorRepository.inserir(new Professor("Eusebio",50));
        professorRepository.inserir(new Professor("cassilote",35));
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        List<Aluno> maior=alunoRepository.listar()
                .stream()
                .filter(a->a.getIdade()>=18)
                .collect(Collectors.toList());


        maior.forEach(System.out::println);
    }
}
