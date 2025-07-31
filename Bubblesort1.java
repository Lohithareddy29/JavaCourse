public class Bubblesort1 {
    public static void main(String[] args) {
        int[] arr={9,3,5,1,2,7,8};
        Bubblesortmethod(arr);
        for(int nums:arr) {
            System.out.print(nums+" ");
        }
        System.out.println("second largest:");
        int ans=findSecondlargestele(arr);
        if(ans!=-1){
        System.out.println(ans);
        }
        }
                
        // n*n

    public static void Bubblesortmethod(int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
             if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
             }
            }
        }
    }
    public static int findSecondlargestele(int[] arr){
        int secondlar=0;
        int n=arr.length;
       int  frstlar=arr[n-1];
        for(int i=n-2;i>=0;i--){
            if(arr[i]!=frstlar){
                return arr[i];
            }
        }
        return -1;
    }


}
