import java.util.Scanner;

public class ConversorDeMoedas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuarPrograma = true;

        while (continuarPrograma) {
            Menu menu = new Menu();
            System.out.println(menu.getMenu());
            System.out.print("Digite a opção desejada: ");
            int opcao = scanner.nextInt();

            if (opcao == 7) {
                System.out.println("Saindo...");
                break;
            }

            String origem = "", destino = "";

            switch (opcao) {
                case 1: origem = "BRL"; destino = "USD"; break;
                case 2: origem = "USD"; destino = "BRL"; break;
                case 3: origem = "EUR"; destino = "BRL"; break;
                case 4: origem = "BRL"; destino = "EUR"; break;
                case 5: origem = "EUR"; destino = "USD"; break;
                case 6: origem = "USD"; destino = "EUR"; break;
                default:
                    System.out.println("Opção inválida.");
                    continue;
            }

            boolean repetirConversao = true;

            while (repetirConversao) {
                System.out.print("Digite o valor para converter: ");
                double valor = scanner.nextDouble();

                ApiResponse resposta = ConsultaCotacao.obterCotacoes(origem);
                double resultado = valor * resposta.conversion_rates.get(destino);
                System.out.printf("%s %.2f = %s %.2f\n", origem, valor, destino, resultado);

                System.out.println("\nDeseja:");
                System.out.println("1 - Converter outro valor com a mesma opção");
                System.out.println("2 - Voltar ao menu principal");
                System.out.println("3 - Sair");
                System.out.print("Digite a opção: ");
                int escolha = scanner.nextInt();

                switch (escolha) {
                    case 1:
                        break;
                    case 2:
                        repetirConversao = false;
                        break;
                    case 3:
                        repetirConversao = false;
                        continuarPrograma = false;
                        System.out.println("Saindo...");
                        break;
                    default:
                        System.out.println("Opção inválida. Voltando ao menu.");
                        repetirConversao = false;
                        break;
                }
            }
        }

        scanner.close();
    }
}