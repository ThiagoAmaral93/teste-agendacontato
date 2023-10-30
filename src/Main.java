import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Adicionar contato");
            System.out.println("2 - Remover contato");
            System.out.println("3 - Buscar contato");
            System.out.println("4 - Exibir todos os contatos");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa a quebra de linha após a leitura do número

            int numeroDeContatos = agenda.getCount();
            System.out.println("Número de contatos na agenda: " + numeroDeContatos);

            switch (opcao) {
                case 1:
                    System.out.print("Nome do contato: ");
                    String nome = scanner.nextLine();
                    System.out.print("Telefone do contato: ");
                    String telefone = scanner.nextLine();
                    System.out.print("Email do contato: ");
                    String email = scanner.nextLine();
                    System.out.print("Aniversário do contato: ");
                    String aniversario = scanner.nextLine();

                    Contato novoContato = new Contato(agenda.getContatos().size() + 1, nome, telefone);
                    novoContato.setEmail(email);
                    novoContato.setAniversario(aniversario);
                    agenda.adiciona(novoContato);
                    System.out.println("Contato adicionado com sucesso.");
                    break;

                case 2:
                    System.out.print("ID do contato a ser removido: ");
                    int id = scanner.nextInt();
                    boolean removido = agenda.remove(id);
                    if (removido) {
                        System.out.println("Contato removido com sucesso.");
                    } else {
                        System.out.println("Contato não encontrado.");
                    }
                    break;

                case 3:
                    System.out.print("Digite o nome, telefone ou email do contato a ser buscado: ");
                    String chave = scanner.nextLine();
                    Contato contatoBuscado = agenda.busca(chave);
                    if (contatoBuscado != null) {
                        agenda.exibe(contatoBuscado);
                    } else {
                        System.out.println("Contato não encontrado.");
                    }
                    break;

                case 4:
                    agenda.exibeTodos();
                    break;

                case 0:
                    System.out.println("Encerrando o programa.");
                    System.exit(0);

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}