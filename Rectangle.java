
package BasicJavaPrograms;

public class Rectangle extends Shape {
    
    int l=10, b=20;

    @Override
    void showxyvalue(){
        System.out.println(" The length of the rectangle is "+l+" and breadth is "+b);
        
    }
    public static void main(String args[]){
        
        Rectangle p = new Rectangle();
        p.getxyvalue(80, 70);
        p.showxyvalue();
    }   
}

