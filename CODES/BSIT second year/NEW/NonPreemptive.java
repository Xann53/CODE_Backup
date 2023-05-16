
/**
 * Write a description of class NonPreemptive here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Arrays;
import java.util.Scanner;

public class NonPreemptive
{
    String[] processId;
    
    int burstTime[];
    int arrivalTime[];
    int numberOfProcess;

    void getProcessData(Scanner input) 
    {
        System.out.println();
        System.out.println("*** NonPreemptiveAlgo ***");
        int inputNumberOfProcess;
    
        do
            {
            System.out.print("Enter Number of Process: ");
            inputNumberOfProcess = input.nextInt();
            
            if (inputNumberOfProcess < 3)
            {
                System.out.println("INVALID INPUT, Process must be more than 3 or equal to 3 process \n TRY again\n");
            }
        }while (inputNumberOfProcess < 3);
        
        numberOfProcess = inputNumberOfProcess;
        burstTime = new int[numberOfProcess];
        arrivalTime = new int[numberOfProcess];
        processId = new String[numberOfProcess];
        String st = "P";
        
        
        for (int i = 0; i < numberOfProcess; i++) 
        {
            processId[i] = st.concat(Integer.toString(i));
            System.out.print("Enter the burst time   for Process - " + (i) + " : ");
            burstTime[i] = input.nextInt();
            System.out.print("Enter the arrival time for Process - " + (i) + " : ");
            arrivalTime[i] = input.nextInt();
        }
    }

    void sortAccordingArrivalTime(int[] at, int[] bt, String[] pid) 
    {

        int temp;
        String stemp;
        for (int i = 0; i < numberOfProcess; i++) 
        {

            for (int j = 0; j < numberOfProcess - i - 1; j++) 
            {
                if (at[j] > at[j + 1]) 
                {
                    //swapping arrival time
                    temp = at[j];
                    at[j] = at[j + 1];
                    at[j + 1] = temp;

                    //swapping burst time
                    temp = bt[j];
                    bt[j] = bt[j + 1];
                    bt[j + 1] = temp;

                    //swapping process identity
                    stemp = pid[j];
                    pid[j] = pid[j + 1];
                    pid[j + 1] = stemp;

                }
                
            }

        }
    }

    void NonPreemptiveAlgorithm() 
    {
        int finishTime[] = new int[numberOfProcess];
        int bt[] = burstTime.clone();
        int at[] = arrivalTime.clone();
        String pid[] = processId.clone();
        int waitingTime[] = new int[numberOfProcess];
        int turnAroundTime[] = new int[numberOfProcess];

        sortAccordingArrivalTime(at, bt, pid);

        //calculating waiting & turn-around time for each process
        finishTime[0] = at[0] + bt[0];
        turnAroundTime[0] = finishTime[0] - at[0];
        waitingTime[0] = turnAroundTime[0] - bt[0];

        for (int i = 1; i < numberOfProcess; i++) 
        {
            finishTime[i] = bt[i] + finishTime[i - 1];
            turnAroundTime[i] = finishTime[i] - at[i];
            waitingTime[i] = turnAroundTime[i] - bt[i];
        }
        float sum = 0;
        for (int n : waitingTime) 
        {
            sum += n;
        }
        float averageWaitingTime = sum / numberOfProcess;

        sum = 0;
        for (int n : turnAroundTime) 
        {
            sum += n;
        }
        float averageTurnAroundTime = sum / numberOfProcess;

       
        System.out.println("Process     Burst Time      Arrival Time        Waiting Time        TurnAround Time");
        for (int i = 0; i < numberOfProcess; i++) {
        
            System.out.println(pid[i] + "                 " + bt[i] + "              " + at[i] + "               " +waitingTime[i] + "                   " + turnAroundTime[i]);
        
        }
        
        System.out.println("\n\t\tAverage \t\t\t" + averageWaitingTime + "                  " +averageTurnAroundTime);
        
    }
    
    void GanttChart()
    {
        System.out.println();
        System.out.println("Gantt chart: ");
        
        int bt[] = burstTime.clone();
        
        int p = 0;
        for (int i = 0; i < numberOfProcess; i++) {
            
            for (int j = 0; j < bt[i]; j++) {
                System.out.print("P"  +p+ ", ");
            }
            p++;
        }
        
    }

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        NonPreemptive obj = new NonPreemptive();
        obj.getProcessData(input);
        obj.NonPreemptiveAlgorithm();
        obj.GanttChart();
    }
}

