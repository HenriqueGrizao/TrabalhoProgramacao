package Funcionarios;

public class ListaFuncionarios {

    Funcionarios[] lista = new Funcionarios[3];
    private int idAtual = 0;

    public ListaFuncionarios() {
    }

    public void add(Funcionarios funcionario) {
        try {
            lista[idAtual] = funcionario;
        } catch (Exception e) {
            Funcionarios[] listaReserva = lista;
            lista = new Funcionarios[idAtual * 2];
            for (int i = 0; i < listaReserva.length; i++) {
                lista[i] = listaReserva[i];
            }
            lista[idAtual] = funcionario;
        }
        idAtual++;
    }

    public void removeId(int id) {
        if (id <= lista.length && id > 0) {
            for (int i = id; i < idAtual; i++) {
                lista[i] = lista[i + 1];
            }
            idAtual--;
        }
    }
    
    public int AcharId(int id){
        for (int i = 0; i < idAtual; i++) {
            if (lista[i].getId() == id) {
                return i;
            }
        }
        return -1;
    }

    public void autalizarNome(int id, String nome) {
        lista[id].setNome(nome);
    }
    public void autalizarcargo(int id, String cargo) {
        lista[id].setCargo(cargo);
    }
    public void autalizarsalario(int id, double salario) {
        lista[id].setSalario(salario);
    }
    public void autalizarcontratacaoData(int id, String contratacaoData) {
        lista[id].setContratacaoData(contratacaoData);
    }
    public void autalizarRG(int id, String RG) {
        lista[id].setRG(RG);
    }
    public void autalizarEndereco(int id, String endereco) {
        lista[id].setEndereco(endereco);
    }

    public void escrever(int id) {
        System.out.println("ListaFuncionarios{" + "lista=" + lista[id].getNome() + ", idLista=" + id + ", idFuncionario=" + lista[id].getId() + '}');
    }
}
