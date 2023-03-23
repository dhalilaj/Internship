package lhind.ex1.survey;

import java.util.*;

public class SurveyApplication {

    public static void main(String[] args) {

        Question question1= new Question(1L, "Question1");
        Question question2= new Question(2L, "Question2");
        Question question3= new Question(3L, "Question3");
        Question question4= new Question(4L, "Question4");

        Answer answer1 = Answer.AGREE;
        Answer answer2 = Answer.SLIGHTLY_AGREE;

        Candidate candidate = new Candidate("Diona", "Halilaj", "dh@gm.c", 687);
        Candidate candidate2 = new Candidate("LHIND", "HSDG", "lh@gm.c", 987);

        System.out.println(question1);
        System.out.println(question2);
        System.out.println(question2);
        System.out.println(question4);

        System.out.println(candidate);
        System.out.println(candidate2);

        List<Question> questionList = new ArrayList<>();
        questionList.add(question1);
        questionList.add(question2);
        questionList.add(question3);
        questionList.add(question4);

        Survey survey = new Survey("Survey title", "lhind", "survey description", questionList);

        Map<Question, Answer> questionAnswerMap = new HashMap<>();

        System.out.println("This is " + survey.getTitle() + "survey");
        System.out.println("Please fill out the survey, answering the below questions: ");
        System.out.println(question1);
        System.out.println(answer1);
        System.out.println(answer2);

        Scanner scanner = new Scanner(System.in);


//        questionAnswerMap.put(question1, a1);



    }
}
