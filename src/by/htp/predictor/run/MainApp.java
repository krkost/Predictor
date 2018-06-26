package by.htp.predictor.run;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

import by.htp.predictor.entity.Answer;
import by.htp.predictor.entity.Client;
import by.htp.predictor.entity.FortuneTeller;
import by.htp.predictor.entity.Prediction;
import by.htp.predictor.entity.Target;

public class MainApp {

	public static void main(String[] args) {
		
		Queue<Answer> answers = new LinkedList<>();
		for (int i = 0; i < 3; i++) {
			answers.add(new Answer("Answer" + i));
		}
		
	
		LinkedHashMap<Prediction, Queue<Answer>> predictionMap = new LinkedHashMap<Prediction, Queue<Answer>>();
		predictionMap.put(new Prediction(Target.HEALTH), answers);
		predictionMap.put(new Prediction(Target.JOB), answers);
		predictionMap.put(new Prediction(Target.LOVE), answers);

		
		FortuneTeller ft = new FortuneTeller(predictionMap);
		ft.showListOfPredictions();
		ft.viewClientsList();
	//	ft.deleteClientFromList(Client.inputClient());
		ft.givePredictionsForClientsQueue();
		ft.viewHistoryOfClients();
				
	}

}
