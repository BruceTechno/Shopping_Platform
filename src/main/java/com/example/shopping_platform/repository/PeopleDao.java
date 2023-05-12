package com.example.shopping_platform.repository;

import com.example.shopping_platform.entity.People;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeopleDao extends JpaRepository<People,String> {
    public People findByAccountAndPwd(String account , String pwd);
}
