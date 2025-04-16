package musicPlayer;

public class SmartPhone implements VideoPlayer, MusicPlayer {

    @Override
    public void playMusic() {
    System.out.println("O smartphone está Tocando musica");    }

    @Override
    public void pauseMusic() {
        System.out.println("O smartphone esra pausando a musica");
    }

    @Override
    public void stopMusic() {
        System.out.println("O smart phone esta parando a musica");
    }

}
