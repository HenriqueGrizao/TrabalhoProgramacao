package Funcionarios;

import Telas.TrabalhoProgramacao;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class BancoDeDados {

    static public void Salvar() {
        try {
            FileWriter FW = new FileWriter("Funcionarios.txt");
            PrintWriter PW = new PrintWriter(FW);
            PW.println(Funcionarios.getNumerosFuncionarios());
            for (int i = 0; i < TrabalhoProgramacao.listaFuncionarios.getIdAtual(); i++) {
                System.out.println(i);
                PW.println(TrabalhoProgramacao.listaFuncionarios.getFuncionarioIndice(i).toString());
            }
            FW.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static public void carregar() {
        try {
            File Arquivo = new File("Funcionarios.txt");
            FileReader Fr = new FileReader(Arquivo);
            BufferedReader BR = new BufferedReader(Fr);

            int pos;
            String Ax;
            String Linha;

            String nome;
            String cargo;
            float salario;
            String contratacaoData;
            String RG;
            String endereco;
            int NumeroFuncionarios = Integer.parseInt(BR.readLine());
            int id;

            while ((Linha = BR.readLine()) != null) {
                pos = Linha.indexOf("-");
                Ax = Linha.substring(0, pos);
                nome = Ax;

                Linha = Linha.substring(pos + 1);
                pos = Linha.indexOf("-");
                Ax = Linha.substring(0, pos);
                cargo = Ax;

                Linha = Linha.substring(pos + 1);
                pos = Linha.indexOf("-");
                Ax = Linha.substring(0, pos);
                salario = Float.parseFloat(Ax);

                Linha = Linha.substring(pos + 1);

                pos = Linha.indexOf("-");
                Ax = Linha.substring(0, pos);
                RG = Ax;

                Linha = Linha.substring(pos + 1);

                pos = Linha.indexOf("-");
                Ax = Linha.substring(0, pos);
                contratacaoData = Ax;

                Linha = Linha.substring(pos + 1);
                pos = Linha.indexOf("-");
                Ax = Linha.substring(0, pos);
                endereco = Ax;

                Linha = Linha.substring(pos + 1);
                id = Integer.parseInt(Linha);
                Funcionarios func = new Funcionarios(nome, cargo, salario, contratacaoData, RG, endereco, id);
                TrabalhoProgramacao.listaFuncionarios.add(func);
            }
            Funcionarios.NumeroFuncionarios = NumeroFuncionarios;
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
//12356789
