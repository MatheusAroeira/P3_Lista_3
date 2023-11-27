import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TesteOperacoes {

    private ArrayList<Cliente> listaClientes = new ArrayList<>();
    private ArrayList<Conta> listaContas = new ArrayList<>();
    private Scanner scan = new Scanner(System.in);

    public void criarConta() {
        String nome, endereco, profissao;
        Cliente novoCliente;
        Conta novaConta;
        int tipoConta, numAgencia, numConta, op;
        double saldo;

        try {
            System.out.print("Digite o nome do cliente: ");
            nome = scan.next();
            System.out.print("Digite o endereço do cliente: ");
            endereco = scan.next();
            System.out.print("Digite a profissão do cliente: ");
            profissao = scan.next();
            novoCliente = new Cliente(nome, endereco, profissao);
            listaClientes.add(novoCliente);

            System.out.print("Qual tipo de conta deseja criar? [1]Conta Poupança [2]Conta Corrente \nDigite aqui: ");
            tipoConta = scan.nextInt();
            System.out.print("Digite o numero da agência: ");
            numAgencia = scan.nextInt();
            System.out.print("Digite o numero da conta: ");
            numConta = scan.nextInt();

            if (numAgencia < 0 || numConta < 0) {
                throw new ValorNegativoException();
            }
            System.out.print("Deseja adicionar um saldo? [1]sim [2]não");
            op = scan.nextInt();
            if (op == 1) {
                System.out.print("Digite o saldo da conta: ");
                saldo = scan.nextDouble();
                if (saldo < 0) {
                    throw new SaldoInvalidoException();
                }
                if (tipoConta == 1) {
                    novaConta = new ContaPoupanca(numAgencia, numConta, saldo, novoCliente);
                } else {
                    novaConta = new ContaCorrente(numAgencia, numConta, saldo, novoCliente);
                }
            } else {
                if (tipoConta == 1) {
                    novaConta = new ContaPoupanca(numAgencia, numConta, novoCliente);
                } else {
                    novaConta = new ContaCorrente(numAgencia, numConta, novoCliente);
                }
            }
            listaContas.add(novaConta);
        } catch (InputMismatchException e) {
            System.out.println("Entrada invalida detectada!");
        } catch (SaldoInvalidoException e) {
            System.out.println("Valor do saldo invalido!");
        } catch (ValorNegativoException e) {
            System.out.println("Valor negativo detectado!");
        }

    }

    public void realizarOperacoes() {
        int numAgenciaSaida, numContaSaida, numAgenciaAlvo, numContaAlvo;
        double valor;
        Conta contaSaida = null, contaAlvo = null;

        try {
            System.out.println("Digite os dados da sua conta");
            System.out.print("Numero da Conta: ");
            numContaSaida = scan.nextInt();
            System.out.print("Agência: ");
            numAgenciaSaida = scan.nextInt();

            System.out.println("Digite os dados da conta destino");
            System.out.print("Numero da Conta: ");
            numContaAlvo = scan.nextInt();
            System.out.print("Agência: ");
            numAgenciaAlvo = scan.nextInt();

            if (numAgenciaAlvo < 0 || numAgenciaSaida < 0 || numContaAlvo < 0 || numContaSaida < 0) {
                throw new ValorNegativoException();
            }

            for (Conta conta : listaContas) {
                if (conta.getNumAgencia() == numAgenciaSaida && conta.getNumConta() == numContaSaida) {
                    contaSaida = conta;
                } else if (conta.getNumAgencia() == numAgenciaAlvo && conta.getNumConta() == numContaAlvo) {
                    contaAlvo = conta;
                }
            }

            System.out.printf("%S está enviando para %S", contaSaida.getCliente().getNome(),
                    contaAlvo.getCliente().getNome());
            System.out.print("Digite o valor a ser transferido: ");
            valor = scan.nextDouble();
            if (valor < 0) {
                throw new ValorNegativoException();
            }
            contaSaida.transferencia(contaAlvo, valor);

        } catch (InputMismatchException e) {
            System.out.println("Entrada invalida detectada!");
        } catch (SaldoInvalidoException e) {
            System.out.println("Saldo Insuficiente");
        } catch (NullPointerException e) {
            System.out.println("Conta inexistente");
        } catch (ValorNegativoException e) {
            System.out.println("Valor negativo detectado!");
        }

    }

    public void exibirSaldo() {

        try {
            int numConta, numAgencia, meses;
            Conta conta = null;
            System.out.print("Digite o numero da conta: ");
            numConta = scan.nextInt();
            System.out.print("Digite o numero da agência: ");
            numAgencia = scan.nextInt();

            for (Conta contaAux : listaContas) {
                if (contaAux.getNumConta() == numConta && contaAux.getNumAgencia() == numAgencia) {
                    conta = contaAux;
                }
            }
            System.out.print("Digite a quantidade de meses para simular a operação");
            meses = scan.nextInt();
            if (meses < 0) {
                throw new ValorNegativoException();
            }
            System.out.printf("Saldo apos simulação: R$%.2f\nSaldo atual: R$%.2f", conta.simularOperacao(meses),
                    conta.getSaldo());
        } catch (NullPointerException e) {
            System.out.println("Conta Inexistente");
        } catch (InputMismatchException e) {
            System.out.println("Entrada invalida detectada!");
        } catch (ValorNegativoException e) {
            System.out.println("Valor negativo!");
        }

    }

    public void apresentarMenu() {
        try {
            int escolha;
            do {
                System.out.print("[1]Criar conta\n[2]Realizar operações\n[3]Exibir saldo\n[0]Sair");
                escolha = scan.nextInt();

                switch (escolha) {
                    case 1:
                        criarConta();
                        break;
                    case 2:
                        realizarOperacoes();
                        break;
                    case 3:
                        exibirSaldo();
                        break;
                    case 0:
                        return;

                    default:
                        System.out.print("Opção invalida");
                        break;
                }

            } while (escolha != 0);
        } catch (InputMismatchException e) {
            System.out.println("Entrada invalida detectada!");
            apresentarMenu();
        }

    }

}
