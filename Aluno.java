public class Aluno{
  private final int matricula; // final = variável expressa apenas 1 vez (ñ pode ser mudado). pode ser usado em atributo, método e final.
  private String nome;
  private float nota1B;
  private float nota2B;
  private float notaFinal;

  public Aluno(int n){
    this.matricula = n;
  }

  public int getMatricula(){
    return matricula;
  }

  public String getNome(){
    return nome;
  }

  public void setNome(String nome){
    this.nome = nome;
  }

  public float getNota1B() {
  	return nota1B;
  }
  public void setNota1B(float nota1b) {
  	nota1B = nota1b;
  }
  public float getNota2B() {
  	return nota2B;
  }
  public void setNota2B(float nota2b) {
  	nota2B = nota2b;
  }

  public float getNotaFinal(){ // aluno.notaFinal (processando a variável) -> Aluno.getNotaFinal() (selecionando método)
    return notaFinal; 
  }

  public void setNotaFinal(float notaFinal){
    this.notaFinal = notaFinal;
  }
}