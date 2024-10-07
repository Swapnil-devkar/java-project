// 9. Car Rental System

// Hint:

// Classes: Car, Customer, Rental

// Features: Add cars, view available cars, rent a car, return a car.

// Swing Elements: Use JTextField for car and customer details, JList to show available cars, JButton for renting/returning.

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;

class procar {
    public static void main(String[] args) {
        JFrame frame = new JFrame("car details ");
        frame.setBounds(250, 100, 650, 550);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JTextField model = new JTextField(" car model:" + "\n");
        model.setBounds(10, 10, 220, 30);
        frame.add(model);

        JTextField carname = new JTextField(" car name:");
        carname.setBounds(10, 50, 220, 30);
        frame.add(carname);

        JTextField coustname = new JTextField(" coustomer name:");
        coustname.setBounds(10, 100, 220, 30);
        frame.add(coustname);

        JTextField phoneno = new JTextField("coustomer phone no:");
        phoneno.setBounds(10, 150, 220, 30);
        frame.add(phoneno);


        JButton button = new JButton("Add");
       button.setBounds(10,200,130,30);
       frame.add(button);

       JButton Button1 = new JButton("view");
       Button1.setBounds(10,250,130,30);
       frame.add(Button1);


       JTextArea display = new JTextArea();
       display.setEditable(false);
       JScrollPane scrollPane = new JScrollPane(display);
       scrollPane.setBounds(150,250,250,200);
       frame.add(scrollPane);

       button.addActionListener(new ActionListener() {

        public void actionPerformed(ActionEvent e){
           String no = model.getText().trim();
           String carname1 = carname.getText().trim();
           String cousname = coustname.getText().trim();
           String mobileno = phoneno.getText().trim();
           
           display.append("car model no: "+ no +"\n");
           display.append("car name: "+ carname1 +"\n");
           display.append("coustomer name: "+ cousname+"\n");
           display.append(" coustomer Phone no: "+ mobileno +"\n");
        }

   });
        frame.setVisible(true);
    }
}
