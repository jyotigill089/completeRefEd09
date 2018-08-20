// Simple Types are passed by value.
class Test_l7 {
    void meth(int i, int j) {
        i *= 2;
        j /= 2;

        System.out.println("a and b in meth: " +
                i + " " + j);
    }
}

class Ch7_CallByValue {
    public static void main(String args[]) {
        Test_l7 ob = new Test_l7();
        int a = 15, b = 20;

        System.out.println("a and b before call: " +
                a + " " + b);

        ob.meth(a, b);

        System.out.println("a and b after call: " +
                a + " " + b);
    }
}