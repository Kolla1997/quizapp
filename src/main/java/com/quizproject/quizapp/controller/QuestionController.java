package com.quizproject.quizapp.controller;

import com.quizproject.quizapp.Model.Question;
import com.quizproject.quizapp.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("question")
public class QuestionController
{
    @Autowired
    QuestionService questionService;
    @GetMapping("allQuestions")
    public ResponseEntity<List<Question>> getAllQuestions()
    {

        return questionService.getAllQuestions();
    }
    @GetMapping("category/{category}")
    public List<Question> getQuestionByCategory(@PathVariable String category)
    {

        return questionService.getQuestionsByCategory(category);
    }
    @PostMapping("add")
    public String addQuestion(@RequestBody Question question)
    {
        return questionService.addQuestions(question);
    }
}
