package empresa;

import java.util.ArrayList;

public class teste {
    public static void main(String[] args) {
        /// Empresa samsung = new Empresa("Samsung");

        /* Departamento departamentoRH = new Departamento("RH");
        Departamento departamentoFin = new Departamento("Finanças");
        Departamento departamentoQual = new Departamento("Qualidade");
        samsung.addDepartamentos(departamentoRH);
        samsung.addDepartamentos(departamentoFin);
        samsung.addDepartamentos(departamentoQual);

        Funcionario geovani = new Funcionario("Geovani", 222.1, departamentoRH);
        Funcionario joao = new Funcionario("Joao", 222.2, departamentoRH);
        departamentoRH.addFuncionarios(geovani);
        departamentoRH.addFuncionarios(joao);
        departamentoRH.aumentoSalario();

        Funcionario jose = new Funcionario("Jose", 222.3, departamentoFin);
        departamentoFin.addFuncionarios(jose);

        Funcionario adevan = new Funcionario("Adevan", 222.4, departamentoQual);
        departamentoQual.addFuncionarios(adevan);

        /// System.out.println("Empresa: " + samsung.getNomeEmpresa());
        /// samsung.mostraDepartamentos(); 

        System.out.println("Nome do departamento: " + departamentoRH.getNomeDpto());
        departamentoRH.mostraFuncionarios();

        System.out.println("Nome dpto: " + departamentoFin.getNomeDpto());
        departamentoFin.mostraFuncionarios();

        System.out.println("Nome dpto: "+ departamentoQual.getNomeDpto());
        departamentoQual.mostraFuncionarios(); */
        
        Departamento rh = new Departamento("RH");
        Departamento vendas = new Departamento("vendas");
        ArrayList<Departamento> d = new ArrayList<Departamento>();

        Empresa samsung = new Empresa("Samsung", d);

        Funcionario geovani = new Funcionario("Geovani", 12000.0, rh);
        Funcionario allef = new Funcionario("Allef", 10000.0, rh);
        Funcionario adriano = new Funcionario("Adriano", 2000.0, vendas);

        /*geovani.mostrarDados();
        geovani.mudarSalario(10);
        geovani.mostrarDados();*/

        rh.mostraFuncionarios();
        d.add(rh);
        d.add(vendas);
        samsung.mostraDepartamentos();
        /// rh.mudarSalario(10);
        rh.mostraFuncionarios();
        /// rh.removerFuncionario(geovani);
        /// rh.mostraFuncionarios();
        vendas.mostraFuncionarios();
        samsung.transferirFuncionario(allef, vendas);
        vendas.mostraFuncionarios();
        rh.mostraFuncionarios();
    }
    
}
