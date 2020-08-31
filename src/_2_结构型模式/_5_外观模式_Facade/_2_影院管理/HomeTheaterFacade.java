package _2_结构型模式._5_外观模式_Facade._2_影院管理;

public class HomeTheaterFacade {
    private DVDPlayer dvdPlayer;
    private Popcorn popcorn;
    private Projector projector;
    private Screen screen;
    private Stereo stereo;
    private TheaterLight sheaterLight;

    public HomeTheaterFacade() {
        dvdPlayer = DVDPlayer.getInstance();
        popcorn = Popcorn.getInstance();
        projector = Projector.getInstance();
        screen = Screen.getInstance();
        stereo = Stereo.getInstance();
        sheaterLight = TheaterLight.getInstance();
    }

    public void ready() {
        popcorn.on();
        popcorn.pop();
        dvdPlayer.on();
        screen.donw();
        projector.donw();
        projector.play();
        stereo.on();
        sheaterLight.dim();
    }

    public void play() {
        dvdPlayer.play();
    }

    public void pause() {
        dvdPlayer.pause();
    }

    public void end() {
        sheaterLight.light();
        popcorn.off();
        dvdPlayer.off();
        screen.up();
        projector.stop();
        projector.up();
        stereo.off();
    }
}
