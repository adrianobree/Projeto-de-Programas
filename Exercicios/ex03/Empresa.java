package empresa;

import java.util.ArrayList;

public class Empresa {
    private String nomeEmpresa;
    private ArrayList<Departamento> departamentos;

    public Empresa(){
        this.departamentos = new ArrayList<Departamento>();
    }
    public Empresa(String nomeEmpresa, ArrayList<Departamento> departamentos){
        this.nomeEmpresa = nomeEmpresa;
        this.departamentos = departamentos;
    }

    public String getNomeEmpresa() {
        return this.nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public void addDepartamentos(Departamento newDepartamento) {
        this.departamentos.add(newDepartamento);
    }

    public void transferirFuncionario(Funcionario funcionario, Departamento departamento){
        funcionario.getDepartamento().removerFuncionario(funcionario);
        departamento.addFuncionarios(funcionario);
        funcionario.setDepartamento(departamento);
    }

    public void mostraDepartamentos() {
        System.out.println("Dados da empresa: ");
        for(int i =0; i < this.departamentos.size();i++){
            System.out.println("Departamentos: " + this.departamentos.get(i).getNomeDpto());
        }
    }
    
}
