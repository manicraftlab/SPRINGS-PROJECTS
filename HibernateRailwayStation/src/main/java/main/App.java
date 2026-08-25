package main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.example.RailwayStation;

public class App {

    public static void main(String[] args) {

        // Load hibernate.cfg.xml
        Configuration configuration = new Configuration();
        configuration.configure();

        // Create SessionFactory
        SessionFactory sessionFactory =
                configuration.buildSessionFactory();

        // Open Session
        Session session = sessionFactory.openSession();

        // Begin Transaction
        Transaction transaction = session.beginTransaction();

        // INSERT
        RailwayStation station = new RailwayStation();

        station.setStationName("Pune Railway Station");
        station.setCity("Pune");
        station.setPlatformCount(6);

        session.persist(station);

        transaction.commit();

        System.out.println("Railway Station Inserted Successfully");

        // SELECT
        RailwayStation result =
                session.get(
                        RailwayStation.class,
                        station.getStationId());

        System.out.println();
        System.out.println("Railway Station Details");
        System.out.println("----------------------------");

        System.out.println(
                "Station ID : " + result.getStationId());

        System.out.println(
                "Station Name : " + result.getStationName());

        System.out.println(
                "City : " + result.getCity());

        System.out.println(
                "Platform Count : " + result.getPlatformCount());

        // Close
        session.close();
        sessionFactory.close();
    }
}