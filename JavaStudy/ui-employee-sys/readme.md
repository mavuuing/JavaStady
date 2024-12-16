* 结合ai使用GUI编程实现一个人事管理系统
 - 第一步：创建一个模块做这个项目。ui-employee-sys
 - 第二步：分析项目的业务需求
   - 提供一个登录界面和注册界面。
   - 提供一个人事信息的管理界面：展示全部员工信息，提供一个根据名称查询某个员工信息展示，添加员工信息，修改员工信息
   - 分析项目角色：
     - 登录用户：登录名称、密码
     - 员工信息：id ，姓名，性别，年龄，电话，职位，入职时间，薪水，部门信息。
   - 分析系统界面：
     - 登录界面类： 创建登录界面
     - 信息管理界面系统类：创建管理界面。
   - 第二步：结合ai 开始开发
     - ai 帮我们生成一个登录界面。  
     - ai 帮我们生成一个信息管理界面。
     - 正式开发
     - 1.拿到登录界面的程序，本进行了修改。
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

     - 启动类：
       package com.employee.ui;

        public class App {
        public static void main(String[] args) {
        //SwingUtilities.invokeLater(() -> new LoginFrame().setVisible(true));
        new LoginFrame().setVisible(true);
            }
        }
   - 拿到管理信息的界面
     - 提供一个人事信息的管理界面：展示全部员工信息，提供一个根据名称查询某个员工信息展示，添加员工信息，修改员工信息
   
     