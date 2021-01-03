
public class Exercise3_1 {

	public static void main(String[] args) {
		Item3_1 item1 = new Item3_1();
		Item3_1 item2 = new Item3_1();
		Item3_1 item3 = new Item3_1();

		item1.setName("消しゴム");
		item2.setName("えんぴつ");
		item3.setName("はさみ");

		item1.setPrice(120);
		item2.setPrice(100);
		item3.setPrice(300);

		item1.printItemInfo();
		item2.printItemInfo();
		item3.printItemInfo();


	}
}
