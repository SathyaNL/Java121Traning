 class Student {
    String Name;
    int Age;
        public void studentInfo(){
        System.out.println(this.Name);
        System.out.println(this.Age);
    }
}

public class Test{
    public static void main(String args[]){

        Student s1 = new Student();
        s1.Name = "nls";
        s1.Age  = 21;
        s1.studentInfo();
    }
}
