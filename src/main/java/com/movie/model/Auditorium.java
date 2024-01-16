package com.movie.model;

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
@Table(name = "auditorium")
public class Auditorium {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "auditorium_id")
	private Long id;

	@Column(name = "seat_count")
	private Integer seatCount;

	@ManyToOne
	@JoinColumn(name = "theatre_id")
	@JsonManagedReference
	private Theatre theatre;

	@OneToMany(mappedBy = "auditorium", cascade = CascadeType.ALL)
	@JsonBackReference
	private Set<Seat> seats;

	@OneToMany(mappedBy = "auditorium", cascade = CascadeType.ALL)
	@JsonBackReference
	private Set<Screening> screenings;
}