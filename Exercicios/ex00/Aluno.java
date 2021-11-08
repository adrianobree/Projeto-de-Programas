


public class Aluno {
    private String nome;
    private String endereco;
    private String cpf;
    private String fone;
    private String data;
    private String nomepai;
    private String nomemae;

    public Aluno(String nome,String endereco,String cpf,String fone,String data,String nomepai,String nomemae){
        this.nome= nome;
        this.endereco= endereco;
        this.cpf= cpf;
        this.fone= fone;
        this.data= data;
        this.nomepai= nomepai;
        this.nomemae= nomemae;
    }
 
    public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
    }
    
    public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
    }
    
    public String getCPF() {
		return cpf;
	}
	public void setCPF(String cpf) {
		this.cpf = cpf;
    }

    public String getFone() {
		return fone;
	}
	public void setFone(String fone) {
		this.fone = fone;
    }

    public String getData() {
		return nome;
	}
	public void setData(String data) {
		this.data = data;
    }

    public String getNomePai() {
		return nomepai;
	}
	public void setNomePai(String nomepai) {
		this.nomepai = nomepai;
    }

    public String getNomeMae() {
		return nomemae;
	}
	public void setNomeMae(String nomemae) {
		this.nomemae = nomemae;
    }

    public void alterarFone(){
        fone = "92982489717";
        System.out.println("Atualizando fone...");
    }

    public void alterarPai(){
        nomepai = "Neymar da Silva Gomes";
        System.out.println("Atualizando nome do pai...");
    }

    public void alterarMae(){
        nomemae = "Rosa Maria de Castro";
        System.out.println("Atualizando nome da mae...");
    }

    public void alterarEndereco(){
        endereco = "Rua Marques de Vila Real da Praia Grande, 22";
        System.out.println("Atualizando endereco...");
    }

    public void mostrarDadosAluno(){
        System.out.println("DADOS CADASTRAIS:");
        System.out.println("=====================================");
        System.out.println("Aluno: "+nome);
        System.out.println("Data de Nascimento: "+data);
        System.out.println("CPF: "+cpf);
        System.out.println("Endereco: "+endereco);
        System.out.println("Fone: "+fone);
        System.out.println("Nome da Mae: "+nomemae);
        System.out.println("Nome do Pai: "+nomepai);
        System.out.println("=====================================");
    }






}
