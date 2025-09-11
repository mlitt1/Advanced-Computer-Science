public class Rectangle {
    int length;
    int width;

    public Rectangle(){
        length = 6;
        width = 7;
    }

    public int getLength(){
        return length;
    }
    
    public int getWidth(){
        return width;
    }

    public 

    public int calculateArea(){
        return length * width;
    }

    public int calculatePerimeter(){
        return ((2 * length) + (2 * width));
    }

    public double calculateDiagonal(){
        return Math.sqrt((length * length) + (width * width));
    }

    public String toString(){
        return ("This rectangle has a length of" + length + "and a width of 7." + width + "Its area is 42");
    }

    public boolean equals(Rectangle other){
        return (length == other.length && width == other.width);
    }

}
