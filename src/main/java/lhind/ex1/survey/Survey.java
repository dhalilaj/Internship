package lhind.ex1.survey;

import java.util.ArrayList;
import java.util.List;

public class Survey {

    private List<Question> question = new ArrayList<>();
    private String title;
    private String topic;
    private String description;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Question> getQuestionList() {
        return question;
    }

    public void setQuestionList(List<Question> questionList) {
        this.question = questionList;
    }

    public Survey(String title, String topic, String description, List<Question> question) {
        this.title = title;
        this.topic = topic;
        this.description = description;
        this.question = new ArrayList<>();

    }

    public void addQuestion(Question question) {
        this.question.add(question);

    }

    public void removeQuestion(Question question) {
        this.question.remove(question);
    }

    @Override
    public String toString() {
        return "Survey{" +
                "question=" + question +
                ", title='" + title + '\'' +
                ", topic='" + topic + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}