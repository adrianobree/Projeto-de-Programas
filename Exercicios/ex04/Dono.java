

import java.util.ArrayList;

public class Dono{
    private String nome;
    private String cpf;
    private String endereço;
    private String telefone;
    private ArrayList<Gato> gatos;
    
    public Dono(){
        this.gatos = new ArrayList<Gato>();
    }
    public Dono(String nome, String cpf, String endereço, String telefone){
        this.gatos = new ArrayList<Gato>();
        this.nome = nome;
        this.cpf = cpf;
        this.endereço = endereço;
        this.telefone = telefone;
        
    }

    public String getNomeDono() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereço() {
        return this.endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public void addGato(Gato gato){
        this.gatos.add(gato);

    }
}