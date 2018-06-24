package by.htp.predictor.entity;

public class PredictionResult {
	private Prediction prediction;
	private Answer answer;

	public PredictionResult() {
		super();
	}

	public PredictionResult(Prediction prediction, Answer answer) {
		super();
		this.prediction = prediction;
		this.answer = answer;
	}

	public Prediction getPrediction() {
		return prediction;
	}

	public void setPrediction(Prediction prediction) {
		this.prediction = prediction;
	}

	public Answer getAnswer() {
		return answer;
	}

	public void setAnswer(Answer answer) {
		this.answer = answer;
	}

	@Override
	public String toString() {
		return " PredictionResult [" + prediction + ", " + answer + "]";
	}

}
