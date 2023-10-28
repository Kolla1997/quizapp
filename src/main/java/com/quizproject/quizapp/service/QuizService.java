package com.quizproject.quizapp.service;

import com.quizproject.quizapp.Model.Question;
import com.quizproject.quizapp.Model.QuizQuestion;
import com.quizproject.quizapp.dao.QuestionDao;
import com.quizproject.quizapp.dao.QuizDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class QuizService
{
    @Autowired
    QuizDao quizDao;
    public List<QuizQuestion> quizQuestions(int num)
    {
        List<QuizQuestion> qq = new ArrayList<QuizQuestion>();
        int count=0;

        for (Object[] obj :quizDao.findQuestionsByLimit(num) ) {

                QuizQuestion question=new QuizQuestion();
                question.setQuestion(++count);
                question.setQuestionTitle((String) obj[0]);
                question.setOption1((String) obj[1]);
                question.setOption2((String) obj[2]);
                question.setOption3((String) obj[3]);
                question.setOption4((String) obj[4]);
                qq.add(question);
        }
        return qq;

    }
}
