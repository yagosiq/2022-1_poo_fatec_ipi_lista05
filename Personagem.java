/* 1. Adicione um método à classe Personagem que exibe o estado (valores de energia,
fome e sono) dos objetos. Chame ele em cada método existente na sua classe. Ele
deve exibir o nome do personagem seguido dos valores de cada variável. */

public public class Personagem {

    private String nome; 
    private int energia = 10;
    private int fome; 
    private int sono = 0;
    final static int LIMITE_SUPERIOR = 10;

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }

    public Personagem(int energia, int fome, int sono){
        if(energia >= 0 && energia <=10)
            this.energia = energia;
        if(fome >=0 && fome <=10)
            this.fome = fome;
        if(sono >= 0 && sono <=10)
            this.sono = sono;
    }
    public Personagem(String nome, int energia, int fome, int sono){
        this(energia,fome,sono);
        this.nome = nome;
        
    }

    void status(){
        System.out.printf("Status de %s:\nEnergia: %s - Sono: %s - Fome: %s\n", 
        this.nome,
        this.energia, 
        this.sono, 
        this.fome);
    }

    void cacar(){
        if(this.energia >= 2){
            System.out.println(nome + " caçando...");
            energia-=2;
            status();
        }
        else{
            System.out.println(nome + " sem energia para caçar...");
            status();
        }
        fome = Math.min(fome + 1, LIMITE_SUPERIOR);
        sono = Math.min(sono + 1,LIMITE_SUPERIOR);
    }

    void cacar(int n){

        if(energia >= 2){
            System.out.println(nome + " esta cacando...");
            energia = energia - n >= 0 ? energia - n : 0;
            status();
        }
        else{
            System.out.println(nome + " esta sem energia para caçar...");
            status();
        }
        fome = Math.min(fome + n, LIMITE_SUPERIOR);
        sono = Math.min(sono + 1,LIMITE_SUPERIOR);
    }

    void comer(){
        if(this.fome >=1){
            System.out.println(nome + " esta comendo...\n");
            fome-=1;
            energia = energia +1 <= LIMITE_SUPERIOR ? energia+=1 : energia;
            status();
        }
        else{
            System.out.println(nome + "esta sem fome...\n");
            status();
        }
    }

    void comer(int n){
        if(fome >=1){
            System.out.printf(nome + "esta comendo\n");
            fome= fome - n >=0? fome - n :0;
            energia = energia +n <= LIMITE_SUPERIOR ? energia+=n : energia;
            status();
        }
        else{
            System.out.printf(nome + " está sem fome...\n");
            status();
        }
    }

    void dormir(){
        if(sono >= 1){
            System.out.println(nome +"esta dormindo...");
            sono -=1;
            energia = energia + 1 <= LIMITE_SUPERIOR ? energia +1 : energia;
            status();
        }
        else{
            System.out.println(nome + " sem sono...");
            status();
        } 
    }