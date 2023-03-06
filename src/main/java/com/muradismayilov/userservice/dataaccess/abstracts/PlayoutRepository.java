package com.muradismayilov.userservice.dataaccess.abstracts;


import org.springframework.data.jpa.repository.JpaRepository;


import com.muradismayilov.userservice.entity.concretes.Playout;

public interface PlayoutRepository extends JpaRepository<Playout,Integer> {

}
