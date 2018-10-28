
package BasicJavaPrograms;

public class ArmstrongNumber {
    
    int a, sum=0, num, r;
    
    void check(int b){
        
        a=b;
        for(int i=0; a!=0; i++){
            
            num = a%10;
            r = num*num*num;
            sum += r;
            a /= 10;
        }
        if(sum==b)
            System.out.println("It is an Armstrong number.");
        else
            System.out.println("Not an Armstrong number.");
    }
    
    public static void main(String args[]){
        
        new ArmstrongNumber().check(153);
    }
    
}
