import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String titulo;
        int ano, numCopias, dia, mes, index;
        Data auxData;

        ArrayList<ItemBiblioteca> itens = new ArrayList<ItemBiblioteca>();

        int op;

        do {
            System.out.println("(1)Adicionar um Livro\n(2)Adicionar um DVD\n(3)Adicionar uma Revista\n(4)Exibir itens\n(5)Fazer Empréstimo\n(6)Fazer devolução ");
            System.out.print("Digite uma opção: ");
            op = scan.nextInt();

            switch (op) {
                case 1:
                    System.out.print("Digite o titulo do livro: ");
                    titulo = scan.next();
                    System.out.print("Digite o ano de publicação: ");
                    ano = scan.nextInt();
                    System.out.print("Digite o numero de copias disponiveis: ");
                    numCopias = scan.nextInt();
                    System.out.print("Digite o nome do autor: ");
                    String autor = scan.next();

                    Livro novoLivro = new Livro(titulo, ano, numCopias, autor);
                    itens.add(novoLivro);
                    break;
                case 2:
                    System.out.print("Digite o titulo do DVD: ");
                    titulo = scan.next();
                    System.out.print("Digite o ano de publicação: ");
                    ano = scan.nextInt();
                    System.out.print("Digite o numero de copias disponiveis: ");
                    numCopias = scan.nextInt();
                    System.out.print("Digite a duração em minutos: ");
                    int duracao = scan.nextInt();

                    DVD novoDvd = new DVD(titulo, ano, numCopias, duracao);
                    itens.add(novoDvd);
                    break;
                case 3:
                    System.out.print("Digite o titulo do DVD: ");
                    titulo = scan.next();
                    System.out.print("Digite o ano de publicação: ");
                    ano = scan.nextInt();
                    System.out.print("Digite o numero de copias disponiveis: ");
                    numCopias = scan.nextInt();
                    System.out.print("Digite a Edição: ");
                    int edicao = scan.nextInt();

                    Revista novaRevista = new Revista(titulo, ano, numCopias, edicao);
                    itens.add(novaRevista);
                    break;
                case 4:
                    int cont = 1;
                    for (ItemBiblioteca itemBiblioteca : itens) {
                        System.out.println(cont + "-" + itemBiblioteca);
                        cont++;
                    }
                    break;
                case 5:
                    System.out.print("Digite o indice do item: ");
                    index = scan.nextInt();

                    System.out.print("Digite o dia e o mês: ");
                    dia = scan.nextInt();
                    mes = scan.nextInt();

                    auxData = new Data(dia, mes);
                    itens.get(index).fazerEmprestimo(auxData);
                    break;
                case 6:
                    System.out.print("Digite o indice do item: ");
                    index = scan.nextInt();

                    System.out.print("Digite o dia e o mês: ");
                    dia = scan.nextInt();
                    mes = scan.nextInt();

                    auxData = new Data(dia, mes);
                    itens.get(index).fazerDevolucao(auxData);

                    if(itens.get(index).calculDiasAtraso() > 0){
                        System.out.println("Multa de R$" + itens.get(index).calcularMulta(itens.get(index).calculDiasAtraso()));
                    }
                    break;

                default:
                    System.out.println("opção invalida");
                    break;
            }

        } while (op != 0);

    }

}
