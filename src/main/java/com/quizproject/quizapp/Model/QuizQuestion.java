package com.quizproject.quizapp.Model;

import lombok.Data;

@Data
public class QuizQuestion
{
    private  int question;
    private String questionTitle;
    private String option1;
    private String option2;
    private String option3;
    private String option4;

}
