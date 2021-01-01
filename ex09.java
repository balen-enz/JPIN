
class ex09 {
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

        // 平均を保持する変数
        double average = total / sales.length;

        // 合計と平均を画面に表示する
        System.out.println("合計：" + total);
        System.out.println("平均：" + average);
    }
}