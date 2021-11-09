import java.util.Scanner;

public class testeConta {
    public static void main(String[] args) {
        
        ContaBancaria conta = new ContaBancaria(2000,"20/10/2004","Corrente",100);
        
        conta.depositar();
        conta.sacar();
        
    }
}
