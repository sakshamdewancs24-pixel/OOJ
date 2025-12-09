class BMS extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {     
            System.out.println("BMS College of Engineering");
            try {
                Thread.sleep(10000);       
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

class CSE extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {     
            System.out.println("CSE");
            try {
                Thread.sleep(2000);        
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

public class ThreadDisplay {
    public static void main(String args[]) {

        BMS t1 = new BMS();
        CSE t2 = new CSE();

        t1.start();
        t2.start();
    }
}
