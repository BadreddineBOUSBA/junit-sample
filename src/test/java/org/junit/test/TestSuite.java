package org.junit.test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.User;
import org.junit.jupiter.api.Test;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({CommandeTest.class, UserTest.class})
public class TestSuite {
	
	
	
	
	
	
	
	
	
	
//	@Test
//	public void hi() {
//		User user = new User("Testing", "raining", List.of("Surfing","Reading"));
//		assertAll(
//		  "Grouped Assertions of User",
//		  () -> assertEquals("admin", user.getNom(), "le nom doit etre admin"),
//		  () -> assertEquals("administrator", user.getPrenom(), "Prenom sdoit etre administrator"),
//		  () -> assertEquals(2, user.getLoisirs().size(), "Loisirs count doit etre 2")
//		);
//
//	}
}
