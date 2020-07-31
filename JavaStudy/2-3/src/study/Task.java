package study;

// ① TaskクラスにCalculatorクラスを継承させなさい。
public class Task extends Calculator{
    /**
     * タスクの実行
     */
    public void doTask() {

        // ② Calculator.javaのすべてのオーバーロードメソッド「plus」に適当な引数を与え、下記画像のよう出力されるようコーディングしなさい。
        // 尚、「どのクラスから呼び出しているか」を明確にするため、plus()には呼び出し元のキーワードを付与すること。
		int A = super.plus(10);
		int B = super.plus(10, 20);
		int C = super.plus(10, 20, 30);
		
		System.out.println("plusメソッドの因数が一つの場合：" + A);
		System.out.println("plusメソッドの因数が二つの場合：" + B);
		System.out.println("plusメソッドの因数が三つの場合：" + C);
    }
}