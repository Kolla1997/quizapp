package com.quizproject.quizapp.dao;

import com.quizproject.quizapp.Model.Question;
import com.quizproject.quizapp.Model.QuizQuestion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface QuizDao extends JpaRepository<Question, Integer>
{
    @Query(value="SELECT question_title as Question ,option1,option2,option3,option4 FROM question ORDER BY RANDOM() LIMIT ?1",nativeQuery = true)
    List<Object[]> findQuestionsByLimit(@Param("num") int num);
}
