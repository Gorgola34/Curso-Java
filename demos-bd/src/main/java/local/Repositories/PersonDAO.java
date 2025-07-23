package local.Repositories;

import local.entities.Person;

public class PersonDAO extends AbstractDAO<Person> {

    public PersonDAO(){
        super(Person.class);
    }

}
