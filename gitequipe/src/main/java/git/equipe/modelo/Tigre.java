package git.equipe.modelo;

public class Tigre extends Animal {

    public Tigre(String especie, String sexo, int idade) {
        super(especie, sexo, idade);
    }

    @Override
    public String emitirSom() {
        return "Urrrghel!";
    }

    @Override
    public String toString() {
    return "Especie:  " + especie + ", Idade:  " + idade + " Sexo: " + sexo;
    }