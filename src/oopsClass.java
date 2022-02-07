class Construct{
    void Construct(){
        System.out.println("constructor without arguments!!!");
    }
    void Construct(int a){
        System.out.println("constructor with one argument: "+ a);
    }
}

class constructTwo extends Construct{
    void constructOne(){
        System.out.println("This is one of the constructor!!");
    }

    void constructerTwo(int a , int b){
        System.out.println("the sum of the givent two elemnt "+(a + b)+"!");
    }

    public void constructeTwo() {
        System.out.println("the element caramerat!!");
    }
}

public class oopsClass {
    public static void main(String[] args){
        Construct obj = new Construct();
        obj.Construct();
        obj.Construct(12);
        constructTwo objone = new constructTwo();
        int a =234;
        int b = 23;
        objone.constructeTwo();
        objone.constructeTwo();

        objone.constructOne();
    }
}
