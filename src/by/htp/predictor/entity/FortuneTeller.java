package by.htp.predictor.entity;

import java.util.LinkedHashMap;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Date;
import java.util.HashMap;

public class FortuneTeller {

	private LinkedHashMap<Prediction, Queue<Answer>> predictionMap;
	private PriorityQueue<Client> waitingList;
	private HashMap<Date, Client> history;
	private int counter = 0;

	public FortuneTeller() {
		super();
	}

	public FortuneTeller(LinkedHashMap<Prediction, Queue<Answer>> predictionMap, PriorityQueue<Client> waitingList) {
		super();
		this.predictionMap = predictionMap;
		this.waitingList = waitingList;
	}

	public LinkedHashMap<Prediction, Queue<Answer>> getPredictionMap() {
		return predictionMap;
	}

	public void setPredictionMap(LinkedHashMap<Prediction, Queue<Answer>> predictionMap) {
		this.predictionMap = predictionMap;
	}

	public PriorityQueue<Client> getWaitingList() {
		return waitingList;
	}

	public void setWaitingList(PriorityQueue<Client> waitingList) {
		this.waitingList = waitingList;
	}

	public void givePrediction(Prediction prediction) {
	//	Date date = /*current date*/;
		if (predictionMap.containsKey(prediction)) {
			System.out.println(prediction);
			for (Queue<Answer> as : predictionMap.values()) {
				for (Answer a : as) {
					System.out.println(a);
				}
			}
		//	history.put(date, waitingList.)
		}

	}

}
