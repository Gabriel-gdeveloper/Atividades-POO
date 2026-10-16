package inicioHeranca;
// Classe Base Abstrata
abstract class Personagem {
    private String nome;
    private int vida;
    private int poderAtaque;

    public Personagem(String nome, int vida, int poderAtaque) {
        this.nome = nome;
        this.vida = vida;
        this.poderAtaque = poderAtaque;
    }
    public void atacar() {
        System.out.println("Está atacando");
    }

    public void receberDano(int dano) {
        this.vida = this.vida - dano;
    }

    public String getNome() {
        return this.nome;
    }

    public int getVida() {
        return this.vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getPoderAtaque() {
        return this.poderAtaque;
    }

    public void setPoderAtaque(int poderAtaque) {
        this.poderAtaque = poderAtaque;
    }
}
class Guerreiro extends Personagem {
    public int escudo;

    public Guerreiro(String nome, int vida, int poderAtaque, int escudo) {
        super(nome, vida, poderAtaque);
        this.escudo = escudo;
    }

    public void usarSuperForca() {
        int novoAtaque = getPoderAtaque() + 10;
        setPoderAtaque(novoAtaque);
    }
}

class Mago extends Personagem {
    public int mana;

    public Mago(String nome, int vida, int poderAtaque, int mana) {
        super(nome, vida, poderAtaque);
        this.mana = mana;
    }

    public void lancarBolaDeFogo() {
        this.mana = this.mana - 15;
    }
}

public class Main {
    public static void main(String[] args) {
        Guerreiro stark = new Guerreiro("Stark", 300, 50, 25);
        Mago fern = new Mago("Fern", 150, 100, 500);
        stark.usarSuperForca();
        fern.lancarBolaDeFogo();
    }
}
