package task_8.travel_agency2.classes;


import lombok.EqualsAndHashCode;


@EqualsAndHashCode
public class Country {
    private String country;

    public Country(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return country;
    }
}
