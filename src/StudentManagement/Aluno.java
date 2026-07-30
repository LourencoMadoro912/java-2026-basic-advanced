package StudentManagement;

class Aluno {
    private String nome;
    private int idade;

    public  Aluno(String nome, int idade) {
        if (idade <= 0) throw new IllegalArgumentException("idade invalida");
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    @Override
    public String toString() {
        return nome + " (" + idade + " anos)";
    }
}
