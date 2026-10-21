package com.pluralsight;
import java.util.Scanner;
import static java.lang.IO.println;

public class CellPhoneApplication {

    public static void display(CellPhone phone) {
        System.out.printf("Serial number: %s\nModel: %s\nCarrier: %s\nPhone no.: %s\nOwner: %s",
                phone.getSerialNumber(),
                phone.getModel(),
                phone.getCarrier(),
                phone.getPhoneNumber(),
                phone.getOwner());
    }

    static void main() {
        Scanner sc = new Scanner(System.in);
        CellPhone cp = new CellPhone();
        println("What is the serial number?");
        cp.setSerialNumber(sc.nextLine());
        println("What is the phone model?");
        cp.setModel(sc.nextLine());
        println("What is the carrier?");
        cp.setCarrier(sc.nextLine());
        println("What is the phone number?");
        cp.setPhoneNumber(sc.nextLine());
        println("Who is the owner of the phone?");
        cp.setOwner(sc.nextLine());

        display(cp);
        CellPhone cp2 = new CellPhone();
        cp2.createCellPhone();
        display(cp2);

        cp.dial(cp2.getPhoneNumber());
    }
}
