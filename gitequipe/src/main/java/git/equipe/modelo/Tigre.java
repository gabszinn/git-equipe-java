package git.equipe.modelo;

public class Tigre extends Animal {
    private String habitat;

    public Tigre(String especie, String sexo, int idade, String habitat) {
        super(especie, sexo, idade); 
        this.habitat = habitat;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    @Override
    public String emitirSom() {
        return "Urrrghel!";
    }

    @Override
    public String toString() {
        return "Especie:  " + especie + ", Idade:  " + idade + " Sexo: " + sexo + " Habitat: " + habitat;
    }
}
