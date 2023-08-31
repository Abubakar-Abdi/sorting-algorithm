import java.util.Arrays;

public class selectionsort {
    public static void main(String[] args) {
        int []arr={5,4,3,2,-1,-3};
        selction(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selction(int[]arr){
        //int max=arr[0];
       //int last=0;
        for(int i =0;i<arr.length;i++){
int last=arr.length-i-1;
int max=maxindex(arr,0,last);
swapp(arr,max,last);
        }}
static int maxindex(int []arr, int start, int end){
        int max=start;
        for(int i=start;i<=end;i++){
            if(arr[max]<arr[i]){
                max=i;}}
        return max;}
static void swapp(int[]arr, int first, int second){
int temp=arr[first];
arr[first]=arr[second];
arr[second]=temp;}}
