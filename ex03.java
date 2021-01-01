class ex03 {
    /**
     * アプリケーションを起動します。
     *
     * @param args
     *            起動パラメータ文字列の配列
     */
    public static void main(String[] args) {
        // メッセージの表示
        String data = "2010/04/01";
        int records[] = {65000,73000,90000};
        int total = 0;
        int average = 0;
        int divsor = records.length;

        for(int i = 0; i < divsor ; i++) {
            System.out.println( "["+ i +"]  total = > " + total);
            total = records[i] + total;
        }
        average = total / divsor;

        System.out.println("**" + data + "**");
        System.out.println("合計:" + total);
        System.out.println("平均:" + average);

    }
}