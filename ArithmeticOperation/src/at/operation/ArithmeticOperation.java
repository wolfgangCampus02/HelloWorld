package at.operation;

import at.Mainenum.DistanceEnum;

public class ArithmeticOperation {
    private int a;
    private int b;

    private static final double _landMileFactor = 0.6214; // 1km = ~~,6214 miles

    public ArithmeticOperation setA(int a) {
       this.a = a;
       return this;
    }

    public ArithmeticOperation setB(int b) {
        this.b = b;
        return this;
    }

    private void outPutForOperator(String operator, int result)
    {
        System.out.println(a + operator + b + " = " + result);

    }

    public void printValuesForOperations(){
        outPutForOperator( "+", (a + b));
        outPutForOperator( "-", (a - b));
        outPutForOperator( "*", (a * b));
        outPutForOperator( "%", (a % b));
        if (b != 0) {
            outPutForOperator( "/", (a / b));
        }
        else
        {
            System.out.println("division not allowed, b equals 0");
        }
    }

    public void outputDistanceTo(DistanceEnum type, double distnace){
        switch (type) {
            case KM:
                landmile2kmOutput(distnace);
                break;
            case LANDMILE:
                km2landmileOutput(distnace);
                break;
        }


    }
    private void landmile2kmOutput(double landMile){
        System.out.println(landMile + " Landmeilen sind " + landmile2km(landMile) + "km");
    }
    private void km2landmileOutput(double km){
        System.out.println(km + " km sind " + km2Landmile(km) + " Landmeilen");
    }
    private double km2Landmile(double km){
        return km * _landMileFactor;
    }

    private double landmile2km(double landMile){
        return landMile/_landMileFactor;
    }

    public boolean compareStrings(String s1, String s2){
        return s1.equals(s2);
    }
}
