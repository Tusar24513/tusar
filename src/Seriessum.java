public class Seriessum {
    private int result;
    public Seriessum(){
        result = 0;
    }
    public int Seriessum(int Highestnumber){
        for (int loopcount = 1; loopcount<= Highestnumber; loopcount++){
            result = result + loopcount;
        }
        return result;
    }
}
