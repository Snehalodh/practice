package com.springboot.practice.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.springboot.practice.Entity.Students;
@Repository("StudentsDao")
public interface StudentsDao extends JpaRepository<Students,Integer>{

}
