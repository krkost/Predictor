package by.htp.predictor.entity;

import java.util.List;

public class Prediction {
	
	private Target target;

	public Prediction() {
		super();
	}
	
	public Prediction(Target target) {
		super();
		this.target = target;
	}

	public Target getTarget() {
		return target;
	}

	public void setTarget(Target target) {
		this.target = target;
	}

	@Override
	public String toString() {
		return "Prediction [" + target + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((target == null) ? 0 : target.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Prediction other = (Prediction) obj;
		if (target != other.target)
			return false;
		return true;
	}
	
	
	
	
}
