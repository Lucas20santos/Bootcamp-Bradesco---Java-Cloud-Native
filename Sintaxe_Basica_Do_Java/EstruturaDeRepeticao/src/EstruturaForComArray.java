public class EstruturaForComArray {
    public static void main(String[] args) {
        String alunos[] = {"LUCAS", "MARIA", "MARCOS"};
        
        // for(int i = 0; i < alunos.length; i++)
        // {
        //     System.out.println(alunos[i]);
        // }

        for (String string : alunos) {
            System.out.println(string);
        }
    }
}
