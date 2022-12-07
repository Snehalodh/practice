package com.springboot.practice.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.springboot.practice.Entity.Departments;
@Repository("DeparmentsDao")
public interface DepartmentsDao extends JpaRepository<Departments,String>{

}
