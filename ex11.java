//41行目 Arraysクラスを使用する為のインポート
import java.util.Arrays;

class ex11 {
    /**
     * アプリケーションを起動する。
     *
     * @param args
     *            起動パラメータ文字列の配列
     */
    public static void main(String[] args) {
        int[] sales = { 88, 90, 52, 85, 63, 54, 92, 95, 74, 80, 68, 100 };
        //sales.length 12
        //sales[11] 100

        // 合計を保持する変数
        int total = 0;
        // 配列内の値の合計を計算する
        for (int i = 0; i < sales.length; i++) {
            total += sales[i];
        }

        //バブルソート
        //比較外側
        //length -1 を範囲とするのは、内ループjがiの一つ先との比較を行う為、最後まで回す必要がない。
        for(int i = 0; i < sales.length -1 ; i++) {

        	// 内側処理
        	//-1にするのは、配列が0開始の為。iの-1時の処理とはまた異なる
        	for(int j = sales.length -1  ; j > i ; j--) {
        		//手前と比較して、手前が大きければ、入れ替え処理
        		if(sales[j - 1] > sales[j]) {
        			System.out.println("要素交換" + (j - 1) + " " + j);
        			System.out.println(sales[j-1] + " > " + sales[j]);
                	int tmp = sales[j - 1];
                	sales[j - 1] = sales[j];
                	sales[j] = tmp;

        		}

        	}
        	System.out.println("j処理→i処理");
        	//ハッシュのような出力形式で表示
        	System.out.println(Arrays.toString(sales));
        }
        // 平均を保持する変数
        double average = total / sales.length;

        // 合計と平均を画面に表示する
        System.out.println("合計：" + total);
        System.out.println("平均：" + average);
    }
}