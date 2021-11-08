package pk_auto;

public class Auto {
    private String numChassi;
    private double velocidadeMax;
    private double velocidade;
    private double km;
    private double potencia;
    private String color;
    private int qntportas;

    public Auto(){
        this.numChassi = "Camaro";
        this.velocidadeMax = 210;
        this.velocidade = 0;
        this.km = 90000;
        this.potencia = 120;
        this.color = "preta";
        this.qntportas = 4;
    } 

    public void ligar(){
        System.out.println(numChassi + " de cor " +color + " está ligado!");
        System.out.println("Velocidade atual: "+ velocidade);
    }

    public void desligar(){
        System.out.println(numChassi + " de cor " +color + " está desligado!");
        velocidade = 0;
        System.out.println("Velocidade atual: "+ velocidade+" Km/h");
    }

    public void acelerar(){
        System.out.println(numChassi + " de cor " +color + " está acelerando!");
        velocidade = velocidade + 20;
        System.out.println("Velocidade atual: "+ velocidade+" Km/h");
    }

    public void freiar(){
        System.out.println(numChassi + " de cor " +color + " está freiando!");
        velocidade = velocidade - 20;
        System.out.println("Velocidade atual: "+ velocidade+" Km/h");
    }

    public void girarVolante(){
        System.out.println(numChassi + " de cor " +color + " está fazendo uma curva!");
        System.out.println("Velocidade atual: "+ velocidade+" Km/h");
    }

    public void reduzirMarcha(){
        System.out.println(numChassi + " de cor " +color + " está reduzindo marcha!");
        velocidade = velocidade - 5;
        System.out.println("Velocidade atual: "+ velocidade+" Km/h");
    }

}