package com.quiz.arun.Services;

import java.util.List;

import com.quiz.arun.Entities.QuestionWrapper;
import com.quiz.arun.Entities.Quiz;
import com.quiz.arun.Entities.Response;

public interface QuizServices {

	Quiz createQuiz(String category, String level, String title);

	List<QuestionWrapper> getQuizQuestions(Integer id);

	String calculateResult(Integer id, List<Response> responses);

	


	

}
