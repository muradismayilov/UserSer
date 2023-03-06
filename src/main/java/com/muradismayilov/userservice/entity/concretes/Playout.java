package com.muradismayilov.userservice.entity.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "playout")
public class Playout {

	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	//@Column(name = "id")
	private int id;
	//@Column(name = "workPlace")
	private String workPlace;
	//@Column(name = "director")
	private String director;
	//@Column(name = "workYear")
	private int workYear;
	
	@ManyToOne
	@JoinColumn(name="usertypes_id")
	private UserTypes usertypes;
}
