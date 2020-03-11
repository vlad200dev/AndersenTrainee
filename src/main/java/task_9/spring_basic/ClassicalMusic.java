package task_9.spring_basic;


import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component
//@Scope("singleton")
public class ClassicalMusic implements Music {

    @PostConstruct
    public void doMyInit(){
        System.out.println("Preparations for work");
    }
    @PreDestroy
    public void doMyDestroy(){
        System.out.println("Finishing all opened connections");
    }

    @Override
    public String getSong() {
        return "Beethoven Ave Maria";
    }
}
