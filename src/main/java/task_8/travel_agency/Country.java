package task_8.travel_agency;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Country {
    private String country;
    private static List<Country> countryList  = new ArrayList<>();

    public Country(String country) {
        this.country = country;
        countryList.add(this);
    }

    public Country() {
    }

    public List<Country> getCountryList() {
        return countryList;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Country country1 = (Country) o;
        return Objects.equals(country, country1.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(country);
    }

    @Override
    public String toString() {
        return country;
    }
}
