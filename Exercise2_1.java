
public class Exercise2_1 {

	public static void main(String[] args) {

		//会員インスタンス作成
		Partner2_1 aPartner = new Partner2_1();

		aPartner.modifyPartnerInfo("1125", "中田", "東京都", "03-0000-2222");
		String prv = aPartner.getPartnerString();
		System.out.println(prv);



	}

}
