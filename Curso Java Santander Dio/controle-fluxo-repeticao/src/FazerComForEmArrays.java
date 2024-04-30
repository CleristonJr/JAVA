public class FazerComForEmArrays {
    public static void main(String[] args) {
        String alunos[] = {"Felipe", "Ruan", "Carlos", "João"};

        for (int x = 0; x<alunos.length; x++){
            System.out.println("O aluno no índice " + x + " é " + alunos[x]);
        }

        //forma abreviada
        for (String aluno : alunos){
            System.out.println("Nome do aluno é " + aluno);
        }
    }
}
