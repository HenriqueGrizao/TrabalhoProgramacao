package Funcionarios;

import static java.lang.Float.parseFloat;

public class ListaFuncionarios {

    Funcionarios[] lista = new Funcionarios[10];
    private int idAtual = 0;
    
    /**
    *esse método adiciona um funcionario no arrey
    *caso o vetor esteja cheio, dobra o tamanho  disponível
     * @param funcionario funcionario que vai ser adicionado
    */
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
    
    public int getIdAtual() {
        return idAtual;
    }
    
    /**
     * Remove um funcionário salvo no vetor baseado no seu id
     * @param id id do funcionário
     */
    public void removeId(int id) {
        try {
            int idLista = acharIndice(id);
            if (id <= lista.length && id > 0) {
                for (int i = idLista; i < idAtual; i++) {
                    lista[i] = lista[i + 1];
                }
                idAtual--;
            }else{
                throw new IllegalArgumentException();
            }
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException();
        }
    }

    private int acharIndice(int id) {
        for (int i = 0; i < idAtual; i++) {
            if (lista[i].getId() == id) {
                return i;
            }
        }
        throw new IllegalArgumentException();
    }

    /**
     * Busca um funcionário baseado em seu id e o
     * retorna convertido em String
     * @param id id do funcionário
     * @return funcionário convertido em string 
     */
    public String buscarFuncionario(int id) {
        try {
            int idLista = acharIndice(id);
            return lista[idLista].toString();
        } catch (IllegalArgumentException e) {
            System.err.println("Não foi possivel achar esse id");
            return "";
        }
    }
/**
 * busca e retorna um funcionario baseado em seu id
 * @param id id do funcionario
 * @return Obejto funcionario basedo no seu id
 */
    public Funcionarios getFuncionario(int id) {
        try {
            return lista[acharIndice(id)];
        } catch (IllegalArgumentException e) {
          throw new IllegalArgumentException();
        }
    }
    
    /**
     * busca e retorna um funcionario baseado em seu nome
     * @param nome nome do funcionário 
     * @return Obejto funcionario basedo no seu nome
     */
    public Funcionarios BuscarNome(String nome){
        for (int i = 0; i < idAtual; i++) {
            if(lista[i].getNome().equals(nome)){
                return lista[i];
            }
        }
        throw new IllegalArgumentException();
    }
    /**
     * Retorna um funcionario baseado no seu indicec da lista
     * @param id indice do funcionario na lista
     * @return funionario que corresponde a posição na lista
     */
    public Funcionarios getFuncionarioIndice(int id) {
        return lista[id];
    }
/**
 * Atualizar  um atributo de um funcionário  baseado em seu id 
 * @param id id do funcionário
 * @param atributoMudar atributo  a ser alterado (n-nome, c-cargo, s-salario, d-data, r-rg, e-enderco)
 * @param novoAtributo atributo que substituirá  o antigo 
 */
    public void autalizarAtributos(int id, char atributoMudar, String novoAtributo) {
        try {
            int idLista = acharIndice(id);
            switch (atributoMudar) {
                case 'n':
                    lista[idLista].setNome(novoAtributo);
                    break;
                case 'c':
                    lista[idLista].setCargo(novoAtributo);
                    break;
                case 's':
                    float salario = parseFloat(novoAtributo.replaceAll(",", "."));
                    lista[idLista].setSalario(salario);
                    break;
                case 'd':
                    lista[idLista].setContratacaoData(novoAtributo);
                    break;
                case 'r':
                    lista[idLista].setRG(novoAtributo);
                    break;
                case 'e':
                    lista[idLista].setEndereco(novoAtributo);
                    break;
                default:
                    System.err.println("Opção invalida");
            }
        } catch (IllegalArgumentException e) {
            if (atributoMudar == 's') {
                try {
                    int idLista = acharIndice(id);
                    System.err.println("O argumento não é um número");
                } catch (Exception ex) {
                    System.err.println("Não foi possivel achar esse id");
                }
            } else {
                System.err.println("Não foi possivel achar esse id");
            }
        }
    }
}
