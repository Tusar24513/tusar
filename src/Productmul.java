public class Productmul {
    private int result;
    public Productmul(){
        result = 1;
    }
    public int Productsum(int Highestnumber){
        for (int loopcount = 1; loopcount<= Highestnumber; loopcount++){
            result = result * loopcount;
        }
        return result;
    }

}
