
public class Exercise3_2 {

	public static void main(String[] args) {

		Item3_2 item1 = new Item3_2();
		Item3_2 item2 = new Item3_2();
		Item3_2 item3 = new Item3_2();

		item1.setName("消しゴム");
		item2.setName("えんぴつ");
		item3.setName("はさみ");

		item1.setPrice(120);
		item2.setPrice(100);
		item3.setPrice(300);

		item1.printItemInfo();
		item2.printItemInfo();
		item3.printItemInfo();

		System.out.println("合計価格は、" + (item1.getPrice() + item2.getPrice() + item3.getPrice()) +"円です" );

	}



}
