package salesResult;
//41行目 Arraysクラスを使用する為のインポート
import java.util.Arrays;

class ex10 {
    /**
     * アプリケーションを起動する。
     *
     * @param args
     *            起動パラメータ文字列の配列
     */
    public static void main(String[] args) {
        int[] sales = { 88, 90, 52, 85, 63, 54, 92, 95, 74, 80, 68, 100 };
        // 合計を保持する変数
        int total = 0;
        // 配列内の値の合計を計算する
        for (int i = 0; i < sales.length; i++) {
            total += sales[i];
        }
        //選択ソート
        //比較外側
        //length -1 を範囲とするのは、内ループjがiの一つ先との比較を行う為、最後まで回す必要がない。
        for(int i = 0; i < sales.length -1 ; i++) {
        	int minpos = i;

        	//比較内側
        	for(int j = i + 1; j <sales.length ; j++) {
        		//外側より、内側が小さければ、内側要素数にminposを上書き
        		if(sales[minpos] > sales[j]) {
        			minpos = j;
        		}
        	}
        	//内側比較がすべて終わったあとのminposを先頭要素数と入れ替え
        	//変数tmp　交換用
        	int tmp = sales[i];
        	sales[i] = sales[minpos];
        	sales[minpos] = tmp;
        	//配列要素ではなく、値を交換している。
        	//先頭の数値が確定していく事により、最小値がソートされていく。
        	//2巡目のfor iループに入る時、sales[1]からsales[12]の比較となる。
        	//仮定として、1回目のループを抜ける時、sales[0]には、52が入っている。

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