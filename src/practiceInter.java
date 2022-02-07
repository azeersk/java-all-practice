public interface practiceInter {
    public void parentOne();
    public void parentTwo();
    public void parentThree();
    public void parentAll();
}

class PracticeImp implements practiceInter{
    public void parentOne(){
        System.out.println("This is parent Interface method One!!");
    }

    public void parentTwo(){
        System.out.println("this is parent interface method second!!");
    }

    public void parentThree(){
        System.out.println("This is parent Interface method!!");
    }
    public void parentAll() {
        System.out.println("This is print all method to print all parent methods!!");
    }

}

class Practice1 extends PracticeImp{
    public void practicalMethod(){
        System.out.println("Practice is done!!");
        System.out.println("above one must Executed!! ");
    }
}

class MainCls{
    public static void main(String[] args){

        PracticeImp objOne = new PracticeImp();
        objOne.parentOne();
        objOne.parentTwo();
        objOne.parentThree();
        objOne.parentAll();
    }
}
