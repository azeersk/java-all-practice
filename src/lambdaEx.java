import java.util.*;

class MainClassOne{
    public void oneMethod(){

        }
}
public interface lambdaEx {
    public String lambdaMethod();
}

interface withTwo{
    public int twoArgument(int a,int b);
}

interface callingMethod{
    public void callMethod();
}

class callReference{
    public static void methodOf(){
        System.out.println("Method reference is working!!");
    }
}
class MainClass{
    public static void threadStatus(){
        System.out.println("Thread is running...");
    }

    public static void main(String[] args) {
        lambdaEx d = () -> {
            return "This is lambdaExpression";
        };

        System.out.println(d.lambdaMethod()+"!!!");
        System.out.println();

        int aa = 20;
        int bb = 30;
        withTwo obj = (int a,int b)->{return (a+b);};
        System.out.print("Sum of the two arguments: ");
        System.out.println(obj.twoArgument(aa,bb));

        callingMethod call = callReference::methodOf;

        call.callMethod();

        Thread obj1 = new Thread(MainClass::threadStatus);
        obj1.start();

        List<Integer> Numbers = new ArrayList<>();
        for(int i=1; i<10; i++){
            Numbers.add(i*3);
        }

        Numbers.forEach(e->{System.out.print(e+ " ");});

        Map<String, Integer> student = new HashMap<>();

        student.put("RollNo", 12);
        student.put("id", 118055);
        student.put("age", 20);
        student.put("key", 1239);
        System.out.println();
        System.out.println();
        student.forEach((a,b)->{
            System.out.println(a+" "+b);
        });

        int a = 23;
        double b =214.45;

        Integer objA = Integer.valueOf(a);
        Double objB = Double.valueOf(b);
        System.out.println(objA);
        System.out.println(objB);
    }

}