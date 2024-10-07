import java.awt.event.ActionListener;
 import java.awt.event.ActionEvent;
import javax.swing.*;
 class pro_contact {
     public static void main(String[] args) {

        JFrame frame = new JFrame("Contact System");
        frame.setBounds(250, 100, 650, 550);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

       JTextField name1 = new JTextField(" name:");
       name1.setBounds(150,50,220,30);
       frame.add(name1);
      
      

       JTextField phoneno = new JTextField("phone no");
       phoneno.setBounds(150, 100, 220, 30);
       frame.add(phoneno);

       JButton button = new JButton("Add");
       button.setBounds(150,150,130,30);
       frame.add(button);

       JTextArea display = new JTextArea();
       display.setEditable(false);
       JScrollPane scrollPane = new JScrollPane(display);
       scrollPane.setBounds(150,250,250,200);
       frame.add(scrollPane);

       button.addActionListener(new ActionListener() {

        public void actionPerformed(ActionEvent e){
           String name = name1.getText().trim();
           String number = phoneno.getText().trim();
           
           display.append("Full name: "+ name +"\n");
           display.append("Phone no: "+ number +"\n");
        }
   });

    
  
       frame.setVisible(true);

     }
    
}
