package com.chinook.entities;


import static org.junit.jupiter.api.Assertions.assertEquals;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AlbumTest {
	private static EntityManagerFactory emf;
	private EntityManager em;

	Album album;

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
		album = em.find(Album.class, 1);
	}

	@AfterEach
	void tearDown() throws Exception {
		em.close();
		album = null;
	}

//	select * from album WHERE AlbumId =1;
//	+---------+---------------------------------------+----------+
//	| AlbumId | Title                                 | ArtistId |
//	+---------+---------------------------------------+----------+
//	|       1 | For Those About To Rock We Salute You |        1 |
//	+---------+---------------------------------------+----------+
	@Test
	void test() {
		assertEquals(1, album.getAlbumId());
		assertEquals("For Those About To Rock We Salute You", album.getTitle());
		assertEquals("For Those About To Rock We Salute You", album.getTitle());
		assertEquals(1, album.getArtistId());
	}

}
