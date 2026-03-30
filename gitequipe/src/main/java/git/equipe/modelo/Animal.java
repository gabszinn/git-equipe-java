package git.equipe.modelo;

public class Animal {
  protected String especie;
  protected String sexo;
  protected int idade;
  
  public Animal(String especie, String sexo, int idade) {
    this.especie = especie;
    this.sexo = sexo;
    this.idade = idade;
  }

  public String emitirSom() {
     return "Som";
  }

  public String getEspecie() {
    return especie;
  }

  public int getIdade() {
    return idade;
  }

  public String getSexo(){
    return sexo;
  }

  @Override
  public String toString(){
    return "Especie: " + especie + ", Sexo: " + sexo + ", Idade: " + idade;
  }


  
}
