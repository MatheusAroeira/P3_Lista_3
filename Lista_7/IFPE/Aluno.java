package Lista_7.IFPE;

public class Aluno {

    private String cpf, nome;
    private double[] notas;
    private int indexNotas;

    public Aluno(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        notas = new double[4];
    }

    public void setNota(double nota) {
        this.notas[indexNotas] = nota;
        indexNotas++;
    }

    public void setNotaAtIndex(double nota, int index) {
        this.notas[index] = nota;

    }

    public double calcMedia() {
        double media = 0;

        for (int i = 0; i < notas.length; i++) {
            media += notas[i];
        }

        return media / 4;
    }

    public String getNome() {
        return nome;
    }

    public double getNotaAtIndex(int index) {
        return notas[index];
    }

    public String getStringArrayNotas() {

        String result = "";

        for (int i = 0; i < notas.length; i++) {
            result += notas[i];
            if(i != 3){
                result += ", ";
            }
        }
        
        return result;
    }

}
