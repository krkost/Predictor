package by.htp.predictor.entity;

public class Answer implements Comparable<Answer> {

	private String answer;

	public Answer() {
		super();
	}

	public Answer(String answer) {
		super();
		this.answer = answer;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	@Override
	public String toString() {
		return "Answer [" + answer + "]";
	}

	@Override
	public int compareTo(Answer answer) {
		return this.answer.compareTo(answer.answer);
	}

}
