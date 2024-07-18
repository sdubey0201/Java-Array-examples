public class CountTheTriplets {

    public static int countTheTriples(int [] array,int size){
        int result = 0;
        int [] tempArray = new int[100];
        for (int i = 0; i <size; i++) {
            tempArray[array[i]]++;
        }
        for (int i = 0;i<size;i++){
            for(int j=i+1;j<size;j++){
                int sum = array[i]+array[j];
                if(tempArray[sum]>0){
                    result++;
                }
            }
        }
        return result;


    }

    public static int countTriple1(int [] array,int size){
        int resutl = 0;
        for (int i =0;i<size;i++){
            for(int j = i+1;j<size;j++){
                for(int k = j+1;k<size;k++){
                    if (array[i]+array[j]==array[k]){
                        resutl++;
                    }
                    if (array[j]+array[k]==array[i]){
                        resutl++;
                    }
                    if (array[i]+array[k]==array[j]){
                        resutl++;
                    }
                }
            }
        }

        return resutl;

    }
}
