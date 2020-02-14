package task_6.patterns.prototype;
// фабрика клонов
public class HumanFactory {
    protected Human human;
    public HumanFactory(Human human) {
    setPrototype(human);
    }
    private void setPrototype(Human human){
        this.human = human;
    }
    public Human makeCopy(){
        return (Human)human.copy();
    }
}
