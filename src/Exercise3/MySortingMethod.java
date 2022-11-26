package Exercise3;

import java.util.Arrays;

public class MySortingMethod {
    private double minValue;
    private double maxValue;
    private int numberOfAppearance;
    private int index = 0;
    private double[] resultArray;

    public double[] getResultArray() {
        return resultArray;
    }

    public MySortingMethod(double[] arrayToSort){
        int index = arrayToSort.length;
        resultArrayCreation(index);
        minValueFinder(arrayToSort);
        maxValueFinder(arrayToSort);
        nextMinValueFinder(arrayToSort);

        System.out.println(Arrays.toString(arrayToSort));
        System.out.println(Arrays.toString(resultArray));
    }


    public void minValueFinder(double[] arrayToSort) {
        minValue = arrayToSort[0];
        for (int i = 1; i < arrayToSort.length; i++) {
            if (minValue > arrayToSort[i]) {
                minValue = arrayToSort[i];
            }
        }
        System.out.println("minValue: " + minValue);
        numberOfAppearance(arrayToSort, minValue);
        resultArrayElementsAdding(minValue, numberOfAppearance);
    }

    public void maxValueFinder(double[] arrayToSort) {
        maxValue = arrayToSort[0];
        for (int i = 1; i < arrayToSort.length; i++) {
            if (maxValue < arrayToSort[i]) {
                maxValue = arrayToSort[i];
            }
        }
        System.out.println("maxValue: " + maxValue);
    }

    public void numberOfAppearance(double[] arrayToSort, double minValue) {
        numberOfAppearance = 0;
        for (int i = 0; i < arrayToSort.length; i++) {
            if (minValue == arrayToSort[i]) {
                numberOfAppearance++;
            }
        }
    }

    public void nextMinValueFinder(double[] arrayToSort) {
        while (minValue < maxValue) {
            double oldMinValue = minValue;

            for (int i = 0; i < arrayToSort.length; i++) {
                if(arrayToSort[i]>oldMinValue) {
                    minValue = arrayToSort[i];

                    for (int j = 0; j < arrayToSort.length; j++) {
                        if (arrayToSort[j] < minValue && arrayToSort[j] > oldMinValue) {
                            minValue = arrayToSort[j];}
                    }

                    //System.out.println("nextMinValue: " + minValue);
                    numberOfAppearance(arrayToSort, minValue);
                    resultArrayElementsAdding(minValue, numberOfAppearance);
                    oldMinValue = minValue;
                }
            }
        }
    }

    public void resultArrayCreation(int arrayLength){
        resultArray = new double [arrayLength];
    }

    public void resultArrayElementsAdding(double minValue, int noAppearance) {

        for (int i = 0; i < noAppearance; i++) {
            resultArray[index] = minValue;
            index++;
        }
    }
}





