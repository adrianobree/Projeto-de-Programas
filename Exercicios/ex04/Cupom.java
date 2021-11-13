public class Cupom {
    private String codigo;
    private double porcent;
    private String status;
 
    public Cupom(String codigo, double porcent, String status){
        
        this.codigo = codigo;
        this.porcent = porcent;
        this.status = status;
    }
    
    public void aplicarCupom(Gato gato){
        System.out.println("Aplicando o desconto...");
        double newValorServ= gato.getValorServ() - (gato.getValorServ()* porcent);
        gato.setValorServ(newValorServ);
        System.out.println("\n");
    }
    
    public void mostrarCupom(){
        System.out.println("==================");
        System.out.println("Cupom: ");
        System.out.println("Codigo: "+ this.codigo);
        System.out.println("Desconto: "+ this.porcent*100+"%");
        System.out.println("Status: "+ this.status);
        System.out.println("==================");
        System.out.println("\n");
    }





}
