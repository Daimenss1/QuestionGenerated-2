package com.skypro.QuestionGenerated2.Tests;

import com.skypro.QuestionGenerated2.Service.QuestionService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
import static com.skypro.QuestionGenerated2.Tests.Container.TEST_QUESTIONS_SET_2;
import static com.skypro.QuestionGenerated2.Tests.Container.FULL_QUESTION1;
@ExtendWith(MockitoExtension.class)
class ExaminerServiceImplTest {

    @Mock
    QuestionService mock;

    @InjectMocks
    ExaminerServiceImplTest out;

    @Test
    public void getQuestionsTest() {
        when(mock.getSize()).thenReturn(1);
        when(mock.getRandomQuestion()).thenReturn(FULL_QUESTION1);
        assertEquals(TEST_QUESTIONS_SET_2,out.getQuestions());
    }
}