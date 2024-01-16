package com.movie.model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "screening")
public class Screening {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "screening_id")
	private Long id;

	@ManyToOne
	@JoinColumn(name = "movie_id")
	@JsonManagedReference
	private Movie movie;

	@ManyToOne
	@JoinColumn(name = "auditorium_id")
	@JsonManagedReference
	private Auditorium auditorium;

	@Column(name = "date")
	private LocalDate date;

	@Column(name = "start_time")
	private LocalTime startTime;

	@Column(name = "end_time")
	private LocalTime endTime;

	@Column(name = "is_full")
	private Boolean isFull;

	@Column(name = "price")
	private Double price;

	@OneToMany(mappedBy = "screening", cascade = CascadeType.ALL)
	@JsonBackReference
	private Set<SeatBooked> bookedSeats;

	@OneToMany(mappedBy = "screening", cascade = CascadeType.ALL)
	@JsonBackReference
	private Set<Booking> bookings;
}