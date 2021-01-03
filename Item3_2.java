
public class Item3_2 {
	int price;
	String name;


	void setPrice(int paramPrice) {
		this.price = paramPrice;
	}

	void setName(String paramName) {
		this.name = paramName;
	}


	void printItemInfo() {
		System.out.println(name + "の価格は、" + price + "円です。");
	}

	int getPrice() {
		return price;
	}

}
