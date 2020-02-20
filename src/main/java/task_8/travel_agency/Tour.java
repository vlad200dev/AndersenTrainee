package task_8.travel_agency;

public class Tour {
    private Country country;
    private Comments comments;
    private Hotel hotel;

    public void setCountry(Country country) {
        this.country = country;
    }

    public void setComments(Comments comments) {
        this.comments = comments;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    @Override
    public String toString() {
        return "Tour{" +
                "country='" + country + '\'' +
                ", comments='" + comments + '\'' +
                ", hotel='" + hotel + '\'' +
                '}';
    }
}
