package PastaAtividade9;

public class ExecucaoCurso {

    public static void main(String[] args) {
        Curso c1 =new Curso ( 1, 1000 );
        Curso c2 = new  Curso ( 2 , 1050 );
        Curso c3 =  new   Curso ( 3 , 2000 );
        Aluno a1=new Aluno(6);
        Aluno a2=new  Aluno(9);
        Aluno a3=new Aluno(7);
        Inst e1 = new Inst ();
        e1 . listaCurso . add (c1);
        e1 . listaCurso . add (c2);
        e1 . listaCurso . add (c3);
        c1.addAluno(a1);
        c2.addAluno(a2);
        c3.addAluno(a3);



        System.out.println ( " Quantidade de alunos aprovados: " );
        for ( Curso cc : e1.listaCurso) {
            System .out. println (cc .getCodigo () +  "  "  + cc . quantAprov ());
        }

        System.out.println ( " Quantidade de reprovados nos cursos "  + e1 . repr ());
        System.out.println ( " Código do curso que gera maior renda "  + e1 . maiorReceita ());


    }
}
