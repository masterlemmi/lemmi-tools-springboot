/*
package com.lemzki.tools.familydb;

import com.lemzki.tools.people.db.FamilyDbApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes= FamilyDbApplication.class)
public class PersonRepositoryTests {
    @Autowired
    PersonRepository personRepository;

    @Test
    public void testGetParents(){
        Person person = new Person();
        person.setId(1l);
       List<Person> parents = personRepository.findParentsOf(person);
parents.forEach(p-> System.out.println(p.getName()));
    }

    @Test
    public void testGetIdIfNullID(){
        //Optional<Person> person = personRepository.findById(null);
       // System.out.println("GETTING EPRSON: " + person.get());
    }

}
*/