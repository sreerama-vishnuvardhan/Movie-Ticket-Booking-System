package com.movie.service;


import java.util.List;

import com.movie.model.Theatre;

public interface TheatreService {
    List<Theatre> getAllTheatres();

    Theatre getTheatreById(Long theatre_id);

    Theatre addTheatre(Theatre newTheatre);

    Theatre updateTheatre(Theatre updatedTheatre, Long theatre_id);

    void deleteTheatreById(Long theatre_id);
}
