package task_9.spring_basic;

import org.springframework.beans.factory.annotation.Value;

//@Component("musicPlayer")
public class MusicPlayer {

    @Value("${musicPlayer.name}")
    private String name;

    @Value("${musicPlayer.value}")
    private int volume;

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }


    private Music music;
    private Music music2;

//    @Autowired
    public MusicPlayer( Music music,Music music2) {
        this.music = music;
        this.music2 = music2;
    }

    public String playMusic(){
        return "Playing " + music.getSong();
    }
}
