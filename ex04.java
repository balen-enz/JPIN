
public class ex04 {

    public static void main(String[] args) {
        // メッセージの表示
        String data = "2010/04/01";
        int records[] = {65000,73000,90000};
        int total = 0;
        int divisor = records.length;


        for(int i = 0; i < divisor ; i++) {
            System.out.println( "["+ i +"]  total = > " + total);
            total = records[i] + total;
        }

      //スコープが異なるので、メイン用の受け皿変数を用意しないと、戻り値をメインで反映出来ない
        int avg = getAverage(total,divisor);

        System.out.println("**" + data + "**");
        System.out.println("合計:" + total);
        System.out.println("平均:" + avg);

    }
    public static int getAverage(int total,int divisor) {
    	int average = 0;
    	average = total / divisor;
    	System.out.println(average);
    	return average;

    }
}

//getAverageメソッド内とmainメソッド内の変数メモリアドレスは使用範囲が異なる
//戻り値averageを入れたavgを表示している。