package calculate;

import java.util.Scanner;

public class calculate {
    public static void main(String[] args) {
    	System.out.println("1つ目の数値を入力して下さい。");
    	//Scannerで初期化
    	Scanner scan = new Scanner(System.in);
    	double num1 = scan.nextDouble();

    	System.out.println("演算子を「 + - * / 」の中から入力して下さい。");
    	String kigou = scan.next();

    	System.out.println("2つ目の数値の入力して下さい。");
    	double num2 = scan.nextDouble();
    	System.out.println();

    	//計算式
    	double result = 0;
    	if (kigou.equals("+")) {
    		result = num1 + num2;
    		kigou = "＋";
    	}else if (kigou.equals("-")) {
    		result = num1 - num2;
    		kigou = "－";
    	}else if (kigou.equals("*")) {
    		result = num1 * num2;
    		kigou = "×";
    	}else if (kigou.equals("/")) {
    		result = num1 / num2;
    		kigou = "÷";
    	}
    	System.out.println(num1 + " " + kigou + " " + num2 + " ＝ " + result + "です。");
    }
}