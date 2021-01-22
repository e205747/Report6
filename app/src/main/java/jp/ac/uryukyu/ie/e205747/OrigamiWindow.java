package jp.ac.uryukyu.ie.e205747;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.Graphics;
//ウィンドウクラス
public class OrigamiWindow extends JFrame{
    public OrigamiWindow(String title, int width, int height){
        super(title);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(width,height);
		setLocationRelativeTo(null);
		setResizable(false);
    }
}
