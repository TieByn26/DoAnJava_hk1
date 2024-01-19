package ViewMain.AdminView;

import Controller.Main.Admin.*;
import org.jdesktop.swingx.prompt.PromptSupport;

import javax.swing.*;
import java.awt.*;

public class DeleteLaptop extends JFrame {
    private ImageIcon imageIcon1;
    private InsertLaptop2 insertLaptop2 = new InsertLaptop2(this);
    private JPanel jPanel2;
    private JPanel jPanel1;
    private SpringLayout layoutMain = new SpringLayout();
    private JButton jButton1;
    private JButton jButton2;
    private JButton jButton3;
    private JButton jButton4;
    private JTextField jTextField1;
    private JTextField jTextField2;
    private JTextField jTextField3;
    private JTextField jTextField4;
    private JTextField jTextField5;
    private JTextField jTextField6;
    private JTextField jTextField7;
    private JTextField jTextField8;
    public DeleteLaptop(){
        this.setSize(700,450);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.initj();
        this.setVisible(true);
    }
    public void initj(){

        jPanel1 = new JPanel();
        jPanel2 = new JPanel();
        jTextField1 = new JTextField();
        jTextField2 = new JTextField();
        jTextField3 = new JTextField();
        jTextField4 = new JTextField();
        jTextField5 = new JTextField();
        jTextField6 = new JTextField();
        jTextField7 = new JTextField();
        jTextField8 = new JTextField();
        jButton1 = new JButton("INSERT");
        jButton2 = new JButton("DELETE");
        jPanel1.setLayout(layoutMain);

        layoutMain.putConstraint(SpringLayout.VERTICAL_CENTER,jTextField1,-180,SpringLayout.VERTICAL_CENTER,jPanel1);
        layoutMain.putConstraint(SpringLayout.HORIZONTAL_CENTER,jTextField1,170,SpringLayout.HORIZONTAL_CENTER,jPanel1);

        layoutMain.putConstraint(SpringLayout.VERTICAL_CENTER,jTextField2,-145,SpringLayout.VERTICAL_CENTER,jPanel1);
        layoutMain.putConstraint(SpringLayout.HORIZONTAL_CENTER,jTextField2,170,SpringLayout.HORIZONTAL_CENTER,jPanel1);

        layoutMain.putConstraint(SpringLayout.VERTICAL_CENTER,jTextField3,-110,SpringLayout.VERTICAL_CENTER,jPanel1);
        layoutMain.putConstraint(SpringLayout.HORIZONTAL_CENTER,jTextField3,170,SpringLayout.HORIZONTAL_CENTER,jPanel1);

        layoutMain.putConstraint(SpringLayout.VERTICAL_CENTER,jTextField4,-75,SpringLayout.VERTICAL_CENTER,jPanel1);
        layoutMain.putConstraint(SpringLayout.HORIZONTAL_CENTER,jTextField4,170,SpringLayout.HORIZONTAL_CENTER,jPanel1);

        layoutMain.putConstraint(SpringLayout.VERTICAL_CENTER,jTextField5,-40,SpringLayout.VERTICAL_CENTER,jPanel1);
        layoutMain.putConstraint(SpringLayout.HORIZONTAL_CENTER,jTextField5,170,SpringLayout.HORIZONTAL_CENTER,jPanel1);

        layoutMain.putConstraint(SpringLayout.VERTICAL_CENTER,jTextField6,-5,SpringLayout.VERTICAL_CENTER,jPanel1);
        layoutMain.putConstraint(SpringLayout.HORIZONTAL_CENTER,jTextField6,170,SpringLayout.HORIZONTAL_CENTER,jPanel1);

        layoutMain.putConstraint(SpringLayout.VERTICAL_CENTER,jTextField7,30,SpringLayout.VERTICAL_CENTER,jPanel1);
        layoutMain.putConstraint(SpringLayout.HORIZONTAL_CENTER,jTextField7,170,SpringLayout.HORIZONTAL_CENTER,jPanel1);

        layoutMain.putConstraint(SpringLayout.VERTICAL_CENTER,jTextField8,65,SpringLayout.VERTICAL_CENTER,jPanel1);
        layoutMain.putConstraint(SpringLayout.HORIZONTAL_CENTER,jTextField8,170,SpringLayout.HORIZONTAL_CENTER,jPanel1);

        layoutMain.putConstraint(SpringLayout.VERTICAL_CENTER,jButton1,130,SpringLayout.VERTICAL_CENTER,jPanel1);
        layoutMain.putConstraint(SpringLayout.HORIZONTAL_CENTER,jButton1,85,SpringLayout.HORIZONTAL_CENTER,jPanel1);

        layoutMain.putConstraint(SpringLayout.VERTICAL_CENTER,jButton2,130,SpringLayout.VERTICAL_CENTER,jPanel1);
        layoutMain.putConstraint(SpringLayout.HORIZONTAL_CENTER,jButton2,240,SpringLayout.HORIZONTAL_CENTER,jPanel1);


        layoutMain.putConstraint(SpringLayout.VERTICAL_CENTER,jPanel2,-55,SpringLayout.VERTICAL_CENTER,jPanel1);
        layoutMain.putConstraint(SpringLayout.HORIZONTAL_CENTER,jPanel2,-160,SpringLayout.HORIZONTAL_CENTER,jPanel1);

        PromptSupport.setPrompt("Product ID", jTextField1);
        PromptSupport.setFocusBehavior(PromptSupport.FocusBehavior.HIDE_PROMPT, jTextField1);
        PromptSupport.setForeground(Color.GRAY, jTextField1);

        PromptSupport.setPrompt("Product's name", jTextField2);
        PromptSupport.setFocusBehavior(PromptSupport.FocusBehavior.HIDE_PROMPT, jTextField2);
        PromptSupport.setForeground(Color.GRAY, jTextField2);

        PromptSupport.setPrompt("Product price", jTextField3);
        PromptSupport.setFocusBehavior(PromptSupport.FocusBehavior.HIDE_PROMPT, jTextField3);
        PromptSupport.setForeground(Color.GRAY, jTextField3);

        PromptSupport.setPrompt("Product cost price", jTextField4);
        PromptSupport.setFocusBehavior(PromptSupport.FocusBehavior.HIDE_PROMPT, jTextField4);
        PromptSupport.setForeground(Color.GRAY, jTextField4);

        PromptSupport.setPrompt("Product type", jTextField5);
        PromptSupport.setFocusBehavior(PromptSupport.FocusBehavior.HIDE_PROMPT, jTextField5);
        PromptSupport.setForeground(Color.GRAY, jTextField5);

        PromptSupport.setPrompt("The number of products", jTextField6);
        PromptSupport.setFocusBehavior(PromptSupport.FocusBehavior.HIDE_PROMPT, jTextField6);
        PromptSupport.setForeground(Color.GRAY, jTextField6);

        PromptSupport.setPrompt("Product information", jTextField7);
        PromptSupport.setFocusBehavior(PromptSupport.FocusBehavior.HIDE_PROMPT, jTextField7);
        PromptSupport.setForeground(Color.GRAY, jTextField7);

        PromptSupport.setPrompt("Image product", jTextField8);
        PromptSupport.setFocusBehavior(PromptSupport.FocusBehavior.HIDE_PROMPT, jTextField8);
        PromptSupport.setForeground(Color.GRAY, jTextField8);

        jPanel1.setPreferredSize(new Dimension(700,450));
        jPanel2.setPreferredSize(new Dimension(300,280));
        jPanel2.setBackground(Color.YELLOW);
        jTextField1.setPreferredSize(new Dimension(300,30));
        jTextField2.setPreferredSize(new Dimension(300,30));
        jTextField3.setPreferredSize(new Dimension(300,30));
        jTextField4.setPreferredSize(new Dimension(300,30));
        jTextField5.setPreferredSize(new Dimension(300,30));
        jTextField6.setPreferredSize(new Dimension(300,30));
        jTextField7.setPreferredSize(new Dimension(300,30));
        jTextField8.setPreferredSize(new Dimension(300,30));
        jButton1.setPreferredSize(new Dimension(150,50));
        jButton1.addActionListener(insertLaptop2);
        jButton2.setPreferredSize(new Dimension(150,50));
        jButton2.addActionListener(insertLaptop2);


        jPanel1.add(jTextField1);
        jPanel1.add(jTextField2);
        jPanel1.add(jTextField3);
        jPanel1.add(jTextField4);
        jPanel1.add(jTextField5);
        jPanel1.add(jTextField6);
        jPanel1.add(jTextField7);
        jPanel1.add(jTextField8);
        jPanel1.add(jButton1);
        jPanel1.add(jButton2);
        jPanel1.add(jPanel2);
        this.add(jPanel1);

    }
    public void repai(){
        this.revalidate();
        this.repaint();
    }

