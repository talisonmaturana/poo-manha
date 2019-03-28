package br.com.talisonmaturana.projFuncionario;

public class Funcionario {

    public String nome;
    public String departamento;
    public double salario;
    public String rg;
    public boolean estaNaEmpresa;

    public void bonificar(double aumento) {

    }

    public void imprimir() {
        System.out.println("nome = " + nome);
        System.out.println("departamento = " + departamento);
        System.out.println("salario = " + salario);
        System.out.println("rg = " + rg);
        if(estaNaEmpresa){
            System.out.println("Funcionario ativo");
        } else {
            System.out.println("Funcionario Inativo");
        }
    }
}
