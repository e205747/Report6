package jp.ac.uryukyu.ie.e205747;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.Graphics;

/*線を描写するクラス
外枠は黒線、山折りは赤線、谷折りは青線で描写する。*/
public class DrawGeometryNet extends JPanel{
	public void paintComponent(Graphics g) {
        int[] xy = (new UserInput()).userInput();
        int x = xy[0];
        int y = xy[1];
        super.paintComponent(g);
        //外枠を黒線で描写する。
        g.setColor(Color.black);
        g.drawLine(blackX1,blackY1,blackX2,blackY2);//横上
        g.drawLine(blackX2,blackY2,blackX3,blackY3);//横下
        g.drawLine(blackX3,blackY3,blackX4,blackY4;//縦左
        g.drawLine(blackX1,blackY1,blackX4,blackY4);//縦右
        //山折り、谷折りをそれぞれ、赤線、青線で描写する。
        for (int a=1;a<x+1;a++){
            for (int b=1;b<y+1;b++){
                g.setColor(Color.red);
                //山折り、赤いバッテン
                g.drawLine(redX1,redY1,redX2,redY2);//左下に向かう斜線
                g.drawLine(redX3,redY3,redX4,redY4);//右下に向かう斜線
                //山折り、赤いひしがた
                g.drawLine(redX5,redY5,redX6,redY6);//一番上の頂点から左回り
                g.drawLine(redX6,redY6,redX7,redY7);
                g.drawLine(redX7,redY7,redX8,redY8);
                g.drawLine(redX5,redY5,redX8,redY8);
                //谷折り、青い十字
                g.setColor(Color.blue);
                g.drawLine(blueX1,blueY1,blueX2,blueY2);//横
                g.drawLine(blueX3,blueY3,blueX4,blueY4);//縦
            }
        }
        for (int a=1;a<x+1;a++){
            for (int b=1;b<y;b++){
                //谷折り、青い横線
                g.setColor(Color.blue);
                g.drawLine(blueX5,blueY5,blueX6,blueY6);//横

            }
        }
        for (int a=1;a<x;a++){
            for (int b=1;b<y+1;b++){
                //谷折り、青い縦線
                g.setColor(Color.blue);
                g.drawLine(blueX5,blueY5,blueX7,blueY7);//縦
            }
        }
	}
}

public class CoordinateCalculation {
    blackX1 = 10;
    blackY1 = 10;
    blackX2 = 10;
    blackY2 = 10+(20*y);
    blackX3 = 10*(x+1);
    blackY3 = 10+(20*y);
    blackX4 = 10*(x+1);
    blackY4 = 10;

    redX1 = 10*a;
    redY1 = (20*b)-10;
    redX2 = 10*(a+1);
    redY2 = 20*b;
    redX3 = 10*(a+1);
    redY3 = (20*b)-10;
    redX4 = 10*a;
    redY4 = 20*b;

    redX5 = (10*a)+5;
    redY5 = 20*b;
    redX6 = 10*a;
    redY6 = (20*b)+5;
    redX7 = (10*a)+5;
    redY7 = (20*b)+10;
    redX8 = 10*(a+1);
    redY8 = (20*b)+5;

    blueX1 = (10*a)+5;
    blueY1 = (20*b)-10;
    blueX2 = (10*a)+5;
    blueY2 = (20*b)+10;
    blueX3 = 10*a;
    blueY3 = 20*b;
    blueX4 = 10*(a+1);
    blueY4 = 20*b;

    blueX5 = 10*a;
    blueY5 = (20*b)+10;
    blueX6 = 10*(a+1);
    blueY6 = (20*b)+10;
    blueX7 = 10*(a+1);
    blueY7 = (20*b)-10;
}