class Ch7_Box {

//  variables or properties of class
    double width;
    double height;
    double depth;

// constructor without input or parameters and its variables
    Ch7_Box(){
        width = -1.0;
        height = -1.0;
        depth = -1.0;
    }

//  constructor with three parameters
    Ch7_Box(double w, double h, double d){
        width = w;
        height = h;
        depth =d;
    }

//  constructor with one parameter
    Ch7_Box(double len){
        width = height = depth = len;
    }

//  function of class to calculate the volume
    double volume(){
        return width * height * depth;
    }
}

public class Ch7_OverloadCons {
    public static void main(String args[]){
//      Initiation of objects of call Ch7_Box
        Ch7_Box myBox1 = new Ch7_Box();
        Ch7_Box myBox2 = new Ch7_Box(10, 20, 30);
        Ch7_Box myBox3 = new Ch7_Box(32.5);

        System.out.println("myBox1 vol = " + myBox1.volume());
        System.out.println("myBox2 vol = " + myBox2.volume());
        System.out.println("myBox3 vol = " + myBox3.volume());
    }
}

