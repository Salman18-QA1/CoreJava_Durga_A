package OOPS;

public class Test2 {

    public void m1(Animal a){
        System.out.println("Animal ver");
    }

    public void m1(Monkey m){
        System.out.println("Monkey ver");
    }

    public static void main(String [] args){
        Test2 t = new Test2();
        Animal x = new Animal();
        Monkey y = new Monkey();
        Animal z = new Monkey();

        t.m1(x);
        t.m1(y);
        t.m1(z);
    }
}
