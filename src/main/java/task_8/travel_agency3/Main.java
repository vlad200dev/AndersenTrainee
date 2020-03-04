package task_8.travel_agency3;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Client.class)
                .addAnnotatedClass(Comments.class)
                .addAnnotatedClass(Destination.class)
                .addAnnotatedClass(Hotel.class)
                .addAnnotatedClass(Identification.class)
                .addAnnotatedClass(Tour.class)
                .buildSessionFactory();
        Session session = factory.getCurrentSession();

        session.beginTransaction();
        int clientId = 1;
        Client tmpClient = session.get(Client.class,clientId);
        Tour tour = new Tour("January 1, 1970");
        tmpClient.add(tour);

        Destination destination = new Destination("USA","New York");
        Hotel hotel = new Hotel("InterContinental");
        Comments goodComment = new Comments("Best Tour I ever attend to");
        Comments goodComment2 = new Comments("Very not bad tour");
        Comments badComment = new Comments("I dislike it");
        tour.setClient(tmpClient);
        tour.addComment(goodComment);
        tour.addComment(goodComment2);
        tour.addComment(badComment);
        tour.addDestination(destination);
        tour.addHotel(hotel);
        destination.addTour(tour);
        hotel.addTour(tour);

        session.save(hotel);
        session.save(destination);
        session.save(goodComment);
        session.save(goodComment2);
        session.save(badComment);
        session.save(tour);

        session.getTransaction().commit();
        session.close();
        factory.close();
    }
}
