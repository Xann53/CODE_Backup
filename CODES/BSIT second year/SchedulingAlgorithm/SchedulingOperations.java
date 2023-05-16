public class SchedulingOperations {
	String[] process, ganttChart, tempQueueProcess;
    int[] arrivalTime, burstTime, priority, tempQueuePriority, tempQueueBurst;
    int arrivingProcess, runningPriority = 0, runningBurst = 0;
    String runningProcess = "*", choiceMethod, choiceAlgorithm;
    ReadyQueue head, end;
    String[][] finalOutput;
	
    public void InputValues(String tempNumOfProcess, String schedMethod, String schedAlgorithm, SchedulingOperations operations) {
		int numOfProcess = Integer.parseInt(tempNumOfProcess);
		process = new String[numOfProcess];
        arrivalTime = new int[numOfProcess];
        burstTime = new int[numOfProcess];
        priority = new int[numOfProcess];
        choiceMethod = schedMethod;
        choiceAlgorithm = schedAlgorithm;
        
        for(int i = 0, tempNum = 1; i < process.length; i++)
            process[i] = "P" + tempNum++;
        new ProcessWindow(0, process, operations);
	}
    public void InputValuesLoop(int ctr, int tempATime, int tempBTime, int tempPLevel, SchedulingOperations operations) {
    	if(ctr < process.length) {
    		arrivalTime[ctr-1] = tempATime;
            burstTime[ctr-1] = tempBTime;
            priority[ctr-1] = tempPLevel;
            new ProcessWindow(ctr, process, operations);
    	} else {
    		arrivalTime[ctr-1] = tempATime;
            burstTime[ctr-1] = tempBTime;
            priority[ctr-1] = tempPLevel;
            GanttChartLength(operations);
    	}
    }
    public void GanttChartLength(SchedulingOperations operations) {
        int totalBurst = 0, temp = arrivalTime[0];
        boolean proceed = false;
        for(int i = 0; i < process.length; i++)
            totalBurst += burstTime[i];
        for(int i = 0; i < arrivalTime.length; i++)
            if(arrivalTime[i] == 0)
                proceed = true;
        if(!proceed) {
            for(int i = 0; i < arrivalTime.length; i++)
                if(arrivalTime[i] < temp)
                    temp = arrivalTime[i];
            ganttChart = new String[totalBurst + temp];
        } else
            ganttChart = new String[totalBurst];
        MainHub(operations);
    }
    public void MainHub(SchedulingOperations operations) {
    	if(choiceMethod.equalsIgnoreCase("Preemptive")) {
    		if(choiceAlgorithm.equalsIgnoreCase("Shortest Job First")) {
    			PreemptiveSJF(operations);
    		} else if(choiceAlgorithm.equalsIgnoreCase("Priority Scheduling")) {
    			PreemptivePriority(operations);
    		} else if(choiceAlgorithm.equalsIgnoreCase("Round Robin Scheduling")) {
    			
    		}
    		
    	} else if(choiceMethod.equalsIgnoreCase("Non-preemptive")) {
    		if(choiceAlgorithm.equalsIgnoreCase("First Come First Serve")) {
    			NonpreemptiveFCFS(operations);
    		} else if(choiceAlgorithm.equalsIgnoreCase("Shortest Job First")) {
    			NonpreemptiveSJF(operations);
    		} else if(choiceAlgorithm.equalsIgnoreCase("Priority Scheduling")) {
    			NonpreemptivePriority(operations);
    		}
    	}
    }
    public void PreemptiveSJF(SchedulingOperations operations) {
        for(int i = 0; i < ganttChart.length; i++) {
            if(CheckArrival(i)) {
                CheckBurst();
                if(runningBurst == 0) {
                    RemoveFromReady();
                    CheckBurstQueue();
                    ganttChart[i] = runningProcess;
                    runningBurst--;
                } else {
                    CheckBurstQueue();
                    ganttChart[i] = runningProcess;
                    runningBurst--;
                }
            } else {
                if(runningBurst != 0) {
                    ganttChart[i] = runningProcess;
                    runningBurst--;
                } else if(runningBurst == 0 && !(IsEmpty())) {
                    RemoveFromReady();
                    CheckBurstQueue();
                    ganttChart[i] = runningProcess;
                    runningBurst--;
                } else
                    ganttChart[i] = "*";
            }
        }
        Table(operations);
    }
    public void PreemptivePriority(SchedulingOperations operations) {
        for(int i = 0; i < ganttChart.length; i++) {
            if(CheckArrival(i)) {
                CheckPriority();
                if(runningBurst == 0) {
                    RemoveFromReady();
                    CheckPriorityQueue();
                    ganttChart[i] = runningProcess;
                    runningBurst--;
                } else {
                    CheckPriorityQueue();
                    ganttChart[i] = runningProcess;
                    runningBurst--;
                }
            } else {
                if(runningBurst != 0) {
                    ganttChart[i] = runningProcess;
                    runningBurst--;
                } else if(runningBurst == 0 && !(IsEmpty())) {
                    RemoveFromReady();
                    CheckPriorityQueue();
                    ganttChart[i] = runningProcess;
                    runningBurst--;
                } else
                    ganttChart[i] = "*";
            }
        }
        Table(operations);
    }
    public void NonpreemptiveFCFS(SchedulingOperations operations) {
        for(int i = 0; i < ganttChart.length; i++) {
            if(CheckArrival(i)) {
                for(int j = 0; j < arrivingProcess; j++)
                    InsertToReady(tempQueueProcess[j], tempQueuePriority[j], tempQueueBurst[j]);
                if(runningBurst == 0) {
                    RemoveFromReady();
                    ganttChart[i] = runningProcess;
                    runningBurst--;
                } else {
                    ganttChart[i] = runningProcess;
                    runningBurst--;
                }
            } else {
                if(runningBurst != 0) {
                    ganttChart[i] = runningProcess;
                    runningBurst--;
                } else if(runningBurst == 0 && !(IsEmpty())) {
                    RemoveFromReady();
                    ganttChart[i] = runningProcess;
                    runningBurst--;
                } else
                    ganttChart[i] = "*";
            }
        }
        Table(operations);
    }
    public void NonpreemptiveSJF(SchedulingOperations operations) {
        for(int i = 0; i < ganttChart.length; i++) {
            if(CheckArrival(i)) {
                for(int j = 0; j < arrivingProcess; j++)
                    InsertToReady(tempQueueProcess[j], tempQueuePriority[j], tempQueueBurst[j]);
                if(runningBurst == 0) {
                    RemoveFromReady();
                    CheckBurstQueue();
                    ganttChart[i] = runningProcess;
                    runningBurst--;
                } else {
                    ganttChart[i] = runningProcess;
                    runningBurst--;
                }
            } else {
                if(runningBurst != 0) {
                    ganttChart[i] = runningProcess;
                    runningBurst--;
                } else if(runningBurst == 0 && !(IsEmpty())) {
                    RemoveFromReady();
                    CheckBurstQueue();
                    ganttChart[i] = runningProcess;
                    runningBurst--;
                } else
                    ganttChart[i] = "*";
            }
        }
        Table(operations);
    }
    public void NonpreemptivePriority(SchedulingOperations operations) {
        for(int i = 0; i < ganttChart.length; i++) {
            if(CheckArrival(i)) {
                for(int j = 0; j < arrivingProcess; j++)
                    InsertToReady(tempQueueProcess[j], tempQueuePriority[j], tempQueueBurst[j]);
                if(runningBurst == 0) {
                    RemoveFromReady();
                    CheckPriorityQueue();
                    ganttChart[i] = runningProcess;
                    runningBurst--;
                } else {
                    ganttChart[i] = runningProcess;
                    runningBurst--;
                }
            } else {
                if(runningBurst != 0) {
                    ganttChart[i] = runningProcess;
                    runningBurst--;
                } else if(runningBurst == 0 && !(IsEmpty())) {
                    RemoveFromReady();
                    CheckPriorityQueue();
                    ganttChart[i] = runningProcess;
                    runningBurst--;
                } else
                    ganttChart[i] = "*";
            }
        }
        Table(operations);
    }
    public boolean CheckArrival(int ctr) {
        int temp = 0;
        arrivingProcess = 0;
        for(int i = 0; i < arrivalTime.length; i++)
            if(arrivalTime[i] == ctr) 
                arrivingProcess++;
        tempQueueProcess = new String[arrivingProcess];
        tempQueuePriority = new int[arrivingProcess];
        tempQueueBurst = new int[arrivingProcess];
        for(int i = 0; i < process.length; i++)
            if(arrivalTime[i] == ctr) {
                tempQueueProcess[temp] = process[i];
                tempQueuePriority[temp] = priority[i];
                tempQueueBurst[temp] = burstTime[i];
                temp++;
            }
        if(arrivingProcess > 0)
            return true;
        else
            return false;
    }
    public void CheckBurst() {
        if(arrivingProcess == 1) {
            InsertToReady(tempQueueProcess[0], tempQueuePriority[0], tempQueueBurst[0]);
        } else if(arrivingProcess > 1) {
            for(int i = 0; i < arrivingProcess; i++)
                for(int j = i + 1; j < arrivingProcess; j++)
                    if(tempQueueBurst[i] > tempQueueBurst[j]) {
                        String tempID = tempQueueProcess[i];
                        tempQueueProcess[i] = tempQueueProcess[j];
                        tempQueueProcess[j] = tempID;
                        int tempPriority = tempQueuePriority[i];
                        tempQueuePriority[i] = tempQueuePriority[j];
                        tempQueuePriority[j] = tempPriority;
                        int tempBurst = tempQueueBurst[i];
                        tempQueueBurst[i] = tempQueueBurst[j];
                        tempQueueBurst[j] = tempBurst;
                    }
            for(int i = 0; i < arrivingProcess; i++)
                InsertToReady(tempQueueProcess[i], tempQueuePriority[i], tempQueueBurst[i]);
        }
    }
    public void CheckBurstQueue() {
        if(!(IsEmpty()))
            for(ReadyQueue temp = head; temp!=null; temp=temp.link)
                if(runningBurst > temp.processBurst) {
                    InsertToReady(runningProcess, runningPriority, runningBurst);
                    RemoveFromReady();
                    CheckBurstQueue();
                }
    }
    public void CheckPriority() {
        if(arrivingProcess == 1) {
            InsertToReady(tempQueueProcess[0], tempQueuePriority[0], tempQueueBurst[0]);
        } else if(arrivingProcess > 1) {
            for(int i = 0; i < arrivingProcess; i++)
                for(int j = i + 1; j < arrivingProcess; j++)
                    if(tempQueuePriority[i] > tempQueuePriority[j]) {
                        String tempID = tempQueueProcess[i];
                        tempQueueProcess[i] = tempQueueProcess[j];
                        tempQueueProcess[j] = tempID;
                        int tempPriority = tempQueuePriority[i];
                        tempQueuePriority[i] = tempQueuePriority[j];
                        tempQueuePriority[j] = tempPriority;
                        int tempBurst = tempQueueBurst[i];
                        tempQueueBurst[i] = tempQueueBurst[j];
                        tempQueueBurst[j] = tempBurst;
                    }
            for(int i = 0; i < arrivingProcess; i++)
                InsertToReady(tempQueueProcess[i], tempQueuePriority[i], tempQueueBurst[i]);
        }
    }
    public void CheckPriorityQueue() {
        if(!(IsEmpty()))
            for(ReadyQueue temp = head; temp!=null; temp=temp.link)
                if(runningPriority > temp.processPriority) {
                    InsertToReady(runningProcess, runningPriority, runningBurst);
                    RemoveFromReady();
                    CheckPriorityQueue();
                }
    }
    public void InsertToReady(String processName, int processPriority, int processBurst) {
        if(IsEmpty()) {
            head = new ReadyQueue(processName, processPriority, processBurst, head);
            end = head;
        } else {
            end.link = new ReadyQueue(processName, processPriority, processBurst, end.link);
            end = end.link;
        }
    }
    public void RemoveFromReady() {
        if (!(IsEmpty())) {
            runningProcess = head.processName;
            runningPriority = head.processPriority;
            runningBurst = head.processBurst;
            head = head.link;
        }
    }
    public boolean IsEmpty() {
        return (head == null);
    }
    public void Table(SchedulingOperations operations) {
    	finalOutput = new String[process.length][ganttChart.length+1];
    	for(int i = 0; i < finalOutput.length; i++) {
    		String currentProcess = process[i];
    		for(int j = 0; j < finalOutput[i].length; j++) {
    			if(j == 0)
    				finalOutput[i][j] = "Process " + (i+1);
    			else if(j != 0 && ganttChart[j-1].equalsIgnoreCase(currentProcess))
    				finalOutput[i][j] = ganttChart[j-1];
    			else
    				finalOutput[i][j] = "";
    		}
    	}
    	new MainGUI(finalOutput, arrivalTime, burstTime, operations);
    }
    public void ShowResults(String[][] finalOutput, int[] arrivalTime, int[] burstTime, SchedulingOperations operations) {
        String reference;
        int lastPosition = 0, sumTT = 0, sumWT = 0;
        double averageTT, averageWT, divisor = finalOutput.length;
        int[] complTime = new int[finalOutput.length];
        int[] turnATime = new int[finalOutput.length];
        int[] waitTime = new int[finalOutput.length];
        
        for(int i = 0; i < finalOutput.length; i++) {
            reference = "P" + (i+1);
            for(int j = 0; j < finalOutput[i].length; j++) {
                if(finalOutput[i][j].equalsIgnoreCase(reference))
                    lastPosition = j;
            }
            complTime[i] = lastPosition;
        }
        
        for(int i = 0; i < turnATime.length; i++)
            turnATime[i] = complTime[i] - arrivalTime[i];
        for(int i = 0; i < waitTime.length; i++)
            waitTime[i] = turnATime[i] - burstTime[i];
        for(int i = 0; i < turnATime.length; i++)
            sumTT += turnATime[i];
        averageTT = sumTT / divisor;
        averageTT = Math.round(averageTT * 100) / 100.0;
        for(int i = 0; i < waitTime.length; i++)
            sumWT += waitTime[i];
        averageWT = sumWT / divisor;
        averageWT = Math.round(averageWT * 100) / 100.0;
        
        String[][] finalResult = new String[finalOutput.length][3];
        
        for (int i = 0; i < finalResult.length; i++) {
        	for(int j = 0; j < finalResult[i].length; j++) {
        		if(j==0)
        			finalResult[i][j] = "Process " + (i+1);
        		else if(j==1)
        			finalResult[i][j] = turnATime[i] + "";
        		else if(j==2)
        			finalResult[i][j] = waitTime[i] + "";
        	}
        }
        
        new ResultWindow(finalResult, averageTT, averageWT, operations);
    }
}