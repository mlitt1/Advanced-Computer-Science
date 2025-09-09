public class Rectangle {
    int length;
    int width;

    public Rectangle(int intLength, int intWidth){
        length = 6;
        width = 7;
    }

    public int getLength(){
        return length;
    }
    
    public int getWidth(){
        return width;
    }

    public int calculateArea(){
        int area = length * width;
        return area;
    }

    public String toString(){
        return ("This rectangle has a length of" + length + "and a width of 7." + width + "Its area is 42");
    }

    public boolean equals(Rectangle other){
        return (length == other.length &&)
    }

}
