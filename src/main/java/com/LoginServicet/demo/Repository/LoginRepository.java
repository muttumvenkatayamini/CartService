package com.LoginServicet.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.LoginServicet.demo.Entity.LoginEntity;

@Repository
public interface LoginRepository extends JpaRepository<LoginEntity, Long> {

	LoginEntity findByUserName(String username);

}
