import java.util.Scanner;

public class IphoneTeste {
    public static void main(String[] args) {
        Iphone iphone = new Iphone("(55) 9999-8888", "Spotify", "Google Chrome", "Whatsapp");
        Scanner scan = new Scanner(System.in);
        int opcao;

        while (true) {

            System.out.println("""
                                Selecione uma opção:
                                1: realizar chamada
                                2: atender chamada
                                3: iniciar correio de voz
                                4: selecionar música
                                5: tocar música selecionada
                                6: pausar música
                                7: abrir página na internet
                                8: atualizar página na internet
                                9: abrir nova aba
                                0: desligar
                                """);

            opcao = scan.nextInt();

            if (opcao == 1) {
                System.out.println("Digite o número");
                String numero = scan.next();
                iphone.ligar(numero);
            }
            else if (opcao == 2)
                iphone.atender();
            else if (opcao == 3)
                iphone.iniciarCorreioDeVoz();
            else if (opcao == 4) {
                System.out.println("Qual a música?");
                String musica = scan.next();
                iphone.selecionarMusica(musica);
            }
            else if (opcao == 5) 
                iphone.tocar();
            else if (opcao == 6)
                iphone.pausar();
            else if (opcao == 7) {
                System.out.println("Digite a URL do site");
                String URL = scan.next();
                iphone.exibirPagina(URL);
            }
            else if (opcao == 8)
                iphone.atualizarPagina();
            else if (opcao == 9)
                iphone.adicionarNovaAba();
            else if (opcao == 0) {
                iphone.desligar();
                break;
            }
        }
    }
}
