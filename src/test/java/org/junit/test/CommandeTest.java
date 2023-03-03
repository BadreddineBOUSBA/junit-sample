package org.junit.test;

import java.util.List;
import java.util.Vector;

import org.junit.Commande;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class CommandeTest {

	private static List<Commande> commades;

 	@BeforeAll
    public static void init(){

 		commades = new Vector<Commande>();
 		commades.add(new Commande("reference1", "date1", "ACTIVE"));
 		commades.add(new Commande("reference2", "date1", "PENDING"));
 		
    }
    
    @Test
    public void commandesCount(){
    	System.out.println(commades.hashCode());
    	
        Assertions.assertEquals(2, commades.size());
    }
    
    @Test
    public void commandesLoisir(){
    	System.out.println(commades.hashCode());
        Assertions.assertEquals("ACTIVE", commades.get(0).getStatus());
	}
    
    @AfterAll
    public static void close(){
 		commades = null;	
    }

}
