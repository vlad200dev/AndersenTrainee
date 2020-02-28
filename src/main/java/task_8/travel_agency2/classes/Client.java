package task_8.travel_agency2.classes;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class Client {
    private String name;
    private String surname;
    private String id;


    public Client(String name, String surname, String id) {
        this.name = name;
        this.surname = surname;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", id='" + id + '\'' +
                '}';
    }

}
