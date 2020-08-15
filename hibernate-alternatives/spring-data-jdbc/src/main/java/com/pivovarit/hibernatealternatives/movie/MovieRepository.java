package com.pivovarit.hibernatealternatives.movie;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepository extends CrudRepository<Movie, Long> {

    @Query("SELECT * FROM movies WHERE title=:title")
    List<Movie> findByTitle(@Param("title") String title);
}
