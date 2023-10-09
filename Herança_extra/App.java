public class App {

    public static void main(String[] args) {
        
        Caixa c1 = new Caixa("123ABC", "Jarro", 15, 100);
        Caixa c2 = new Caixa("456DEF", "Quadro", 10.5, 150);
        CaixaFragil c3 = new CaixaFragil("756FHG", "TV", 13.7, 93);
        CaixaFragil c4 = new CaixaFragil("976GJT", "Espelho", 17, 300);
        Caixa c5 = new Caixa("952TUI", "Colchão Solteiro", 9.5, 257);

        PilhaDeCaixas pilha = new PilhaDeCaixas(900); 

        System.out.println(c1.exibirEtiqueta());

        if(pilha.empilhar(c1)){
            System.out.println("c1 empilhada");
        } else {
            System.out.println("c1 nao empilhada");
        }

        if(pilha.empilhar(c2)){
            System.out.println("c2 empilhada");
        } else {
            System.out.println("c2 nao empilhada");
        }

        if(pilha.empilhar(c4)){
            System.out.println("c4 empilhada");
        } else {
            System.out.println("c4 nao empilhada");
        }

        if(pilha.empilhar(c3)){
            System.out.println("c3 empilhada");
        } else {
            System.out.println("c3 nao empilhada");
        }

        if(pilha.empilhar(c5)){
            System.out.println("c5 empilhada");
        } else {
            System.out.println("c5 nao empilhada");
        }

        




    }
    
}
