import java.util.*;

class Employee {
    String name;
    int Age;
    int PhNo;
    String Address;
    int Salary = 1000;

    public void printSalary(){
        System.out.println(Salary+"");
    }

    public void display(){
        System.out.println("The class is Employee");
    }
}

class Officer extends Employee {
    String specialization;
    @Override
    public void printSalary(){
        System.out.println("8000");
    }
    @Override
    public void display(){
        System.out.println("The class is Officer");
    }
}

class Manager extends Employee {
    String department;
    @Override
    public void printSalary(){
        System.out.println("10,000");
    }

    public void display(){
        System.out.println("The class is Manager");
    }
}

class Engineer extends Employee {
    @Override
    public void display(){
        System.out.println("The class is Engineer");
    }
}

public class Main {
    public static void main(String[] args){
        System.out.println("Main class!");

        Employee eng = new Engineer();
        eng.display();

        Vector<String> names = new Vector<>();
        Scanner sc = new Scanner(System.in);
        boolean loopFlag = true;
        while(loopFlag){
            System.out.println("Enter your choice: 1. add 2 vals, 2. add to 3rd pos, 3. append 3 simulataneously, 4. delete the 2nd pos, 5. clear the entire vector, 6. view the vector, 7. exit");

            int choice = sc.nextInt();
            sc.nextLine();

            switch(choice){
                case 1:
                    System.out.println("Enter 3 names:");
                    for(int i = 0; i<3; i++) names.add(sc.next());

                    sc.nextLine();
                    break;
                case 2:
                    System.out.println("Add to the 3rd posn: ");
                    names.add(2, sc.next());
                    sc.nextLine();
                    break;
                case 3:
                    System.out.println("Append 3 in one go: ");
                    String val1 = sc.next();
                    String val2 = sc.next();
                    String val3 = sc.next();
                    List<String> vals = Arrays.asList(val1,val2,val3);
                    names.addAll(vals);
                    break;
                case 4:
                    System.out.println("Deleted second position: "+names.get(1));
                    names.remove(1);
                    break;
                case 5:
                    System.out.println("Cleared the entire vecotr!");
                    names.clear();
                    break;
                case 6:
                    for(String name : names) {
                        System.out.println(name+" ");
                    }
                    break;
                case 7:
                    loopFlag = false;
                    break;
                default:
                    System.out.println("Try again!");
                    break;
            }

        }
    }
}
