/**
 * 売り上げ処理アプリケーションです。
 * 
 */
class ex01 {
    /**
     * アプリケーションを起動します。
     * 
     * @param args
     *            起動パラメータ文字列の配列
     */
    public static void main(String[] args) {
        // メッセージの表示
        String data = "2010/04/01";
        int tokyo = 65000;
        int osaka = 73000;
        int nagoya = 90000;
        int total = 0;
        int average = 0;

        total = tokyo + osaka + nagoya ;
        average = total / 3;

        System.out.println("**" + data + "**");
        System.out.println("合計:" + total);
        System.out.println("平均:" + average);
        
    }
}