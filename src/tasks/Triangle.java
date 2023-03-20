package tasks;

public class Triangle {

    //Field
    private double side1;
    private double side2;
    private double side3;

    //Setter method
    public void setSide1(double side1) { this.side1 = side1; }
    public void setSide2(double side2) { this.side2 = side2; }
    public void setSide3(double side3) { this.side3 = side3; }

    //Getter method
    //a- side1, b- side2, c- side3
    public double getSide1(){ return side1; }

    public double getSide2() {return side2; }

    public double getSide3() {return side3; }

    public void triangleSide1(double side1) {
        if (side1 + side2 > side3) {
            System.out.println("Value of side 1 is: " + side1);
        } else {
            System.out.println("");
        }

    }
    //Validation method
    private boolean isValid(double side1, double side2, double side3){
        if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 >side1){
            return true;
        }else {
            return false;
        }
    }

    //Calculate are
    public double areaTriangle(){
        double area = 0;
        if (isValid(side1, side2, side3)){
            double halfPerHour = (side1 + side2 + side3) / 2;
            area = Math.sqrt(halfPerHour * (halfPerHour - side1) * (halfPerHour - side2) * (halfPerHour - side3));
        }else {
            System.out.println("Triangle is not valid");
        }
        return  area;
    }

}

