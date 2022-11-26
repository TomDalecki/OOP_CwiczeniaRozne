package Exercise3;

import java.util.Arrays;

public class RemoveDoubleValues extends MySortingMethod{
    public RemoveDoubleValues(double[] arrayToSort) {
        super(arrayToSort);
        removeDoubleValues(getResultArray());
    }

    public void removeDoubleValues(double[] resultArray){
        int index = 1;
        for (int i = 1; i < resultArray.length; i++) {
            if (resultArray[i] != resultArray[i-1]){
                index++;
            }
        }

        double[] noDuplicateEntriesArray = new double[index];
        noDuplicateEntriesArray[0] = resultArray[0];

        index = 1;
        for (int i = 1; i < resultArray.length; i++) {
            if (resultArray[i] != resultArray[i-1]){
                noDuplicateEntriesArray[index] = resultArray[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(noDuplicateEntriesArray));

    }

}
