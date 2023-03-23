package lhind.ex1.survey;

public class Question {

	private Long id;
	private String question;

	private Answer answer;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public Answer getAnswer() {
		return answer;
	}

	public void setAnswer(Answer answer) {
		this.answer = answer;
	}

	public Question(Long id, String question) {
		this.id = id;
		this.question = question;
	}

	@Override
	public String toString() {
		return "Question{" +
				"id=" + id +
				", question='" + question + '\'' +
				", answer=" + answer +
				'}';
	}
}
