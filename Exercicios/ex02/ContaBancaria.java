
import java.util.Scanner;

public class ContaBancaria {
    private double saldo;
    private String dataAbertura;
    private String tipoConta;
    private double valorMan;
    private double deposito;
    private double saque;
    
    public void Scanner(){
        Scanner ler = new Scanner(System.in);
    }    

    public ContaBancaria(double saldo,String dataAbertura,String tipoConta,double valorMan){
        this.saldo = saldo;
        this.dataAbertura = dataAbertura;
        this.tipoConta = tipoConta;
        this.valorMan = valorMan;
        this.deposito = deposito;
        this.saque = saque;
    }


    public double getSaldo(){
        return saldo;
    }

    public void setSaldo(double saldo){
        this.saldo=saldo;
    }

    public String getDataAbertura(){
        return dataAbertura;
    }

    public void setDataAbertura(String dataAbertura){
        this.dataAbertura=dataAbertura;
    }
    public String getTipoConta(){
        return tipoConta;
    }

    public void setTipoConta(String tipoConta){
        this.tipoConta=tipoConta;
    }
    
    public double getValorMan(){
        return valorMan;
    }

    public void setValorMan(double valorMan){
        this.valorMan=valorMan;
    }

    public double getDepodito(){
        return deposito;
    }

    public void setDeposito(double deposito){
        this.deposito=deposito;
        
    }

    public double getSaque(){
        return saque;
    }

    public void setSaque(double saque){
        
        this.saque=saque;
    }
    
    public void depositar(){
       
        System.out.println("=====================================");
        System.out.println("DEPOSITO  -----  "+dataAbertura);
        System.out.println("Saldo: R$ "+saldo);
        System.out.println("Qual valor deseja depositar: ");
        Scanner ler = new Scanner(System.in);
        deposito = ler.nextInt();
        
        

        
        if (saldo >= saque) {
            System.out.println("=====================================");
            System.out.println("DEPOSITO  -----  "+dataAbertura);
            System.out.println("Saldo: R$ "+saldo);
            System.out.println("Valor depositado: R$ "+deposito);
            saldo = saldo + deposito;
            System.out.println("Saldo atualizado: R$ "+saldo);
        }

        
        
    }

    private static double nextInt() {
        return 0;
    }


    public void sacar(){
        
        System.out.println("=====================================");
        System.out.println("SAQUE  -----  "+dataAbertura);
        System.out.println("Saldo: R$ "+saldo);
        System.out.println("Qual valor deseja sacar: ");
        Scanner ler = new Scanner(System.in);
        saque = ler.nextInt();

        
        if (saldo >= saque) {
            System.out.println("=====================================");
            System.out.println("SAQUE  -----  "+dataAbertura);
            System.out.println("Saldo: R$ "+saldo);
            System.out.println("Valor de saque: R$ "+saque);
            saldo = saldo - saque;
            System.out.println("Saldo atualizado: R$ "+saldo);
        }
        
        if (saldo < saque) {
            System.out.println("=====================================");
            System.out.println("Saldo: R$ "+saldo);
            System.out.println("Valor de saque: R$ "+saque);
            System.out.println("Saldo não é suficiente para saque");
        }
    }

    
















}



