package com.pivovarit.hibernatealternatives.movie;

import java.util.Optional;

public interface MovieRepository {
    Optional<Movie> findOneById(long id);
    void save(Movie movie);
}
