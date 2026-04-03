package TwelveOneJFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test extends JFrame {

    public Test() {
        setTitle("登录窗口");
        setSize(250, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(5, 5));

        JLabel nameLabel = new JLabel("用户名:");
        JLabel passLabel = new JLabel("密码:");
        JTextField nameField = new JTextField();
        JPasswordField passField = new JPasswordField();

        JPanel inputPanel = new JPanel(new GridLayout(2, 2));
        inputPanel.add(nameLabel);
        inputPanel.add(nameField);
        inputPanel.add(passLabel);
        inputPanel.add(passField);
        add(inputPanel, BorderLayout.CENTER);

        JButton loginButton = new JButton("登录");
        JButton registerButton = new JButton("注册");
        JPanel buttonPanel = new JPanel(new FlowLayout());
        buttonPanel.add(loginButton);
        buttonPanel.add(registerButton);
        add(buttonPanel, BorderLayout.SOUTH);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = nameField.getText();
                String password = new String(passField.getPassword());
                System.out.println("登录信息：用户名 : " + username + ", 密码 : " + password);
            }
        });

        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = nameField.getText();
                String password = new String(passField.getPassword());
                System.out.println("注册信息：用户名 : " + username + ", 密码 : " + password);
            }
        });
        setVisible(true);
    }
    public static void main(String[] args) {
        new Test();
    }
}
