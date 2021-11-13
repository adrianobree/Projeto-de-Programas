

public class Gato {
    private String nome;
    private String corPredominante;
    private String raçaoFavorita;
    private Dono dono;
    private double valorserv = 0;

    public Gato(String nome, String corPredominante, String raçaoFavorita, Dono dono){
        this.nome = nome;
        this.corPredominante = corPredominante;
        this.raçaoFavorita = raçaoFavorita;
        this.dono = dono;
        this.dono.addGato(this);
    }
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCorPredominante() {
        return this.corPredominante;
    }

    public void setCorPredominante(String corPredominante) {
        this.corPredominante = corPredominante;
    }

    public String getRaçaoFavorita() {
        return this.raçaoFavorita;
    }

    public void setRaçaoFavorita(String raçaoFavorita) {
        this.raçaoFavorita = raçaoFavorita;
    }

    public Dono getDono() {
        return this.dono;
    }

    public void setDono(Dono dono) {
        this.dono = dono;
    }

    public double getValorServ(){
        return this.valorserv;
    }

    public void setValorServ(double valorserv){
        this.valorserv = valorserv;
    }


    public void imprimirDono(){
        System.out.println("==================");
        System.out.println("Nome: "+ this.nome );
        System.out.println("Dono: " + dono.getNomeDono());
        System.out.println("==================");
        System.out.println("\n");
    }

    public void banho(){
        valorserv += 70.0;
    }
    public void tosa(){
        valorserv += 150.0;
    }
    public void consulta(){
        valorserv += 100.0;
    }
    public void hotelzinhoPet(){
        valorserv += 300.0;
    }
    public void mostraDespesa(){
        System.out.println("PetShop GatinhosLindinhos");
        System.out.println("Despesa "+ this.nome + ":" + this.valorserv);
        System.out.println("\n");
    }

}
