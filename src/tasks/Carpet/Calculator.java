package tasks.Carpet;

public class Calculator {
    //Floor, carpet is a string and we can use it then other class's are created
    private Floor floor;
    private Carpet carpet;

    /*(Floor floor, Carpet carpet) - are inputs as object. But the logic is that we have 2 other classes which we will use it
    as inputs
    */
    public  Calculator(Floor floor, Carpet carpet){
        this.floor = floor;
        this.carpet = carpet;
    }
    //Idea to know the cost of the carpet
    public double getTotalCost(){
        return floor.getArea() * carpet.getCost();
    }

}
