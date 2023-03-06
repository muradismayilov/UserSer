package com.muradismayilov.userservice.dataaccess.abstracts;


import org.springframework.data.jpa.repository.JpaRepository;


import com.muradismayilov.userservice.entity.concretes.UserTypes;

public interface UserTypesRepository extends JpaRepository<UserTypes,Integer>{

}
