

import java.util.ArrayList;

public class Petshop {
    private String nome;
    private ArrayList<Dono> donos;

    public Petshop(String nome){
        this.donos = new ArrayList<Dono>();
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void addDono(Dono dono){
        this.donos.add(dono);
    }
    
}

