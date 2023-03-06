package com.muradismayilov.userservice.dataaccess.abstracts;



import org.springframework.data.jpa.repository.JpaRepository;


import com.muradismayilov.userservice.entity.concretes.User;




public interface UserRepository extends JpaRepository<User, Integer> {

	boolean existsByName(String name);
}
