package ferdev.mvn.test.service;

import ferdev.mvn.test.data.Person;
import ferdev.mvn.test.repository.PersonRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.Extensions;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@Extensions(
        @ExtendWith(MockitoExtension.class)
)
public class TestPersonService {
    private PersonService personService;

    @Mock
    private PersonRepository personRepository;

    @BeforeEach
    void setUp() {
        personService = new PersonService(personRepository);
    }

    @Test
    public void testPersonNotFound(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            personService.get("tidak ada"); // karena jika belum diisi behaviour nya akan null;
        });
    }

    @Test
    public void testSuccesGetPerson(){
        Mockito.when(personRepository.selectById("feri"))
                .thenReturn(new Person("feri", "winarta"));

        Person person = personService.get("feri");
        // Person person2 = personService.get("feri");

        Mockito.verify(personRepository, Mockito.times(1))
                .selectById("feri");

        Assertions.assertNotNull(person);
        Assertions.assertEquals("feri", person.getId());
        Assertions.assertEquals("winarta", person.getName());
    }

    @Test
    public void testRegisterSucces(){
        Person person = personService.register("jaka");
        Assertions.assertNotNull(person);
        Assertions.assertEquals("jaka", person.getName());
        Assertions.assertNotNull(person.getId());

        Mockito.verify(personRepository, Mockito.times(1))
                .insert(new Person(person.getId(), person.getName()));
    }


}
