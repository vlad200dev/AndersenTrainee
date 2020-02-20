package task_8.travel_agency;

public class Order {
    public static void main(String[] args) {
        Hotel ihg = new Hotel("InterContinental");
        Hotel wyndham = new Hotel("Wyndham");
        Hotel marriott = new Hotel("Marriott");
        Hotel hilton = new Hotel("Hilton");
        Hotel hyatt = new Hotel("Hyatt");

        Comments highLevelComments = new Comments("Level A");
        Comments middleLevelComments = new Comments("Level B");
        Comments lowLevelComments = new Comments("Level c");

        Country Mexico = new Country("Mexico");
        Country Canada = new Country("Canada");
        Country Usa = new Country("USA");
        Country Brazil = new Country("Brazil");


        Client client1 = new Client("Mike","Tyson","8012554433");
        Client client2 = new Client("Muhammad","Ali","8012334455");

        Tour tourForFirstClient = new TourBuilder()
                .countryBuilder("Mexico")
                .commentsBuilder("Level A")
                .hotelBuilder("Hilton")
                .build();

        Tour tourForSecondClient = new TourBuilder()
                .countryBuilder("USA")
                .commentsBuilder("Level A")
                .hotelBuilder("Marriott")
                .build();


        System.out.println(tourForFirstClient);
        System.out.println(tourForSecondClient);
    }
}
/*
Tour{ Mexico, Level A, Hilton, }
Tour{ USA, Level A, Marriott, }
 */
