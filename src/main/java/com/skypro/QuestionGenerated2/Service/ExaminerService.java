package com.skypro.QuestionGenerated2.Service;

import com.skypro.QuestionGenerated2.Model.Question;

import java.util.Collection;

public interface ExaminerService {
    Collection<Question> getQuestions(int amount);
}
