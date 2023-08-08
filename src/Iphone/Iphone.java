package Iphone;

public class Iphone implements iPod, Internet, Phone {

    @Override
    public void call() {
        System.out.println("Ligando");
    }

    @Override
    public void answer() {
        System.out.println("Atendendo");
    }

    @Override
    public void startMailVoz() {
        System.out.println("Iniciando chamada de voz");
    }

    @Override
    public void displayPage() {
        System.out.println("Exibindo Pagina");
    }

    @Override
    public void addNewTab() {
        System.out.println("Adicionando nova ABA");
    }

    @Override
    public void refreshPage() {
        System.out.println("Atualizando pagina");
    }

    @Override
    public void play() {
        System.out.println("Tacando");
    }

    @Override
    public void pause() {
        System.out.println("Pausando");
    }

    @Override
    public void selectMusic() {
        System.out.println("Selecionando Musica");
    }
}
