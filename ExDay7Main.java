import java.util.Arrays;
import java.util.Scanner;

public class ExDay7Main {
    public static void main(String[] args) {
        Scanner getFromUser = new Scanner(System.in);
        //Ex1
       /* System.out.println("Enter your First number : ");
        int Number1=getFromUser.nextInt();
        System.out.println("Enter your socande number : ");
        int Number2=getFromUser.nextInt();
        System.out.println("Enter your Oprations  :\n " +
            " 1.   ( + ) \n2. ( - ) \n3. ( / ) \n4.( * ) \n5. ( % )"   );
        int op=getFromUser.nextInt();
        if (op==1){
            System.out.println("the Total is :"+(Number1+Number2));
        } else if (op==2) {
            System.out.println("the Total is :"+ (Number1-Number2));
        } else if (op==3) {
            System.out.println("the Total is :"+(Number1*Number2));
        } else if (op==4) {
            System.out.println("the Total is :"+(Number1/Number2));
        }else if(op==5) {
            System.out.println("please chose the right opration");
        }
        System.out.println("--------------------------------");*/

        //Ex2
        /*MyTime TestMyTime=new MyTime(23,59,59);
        TestMyTime.nextSecond();
        TestMyTime.previousSecond();
        System.out.println(TestMyTime);
        System.out.println("--------------------------------");*/
        //Ex3
        Point2D point2D=new Point2D(3,5);
        System.out.println(point2D);
        System.out.println(point2D.getX());
        System.out.println(point2D.getY());
        float array[]= point2D.getXY();
        System.out.println(Arrays.toString(array));
        point2D.setXY(5,6);
        System.out.println(point2D);
        Point3D point3D= new Point3D(6,7,8);
        System.out.println("--------------------------------3d");
        System.out.println(point3D);
        System.out.println(point3D.getX());
        System.out.println(point3D.getY());
        System.out.println(point3D.getZ());
        float array2[]= point3D.getXYZ();
        System.out.println(Arrays.toString(array2));

        System.out.println("--------------------------------");
        //Ex5
        MyTriangle t1 = new MyTriangle(1,1,  3,5,  6,2);
        MyTriangle t2 = new MyTriangle(new Mypoint(1,1), new Mypoint(3,5), new Mypoint(6,2));

        System.out.println("Triangle "+ t1 +" is "+ t1.printType() +" and has perimeter "+t1.getPerimeter());
        System.out.println("Triangle "+ t2 +" is "+ t2.printType() +" and has perimeter "+t2.getPerimeter());
    }
}
