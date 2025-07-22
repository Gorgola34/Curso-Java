package local.Repositories;

import local.entities.Meeting;

public class MeetingDAO extends AbstractDAO<Meeting> {

    public MeetingDAO(){
        super(Meeting.class);
    }

}
