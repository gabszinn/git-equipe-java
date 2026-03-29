package git.equipe.modelo;

public class Gato extends Animal {

    public Gato(String especie, String sexo, int idade) {
        super(especie, sexo, idade);
    }

    @Override
    public String emitirSom() {
        return "Miau Miau!";
    }

    @Override
    public String toString() {
        return super.toString() + ", Tipo: Gato";
    }
}