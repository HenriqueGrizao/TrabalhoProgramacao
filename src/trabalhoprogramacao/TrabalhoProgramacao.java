package trabalhoprogramacao;

import Funcionarios.Funcionarios;
import Funcionarios.ListaFuncionarios;

public class TrabalhoProgramacao {

    public static void main(String[] args) {

        ListaFuncionarios listaFuncionarios = new ListaFuncionarios();

        Funcionarios t0 = new Funcionarios("0", "Cargos", 11, "", "","");
        Funcionarios t1 = new Funcionarios("1", "hc", 11, "", "","");
        Funcionarios t2 = new Funcionarios("2", "hc", 11, "", "","");
        Funcionarios t3 = new Funcionarios("3", "hc", 11, "", "","");
        Funcionarios t4 = new Funcionarios("4", "hc", 11, "", "","");

        listaFuncionarios.add(t0);
        listaFuncionarios.add(t1);
        listaFuncionarios.add(t2);
        listaFuncionarios.add(t3);
        listaFuncionarios.add(t4);
        listaFuncionarios.removeId(2);
        listaFuncionarios.autalizarNome(0, "dgtdghdvh");

        listaFuncionarios.escrever(0);
        listaFuncionarios.escrever(1);
        listaFuncionarios.escrever(2);
        listaFuncionarios.escrever(3);
        //listaFuncionarios.escrever(4);
        System.out.println(listaFuncionarios.AcharId(8));
    }

}
