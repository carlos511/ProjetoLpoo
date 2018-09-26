
package projetolpoo;

public class Funcionario extends Pessoa {
    public int matricula;
    public double salario;
    public String funcao;

    public Funcionario(){}
    
    public Funcionario(int matricula, double salario, String funcao){
        this.matricula = matricula;
        this.salario = salario;
        this.funcao = funcao;
    }
    
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
    
}
