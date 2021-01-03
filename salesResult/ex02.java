package salesResult;
class ex02 {
    /**
     * アプリケーションを起動します。
     *
     * @param args
     *            起動パラメータ文字列の配列
     */
    public static void main(String[] args) {
       int records[] = {65000,73000,90000};
       int total = 0;

       total = records[0] + records[1] + records[2];
       System.out.println(total);

    }
}