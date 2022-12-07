package com.springboot.practice.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.springboot.practice.Entity.Subjects;
@Repository("SubjectDao")
public interface SubjectsDao extends JpaRepository<Subjects,String>{

}
