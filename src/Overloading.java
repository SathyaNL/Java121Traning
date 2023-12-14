class load1{
    String name;
    int age;
    public void printInfo(){
        System.out.println("Start");
    }
    public void printInfo(String name){
        System.out.println(name);
    }
    public void printInfo(int age){
        System.out.println(age);
    }
}
public class Overloading {
    public static void main(String args[]){
        load1 ol = new load1();
        ol.printInfo(33);
    }
}
