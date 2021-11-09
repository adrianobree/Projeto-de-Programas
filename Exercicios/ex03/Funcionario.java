package empresa;

public class Funcionario {
    private String nomeFuncionario;
    private double salarioFuncionario;
    private Departamento departamento;

    public Funcionario(String nomeFuncionario, double salarioFuncionario, Departamento departamento){
        this.nomeFuncionario = nomeFuncionario;
        this.salarioFuncionario = salarioFuncionario;
        this.departamento = departamento;
        this.departamento.addFuncionarios(this);
    }

    public String getNomeFuncionario() {
        return this.nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public double getSalarioFuncionario() {
        return this.salarioFuncionario;
    }

    public void setSalarioFuncionario(double salarioFuncionario) {
        this.salarioFuncionario = salarioFuncionario;
    }

    public Departamento getDepartamento(){
        return this.departamento;
    }

    public void setDepartamento(Departamento departamento){
        this.departamento = departamento;
    }

    public void mudarSalario(double valor){
        this.salarioFuncionario = salarioFuncionario + (salarioFuncionario * valor/100);
    }

    public void mostrarDados(){
        System.out.println("nome: " + this.nomeFuncionario + "\nSalario: " + this.salarioFuncionario + "\nDepartamento: "+ this.departamento.getNomeDpto());
    }
    
}
