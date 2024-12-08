import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test3 {
    public static void main(String[] args) {
        //目标：搞清楚几个匿名内部类的使用场景
        //需求：创建一个登录页面
        JFrame win=new JFrame("登录页面");
        win.setSize(300,200);
        win.setLocationRelativeTo(null);//居中显示
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//退出esc

        JPanel panel =new JPanel();
        win.add(panel);

        JButton btn=new JButton("登录");
        panel.add(btn);
        btn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("登录按钮被点击了");
            }
        });
        win.setVisible(true);
    }
}
