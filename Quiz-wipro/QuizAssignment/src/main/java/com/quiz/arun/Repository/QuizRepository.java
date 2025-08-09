package com.quiz.arun.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.quiz.arun.Entities.Quiz;

@Repository
public interface QuizRepository extends JpaRepository<Quiz, Integer> {


}
