package main.java.com.meuapp;

public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    @Override
    public String tocar() {
        return "Reproduzindo música...";
    }

    @Override
    public String pausar() {
        return "Música pausada.";
    }

    @Override
    public String selecionarMusica(String musica) {
        return "Selecionando a música: " + musica;
    }

    @Override
    public String ligar(String numero) {
        return "Ligando para: " + numero;
    }

    @Override
    public String atender() {
        return "Atendendo a chamada.";
    }

    @Override
    public String iniciarCorreioVoz() {
        return "Iniciando correio de voz.";
    }

    @Override
    public String exibirPagina(String url) {
        return "Exibindo a página: " + url;
    }

    @Override
    public String adicionarNovaAba() {
        return "Adicionando uma nova aba.";
    }

    @Override
    public String atualizarPagina() {
        return "Atualizando a página.";
    }
}
