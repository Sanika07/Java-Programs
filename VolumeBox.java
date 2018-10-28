
package BasicJavaPrograms;


public class VolumeBox {
    
    int v, s;
    VolumeBox(int w, int h, int d){
        
        v=w*h*d;
        s=2*(w*h+h*d+d*w);
        System.out.println("volume : "+v);
        System.out.println("Surface Area : "+s);
    }
   public static void main(String args[]){
       
       VolumeBox p = new VolumeBox(3,4,2);
   }
}
