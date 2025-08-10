package com.arun.example.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.arun.example.entities.Teacher;
import com.arun.example.entities.Teacher.Qualification;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Long> {

	List<Teacher> findByQualification(Qualification qualification);

	void deleteByTeacherAddress(String teacherAddress);

}
