package Funcionarios;

public class Funcionarios {

    private String nome;
    private String cargo;
    private float salario;
    private String contratacaoData;
    private String RG;
    private String endereco;
    private static int NumeroFuncionarios;
    private int id;

    public Funcionarios(String nome, String cargo, float salario, String contratacaoData, String RG, String endereco) {
        NumeroFuncionarios++;
        id = NumeroFuncionarios;
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
        this.contratacaoData = contratacaoData;
        this.RG = RG;
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return nome + " Cargo - " + cargo + " salario - " + salario + " RG - " + RG + " Data da contratação - " + contratacaoData + " Endereço - " + endereco;
    }

    public boolean Iqual(Funcionarios Funcionarios) {
        return this.id == Funcionarios.getId();
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String Endereco) {
        this.endereco = Endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getContratacaoData() {
        return contratacaoData;
    }

    public void setContratacaoData(String contratacaoData) {
        this.contratacaoData = contratacaoData;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public int getId() {
        return id;
    }

}
