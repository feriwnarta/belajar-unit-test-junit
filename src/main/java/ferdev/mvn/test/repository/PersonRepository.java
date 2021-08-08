package ferdev.mvn.test.repository;

import ferdev.mvn.test.data.Person;

public interface PersonRepository {
    public Person selectById(String id);

    public void insert(Person person);
}
