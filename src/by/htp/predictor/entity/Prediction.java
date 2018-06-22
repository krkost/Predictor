package by.htp.predictor.entity;

import java.util.List;

public class Prediction {
	
	private String target;

	public Prediction() {
		super();
	}

	public Prediction(String target) {
		super();
		this.target = target;
	}

	public String getTarget() {
		return target;
	}

	public void setTarget(String target) {
		this.target = target;
	}

	@Override
	public String toString() {
		return "Prediction [target=" + target + "]";
	}
	
	

}
