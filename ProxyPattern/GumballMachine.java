public class GumballMachine {

    String location;
    int count;

    public GumballMachine(String location, int count) {
        this.location=location;
        this.count=count;
    }

    public String getLocation(){
        return location;
    }

    public Integer getCount(){
        return count;
    }

    public String getState(){
        return "waiting for quarter";
    }
}