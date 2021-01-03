/**
 * OOP体験 アプリケーション
 *
 */
class Exercise1_3 {

    public static void main(String[] args) {

    	//インスタンス生成
    	//Sectionクラス 変数名
        Section1_3 parsonnel 	= new Section1_3();
        Section1_3 sales 		= new Section1_3();
        Section1_3 engineering  = new Section1_3();



        //インスタンスを3個作成。
        parsonnel.setName("人事部");
        sales.setName("営業部");
        engineering .setName("技術部");

        //インスタンスprintNameメソッドを実行

        parsonnel.printName();
        sales.printName();
        engineering.printName();


    }

}