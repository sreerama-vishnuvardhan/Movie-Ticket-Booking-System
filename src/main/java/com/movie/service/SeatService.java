package com.movie.service;

import java.util.List;

import com.movie.model.Seat;

public interface SeatService {
    List<Seat> getAllSeats();

    Seat getSeatById(Long seat_id);

    Seat addSeat(Seat newSeat);

    Seat updateSeat(Seat updatedSeat, Long seat_id);

    void deleteSeatById(Long seat_id);
}
