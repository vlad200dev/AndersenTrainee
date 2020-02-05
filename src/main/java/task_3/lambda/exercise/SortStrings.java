package task_3.lambda.exercise;

import java.util.ArrayList;
import java.util.List;

// Задача - отсортировать строки по своему установленному порядку(не лексикографически) по длине строки
// Использовать лямбда вместо отдельного класса Компаратор

public class SortStrings  {

    private List<String> list = new ArrayList<>();

    public List<String> getList() {
        return list;
    }


    public void setList(List<String> list) {
        this.list = list;
    }

}
