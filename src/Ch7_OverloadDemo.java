class OverloadDemo{

    void test(){
        System.out.println("No Parameters");
    }

    void test(int a, int b){
        System.out.println("a = "+a+",& b = "+b);
    }

    void test(double a){
        System.out.println("Double a ="+a);
    }
}


public class Ch7_OverloadDemo {
    public static void main(String args[]){
        OverloadDemo ob = new OverloadDemo();

        int i = 88;

        ob.test();
        ob.test(10, 20);

        ob.test(i);
        ob.test(123.2);
    }
}
