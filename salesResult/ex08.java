package salesResult;

public class ex08 {
	//コマンドライン引数とは、mainメソッドに渡される引数

    public static void main(String[] args) {

    	if(args.length != 4) {
    		System.out.println("** 実行方法 **");
    		System.out.println("java SelesResult <日付> <東京の売上> <大阪の売上> <名古屋の売上>");
    		//return 処理終了　メインメソッドでも途中でreturunを使えば処理が返る
    		return;
    	}

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
        int max = getMaxValue(records[0],records[1],records[2]);
        int min = getMinValue(records[0],records[1],records[2]);
        // 日付の表示・合計の表示・平均の表示
        System.out.println("** " + date + " **");
        System.out.println("合計：" + total);
        System.out.println("平均：" + average);
        System.out.println("最大売上" + max);
        System.out.println("最小売上" + min);


    }
    public static double getAverage(int total, double divisor) {
    	double average = 0;
    	average = total / divisor;
    	System.out.println(average);
    	return average;

    }
    public static int getMaxValue(int tempo1,int tempo2,int tempo3) {
        if (tempo1 > tempo2 && tempo1 > tempo3) {
        	System.out.println(tempo1);
            return tempo1;
        } else {
            if (tempo2 > tempo3) {
            	System.out.println(tempo2);
               return tempo2;
            } else {
            	System.out.println(tempo3);
                return tempo3;
            }
        }
    }
    public static int getMinValue(int tempo1,int tempo2,int tempo3) {
        if (tempo1 < tempo2 && tempo1 < tempo3) {
        	System.out.println(tempo1);
            return tempo1;
        } else {
            if (tempo2 < tempo3) {
            	System.out.println(tempo2);
               return tempo2;
            } else {
            	System.out.println(tempo3);
                return tempo3;
            }
        }
    }

}

//getAverageメソッド内とmainメソッド内の変数メモリアドレスは使用範囲が異なる
//戻り値averageを入れたavgを表示している。


