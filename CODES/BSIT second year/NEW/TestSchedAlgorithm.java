import java.util.*;
public class TestSchedAlgorithm {
    private static Scanner input = new Scanner(System.in);
    private static String[] process, ganttChart, tempQueueProcess;
    private static int[] arrivalTime, burstTime, priority, tempQueuePriority, tempQueueBurst;
    private static int arrivingProcess, runningPriority = 0, runningBurst = 0;
    private static String runningProcess = "*";
    private static ReadyQueue head, end;
    public static void main(String[] args) {
        System.out.print("Enter number of processes: ");
        int numOfProcess = input.nextInt();
        process = new String[numOfProcess];
        arrivalTime = new int[numOfProcess];
        burstTime = new int[numOfProcess];
        priority = new int[numOfProcess];
        
        for(int i = 0, tempNum = 1; i < process.length; i++) //Assign the processes their ID
            process[i] = "P" + tempNum++;
        for(int i = 0; i < process.length; i++) { //Assign the AT, BT, and PL of each process
            System.out.print("What is the Arrival Time of " + process[i] + ": ");
            arrivalTime[i] = input.nextInt();
            System.out.print("What is the CPU Brust Time of " + process[i] + ": ");
            burstTime[i] = input.nextInt();
            System.out.print("What is the Priority Level of " + process[i] + ": ");
            priority[i] = input.nextInt();
        }
        GanttChartLength();
    }
    public static void GanttChartLength() {
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
        NonpreemptiveSJF();
    }
    public static void Preemptive() {
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
        for(int i = 0; i < ganttChart.length; i++) {
            System.out.print(ganttChart[i] + " ");
        }
    }
    public static void NonpreemptiveFCFS() {
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
        for(int i = 0; i < ganttChart.length; i++) {
            System.out.print(ganttChart[i] + " ");
        }
    }
    public static void NonpreemptiveSJF() {
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
        for(int i = 0; i < ganttChart.length; i++) {
            System.out.print(ganttChart[i] + " ");
        }
    }
    public static void CheckBurstQueue() {
        if(!(IsEmpty()))
            for(ReadyQueue temp = head; temp!=null; temp=temp.link)
                if(runningBurst > temp.processBurst) {
                    InsertToReady(runningProcess, runningPriority, runningBurst);
                    RemoveFromReady();
                    CheckBurstQueue();
                }
    }
    public static void CheckPriorityQueue() {
        if(!(IsEmpty()))
            for(ReadyQueue temp = head; temp!=null; temp=temp.link)
                if(runningPriority > temp.processPriority) {
                    InsertToReady(runningProcess, runningPriority, runningBurst);
                    RemoveFromReady();
                    CheckPriorityQueue();
                }
    }
    public static void CheckPriority() {
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
    public static void InsertToReady(String processName, int processPriority, int processBurst) {
        if(IsEmpty()) {
            head = new ReadyQueue(processName, processPriority, processBurst, head);
            end = head;
        } else {
            end.link = new ReadyQueue(processName, processPriority, processBurst, end.link);
            end = end.link;
        }
    }
    public static void RemoveFromReady() {
        if (!(IsEmpty())) {
            runningProcess = head.processName;
            runningPriority = head.processPriority;
            runningBurst = head.processBurst;
            head = head.link;
        }
    }
    public static boolean IsEmpty() {
        return (head == null);
    }
    public static boolean CheckArrival(int ctr) {
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
}
/*
    public void TestOutput() {
        for(int i = 0; i < process.length; i++)
            System.out.println("P" + process[i] + ": AT(" + arrivalTime[i] + "), BT(" + burstTime[i] + "), PL(" + priority[i] + ")");
        System.out.println(choiceMethod + " " + choiceAlgorithm);
    }*/