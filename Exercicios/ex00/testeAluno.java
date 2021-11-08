

public class testeAluno {
    public static void main(String[] args) {
        Aluno al01 = new Aluno("Adriano","Rua Rita Gama Barros, 255","92660398291","92984126967","29/06/2002","Romualdo","Suely");
        al01.mostrarDadosAluno();
        al01.alterarEndereco();
        al01.alterarFone();
        al01.alterarMae();
        al01.alterarPai();
        al01.mostrarDadosAluno();
    }
}
