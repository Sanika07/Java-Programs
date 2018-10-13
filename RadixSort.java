package SortPackage;


import SortPackage.CountingSortNew;
import static SortPackage.CountingSortNew.Sort;
import java.util.Arrays;


public class RadixSort {
   
    public static int[] RSort(int[] a){
  int[] b = new int[a.length];
  int[] arr = new int[a.length];
  int m = a[0], i;
  for(i=1; i<a.length; i++)
  {
    if(a[i]>m)
    m = a[i];
  }
  for(i=0; i<a.length; i++){
  for(int exp=1; m/exp>0; exp*=10){
     int tmp = (a[i]/exp)%10;
       arr[i] = tmp;
     b = Sort(arr);
  } }
  return b;
}

public static void main(String[] args) {
  CountingSortNew p = new CountingSortNew();
  int[] unsorted = {5,3,0,2,4,1,0,5,2,3,1,4};
 System.out.println("Before Radix Sorting: " + Arrays.toString(unsorted));

 int[] sorted = RSort(unsorted);
 System.out.println("After Radix Sorting:  " + Arrays.toString(sorted));

}
    
    
    
    
}
