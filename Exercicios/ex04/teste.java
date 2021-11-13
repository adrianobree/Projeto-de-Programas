

public class teste {
    public static void main(String[] args) {
        Petshop pet = new Petshop("GatinhosLindinhos");

        Cupom cupom1 = new Cupom("descontao", 0.15, "ATIVO");
        Cupom cupom2 = new Cupom("20OFF", 0.20, "ATIVO");

        Dono adriano = new Dono("Geovani", "957.614.320-51", "Av Constantino Nery, 38", "94235-6538");
        Dono jose = new Dono("Jose", "143.496.749-18", "Av Coronel Texeira, 20", "93546-6789");

        Gato ninina = new Gato("Ninina", "Preto", "Premium", adriano);
        Gato tareco = new Gato("Tareco", "Branco", "Wisker", adriano);
        Gato garfild = new Gato("Garfild", "Caramelo", "Pedigre", adriano);
        Gato frajola = new Gato("Frajola", "Amarelo", "Wisker", jose);
        Gato tom = new Gato("Tom", "Azul", "Pedigre", jose);



        ninina.imprimirDono();
        tareco.imprimirDono();
        garfild.imprimirDono();
        tom.imprimirDono();
        frajola.imprimirDono();
        System.out.println("++++++++++++++++++++++++");
        System.out.println("José:");
        System.out.println("Gato favorito: Frajola");
        System.out.println("++++++++++++++++++++++++");
        System.out.println("\n");

        ninina.banho();
        ninina.mostraDespesa();
        cupom1.mostrarCupom();
        cupom1.aplicarCupom(ninina);
        ninina.mostraDespesa();
        
        frajola.banho();
        frajola.consulta();
        frajola.hotelzinhoPet();
        frajola.mostraDespesa();
        cupom2.mostrarCupom();
        cupom2.aplicarCupom(frajola);
        frajola.mostraDespesa();
        
        
        
        
        pet.addDono(adriano);
        pet.addDono(jose);
    }
    
}
