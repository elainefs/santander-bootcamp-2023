import aparelho.Iphone;

public class IphoneMaria {

  public static void main(String[] args) {
    Iphone iphone = new Iphone();

    System.out.println("-- Usando aparelho telefônico --");
    iphone.ligar();
    iphone.atender();
    iphone.iniciarCorreioVoz();

    System.out.println("-- Usando reprodutor de música --");
    iphone.selecionarMusica();
    iphone.tocar();
    iphone.pausar();

    System.out.println("-- Usando navegador de internet --");
    iphone.adicionarNovaAba();
    iphone.exibirPagina();
    iphone.atualizarPagina();
  }
}
