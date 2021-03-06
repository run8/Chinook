package com.chinook.entities;

import static org.junit.jupiter.api.Assertions.fail;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ArtistTest {

	private static EntityManagerFactory emf;
	private EntityManager em;
	private Artist artist;

	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		emf = Persistence.createEntityManagerFactory("JPAChinook");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		emf.close();
	}

	@BeforeEach
	void setUp() throws Exception {
		em = emf.createEntityManager();
		artist = em.find(Artist.class, 1);
	}

	@AfterEach
	void tearDown() throws Exception {
		em.close();
		artist = null;
	}

	
//	select * from artist where artistid = 1;
//	+----------+-------+
//	| ArtistId | Name  |
//	+----------+-------+
//	|        1 | AC/DC |
//	+----------+-------+
	@Test
	void test() {
		assertEquals(1, artist.);
	}

}
