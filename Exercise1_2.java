/**
 * OOP体験 アプリケーション
 *
 */
class Exercise1_2 {

    public static void main(String[] args) {

    	//インスタンス生成
    	//Sectionクラス 変数名
        Section1_2 parsonnel = new Section1_2();

        //インスタンスからsetNameメソッドを使用し、parsonnelのname変数に"人事部"を代入する。
        parsonnel.setName("人事部");

        //Exercise1の変数nameにparsonnelのgetNameメソッド戻り値を入れる

        parsonnel.printName();


    }

}