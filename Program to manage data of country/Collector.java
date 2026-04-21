public class Collector {

    String name;
    int batchNo;

    public Collector(String name, int batchNo) {
        this.name = name;
        this.batchNo = batchNo;
    }

    public void collectorInfo(){
        System.out.println("collector name :"+name);
        System.out.println("Batch number : "+batchNo);
    }
}
