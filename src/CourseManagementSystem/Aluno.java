package CourseManagementSystem;

public class Aluno extends Pessoa{
    public  Aluno(String nome,int idade){
        super(nome,idade);
    }

    @Override
    public void apresentar(){
        System.out.println("apesentar aluno: "+getNome());
    }

    @Override
    public String toString(){
        return super.toString();
    }
}
