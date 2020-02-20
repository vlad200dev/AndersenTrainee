package task_8.travel_agency;

public class TourBuilder {
    private Country countryChosen;
    private Comments comments;
    private Hotel hotelChosen;

    TourBuilder countryBuilder(String country){
        for (Country tmp: new Country().getCountryList()){
            if (country.equals(tmp)){
                this.countryChosen = tmp;
            }
        }
        return this;
    }

    TourBuilder commentsBuilder(String comment) {
        for (Comments tmp : new Comments().getCommentsList()){
            if (comment.equals(tmp)){
                this.comments = tmp;
            }
        }
        return this;
    }

    TourBuilder hotelBuilder(String hotel){
        for (Hotel tmp: new Hotel().getHotelList()){
            if (hotel.equals(tmp)){
                this.hotelChosen = tmp;
            }
        }
        return this;
    }

    Tour build(){
        Tour tour = new Tour();
        tour.setCountry(countryChosen);
        tour.setComments(comments);
        tour.setHotel(hotelChosen);
        return tour;
    }
}
