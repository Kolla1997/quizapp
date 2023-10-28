package com.quizproject.quizapp.controller;

import com.quizproject.quizapp.Model.Question;
import com.quizproject.quizapp.Model.QuizQuestion;
import com.quizproject.quizapp.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("Quiz")
public class QuizController
{
    @Autowired
    QuizService quizService;
    @GetMapping("questions")
    public List<QuizQuestion> quizQuestions()
    {
        return quizService.quizQuestions(5);

    }

}
