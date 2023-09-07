package Lista_7.IFPE;

public class Aluno_App {

    public static void main(String[] args) {
        
        Aluno joao = new Aluno("João", "123.456.789-10");
        double media;

        joao.setNota(9.5);
        joao.setNota(7);
        joao.setNota(5.7);
        joao.setNota(10);

        media = joao.calcMedia();
        
        System.out.printf("%.2f media\n", media);

        joao.setNotaAtIndex(8.4, 1);

        media = joao.calcMedia();

        System.out.printf("%.2f nova media\n", media);




    }
    
}
