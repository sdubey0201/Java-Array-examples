public class IndexesOfSubArraySum {
    public static int[] getIndexesOfSubArraySum(int [] array,int sum){
        int[] result = new int[2];
        int currentSum = 0;
        for (int i = 0; i < array.length; i++) {
            currentSum = array[i];
            if(currentSum==sum){
                result[0]=i+1;
                result[1]=result[0];
                return result;
            }
            for (int j = i+1; j <array.length ; j++) {
                currentSum = currentSum+array[j];
                if(currentSum==sum){
                    result[0]=i+1;
                    result[1]=j+1;
                    return result;
                }
                if (currentSum>sum){
                    break;
                }

            }

        }
        return result;
    }


}
