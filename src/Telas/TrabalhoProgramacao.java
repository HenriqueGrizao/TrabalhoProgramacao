package Telas;

import Funcionarios.Funcionarios;
import Funcionarios.ListaFuncionarios;

public class TrabalhoProgramacao {
    //Declaração dos jFrames
    static FrameInicial inicial = new FrameInicial();
    static FrameAdicionar adicionar = new FrameAdicionar();
    static FrameRemover revover = new FrameRemover();
    static FrameEditar editar = new FrameEditar();
    static FrameBuscar buscar = new FrameBuscar();
    /*Inicialização da classe ListaFuncionarios como estática  para que a mesma
    *lista/vetor possa ser usada por todas as classes  */
    public static ListaFuncionarios listaFuncionarios = new ListaFuncionarios();

    public static void main(String[] args) {
        inicial.setVisible(true);
    }

}
