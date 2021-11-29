import javax.swing.*;

public class Prom {

    /* In order to purchase a ticket to go to prom,
    you must be a Junior or Senior, have no disciplinary
    records and have $40 to pay for it.
     */

    public static void main(String[] args) {

        int gradeLevel = Integer.parseInt(JOptionPane.showInputDialog("What grade level are you in? (9, 10, 11, 12"));
        int discipline = Integer.parseInt(JOptionPane.showInputDialog("How many suspensions have you had?"));
        int money = Integer.parseInt(JOptionPane.showInputDialog("How much money do you have? (Round down to nearest $5"));

        if(gradeLevel >= 11){
            if(discipline >= 1) {
                System.out.println("You can't go to Prom. Press F to pay respects");
            }else{
                if(money >= 40) {
                    System.out.println("You can get a Prom ticket.");
                }else{
                    System.out.println("You can't go to Prom. Press F to pay respects");
                }
            }
        }else{
            System.out.println("You can't go to Prom. Press F to pay respects");
        }

        System.exit(0);

    }

}
