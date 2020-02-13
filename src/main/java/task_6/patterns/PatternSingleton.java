package task_6.patterns;
/**
Реализация паттерна СИНГЛТОН
  */
public class PatternSingleton {

    private static PatternSingleton instance;
    private String value;

    public String getValue() {
        return value;
    }

    private PatternSingleton(String value) {
        this.value = value;
    }

    public static PatternSingleton getInstance(String value) {
        if (instance == null) {
            instance = new PatternSingleton(value);
        }
        return instance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PatternSingleton that = (PatternSingleton) o;

        return value != null ? value.equals(that.value) : that.value == null;
    }

    @Override
    public int hashCode() {
        return value != null ? value.hashCode() : 0;
    }
}


