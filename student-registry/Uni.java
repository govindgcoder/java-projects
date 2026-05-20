import java.util.*;
import java.lang.Math;

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

class PerfArea {
    public static double area(double radius){
        return Math.PI*radius*radius;
    }
    public static int area(int l, int b){
        return l*b;
    }

    public static int[][] matmmul(int a[][], int b[][]){
        int[][] res = new int[3][3];

        for(int i=0;i<3;i++){
        	for(int j=0;j<3;j++){
        		int sum=0;
        		for(int k=0;k<3;k++){
        			sum+=a[i][k]*b[k][j];
        		}
        		res[i][j]=sum;
        	}
        }

        return res;

    }
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
        student.inputValue(val, "student-1aa");

        String[] colors = {"Red","Green","Blue","Yellow","Purple"};

        Random rand = new Random();

        student.inputColor(colors[rand.nextInt(5)]);
        String name = student.getName();
        int count = 0;

        for (int i=0;i<name.length();i++){
            if(name.charAt(i)=='a'){
                count++;
            }
        }
        System.out.println("Student has the letter a: "+count+" times");

        System.out.println(PerfArea.area(5.0)+"  "+PerfArea.area(5,5));

        int a[][] = new int[3][3];
        int b[][] = new int[3][3];
        Arrays.fill(a[0],1);
        Arrays.fill(b[0],1);
        Arrays.fill(a[1],2);
        Arrays.fill(b[1],2);
        int res[][] = PerfArea.matmmul(a,b);

        for(int i=0;i<3;i++){
        	System.out.println(res[i][0]+" "+res[i][1]+" "+res[i][2]);
        }
    }
}
