package git.equipe.modelo;

public class Tigre extends Animal {

    private String raca;

    public Tigre(String especie, String sexo, int idade, String raca) {
        super("Tigre", sexo, idade);
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
        return "Urrrggghhh";
    }

    @Override
    public String toString() {
        return super.toString() + ", Raça: " + raca;
    }
}