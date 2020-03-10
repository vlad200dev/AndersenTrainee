package task_8.travel_agency3;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.sql.ResultSet;
import java.util.Date;
import java.util.List;
import java.util.Queue;

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

//        Identification mikeTysonIdentificaction = new Identification("223355GTP");
//        Client mikeTyson = new Client("Mike","Tyson");
//        mikeTyson.setIdentification(mikeTysonIdentificaction);
//        Tour tour = new Tour(new Date());
//        mikeTyson.add(tour);
//        Comments goodComment = new Comments("Best I ever seen of");
//        Comments standardComment = new Comments("Normal Tour");
//        Comments dislikeComment = new Comments("Never take again");
//        tour.addComment(goodComment);
//        tour.addComment(standardComment);
//        tour.addComment(dislikeComment);
//
//        session.save(mikeTyson);
//        session.save(mikeTysonIdentificaction);
//        session.save(tour);

//        int id = 1;
//        Tour mikeTysonTour = session.get(Tour.class,id);


        Query<Comments> theQuery = session.createQuery("FROM Comments",Comments.class);
        List<Comments> comments = theQuery.getResultList();
        System.out.println(comments);


//        Destination usa = new Destination("New York","Usa");
//        Destination canada = new Destination("Monreal","Canada");
//        Destination mexico = new Destination("Mexico","Mexico");
//
//        mikeTysonTour.addDestination(usa);
//        mikeTysonTour.addDestination(canada);
//        mikeTysonTour.addDestination(mexico);
//
//        session.save(usa);
//        session.save(canada);
//        session.save(mexico);

//        Hotel InterContinental = new Hotel("InterContinental");
//        Hotel Hilton = new Hotel("Hilton");
//        Hotel Marriott = new Hotel("Marriott");
//
//        mikeTysonTour.addHotel(InterContinental);
//        mikeTysonTour.addHotel(Hilton);
//        mikeTysonTour.addHotel(Marriott);
//
//        session.save(InterContinental);
//        session.save(Hilton);
//        session.save(Marriott);


        session.getTransaction().commit();
        factory.close();
    }
}
