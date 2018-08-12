// Objects are passed through their references.

class Test_l8 {
    int a, b;

    Test_l8(int i, int j) {
        a = i;
        b = j;
    }

    // pass an object
    void meth(Test_l8 o) {
        o.a *=  2;
        o.b /= 2;
    }
}

class Ch7_PassObjRef {
    public static void main(String args[]) {
        Test_l8 ob = new Test_l8(15, 20);

        System.out.println("ob.a and ob.b before call: " +
                ob.a + " " + ob.b);

        ob.meth(ob);

        System.out.println("ob.a and ob.b after call: " +
                ob.a + " " + ob.b);
    }
}