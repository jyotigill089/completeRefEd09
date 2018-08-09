class Box {

    double width;
    double height;
    double depth;

    Box(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }

    double volume() {
        return width * height * depth;
    }

}

public class Ch6_BoxDemo7 {

    public static void main(String args[]) {
        Box mybox1 = new Box(10, 20, 15);
        Box mybox2 = new Box(3, 6, 9);

        // vol is variable of main method
        double vol;

        // assigning the output of volume method (class Box) to
        // vol (variable of main method)
        vol = mybox1.volume();
        System.out.println("box2 vol: "+vol);

        vol = mybox2.volume();
        System.out.println("box2 vol: "+vol);

    }
}
