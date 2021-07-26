package com.chinook.data;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.chinook.entities.Album;

@Repository  // this annotation makes it a bean so we can inject the repository into our controller.
// Spring gives this to us.  We tell Spring we want it to manage albums in our DB and its key is an int.
public interface AlbumRepository extends CrudRepository<Album, Integer> {

}
