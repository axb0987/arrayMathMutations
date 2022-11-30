enum COMPARE {
    GREATER,
    EQUAL,
    LOWER,

    ERROR
}

public class arrayMath {
    public static void main(String[] args) {
        int[] arr = {-1, -5, -7, 0, -3, 4, -2, 1, -2};
        int target = 12;
        System.out.printf("Smallest num in arr = %d\n", smallestPositiveNum(arr));
    }

    static int linearSearch(int[] arr, int target, int start, int end) {
        if (arr.length < 1) {
            return -1;
        }
        for (int index = start; index < end; index++) {
            if (arr[index] == target) {
                return index;
            }
        }
        return -1;
    }

    static int linearSearch_BoundMutLength(int[] arr, int target, int start, int end) {
        if (arr.length <= 1) {
            return -1;
        }
        for (int index = start; index < end; index++) {
            if (arr[index] == target) {
                return index;
            }
        }
        return -1;
    }
    static int linearSearch_invertNegReturn(int[] arr, int target, int start, int end) {
        if (arr.length < 1) {
            return 1;
        }
        for (int index = start; index < end; index++) {
            if (arr[index] == target) {
                return index;
            }
        }
        return -1;
    }
    static int linearSearch_BoundMutEnd(int[] arr, int target, int start, int end) {
        if (arr.length < 1) {
            return -1;
        }
        for (int index = start; index <= end; index++) {
            if (arr[index] == target) {
                return index;
            }
        }
        return -1;
    }
    static int linearSearch_NegCondTarget(int[] arr, int target, int start, int end) {
        if (arr.length < 1) {
            return -1;
        }
        for (int index = start; index < end; index++) {
            if (arr[index] != target) {
                return index;
            }
        }
        return -1;
    }

