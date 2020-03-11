package task_9.spring_basic;

/**
 * Представим что класс MusicPlayer это часть класса Computer
 * Пример, что СПРИНГ успешно внедряет зависимости внутри других зависимостей
 */
//@Component
public class Computer {
    private int id;
    private MusicPlayer musicPlayer;

//    @Autowired
    public Computer(MusicPlayer musicPlayer) {
        this.id = 1; // это значение СПРИНГ не тронет.
        this.musicPlayer = musicPlayer;
    }

    @Override
    public String toString() {
        return "Computer " + id + " " + musicPlayer.playMusic();
    }
}
