package com.daralisdan.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.daralisdan.entity.User;

public interface UseIDao extends JpaRepository<User, Integer> {

}
