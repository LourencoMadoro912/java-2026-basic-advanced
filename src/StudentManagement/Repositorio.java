package StudentManagement;

import java.util.ArrayList;
import java.util.List;

class Repositorio<T> {
    List<T> alunos = new ArrayList<>();

    public void inserir(T dados) {
        alunos.add(dados);
    }

    public List<T> listar() {
        return alunos;
    }

}
