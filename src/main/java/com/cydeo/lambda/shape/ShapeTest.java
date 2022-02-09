package com.cydeo.lambda.shape;

public class ShapeTest {
    public static void main(String[] args) {

        // -> represent lambda expr

        // no return type no param
        Drawable drawable = () -> System.out.println("Drawing a circle");
        drawable.draw();

        //One Parameter,No Return Type
        Drawable2 drawable2 = shape -> System.out.println("Drawing a " + shape);
        drawable2.draw("Triangle");

        //Multiple Parameter,No Return Type
        Drawable3 drawable3 = (shape,name) -> System.out.println(name  + " is drawing a " + shape);
        drawable3.draw("Circle","Mike");

        //Multiple Parameters,Return Type
        Drawable4 drawable4 = (shape, area) -> "Drawing a " + shape + " and it's area is " + area;
        System.out.println(drawable4.draw("Circle",200));

        Drawable3 drawable31 = (shape,name) ->{
            System.out.println("What kind of shape is this? :" + shape);
            System.out.println("Who is drawing this shape? :" + name);
        };
        drawable31.draw("Triangle","Mike");







    }
}
