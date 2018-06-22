package by.htp.predictor.run;

import java.util.LinkedHashMap;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.ArrayDeque;

import by.htp.predictor.entity.Answer;
import by.htp.predictor.entity.Client;
import by.htp.predictor.entity.FortuneTeller;
import by.htp.predictor.entity.Prediction;

public class MainApp {

	public static void main(String[] args) {
		
		Prediction[] predictions = {new Prediction("Health"), new Prediction("Job"), new Prediction("Love")};
		Queue<Answer> answers = new ArrayDeque<>();
		answers.add(new Answer("Answer1"));
		answers.add(new Answer("Answer2"));
		answers.add(new Answer("Answer3"));
		
		LinkedHashMap<Prediction, Queue<Answer>> predictionMap = new LinkedHashMap<Prediction, Queue<Answer>>();
		predictionMap.put(predictions[0], answers);
		predictionMap.put(predictions[1], answers);
		predictionMap.put(predictions[2], answers);
		
		Client c1 = new Client("John");
		
		PriorityQueue<Client> waitingList = new PriorityQueue<>();
		
		waitingList.add(c1);
		
		FortuneTeller ft = new FortuneTeller(predictionMap, waitingList);
		
		ft.givePrediction(predictions[0]);
		

	}

}
