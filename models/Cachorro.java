package models;

import util.Validacoes;

public class Cachorro {

    //ATRIBUTOS

    private String nome;
    private String cor;
    private String raca;
    private int idade;

    //CONTRUTOR PARAMETRIZADO

    public Cachorro(String nome, String cor, String raca, int idade) {
        this.nome = nome;
        this.cor = cor;
        this.raca = raca;
        this.idade = idade;
    }

    //CONSTRUTOR COM VALORES PADRÕES

    public Cachorro(){
        this.nome = "Kratos";
        this.cor = "Branco com listra vermelha";
        this.raca = "Pit bull";
        this.idade = 7;
    }

    //SAUDAÇÃO

    public void saudacao() {
        System.out.println("O cachorro " + nome + ", da cor " + cor + ", da raça " + raca + " tem " + idade + " anos.");
    }

    //GETTERS

    public String getNome(){
        return nome;
    }
    public String getCor(){
        return cor;
    }
    public String getRaca(){
        return raca;
    }
    public int getIdade(){
        return idade;
    }
    
        //SETTERS

    public void setNome(String nome){
        if (Validacoes.nomeValido(nome)) {
            this.nome = nome;
        } else {
            System.out.println(Validacoes.mensagemErroNome(nome));
        }
    }
    public void setCor(String cor){
        if (Validacoes.corValida(cor)) {
            this.cor = cor;
        } else {
            System.out.println(Validacoes.mensagemErroCor(cor));
        }
    }
    public void setRaca(String raca){
        if (Validacoes.racaValida(raca)) {
            this.raca = raca;
        } else {
            System.out.println(Validacoes.mensagemErroRaca(raca));
        }
    }
    public void setIdade(int idade){
        if (Validacoes.idadeValida(idade)) {
            this.idade = idade;
        } else {
            System.out.println(Validacoes.mensagemErroIdade(idade));
        }
    }

    //METODO toString

    @Override
    public String toString(){
        return "Cachorro [nome = " + nome +
                        ", cor = " + cor +
                        ", raça = " + raca +
                        ", idade = " + idade + "]";
    }
}