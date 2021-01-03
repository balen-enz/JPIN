package salesResult;

public class ex06 {
	//コマンドライン引数とは、mainメソッドに渡される引数

    public static void main(String[] args) {

        // メッセージの表示
        String date = args[0]; // 日付の格納
        int[] records; // 売り上げ情報を格納する配列を宣言
        records = new int[3]; // 売り上げ情報を格納する配列を生成
        int total = 0;

        // 売上の格納
        for (int i = 0; i < records.length; i++) {
            // 文字列を数値に変換
        	//IntegerクラスのparseIntメソッドを呼び出し
        	//クラス名.メソッド名(処理したい内容)
            records[i] = Integer.parseInt(args[i + 1]);
        }
        // 合計の計算
        for (int i = 0; i < records.length; i++) {
            System.out.println("[" + i + "] total => " + total);
            total += records[i];
        }

        // 平均の計算
        double average = getAverage(total, records.length);

        // 日付の表示・合計の表示・平均の表示
        System.out.println("** " + date + " **");
        System.out.println("合計：" + total);
        System.out.println("平均：" + average);


    }
    public static double getAverage(int total, double divisor) {
    	double average = 0;
    	average = total / divisor;
    	System.out.println(average);
    	return average;

    }
}

//getAverageメソッド内とmainメソッド内の変数メモリアドレスは使用範囲が異なる
//戻り値averageを入れたavgを表示している。



