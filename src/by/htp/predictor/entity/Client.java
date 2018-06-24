package by.htp.predictor.entity;

import java.util.Date;
import java.util.Scanner;
import java.util.TreeMap;

public class Client implements Comparable<Client> {

	private String name;
	private Prediction prediction;
	private TreeMap<Date, PredictionResult> historyOfPredictions;

	public Client() {
		super();
		this.historyOfPredictions = new TreeMap<Date, PredictionResult>();
	}

	public Client(String name) {
		this.name = name;
		this.prediction = new Prediction();
		this.historyOfPredictions = new TreeMap<Date, PredictionResult>();
	}

	public Client(String name, Prediction prediction) {
		this.name = name;
		this.prediction = prediction;
		this.historyOfPredictions = new TreeMap<Date, PredictionResult>();
	}

	public Client(String name, TreeMap<Date, PredictionResult> historyOfPredictions) {
		super();
		this.name = name;
		this.prediction = new Prediction();
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

	public Prediction getPrediction() {
		return prediction;
	}

	public void setPrediction(Prediction prediction) {
		this.prediction = prediction;
	}

	public void savePredictionResult(Date date, PredictionResult predictionResult) {
		historyOfPredictions.put(date, predictionResult);
	}

	public static Client inputClient() {
		Client client = new Client();
		Scanner sc = new Scanner(System.in);
		System.out.println("Input Client name");
		client.name = sc.nextLine();
		System.out.println("Input Client prediction: 1 - Health, 2 - Job, 3 - Love");
		String var = sc.nextLine();
		switch (var) {
		case "1":
			client.prediction = new Prediction(Target.HEALTH);
			break;
		case "2":
			client.prediction = new Prediction(Target.JOB);
			break;
		case "3":
			client.prediction = new Prediction(Target.LOVE);
			break;
			default: client.prediction = new Prediction(Target.HEALTH);
		}
		return client;
	}

	@Override
	public String toString() {
		return "Client [name=" + name + ", prediction=" + prediction + ", historyOfPredictions=" + historyOfPredictions
				+ "]";
	}

	@Override
	public int compareTo(Client client) {
		return 0;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((historyOfPredictions == null) ? 0 : historyOfPredictions.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((prediction == null) ? 0 : prediction.hashCode());
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
		Client other = (Client) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (prediction == null) {
			if (other.prediction != null)
				return false;
		} else if (!prediction.equals(other.prediction))
			return false;
		return true;
	}

}
