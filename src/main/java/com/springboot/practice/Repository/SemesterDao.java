package com.springboot.practice.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.springboot.practice.Entity.Semester;
@Repository("SemesterDao")
public interface SemesterDao extends JpaRepository<Semester,String>{

}
