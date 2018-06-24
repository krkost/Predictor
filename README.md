# Predictor
Create a program that allows the user to predict the development of various situations.
FortuneTeller is a class that stores:
a set of fortune-telling and a set of answers for each fortune-telling (LinkedHashMap <Prediction, Queue <Answer>);

the client queue (PriorityQueue <Client>). Predictor can receive no more than 10 clients per day. One client can not receive magical help more than once a week.

Implement the following functionality:
- the client can view a list of available predictions;
- the client can turn to the predictor, indicate the purpose of the fortune telling, get an answer. If the client appeals more often than once a week, or on the date of treatment the predictor limit is exceeded (no more than 10 predictions per day), the client enters the waiting list;
- client stores the history of calls to the predictor (TreeMap <Date, PredictionResult>) PredictionResult = Prediction + Answer.
- the predictor keeps a record of customers (HashMap <Date, Client>), which was provided with magical help and provides a report on these customers;
- the predictor provides an opportunity to view the list of clients written to the queue for reception;
- the predictor has the ability to remove the client from the waiting list.
