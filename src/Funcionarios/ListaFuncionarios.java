package Funcionarios;

import static java.lang.Float.parseFloat;

public class ListaFuncionarios {

    Funcionarios[] lista = new Funcionarios[3];
    private int idAtual = 0;

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
        try {
            int idLista = acharIndice(id);
            if (id <= lista.length && id > 0) {
                for (int i = id; i < idAtual; i++) {
                    lista[i] = lista[i + 1];
                }
                idAtual--;
            }
        } catch (IllegalArgumentException e) {
            System.err.println("Não foi possivel achar esse id");
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

    public String buscarFuncionario(int id) {
        try {
            int idLista = acharIndice(id);
            return lista[idLista].toString();
        } catch (IllegalArgumentException e) {
            System.err.println("Não foi possivel achar esse id");
            return "";
        }
    }

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

//    public void autalizarNome(int id, String nome) {
//        lista[id].setNome(nome);
//    }
//
//    public void autalizarcargo(int id, String cargo) {
//        lista[id].setCargo(cargo);
//    }
//
//    public void autalizarsalario(int id, float salario) {
//        lista[id].setSalario(salario);
//    }
//
//    public void autalizarcontratacaoData(int id, String contratacaoData) {
//        lista[id].setContratacaoData(contratacaoData);
//    }
//
//    public void autalizarRG(int id, String RG) {
//        lista[id].setRG(RG);
//    }
//
//    public void autalizarEndereco(int id, String endereco) {
//        lista[id].setEndereco(endereco);
//    }

}
