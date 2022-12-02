package Telas;

import Funcionarios.Funcionarios;
import Funcionarios.ListaFuncionarios;

public class TrabalhoProgramacao {

    static FrameInicial inicial = new FrameInicial();
    static FrameAdicionar adicionar = new FrameAdicionar();
    static FrameRemover revover = new FrameRemover();
    static FrameEditar editar = new FrameEditar();
    static FrameBuscar buscar = new FrameBuscar();
    static ListaFuncionarios listaFuncionarios = new ListaFuncionarios();

    public static void main(String[] args) {

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
        inicial.setVisible(true);
    }

}
