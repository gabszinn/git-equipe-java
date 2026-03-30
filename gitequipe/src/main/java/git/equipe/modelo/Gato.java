package git.equipe.modelo;

public class Gato extends Animal {

    private String cor;

    public Gato(String especie, String sexo, int idade, String cor) {
        super(especie, sexo, idade);
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String emitirSom() {
        return "Miau Miau!";
    }

@Override
public String toString() {
    return "Especie: " + especie +
           ", Sexo: " + sexo +
           ", Idade: " + idade +
           ", Cor: " + cor;
  }
}  