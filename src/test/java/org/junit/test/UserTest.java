package org.junit.test;

import org.junit.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Vector;

/**
 * @author BOUSBA Badreddine
 * @created 02/03/2023
 * @project unit-test
 */

public class UserTest {
    
	private List<User> users;
	
	
    @BeforeEach
    public void init(){

        users = new Vector<User>();

        users.add(new User("Ahmed", "Ahmadi", List.of("Tripping", "Sleeping")));
        users.add(new User("Ilyas", "Khiyali", List.of("Cycling", "Sleeping")));
    }
    
    @Test
    public void usersCount(){

    	Assertions.assertEquals(2, users.size());
    }
    
    @Test
    public void userLoisir(){

        Assertions.assertSame("Sleeping", users.get(0).getLoisirs().get(1), "Obviously not the same values");
    }

}
