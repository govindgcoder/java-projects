import java.lang.Thread;

class CustomException extends Exception {
    public CustomException(String msg){
        super(msg);
    }
}

class Obj {
    public static synchronized void display(String val) throws CustomException{
        System.out.println(val);
    }
}

class MyThread implements Runnable {

    MyThread (Obj obj, String msg, int delay){
        this.obj = obj;
        this.msg = msg;
        this.delay = delay;
    }

    Obj obj;
    String msg="";
    int delay=1000;

    @Override
    public void run(){
        while(true){
        try {
            obj.display(msg);
            Thread.sleep(delay);
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
}
    }
}

public class Main {

    public static void main(String[] args){
        Obj obj = new Obj();

        Thread t1 = new Thread(new MyThread(obj, "Simple", 1000));
        Thread t2 = new Thread(new MyThread(obj, "Power", 2000));


        t1.start();
        t2.start();

    }
}
