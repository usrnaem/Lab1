//抽象产品Shape
abstract class Shape{
    public abstract void draw();
    public abstract void erase();
}

//具体产品Circle
class Circle extends Shape{
    public void draw(){
        System.out.println("draw a Circle");
    }
    public void erase(){
        System.out.println("erase Circle");
    }
}

//具体产品Rectangle
class Rectangle extends Shape{
    public void draw(){
        System.out.println("draw a Rectangle");
    }
    public void erase(){
        System.out.println("erase Rectangle");
    }
}

//具体产品Triangle
class Triangle extends Shape{
    public void draw(){
        System.out.println("draw a Triangle");
    }
    public void erase(){
        System.out.println("erase Triangle");
    }
}

//工厂
class ShapeFactory
{
    public static Shape createShape(String s) throws UnsupportedShapeException{
        if(s.equals("a")){
            return new Circle();
        }
        else if(s.equals("b")){
            return new Rectangle();
        }
        else if(s.equals("c")){
            return new Triangle();
        }
        else {
            throw new UnsupportedShapeException("can't");
        }
    }
}

//自定义异常类
class UnsupportedShapeException extends Exception{
    private String message;

    public UnsupportedShapeException(String message){
        super(message);
        this.message=message;
    }
}

//客户端测试类
class lab1_1 {
    public static void main(String args[])
    {
        try
        {
            Shape shape;
            shape=ShapeFactory.createShape("a");
            shape.draw();
            shape.erase();
        }
        catch(UnsupportedShapeException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
