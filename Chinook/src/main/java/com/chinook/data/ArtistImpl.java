package com.chinook.data;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.chinook.entities.Artist;

@Service
@Transactional
public class ArtistImpl implements ArtistDAO {
	
	@PersistenceContext
	private EntityManager em;
	
	private String jpql;
	
	@Override
	public Artist getArtistById(int id) {
			
	return em.find(Artist.class, id);	

	}

}
