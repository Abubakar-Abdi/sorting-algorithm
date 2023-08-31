import java.util.Arrays;

public class insersion {
    public static void main(String[] args) {
int []arr={5,2,6,7,1};
insersionsort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void insersionsort(int []arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                int s=j-1;
                if(arr[j]<arr[s]){

                    int temp=arr[j];
                   arr[j] =arr[s];
                    arr[s]=temp;
                }
                else{
                    break;

                }
            }
        }
    }
}
