package salesResult;
//41行目 Arraysクラスを使用する為のインポート

class ex12 {
    /**
     * アプリケーションを起動する。
     *
     * @param args
     *            起動パラメータ文字列の配列
     */
    public static void main(String[] args) {
        int[] sales = { 88, 90, 52, 85, 63, 54, 92, 95, 74, 80, 68, 100 };
        //sales.length 12

        int search = 54;
        int flg = -1;
        //リニアサーチ

        for(int i = 0; i < sales.length ; i++) {
        	if(sales[i] == search) {
        		flg = i;
                System.out.println("探索：" + flg);
        		return;
        	}

        }
		System.out.println("探索値なし");

    }
}