    static int linearSearch_invertNegTargetReturn(int[] arr, int target, int start, int end) {
        if (arr.length < 1) {
            return -1;
        }
        for (int index = start; index < end; index++) {
            if (arr[index] == target) {
                return -index;
            }
        }
        return -1;
    }
    static int max(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int element : arr) {
            if (element > max) {
                max = element;
            }
        }
        return max;
    }
    static int max_InvertNegMin(int[] arr) {
        int max = Integer.MAX_VALUE;
        for (int element : arr) {
            if (element > max) {
                max = element;
            }
        }
        return max;
    }
    static int max_RORComparison(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int element : arr) {
            if (element < max) {
                max = element;
            }
        }
        return max;
    }
    static int max_InvertNegElement(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int element : arr) {
            if (element > max) {
                max = -element;
            }
        }
        return max;
    }
    static int maxIndex(int[] arr) {
        if (arr.length == 0) {
            return -1;
        }

        int maxIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    static int min(int[] arr) {
        if (arr.length == 0) {
            return Integer.MAX_VALUE;
        }
        int min = arr[0];
        for (int element : arr) {
            if (element < min) {
                min = element;
            }
        }
        return min;
    }

    static int minIndex(int[] arr) {
        if (arr.length == 0) {
            return -1;
        }

        int minIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    static int mode(int[] arr) {
        int score[] = new int[arr.length];

        for (int compare = 0; compare < arr.length; compare++) {
            score[compare] = 1;
            for (int j = compare + 1; j < arr.length; j++) {
                if (arr[compare] == arr[j]) {
                    score[compare]++;
                }
            }
        }
        return arr[maxIndex(score)];
    }
    static double averageVal(int[] arr) {
        double Sum = 0;
        for (int element : arr) {
            Sum += element;
        }
        return (Sum / arr.length);
    }
    static double averageVal_InvertNegSum(int[] arr) {
        double Sum = 0;
        for (int element : arr) {
            Sum -= element;
        }
        return (Sum / arr.length);
    }
    static double averageVal_InvertNegTotalSum(int[] arr) {
        double Sum = 0;
        for (int element : arr) {
            Sum += element;
        }
        return (-Sum / arr.length);
    }
    static double medianVal(int[] arr) {
        double med = Math.floor(arr.length / 2);
        if (arr.length % 2 == 0) {
            double med2 = med + 1;
            return ((arr[(int) med] + arr[(int) med2]) / 2);
        }
        return arr[(int) med];
    }
    static double medianVal_NegateMod(int[] arr) {
        double med = Math.floor(arr.length / 2);
        if (arr.length % 2 != 0) {
            double med2 = med + 1;
            return ((arr[(int) med] + arr[(int) med2]) / 2);
        }
        return arr[(int) med];
    }
    static double medianVal_NegateMed2(int[] arr) {
        double med = Math.floor(arr.length / 2);
        if (arr.length % 2 == 0) {
            double med2 = med - 1;
            return ((arr[(int) med] + arr[(int) med2]) / 2);
        }
        return arr[(int) med];
    }
    static int linearSearch_TrueLength(int[] arr, int target, int start, int end) {
        if (true) {
            return -1;
        }
        for (int index = start; index < end; index++) {
            if (arr[index] == target) {
                return index;
            }
        }
        return -1;
    }
    static int linearSearch_SearchIndexTrue(int[] arr, int target, int start, int end) {
        if (arr.length < 1) {
            return -1;
        }
        for (int index = start; index < end; index++) {
            if (true) {
                return index;
            }
        }
        return -1;
    }
    static int max_TrueConditional(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int element : arr) {
            if (true) {
                max = element;
            }
        }
        return max;
    }

    static COMPARE compareAVG(int target, int[] arr) {
        double funct = averageVal(arr);
        if (target > funct)
            return COMPARE.GREATER;
        if (target == funct)
            return COMPARE.EQUAL;
        if (target < funct)
            return COMPARE.LOWER;

        return COMPARE.ERROR;
    }
    static COMPARE compareAVG_NegCondGreater(int target, int[] arr) {
        double funct = averageVal(arr);
        if (target <= funct)
            return COMPARE.GREATER;
        if (target == funct)
            return COMPARE.EQUAL;
        if (target < funct)
            return COMPARE.LOWER;

        return COMPARE.ERROR;
    }
    static COMPARE compareAVG_TrueGreater(int target, int[] arr) {
        double funct = averageVal(arr);
        if (true)
            return COMPARE.GREATER;
        if (target == funct)
            return COMPARE.EQUAL;
        if (target < funct)
            return COMPARE.LOWER;

        return COMPARE.ERROR;
    }
    static COMPARE compareAVG_CondBoundGreater(int target, int[] arr) {
        double funct = averageVal(arr);
        if (target >= funct)
            return COMPARE.GREATER;
        if (target == funct)
            return COMPARE.EQUAL;
        if (target < funct)
            return COMPARE.LOWER;

        return COMPARE.ERROR;
    }
    static COMPARE compareAVG_NVMCFunct(int target, int[] arr) {
        double funct = 0;
        if (target > funct)
            return COMPARE.GREATER;
        if (target == funct)
            return COMPARE.EQUAL;
        if (target < funct)
            return COMPARE.LOWER;

        return COMPARE.ERROR;
    }
    static COMPARE compareAVG_InlineTargetZero(int target, int[] arr) {
        target = 0;
        double funct = averageVal(arr);
        if (target > funct)
            return COMPARE.GREATER;
        if (target == funct)
            return COMPARE.EQUAL;
        if (target < funct)
            return COMPARE.LOWER;

        return COMPARE.ERROR;
    }

    static COMPARE compareMOD(int target, int[] arr) {

        double funct = mode(arr);
        if (target > funct)
            return COMPARE.GREATER;
        if (target == funct)
            return COMPARE.EQUAL;
        if (target < funct)
            return COMPARE.LOWER;

        return COMPARE.ERROR;
    }

    static COMPARE compareMED(int target, int[] arr) {

        double funct = medianVal(arr);
        if (target > funct)
            return COMPARE.GREATER;
        if (target == funct)
            return COMPARE.EQUAL;
        if (target < funct)
            return COMPARE.LOWER;

        return COMPARE.ERROR;
    }

    static COMPARE compareMinToMax(int[] arr) {

        int min = min(arr);
        int max = max(arr);

        if (min > max)
            return COMPARE.GREATER;
        else if (min == max)
            return COMPARE.EQUAL;
        else if (min < max)
            return COMPARE.LOWER;

        return COMPARE.ERROR;
    }

    static void linearSort(int[] arr) {
        int temp = 0;
        for (int sorter = 0; sorter < arr.length; sorter++) {
            for (int compare = sorter + 1; compare < arr.length; compare++) {
                if (arr[sorter] > arr[compare]) {
                    temp = arr[sorter];
                    arr[sorter] = arr[compare];
                    arr[compare] = temp;
                }
            }
        }
    }

    static void reverse(int[] arr){
        int end = arr.length -1 ;
        int temp = 0;
        for(int i = 0; i < Math.ceil(arr.length/2); i++) {
            temp = arr[i];
            arr[i] = arr[end];
            arr[end] = temp;
            end--;
        }
    }

    static void distance(int[] dist, int target) {
        for(int i = 0; i < dist.length; i++) {
            dist[i] = dist[i] - target;
        }
    }

    static void printer(int[] arr, String text) {
        System.out.printf("%s:\n[", text);
        for (int i = 0; i < arr.length; i++) {
            System.out.printf(" %d ", arr[i]);
        }
        System.out.println("]\n");
    }

    static int smallestPositiveNum(int arr[]){
        if(arr.length < 1){
            return -1;
        }
        int returnNumber = -1;

        for(int i = 0; i < arr.length; i++){
            //if uninitialized still, set first positive number as returnNumber
            if(returnNumber == -1 && arr[i] > 0){
                returnNumber = arr[i];
            }
            else if(arr[i] < returnNumber && arr[i] > 0){ //if we find a smaller number, set it as the number
                returnNumber = arr[i];
            }
        }
        return returnNumber;
    }
}




