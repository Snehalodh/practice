package com.springboot.practice.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.springboot.practice.Entity.Teachers;
@Repository("TeachersDao")
public interface TeachersDao extends JpaRepository<Teachers,Integer>{

}
