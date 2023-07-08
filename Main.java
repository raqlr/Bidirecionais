import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in); // scanf em c...

    // variáveis
    int opcao;
    boolean rodando = true;
    int idsMatricula = 202302001;
    float media = 0;
    List<Aluno> alunosList = new ArrayList<Aluno>(); // lista com expecificação (<Aluno>)

    while(rodando == true){
      System.out.printf("\n\n\tMENU\n");
      System.out.println("1 - Cadastrar alunos");
      System.out.println("2 - Digitar a nota do 1º Bimestre");
      System.out.println("3 - Digitar a nota do 2º bimestre");
      System.out.println("4 - Fechar notas");
      System.out.println("5 - Exbir alunos");
      System.out.println("6 - Exibir media final da turma");
      System.out.println("7 - Exibir aluno com maior nota");
      System.out.println("8 - Exibir aluno com menor nota");
      System.out.println("9 - Exibir alunos com nota igual ou acima da media");
      System.out.println("0 - Sair");

      System.out.printf("\nDigite a opção desejada: ");
      opcao = scan.nextInt();

      switch (opcao){
        case 1: // Cadastrar Aluno
          Aluno aux = new Aluno(idsMatricula); // aux (auxiliar) = nome dado a classe.
          
          System.out.printf("\nDigite o nome do aluno: ");
          String nome = scan.next();
          
          aux.setNome(nome);
          idsMatricula++;
          
          alunosList.add(aux);
        break;
          
        case 2: // nota1B 
          for(Aluno i: alunosList){
            System.out.printf("\nDigite a nota do aluno: " + i.getNome() + "("+ i.getMatricula() +"): ");
            float n1 = scan.nextFloat();
            i.setNota1B(n1);
            System.out.printf("\n----------");
          }
          
        break;
        
        case 3: // nota2B
          for(Aluno i: alunosList){
            System.out.printf("\nDigite a nota do aluno: " + i.getNome() + "("+ i.getMatricula() +"): ");
            float n2 = scan.nextFloat();
            i.setNota2B(n2);
            System.out.printf("\n----------");
          }
        break;
        
        case 4: // fechamento de notas
          for(Aluno i: alunosList){
            i.setNotaFinal((i.getNota1B()+i.getNota2B())/2);
          }
            System.out.printf("\nNota Final processada! ");
        break;
          
        case 5: // visualizar alunos
          System.out.printf("\n\n----------LISTA DE ALUNOS---------");
          for(Aluno i: alunosList){
            System.out.printf("\nMatrícula: " + i.getMatricula());
            System.out.printf("\nNome: " + i.getNome());
            System.out.printf("\nNota 1º Bimestre: " + i.getNota1B());
            System.out.printf("\nNota 2º Bimestre: " + i.getNota2B());
            System.out.printf("\nNota Final: " + i.getNotaFinal());
            System.out.printf("\n----------------------------------");
          }
        break;
          
        case 6: // media final da turma
          float soma = 0;
          for(Aluno i: alunosList){
            soma = soma + i.getNotaFinal();
          }
          media = soma / alunosList.size();
          System.out.printf("\n\nNota média da Turma: " + media);
        break;

        case 7: // maior nota
          Aluno max = alunosList.get(0); // aluno da primeira posição e comparar entre os demais.
          for(Aluno i: alunosList){
            if(max.getNotaFinal() < i.getNotaFinal()){
              max = i;
            }
          }
          System.out.printf("\n\nAluno com maior nota: "+ max.getNome() +" ("+ max.getMatricula() +") NOTA: " + max.getNotaFinal());
        break;

        case 8: // menor nota
          Aluno min = alunosList.get(0); // aluno da primeira posição e comparar entre os demais.
          for(Aluno i: alunosList){
            if(min.getNotaFinal() > i.getNotaFinal()){
              min = i;
            }
          }
          System.out.printf("\n\nAluno com menor nota: "+ min.getNome() +" ("+ min.getMatricula() +") NOTA: " + min.getNotaFinal());
        break;

        case 9: // acima da média
          for(Aluno i: alunosList){
            if(i.getNotaFinal() >= media){
              System.out.printf("\nMatrícula: " + i.getMatricula());
              System.out.printf("\nNome: " + i.getNome());
              System.out.printf("\nNota Final: " + i.getNotaFinal());
              System.out.printf("\n----------");
            }
          }
        break;
        
        case 0:
          System.out.println("Saindo...");
          System.exit(0);
        default:
          System.out.println("Opção inválida.");
      } 
    } 
  }
}