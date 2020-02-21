package task_8.travel_agency2;

public class Tour {
    private Country country;
    private Comments comments;
    private Hotel hotel;


    public Tour(Country country, Comments comments, Hotel hotel) {
        this.country = country;
        this.comments = comments;
        this.hotel = hotel;
    }

    @Override
    public String toString() {
        return "Tour{ "+ country + ", " + comments + ", " + hotel + ", " +'}';
    }

}
