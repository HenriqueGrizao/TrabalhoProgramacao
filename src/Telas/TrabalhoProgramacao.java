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

        Funcionarios t0 = new Funcionarios("0", "programador", 11, "20/12/2020", "123456789", "casa");
        Funcionarios t1 = new Funcionarios("1", "ola", 11, "20/12/2020", "987654321", "predio");
        Funcionarios t2 = new Funcionarios("2", "teste", 11, "20/12/2020", "129834765", "sitio");
        Funcionarios t3 = new Funcionarios("3", "rico", 11, "20/12/2020", "147258369", "manção");
        Funcionarios t4 = new Funcionarios("4", "nada", 11, "20/12/2020", "963852741", "tenda");

        listaFuncionarios.add(t0);
        listaFuncionarios.add(t1);
        listaFuncionarios.add(t2);
        listaFuncionarios.add(t3);
        listaFuncionarios.add(t4);
        inicial.setVisible(true);
    }

}