    public JPanel getjPanel2() {
        return jPanel2;
    }

    public void setjPanel2(JPanel jPanel2) {
        this.jPanel2 = jPanel2;
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public void setjPanel1(JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    public SpringLayout getLayoutMain() {
        return layoutMain;
    }

    public void setLayoutMain(SpringLayout layoutMain) {
        this.layoutMain = layoutMain;
    }

    public JButton getjButton1() {
        return jButton1;
    }

    public void setjButton1(JButton jButton1) {
        this.jButton1 = jButton1;
    }

    public JButton getjButton2() {
        return jButton2;
    }

    public void setjButton2(JButton jButton2) {
        this.jButton2 = jButton2;
    }

    public JButton getjButton3() {
        return jButton3;
    }

    public void setjButton3(JButton jButton3) {
        this.jButton3 = jButton3;
    }

    public JButton getjButton4() {
        return jButton4;
    }

    public void setjButton4(JButton jButton4) {
        this.jButton4 = jButton4;
    }

    public JTextField getjTextField1() {
        return jTextField1;
    }

    public void setjTextField1(JTextField jTextField1) {
        this.jTextField1 = jTextField1;
    }

    public JTextField getjTextField2() {
        return jTextField2;
    }

    public void setjTextField2(JTextField jTextField2) {
        this.jTextField2 = jTextField2;
    }

    public JTextField getjTextField3() {
        return jTextField3;
    }

    public void setjTextField3(JTextField jTextField3) {
        this.jTextField3 = jTextField3;
    }

    public JTextField getjTextField4() {
        return jTextField4;
    }

    public void setjTextField4(JTextField jTextField4) {
        this.jTextField4 = jTextField4;
    }

    public JTextField getjTextField5() {
        return jTextField5;
    }

    public void setjTextField5(JTextField jTextField5) {
        this.jTextField5 = jTextField5;
    }

    public JTextField getjTextField6() {
        return jTextField6;
    }

    public void setjTextField6(JTextField jTextField6) {
        this.jTextField6 = jTextField6;
    }

    public JTextField getjTextField7() {
        return jTextField7;
    }

    public void setjTextField7(JTextField jTextField7) {
        this.jTextField7 = jTextField7;
    }

    public JTextField getjTextField8() {
        return jTextField8;
    }

    public void setjTextField8(JTextField jTextField8) {
        this.jTextField8 = jTextField8;
    }

    public ImageIcon getImageIcon1() {
        return imageIcon1;
    }

    public void setImageIcon1(ImageIcon imageIcon1) {
        this.imageIcon1 = imageIcon1;
    }

    public static void main(String[] args) {
        new DeleteLaptop();
    }
}
