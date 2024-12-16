package com.employee.ui;

import javax.swing.*;
import java.awt.*;


public class LoginFrame extends JFrame {
    private JLabel usernameLabel;
    private JTextField usernameField;
    private JLabel passwordLabel;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JButton registerButton;

    public LoginFrame() {
        this.setTitle("人事管理系统");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300, 200);
        this.setLocationRelativeTo(null);
        setResizable(false);
        creatAndShow();
    }

    private void creatAndShow(){
        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        panel.setBackground(Color.WHITE);
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(5, 0, 5, 0);

        usernameLabel = new JLabel("用户名:");
        panel.add(usernameLabel, gbc);

        gbc.gridx = 1;
        usernameField = new JTextField(15);
        panel.add(usernameField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        passwordLabel = new JLabel("密码:");
        panel.add(passwordLabel, gbc);

        gbc.gridx = 1;
        passwordField = new JPasswordField(15);
        panel.add(passwordField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        loginButton = new JButton("登录");
        loginButton.setBackground(Color.BLUE);
        loginButton.setForeground(Color.WHITE);
        panel.add(loginButton, gbc);

        gbc.gridy = 3;
        registerButton = new JButton("注册");
        registerButton.setBackground(Color.GREEN);
        registerButton.setForeground(Color.WHITE);
        panel.add(registerButton, gbc);

        add(panel);

        // 使用Lambda表达式简化事件处理
        loginButton.addActionListener(e -> {
            String username = usernameField.getText();
            String password = new String(passwordField.getPassword());
            if (username.equals("admin") && password.equals("123456")) {
                JOptionPane.showMessageDialog(LoginFrame.this, "登录成功！");
            } else {
                JOptionPane.showMessageDialog(LoginFrame.this, "用户名或密码错误！");
            }
        });

        registerButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(LoginFrame.this, "注册功能暂未开放！");
        });
    }
}
