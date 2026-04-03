package TwelveTwoMenu;

import javax.swing.*;
import java.awt.*;

public class Text extends JFrame {
    public Text(){
        Toolkit toolkit=Toolkit.getDefaultToolkit();
        Dimension d=toolkit.getScreenSize();
        int x= (int) d.getWidth();
        int y= (int) d.getHeight();
        setBounds((x-600)/2,(y-600)/2,600,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("主界面");

        JMenuBar menuBar=new JMenuBar();
        setJMenuBar(menuBar);
        
        JMenu menu1=new JMenu("文件");
        JMenu menu2=new JMenu("关于我们");
        JMenuItem mi1=new JMenuItem("重新开始");
        JMenuItem mi2=new JMenuItem("退出");
        menu1.add(mi1);
        menu1.add(mi2);
        menuBar.add(menu1);
        menuBar.add(menu2);

        JPanel jPanel=new JPanel();
        jPanel.add(new JLabel("昵称：削苹果核"));
        jPanel.add(new JLabel("得分：0"));
        jPanel.add(new JButton("重排"));
        jPanel.add(new JButton("新游戏"));
        add(jPanel);

        setVisible(true);
    }
}
class Start{
    public static void main(String[] args) {
        new Text();
    }
}