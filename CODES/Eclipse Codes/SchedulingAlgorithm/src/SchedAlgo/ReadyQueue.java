package SchedAlgo;

public class ReadyQueue {
    String processName;
    int processPriority, processBurst;
    ReadyQueue link;
    ReadyQueue () {
        this.processName = "";
        this.processPriority = 0;
        this.processBurst = 0;
        this.link = null;
    }
    ReadyQueue (String processName, int processPriority, int processBurst, ReadyQueue myLink) {
        this.processName = processName;
        this.processPriority = processPriority;
        this.processBurst = processBurst;
        this.link = myLink;
    }
}