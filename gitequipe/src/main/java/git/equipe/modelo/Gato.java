package git.equipe.modelo;

public class Gato extends Animal {

    private String raca;

    public Cachorro(String especie, String sexo, int idade, String raca) {
        super(especie, sexo, idade);
        this.raca = raca;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    @Override
    public String emitirSom() {
        return "Miau Miau!";
    }

    @Override
    public String toString() {
        return super.toString() + ", Raça: " + raca;
    }
}