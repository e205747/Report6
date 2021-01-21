package jp.ac.uryukyu.ie.e205747;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.Graphics;
//ウィンドウクラス
class OrigamiWindow extends JFrame{
    public OrigamiWindow(String title, int width, int height){
        super(title);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(width,height);
		setLocationRelativeTo(null);
		setResizable(false);
    }
}
/*線を描写するクラス
外枠は黒線、山折りは赤線、谷折りは青線で描写する。*/
class DrawGeomrtryNet extends JPanel{
	public void paintComponent(Graphics g) {
        int[] xy = (new UserInput()).userInput();
        int x = xy[0];
        int y = xy[1];
        super.paintComponent(g);
        //外枠を黒線で描写する。
        g.setColor(Color.black);
        g.drawLine(10,10,10*(x+1),10);//横上
        g.drawLine(10,10+(20*y),10*(x+1),10+(20*y));//横下
        g.drawLine(10,10,10,10+(20*y));//縦左
        g.drawLine(10*(x+1),10,10*(x+1),10+(20*y));//縦右
        //山折り、谷折りをそれぞれ、赤線、青線で描写する。
        for (int a=1;a<x+1;a++){
            for (int b=1;b<y+1;b++){
                g.setColor(Color.red);
                //山折り、赤いバッテン
                g.drawLine(10*(a+1), (20*b)-10, 10*a, 20*b);//左下に向かう斜線
                g.drawLine(10*a, (20*b)-10, 10*(a+1), 20*b);//右下に向かう斜線
                //山折り、赤いひしがた
                g.drawLine((10*a)+5, 20*b, 10*a, (20*b)+5);//一番上の頂点から左回り
                g.drawLine(10*a, (20*b)+5, (10*a)+5, (20*b)+10);
                g.drawLine((10*a)+5, (20*b)+10, 10*(a+1), (20*b)+5);
                g.drawLine((10*a)+5, 20*b, 10*(a+1), (20*b)+5);
                //谷折り、青い十字
                g.setColor(Color.blue);
                g.drawLine(10*a, 20*b, 10*(a+1), 20*b);//横
                g.drawLine((10*a)+5, (20*b)-10, (10*a)+5, (20*b)+10);//縦
            }
        }
        for (int a=1;a<x+1;a++){
            for (int b=1;b<y;b++){
                //谷折り、青い横線
                g.setColor(Color.blue);
                g.drawLine(10*a, (20*b)+10, 10*(a+1), (20*b)+10);//横

            }
        }
        for (int a=1;a<x;a++){
            for (int b=1;b<y+1;b++){
                //谷折り、青い縦線
                g.setColor(Color.blue);
                g.drawLine(10*(a+1), (20*b)-10, 10*(a+1), (20*b)+10);//縦
            }
        }
	}
}

