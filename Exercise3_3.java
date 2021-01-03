
public class Exercise3_3 {

	public static void main(String[] args) {

		int total = 0;

		if(args.length % 2 != 0 || args.length == 0) {
			System.out.println("商品情報（商品名、価格）は、ペアで入力してください。");
			return;
		}

		Item3_2 aitem = new Item3_2();

		for(int i = 0; i < args.length; i++) {
			aitem.setName(args[i]);
			aitem.setPrice(Integer.parseInt(args[i + 1]));
			aitem.printItemInfo();
			total =+ aitem.getPrice();
		}

		System.out.println("合計価格は、" + total  +"円です" );

	}



}


//System.out.println(args[total]);
//Item3_2 item[] = new Item3_2[args.length];
//
//
//
//
//for(int i = 0; i < args.length ; i ++) {
//
//	//奇数処理
//	if(i % 2 != 0 || i == 0) {
//		item[i].setName(args[i]);
//		System.out.println(item[i].name);
//
//	//偶数処理
//	}else {
//		item[i].setPrice(Integer.parseInt(args[i]));
//		total = item[i].getPrice();
//	}
//}