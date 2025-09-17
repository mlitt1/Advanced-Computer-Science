public class Student {
    // instance variables
    public int grade;
    public String name, id;
    // constructors
    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
        this.id = generateId();
    }
    // getters
    public String getName(){
        return name;
    }
    public int getGrade(){
        return grade;
    }

    public String getId(){
        return generateId();
    }
    
    // setters
    public void setName(String name){
        this.name = name;
    }
    
    public void setId(String id){
        this.id = generateId();
    }

    public void setGrade(int grade){
        this.grade = grade;
    }

    // methods
    public String generateId() {
        return (Math.random() * 9) + (Math.random() * 9) + (Math.random() * 9) + "-" + (Math.random() * 9)+ (Math.random() * 9) + (Math.random() * 9) + (Math.random() * 9);
    }

    public String toString(int grade, String name, String id){
        return name + " is a" + grade + "th grade student. Their id is " + id;
    }
    

}