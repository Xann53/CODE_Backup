public class TestOutput
{
    public static void main(String[] args) {
        String[][] finalOutput = {
            {"Process 1","P1","","","","","","","","","","P1","P1","P1","P1","P1","P1","P1","P1","P1","P1","P1","P1","P1","P1","P1","P1","",""},
            {"Process 2","","P2","","","","","","","P2","P2","","","","","","","","","","","","","","","","","",""},
            {"Process 3","","","P3","P3","P3","P3","P3","P3","","","","","","","","","","","","","","","","","","","",""},
            {"Process 4","","","","","","","","","","","","","","","","","","","","","","","","","","","P4","P4"}
        };
        ShowResults(finalOutput);
    }
    public static void ShowResults(String[][] finalOutput) {
        String reference;
        int cpuCtr = 0, lastPosition = 0, prcssBrst = 0, sumTT = 0, sumWT = 0;
        double averageTT, averageWT, divisor = finalOutput.length;
        int[] arrvlTime = {0, 1, 2, 3};
        int[] complTime = new int[finalOutput.length];
        int[] turnATime = new int[finalOutput.length];
        int[] cpuBrst = new int[finalOutput.length];
        int[] waitTime = new int[finalOutput.length];
        
        for(int i = 0; i < finalOutput.length; i++) {
            reference = "P" + (i+1);
            for(int j = 0; j < finalOutput[i].length; j++) {
                if(finalOutput[i][j].equalsIgnoreCase(reference))
                    lastPosition = j;
            }
            complTime[i] = lastPosition;
        }
        for(int i = 0; i < finalOutput.length; i++) {
            reference = "P" + (i+1);
            prcssBrst = 0;
            for(int j = 0; j < finalOutput[i].length; j++) {
                if(finalOutput[i][j].equalsIgnoreCase(reference))
                    prcssBrst += 1;
            }
            cpuBrst[i] = prcssBrst;
        }
        
        for(int i = 0; i < turnATime.length; i++)
            turnATime[i] = complTime[i] - arrvlTime[i];
        for(int i = 0; i < waitTime.length; i++)
            waitTime[i] = turnATime[i] - cpuBrst[i];
        for(int i = 0; i < turnATime.length; i++)
            sumTT += turnATime[i];
        averageTT = sumTT / divisor;
        for(int i = 0; i < waitTime.length; i++)
            sumWT += waitTime[i];
        averageWT = sumWT / divisor;
            
        for(int i = 0; i < waitTime.length; i++)
            System.out.println(turnATime[i] + "   " + waitTime[i]);
        System.out.println("\n" + averageTT + "   " + averageWT);
    }
}