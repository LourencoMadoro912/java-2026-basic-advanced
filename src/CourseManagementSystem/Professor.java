package CourseManagementSystem;

public class Professor extends Pessoa {
    public Professor(String nome, int idade){
        super(nome,idade);
    }

    @Override
    public void apresentar(){
        System.out.println("apresentado professor: "+getNome());
    }

    @Override
    public String toString(){
        return super.toString();
    }
}
