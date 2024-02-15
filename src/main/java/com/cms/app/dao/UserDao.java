package com.cms.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cms.app.POJO.User;
public interface UserDao extends JpaRepository<User,Integer>{
    
}
