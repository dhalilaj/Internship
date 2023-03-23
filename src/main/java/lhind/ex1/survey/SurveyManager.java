package lhind.ex1.survey;

import java.util.Map;

public class SurveyManager {

    private Candidate candidate;

    private Survey survey;

    private Map<Question, Answer> questionAnswerMap;

    public Candidate getCandidate() {
        return candidate;
    }

    public void setCandidate(Candidate candidate) {
        this.candidate = candidate;
    }

    public Survey getSurvey() {
        return survey;
    }

    public void setSurvey(Survey survey) {
        this.survey = survey;
    }

    public Map<Question, Answer> getQuestionAnswerMap() {
        return questionAnswerMap;
    }

    public void setQuestionAnswerMap(Map<Question, Answer> questionAnswerMap) {
        this.questionAnswerMap = questionAnswerMap;
    }

    public SurveyManager(Candidate candidate, Survey survey, Map<Question, Answer> questionAnswerMap) {
        this.candidate = candidate;
        this.survey = survey;
        this.questionAnswerMap = questionAnswerMap;
    }

    @Override
    public String toString() {
        return "SurveyManager{" +
                "candidate=" + candidate +
                ", survey=" + survey +
                ", questionAnswerMap=" + questionAnswerMap +
                '}';
    }
}
