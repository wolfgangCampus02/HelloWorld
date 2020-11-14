package at.main;

import at.Mainenum.DistanceEnum;
import at.operation.ArithmeticOperation;

public class MainOperation {

    public static void main(String[] args) {

        ArithmeticOperation operation = new ArithmeticOperation()
                .setA(13)
                .setB(9);
        operation.printValuesForOperations();

        new ArithmeticOperation()
                .setA(20)
                .setB(-60)
                .printValuesForOperations();

        new ArithmeticOperation().outputDistanceTo(DistanceEnum.KM, 12);
        new ArithmeticOperation().outputDistanceTo(DistanceEnum.LANDMILE,15);

    }
}
