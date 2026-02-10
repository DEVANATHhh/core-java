public class MainClass {

    public static void main(String[] args) {

       
        String ocean1Name = "Pacific";
        double ocean1Area = 165250000;
        double ocean1Depth = 4280;
        boolean ocean1Salty = true;
        int ocean1Species = 10000;

        String ocean2Name = "Atlantic";
        double ocean2Area = 106460000;
        double ocean2Depth = 3646;
        boolean ocean2Salty = true;
        int ocean2Species = 8000;

        String ocean3Name = "Indian";
        double ocean3Area = 70560000;
        double ocean3Depth = 3890;
        boolean ocean3Salty = true;
        int ocean3Species = 7000;

        Ocean.oceanInfo(ocean1Name, ocean1Area, ocean1Depth, ocean1Salty, ocean1Species);
        Ocean.oceanInfo(ocean2Name, ocean2Area, ocean2Depth, ocean2Salty, ocean2Species);
        Ocean.oceanInfo(ocean3Name, ocean3Area, ocean3Depth, ocean3Salty, ocean3Species);

       
        String wf1Name = "Jog Falls", wf1Loc = "Karnataka";
        double wf1Height = 253; boolean wf1Tourist = true;

        String wf2Name = "Niagara", wf2Loc = "USA";
        double wf2Height = 51; boolean wf2Tourist = true;

        String wf3Name = "Angel Falls", wf3Loc = "Venezuela";
        double wf3Height = 979; boolean wf3Tourist = true;

        String wf4Name = "Victoria Falls", wf4Loc = "Zambia";
        double wf4Height = 108; boolean wf4Tourist = true;

        String wf5Name = "Dudhsagar", wf5Loc = "Goa";
        double wf5Height = 310; boolean wf5Tourist = true;

     
        WaterFall.info(wf1Name, wf1Loc, wf1Height, wf1Tourist);
        WaterFall.info(wf2Name, wf2Loc, wf2Height, wf2Tourist);
        WaterFall.info(wf3Name, wf3Loc, wf3Height, wf3Tourist);
        WaterFall.info(wf4Name, wf4Loc, wf4Height, wf4Tourist);
        WaterFall.info(wf5Name, wf5Loc, wf5Height, wf5Tourist);

    
        String st1 = "Karnataka", ct1 = "India", rv1 = "Sharavathi"; int yr1 = 2000; boolean prot1 = true;
        String st2 = "New York", ct2 = "USA", rv2 = "Niagara"; int yr2 = 1885; boolean prot2 = true;
        String st3 = "Bolivar", ct3 = "Venezuela", rv3 = "Churun"; int yr3 = 1937; boolean prot3 = true;
        String st4 = "Livingstone", ct4 = "Zambia", rv4 = "Zambezi"; int yr4 = 1905; boolean prot4 = true;
        String st5 = "Goa", ct5 = "India", rv5 = "Mandovi"; int yr5 = 1999; boolean prot5 = true;

       
        WaterFall.stateOwningInfo(st1, ct1, rv1, yr1, prot1);
        WaterFall.stateOwningInfo(st2, ct2, rv2, yr2, prot2);
        WaterFall.stateOwningInfo(st3, ct3, rv3, yr3, prot3);
        WaterFall.stateOwningInfo(st4, ct4, rv4, yr4, prot4);
        WaterFall.stateOwningInfo(st5, ct5, rv5, yr5, prot5);

       
        String m1Name = "Everest", m1Loc = "Nepal"; double m1Height = 8848.86;
        String m2Name = "K2", m2Loc = "Pakistan"; double m2Height = 8611;

        String trek1Diff = "Hard"; int trek1Days = 15; boolean trek1Guide = true;
        String trek2Diff = "Moderate"; int trek2Days = 10; boolean trek2Guide = false;

       
        Mountain.mountainInfo(m1Name, m1Height, m1Loc);
        Mountain.mountainInfo(m2Name, m2Height, m2Loc);

        Mountain.trekkingInfo(trek1Diff, trek1Days, trek1Guide);
        Mountain.trekkingInfo(trek2Diff, trek2Days, trek2Guide);
    }
}
