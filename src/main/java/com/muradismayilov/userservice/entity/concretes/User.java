package com.muradismayilov.userservice.entity.concretes;


import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	//@Column(name = "id")
	private int id;
	//@Column(name = "username")
	private String name;
	//@Column(name = "usersurname")
	private String surName;
	//@Column(name = "userfathername")
	private String fatherName;
	//@Column(name = "userusername")
	private String userName;
	
	@OneToMany(mappedBy= "user")
	private List<UserTypes> usertypess;
	
	
	
	
	
	/*public User(int id, String name, String surName, String fatherName, String userName) {
		
		this.id = id;
		this.name = name;
		this.surName = surName;
		this.fatherName = fatherName;
		this.userName = userName;
	}
	
	
	
	
	public User() {
		
	}




	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", surName=" + surName + ", fatherName=" + fatherName
				+ ", userName=" + userName + "]";
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurName() {
		return surName;
	}
	public void setSurName(String surName) {
		this.surName = surName;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}*/

}
