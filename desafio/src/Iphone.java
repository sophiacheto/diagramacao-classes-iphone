import interfaces.AparelhoTelefonico;
import interfaces.NavegadorInternet;
import interfaces.ReprodutorMusical;


public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    boolean ligado;
    String numeroDeTelefone;
    String appMusica;
    String appNavegador;
    String appChamadas;

    public Iphone(String numeroDeTelefone, String appMusica, String appNavegador, String appChamadas) {
        this.numeroDeTelefone = numeroDeTelefone;
        this.appMusica = appMusica;
        this.appNavegador = appNavegador;
        this.appChamadas = appChamadas;
    }

    public void ligarIphone() {this.ligado = true;}

    public void desligarIphone() {this.ligado = false;}
    
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero + " por " + appChamadas);
    }

    @Override
    public void iniciarCorreioDeVoz() {
        System.out.println("Iniciando correio de voz por " + appChamadas);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação");
    }

    @Override
    public void desligar() {
        System.out.println("Desligando ligação");
    }

 
    @Override
    public void exibirPagina(String URL) {
       System.out.println("Exibindo página " + URL + " em " + appNavegador);
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
    }

       @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando música " + musica + " em " + appMusica);
    }

    @Override
    public void tocar() {
       System.out.println("Tocando música em " + appMusica);
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada");
    }

}
