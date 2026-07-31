package CourseManagementSystem;

public class Main {
    public static void main(String[] args) {
        try {
        Repository<Aluno> alunoRepository =new Repository<>();
        alunoRepository.inserir(new Aluno("lourenco",19));
        alunoRepository.inserir(new Aluno("paulito",18));
        alunoRepository.inserir(new Aluno("antonio",19));
        alunoRepository.inserir(new Aluno("osvaldo",20));

        Repository<Professor> professorRepository=new Repository<>();
        professorRepository.inserir(new Professor("Eusebio",50));
        professorRepository.inserir(new Professor("cassilote",35));
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }



    }
}
