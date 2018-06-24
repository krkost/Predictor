package by.htp.predictor.entity;

import java.util.LinkedHashMap;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;

public class FortuneTeller implements Comparable<FortuneTeller> {

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
		this.history = new HashMap<Date, Client>();
	}

	public FortuneTeller(LinkedHashMap<Prediction, Queue<Answer>> predictionMap) {
		super();
		this.predictionMap = predictionMap;
		this.history = new HashMap<Date, Client>();
		this.waitingList = new PriorityQueue<>();
		System.out.println("Input number of clients:");
		int clients = new Scanner(System.in).nextInt();
		for (int i = 0; i < clients; i++) {
			Client c1 = Client.inputClient();
			this.waitingList.add(c1);
		}

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

	public HashMap<Date, Client> getHistory() {
		return history;
	}

	public Set<Prediction> getPredictions() {
		return this.predictionMap.keySet();
	}

	public void showListOfPredictions() {
		Set pr = getPredictions();
		Iterator itr = pr.iterator();
		while (itr.hasNext())
			System.out.println(itr.next());
	}

	public void givePrediction(Client client) {
		if (counter <= 10) {
			Prediction clientPrediction = client.getPrediction();
			PredictionResult prRes = null;
			if (predictionMap.containsKey(clientPrediction)) {
				Date date = new Date();
				Answer answ = predictionMap.get(clientPrediction).poll();
				prRes = new PredictionResult(client.getPrediction(), answ);
				client.savePredictionResult(date, prRes);
				history.put(date, client);
				counter++;
			}
		} else {
			System.out.println("Requests reached the limit for today");
		}
	}

	public void givePredictionsForWaitingList() {
		int size = waitingList.size();
		if (size != 0) {
			PriorityQueue<Client> temp = new PriorityQueue<>();
			temp.addAll(waitingList);
			for (int i = 0; i < size; i++) {
				Client cl = new Client();
				cl = temp.poll();
				givePrediction(cl);
			}
		}
	}

	public void viewClientsList() {
		int size = waitingList.size();
		PriorityQueue<Client> temp = new PriorityQueue<>();
		temp.addAll(waitingList);
		if (size != 0) {
			for (int i = 0; i < size; i++) {
				Client cl = temp.poll();
				System.out.print(cl.getName() + ", ");
			}
			System.out.println();
		} else {
			System.out.println("There is no clients in the queue");
		}
	}

	public void deleteClientFromList(Client client) {
		int size = waitingList.size();
		if (size != 0) {
			for (int i = 0; i < size; i++) {
				Client cl = waitingList.peek();
				if (cl.equals(client)) {
					waitingList.remove();
				}
			}
		} else {
			System.out.println("There is no clients in the queue");
		}
	}

	public void viewHistoryOfClients() {
		int size = history.size();
		HashMap<Date, Client> temp = new HashMap<Date, Client>();
		temp.putAll(history);
		ArrayList<Date> dateSet = new ArrayList<Date>();
		dateSet.addAll(history.keySet());
		for (int i = 0; i < size; i++) {
			Date d = dateSet.get(i);
			System.out.print(d);
			System.out.println(": " + temp.get(d));
		}
	}

	@Override
	public int compareTo(FortuneTeller fortuneTeller) {
		return 0;
	}

}
