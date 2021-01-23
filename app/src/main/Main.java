import jp.ac.uryukyu.ie.e205747.*;

public class Main {
    public static void main(String[] args) {
        OrigamiWindow ow = new OrigamiWindow("オリガミウィンドウ",1300,800);
        ow.add(new DrawGeometryNet());//描画領域の追加
        ow.setVisible(true);
    }
}