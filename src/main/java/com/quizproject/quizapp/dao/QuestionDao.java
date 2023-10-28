package com.quizproject.quizapp.dao;

import com.quizproject.quizapp.Model.Question;
import com.quizproject.quizapp.service.QuizService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface QuestionDao extends JpaRepository<Question, Integer>
{

    List<Question> findByCategory(String category);

}
