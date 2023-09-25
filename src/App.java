import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Banco banco = new Banco();
        Scanner scanner = new Scanner(System.in);

        Titular titular1 = new PessoaFisica(0, "Michael Alves", "087.354.273-88");
        Titular titular2 = new PessoaJuridica(1, "Maicon Alves", "0899.0088.9988-99");

        System.out.println(titular1.getId() + ": " + titular1.getNome());
        System.out.println(titular2.getId() + ": " + titular2.getNome());

        PessoaFisica pessoaFisica = (PessoaFisica) titular1;
        PessoaJuridica pessoaJuridica = (PessoaJuridica) titular2;

        System.out.println(pessoaFisica.getId() + ": " + pessoaFisica.getNome() + ": " + pessoaFisica.getCpf());
        System.out.println(pessoaJuridica.getId() + ": " + pessoaJuridica.getNome() + ": " + pessoaJuridica.getCnpj());
        System.exit(0);

        while (true) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Criar Cliente");
            System.out.println("2. Criar Conta");
            System.out.println("3. Depositar");
            System.out.println("4. Sacar");
            System.out.println("5. Transferir");
            System.out.println("6. Mostrar Saldo");
            System.out.println("7. Mostrar Cliente");
            System.out.println("8. Mostrar Conta");
            System.out.println("9. Atualizar Cliente");
            System.out.println("10. Atualizar Conta");
            System.out.println("11. Deletar Cliente");
            System.out.println("12. Deletar Conta");
            System.out.println("13. Sair");

            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("Digite o nome do cliente:");
                    String nomeCliente = scanner.next();
                    System.out.println("Digite o CPF do cliente:");
                    String cpfCliente = scanner.next();
                    banco.criarCliente(nomeCliente, cpfCliente);
                    break;
                case 2:
                    System.out.println("Digite o ID do cliente:");
                    int idCliente = scanner.nextInt();
                    System.out.println("Digite o saldo inicial:");
                    double saldoInicial = scanner.nextDouble();
                    System.out.println("Digite o número da conta:");
                    String numeroConta = scanner.next();
                    System.out.println("Digite o número da agência:");
                    String agencia = scanner.next();
                    banco.criarConta(idCliente, saldoInicial, numeroConta, agencia);
                    break;
                case 3:
                    System.out.println("Digite o ID da conta:");
                    int idContaDeposito = scanner.nextInt();
                    System.out.println("Digite o valor a ser depositado:");
                    double valorDeposito = scanner.nextDouble();
                    banco.depositar(idContaDeposito, valorDeposito);
                    break;
                case 4:
                    System.out.println("Digite o ID da conta:");
                    int idContaSaque = scanner.nextInt();
                    System.out.println("Digite o valor a ser sacado:");
                    double valorSaque = scanner.nextDouble();
                    banco.sacar(idContaSaque, valorSaque);
                    break;
                case 5:
                    System.out.println("Digite o ID da conta de origem:");
                    int idContaOrigem = scanner.nextInt();
                    System.out.println("Digite o ID da conta de destino:");
                    int idContaDestino = scanner.nextInt();
                    System.out.println("Digite o valor a ser transferido:");
                    double valorTransferencia = scanner.nextDouble();
                    banco.transferir(idContaOrigem, idContaDestino, valorTransferencia);
                    break;
                case 6:
                    System.out.println("Digite o ID da conta:");
                    int idContaSaldo = scanner.nextInt();
                    banco.mostrarSaldo(idContaSaldo);
                    break;
                case 7:
                    System.out.println("Digite o ID do cliente:");

                    break;
                case 8:
                    System.out.println("Digite o ID da conta:");

                    break;
                case 9:
                    System.out.println("Digite o ID do cliente:");

                    break;
                case 10:
                    System.out.println("Digite o ID da conta:");

                    break;

                case 11:
                    System.out.println("Digite o ID do cliente:");
                    int idClienteDeletar = scanner.nextInt();
                    banco.deletarCliente(idClienteDeletar);
                    break;
                case 12:
                    System.out.println("Digite o ID da conta:");
                    int idContaDeletar = scanner.nextInt();
                    banco.deletarConta(idContaDeletar);
                    break;

                case 13:
                    scanner.close();
                    System.out.println("Saindo...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
