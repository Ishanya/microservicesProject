 package com.ntl.practice.loginSignup.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ntl.practice.loginSignup.bean.RegisterBean;

@Repository
public interface RegisterDao extends JpaRepository<RegisterBean,String> {

}
