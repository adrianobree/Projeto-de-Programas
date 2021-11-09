package empresa;

import java.util.ArrayList;

public class Departamento{
    private String nomeDpto;
    private ArrayList<Funcionario> funcionarios;


    public Departamento(){
        this.funcionarios = new ArrayList<Funcionario>();
    }

    public Departamento(String nomeDpto){
        this.funcionarios = new ArrayList<Funcionario>();
        this.nomeDpto = nomeDpto;

    }
    
    public String getNomeDpto() {
        return this.nomeDpto;
    }

    public void setNomeDpto(String nomeDpto) {
        this.nomeDpto = nomeDpto;
    }

    public void mudarSalario(double valor){
        for (int i =0; i < this.funcionarios.size();i++){
            this.funcionarios.get(i).mudarSalario(valor);
        }

    }

    public void addFuncionarios(Funcionario newFuncionario) {
        this.funcionarios.add(newFuncionario);
    }
    public void removerFuncionario(Funcionario funcionario){
        this.funcionarios.remove(funcionario);
    }
    public void mostraFuncionarios(){
        System.out.println("Funcionarios do departamento " + this.nomeDpto);
        for (int i =0; i < this.funcionarios.size();i++){
            System.out.println("Funcionario: " + this.funcionarios.get(i).getNomeFuncionario() + "/ Salario: " + this.funcionarios.get(i).getSalarioFuncionario());
        }
    }
}