package OOPS;

public class Test {

    public void m1(StringBuffer a){
        System.out.println("String buffer method");
    }
    public void m1(String a){
        System.out.println("String method");
    }

    public void m2(int... a){
        System.out.println("var arg method");
    }
    public void m2(int a){
        System.out.println("int method");
    }
    public static void main (String [] args){
        Test t = new Test();
        t.m2(10,20);

    }
}
