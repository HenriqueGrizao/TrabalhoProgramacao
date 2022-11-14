package trabalhoprogramacao;

import Funcionarios.Funcionarios;
import Funcionarios.ListaFuncionarios;

public class TrabalhoProgramacao {

    public static void main(String[] args) {

        ListaFuncionarios listaFuncionarios = new ListaFuncionarios();

        Funcionarios t0 = new Funcionarios("0", "Cargos", 11, "", "", "");
        Funcionarios t1 = new Funcionarios("1", "hc", 11, "", "", "");
        Funcionarios t2 = new Funcionarios("2", "hc", 11, "", "", "");
        Funcionarios t3 = new Funcionarios("3", "hc", 11, "", "", "");
        Funcionarios t4 = new Funcionarios("4", "hc", 11, "", "", "");

        listaFuncionarios.add(t0);
        listaFuncionarios.add(t1);
        listaFuncionarios.add(t2);
        listaFuncionarios.add(t3);
        listaFuncionarios.add(t4);
        //listaFuncionarios.removeId(2);
        //listaFuncionarios.autalizarAtributos(1, 's', "1,1");

        System.out.println(listaFuncionarios.buscarFuncionario(1));
        System.out.println(listaFuncionarios.buscarFuncionario(2));
        System.out.println(listaFuncionarios.buscarFuncionario(3));
        System.out.println(listaFuncionarios.buscarFuncionario(4));
        System.out.println(listaFuncionarios.buscarFuncionario(5));
        //System.out.println(listaFuncionarios.buscarFuncionario(6));
    }

}
