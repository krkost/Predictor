package by.htp.predictor.entity;

import java.util.Date;
import java.util.TreeMap;

public class Client {

	private String name;
	private TreeMap<Date, PredictionResult> historyOfPredictions;

	public Client() {
		super();
	}

	public Client(String name) {
		this.name = name;
		this.historyOfPredictions = null;
	}

	public Client(String name, TreeMap<Date, PredictionResult> historyOfPredictions) {
		super();
		this.name = name;
		this.historyOfPredictions = historyOfPredictions;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public TreeMap<Date, PredictionResult> getHistoryOfPredictions() {
		return historyOfPredictions;
	}

	public void setHistoryOfPredictions(TreeMap<Date, PredictionResult> historyOfPredictions) {
		this.historyOfPredictions = historyOfPredictions;
	}

	public void viewListOfPredictions(Prediction[] predictions) {
		for (Prediction p : predictions) {
			System.out.println(p);
		}
	}

}
