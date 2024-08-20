import main.java.com.meuapp.IPhone;

public class IphoneApp {
    public static void main(String[] args) {
        IPhone meuIphone = new IPhone();

        System.out.println("***ReprodutorMusical***");
        System.out.println(meuIphone.tocar() + "\n" + meuIphone.pausar() + "\n" + meuIphone.selecionarMusica("Specialz"));

        System.out.println("***AparelhoTelefonico***");
        System.out.println(meuIphone.ligar("123456789") + "\n" + meuIphone.atender() + "\n" + meuIphone.iniciarCorreioVoz());

        System.out.println("***NavegadorInternet***");
        System.out.println(meuIphone.exibirPagina("https://www.java.com") + "\n" + meuIphone.adicionarNovaAba() + "\n" + meuIphone.atualizarPagina());
    }
}
