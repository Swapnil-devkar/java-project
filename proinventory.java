 
// 5. Inventory Management System
 
// Hint:
 
// Classes: Product, Inventory
 
// Features: Add new products, view inventory, update stock, remove products.
 
// Swing Elements: Use JTextField for product details, JTable to show product list, JButton to add/remove/update stock.

import java.awt.event.ActionListener;
 import java.awt.event.ActionEvent;
import javax.swing.*;
public class proinventory {
    public static void main(String[] args) {

        JFrame  frame= new JFrame("Inventory Management system");
        frame.setBounds(250,150,650,550);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JTextField productno = new JTextField("productno:");
        productno.setBounds(200,50,220,30);
        frame.add(productno);

        JTextField productname = new JTextField("productname:");
        productname.setBounds(200,100,220,30);
        frame.add(productname);

        JTextField productprice = new JTextField("product price:");
        productprice.setBounds(200,150,220,30);
        frame.add(productprice);

        JTextField producttype = new JTextField("producttype :");
        producttype.setBounds(200,200,220,30);
        frame.add(producttype);

        JButton button = new JButton("Add");
        button.setBounds( 200,250 ,70,30);
        frame.add(button);

        JButton view = new JButton("view");
       view.setBounds(290 ,249,70,30);
        frame.add(view);
        
        JButton update = new JButton("update");
        update.setBounds(330 ,300 ,70,30);
        frame.add(update);

    

        frame.setVisible(true);
    }
   
}
