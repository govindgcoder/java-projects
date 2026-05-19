import java.util.*;

class Student {
    private int id;
    private String name;
    private String color;
    Student() {
        System.out.println("Student created successfully");
    }
    Student(int id, String name){
        this();
        this.id = id;
        this.name  = name;
    }
    public void inputValue(int id, String name){
        this.id = id;
        this.name = name;
        System.out.println("Value inserted! - "+ String.valueOf(id));
    }
    public void inputColor(String color){
        this.color = color;
        System.out.println("Color: "+color+" added successfully!");
    }
    public String getName() {return this.name;}
    public int getId() {return this.id;}
    public String getColor(){return this.color;}
}

public class Uni {
    public static void main(String args[]){
        Student student = new Student();
        Scanner sc = new Scanner(System.in);
        System.out.println("Input values to take average of in comma seperated way: (11,22,31)");
        String input = sc.nextLine();
        int val = 0; int n = 0;
        StringTokenizer st = new StringTokenizer(input);
        while(st.hasMoreTokens()){
            val += Integer.parseInt(st.nextToken());
            n++;
        }
        val = (int) val/n;
        student.inputValue(val, "student-1");
    }
}
