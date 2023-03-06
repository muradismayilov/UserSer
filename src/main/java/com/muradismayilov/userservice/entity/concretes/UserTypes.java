package com.muradismayilov.userservice.entity.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "usertypes")
public class UserTypes {

	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	//@Column(name = "id")
	private int id;
	//@Column(name = "usertypesgender")
	private String gender;
	//@Column(name = "usertypesheight")
	private int heigth;
	//@Column(name = "usertypesweight")
	private int weight;
	//@Column(name = "usertypeshowold")
	private int howold;
	
	@ManyToOne
	@JoinColumn(name="user_id")
	private User user;
	
	@OneToMany(mappedBy= "usertypes")
	private List<Playout> playouts;
}
