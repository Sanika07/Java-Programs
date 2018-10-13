package SortPackage;

import java.util.Arrays;


public class CountingSortNew {
    
      public static int[] Sort(int[] a){
    int[] b = new int[a.length];

    int min = a[0];
    int max = a[0];
    for (int i = 1; i < a.length; i++) {
      if (a[i] < min) {
        min = a[i];
      } else if (a[i] > max) {
        max = a[i];
      }
    }
    int[] c = new int[max-min+1];
    for(int i=min; i<=max; i++)
       c[i]=0;

    for(int i=0; i<a.length; i++)
        c[a[i]-min]++;

    for(int i=min+1; i<=max; i++)
        c[i] = c[i] + c[i-1];

    for(int i=a.length-1; i>=0; i--){
      b[c[a[i]]-1] = a[i];
      --c[a[i]];
    }
return b;
  }

  public static void main(String[] args) {

    int[] unsorted = {5,3,0,2,4,1,0,5,2,3,1,4};
   System.out.println("Before Count Sorting: " + Arrays.toString(unsorted));

   int[] sorted = Sort(unsorted);
   System.out.println("After Count Sorting:  " + Arrays.toString(sorted));


  }
    
    
    
}
