package task_9.spring_basic;

import org.springframework.context.annotation.*;

@Configuration
//@ComponentScan("task_9.spring_basic")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
    @Bean
    @Scope("singleton")
    public ClassicalMusic classicalMusic(){
        return new ClassicalMusic();
    }

    @Bean
    @Scope("prototype")
    public RockMusic rockMusic(){
        return new RockMusic();
    }

    @Bean
    @Scope("singleton")
    public MusicPlayer musicPlayer(){
        return new MusicPlayer(rockMusic(),classicalMusic());
    }
    @Bean
    @Scope("singleton")
    public Computer computer(){
        return new Computer(musicPlayer());
    }
}
