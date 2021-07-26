package com.chinook.data;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.chinook.entities.Album;

@Service  // This means This class is a Spring Bean
@Transactional
public class AlbumDAOImpl implements AlbumDAO {

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public Album findByAlbumId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
