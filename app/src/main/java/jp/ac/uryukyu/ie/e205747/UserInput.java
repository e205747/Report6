package jp.ac.uryukyu.ie.e205747;
public class UserInput {
    public static int[] userInput(){
        int row = 0;
        int column = 0;
        while (row<=0||column<=0){
            try {
                System.out.println("なまこ折りの展開図を生成します。\n行数を入力してください。\n但し、入力できるのは自然数のみです。");
                row = new java.util.Scanner(System.in).nextInt();
                if (row<=0){
                    System.out.println("入力できるのは自然数のみです。やり直してください。");
                    continue;
                }
                System.out.println("列数を入力してください。\n但し、入力できるのは自然数のみです。");
                column = new java.util.Scanner(System.in).nextInt();
                if (column<=0){
                    System.out.println("入力できるのは自然数のみです。やり直してください。");
                    continue;
                }
                System.out.println("リクエストを受け付けました。" + row + "行" + column + "列のなまこ折り展開図を生成します。");
            }catch(Exception e){
                System.err.println(e);
            }
        }
        return new int[]{row, column};
    }
}