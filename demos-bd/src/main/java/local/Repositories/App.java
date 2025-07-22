package local.Repositories;

import local.entities.Meeting;

public class App {

    public static void main(String[] args) {
        MeetingDAO m= new MeetingDAO();
        System.out.println(m.findAll());
        System.out.println(m.save(new Meeting("Primera reunion", null)));
    }

}
