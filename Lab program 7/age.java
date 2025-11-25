import java.util.Scanner;


class WrongAge extends Exception {
    WrongAge() {
        super("Age Error");
    }

    WrongAge(String msg) {
        super(msg);
    }
}


class Father {
    int fatherAge;
    Scanner s = new Scanner(System.in);

    Father() throws WrongAge {
        System.out.print("Enter Father's Age: ");
        fatherAge = s.nextInt();

        if (fatherAge < 0) {
            throw new WrongAge("Age cannot be negative");
        }
    }

    void display() {
        System.out.println("Father's Age: " + fatherAge);
    }
}


class Son extends Father {
    int sonAge;

    Son() throws WrongAge {
        super();  

        System.out.print("Enter Son's Age: ");
        sonAge = s.nextInt();

        if (sonAge >= fatherAge) {
            throw new WrongAge("Son's age cannot be greater than or equal to Father's age");
        } 
        else if (sonAge < 0) {
            throw new WrongAge("Age cannot be negative");
        }
    }

    void displaySon() {
        System.out.println("Son's Age: " + sonAge);
    }
}


public class age {
    public static void main(String[] args) {
        try {
            Son obj = new Son();

            System.out.println("\n--- Age Details ---");
            obj.display();        
            obj.displaySon();     

        } catch (WrongAge e) {
            System.out.println("Exception Caught: " + e.getMessage());
        }
    }
}
