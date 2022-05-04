// 2. Adicione um novo personagem e inclua ele no “loop do jogo”.

import java.util.Random;

public class Jogo {

    public static void main(String[] args) throws Exception {

        Personagem cacador = new Personagem(10, 0,0);
        Personagem soneca = new Personagem(2, 4,10);
        Personagem guloso = new Personagem(4, 10,2);

    
        cacador.setNome("Fernanda");
        soneca.setNome("Leo");
        guloso.setNome("Maria");

        Random gerador = new Random();
    
        while(true){
            int oQueFazer = gerador.nextInt(3)+1;
            int debuff = oQueFazer+1;
            switch(oQueFazer){
                case 1:
                    cacador.cacar();
                    guloso.cacar(debuff);
                    break;
                case 2:
                    cacador.comer();
                    guloso.comer(debuff);
                    break;
                case 3:
                    cacador.dormir();
                    guloso.dormir();
                    break;
            }
            System.out.println("\n");
            Thread.sleep(3000);
        }

    }
}