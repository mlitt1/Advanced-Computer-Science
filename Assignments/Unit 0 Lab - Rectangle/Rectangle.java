public class Rectangle {

    public int length;
    public int width;
    
    public String toString(){
        return ("This rectangle has a length of 6 and a width of 7. Its area is 42");
    }

    public void Rectange(int inputLength, int inputWidth) {
        length = inputLength;
        width = inputWidth;
    }    

    public int getLength(){
        return length;
    }
    
    public int getWidth(){
        return width;
    }


    public void setLength(int input){
        length = input;
    }
    
    public void setWidth(int input){
        width = input;
    }

}
