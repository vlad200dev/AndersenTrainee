package task_9.spring_basic;

import org.springframework.context.annotation.Scope;

import javax.annotation.PostConstruct;


//@Component("musicBean")
@Scope("prototype")
public class RockMusic implements Music {
    @PostConstruct
    public void doMyInit() {
        System.out.println("doing preparations for work");
    }

    //@PreDestroy при создании через @Scope("prototype") не используется

    @Override
    public String getSong() {
        return "Wind cries Mary";
    }
}
