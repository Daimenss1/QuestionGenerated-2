package com.skypro.QuestionGenerated2.Service.Impl;


import com.skypro.QuestionGenerated2.Model.Question;

import java.util.Collection;

public interface QuestionRepository{
    boolean add(Question question);
    boolean remove(Question question);
    Collection<Question> getAll();

}
