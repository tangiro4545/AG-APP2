package app;

import models.Cachorro;

public class Main {
    
    public static void main(String[] args){

        Cachorro cachorroPadrao = new Cachorro();
        System.out.println("\nCachorro padrão:");
        imprimirCachorro(cachorroPadrao);

        Cachorro cachorroNulo = null;
        System.out.println("\nCachorro nulo:");
        imprimirCachorro(cachorroNulo);
    
        Cachorro cachorro = new Cachorro("Kratos", "Branco com listra vermelha", "Pit bull", 7);
        System.out.println("\nCachorro criado:");
        imprimirCachorro(cachorro);

        cachorro.saudacao();

        System.out.println("Nome (get): " + cachorro.getNome());

        cachorro.setNome("Lucas Sistema");
        System.out.println("Nome modificado: " + cachorro.getNome());

        cachorro.setIdade(5);
        System.out.println("Após modificações: " + cachorro);
    }

    public static void imprimirCachorro(Cachorro cachorro) {
        if (cachorro == null) {
            System.out.println("Cachorro não inicializado!");
            return;
        }
        System.out.println(cachorro);
        cachorro.saudacao();
    }
}