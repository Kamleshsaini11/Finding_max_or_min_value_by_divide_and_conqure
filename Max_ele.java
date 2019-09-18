// implementation of maxmum element in array by divide and conqure 
import java.util.*;
import java.lang.String;
class Max_ele
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        int n;
        n=scan.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
           arr[i]=scan.nextInt();
        Max_ele obj=new Max_ele();
        int a=obj.min(arr,0,n-1);
        System.out.println("Minimum element in array is "+a);
    }
    public int min(int arr[],int low,int high)
    {
        if (low<high)
        {
            int m=(low+high)/2;
            int a=min(arr,low,m);
            int b=min(arr,m+1,high);
            return a>b?a:b;   // for finding minimum change it by a>b?b:a 
        }
        else
            return arr[low]; 
    }
}