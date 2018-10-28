
package BasicJavaPrograms;

public class Triangle extends dimension{
    
    double t;
    void area(int b, int h){
        t=0.5*b*h;
    }
    void display(){
        System.out.println("Area of Triangle :"+t+" units");
    }
    public static void main(String args[]){
        Rect r = new Rect();
        r.area(30, 40);
        r.display();
        Triangle p = new Triangle();
        p.area(10, 2);
        p.display();
    }
    
}
