
public class Exercise2_2 {

	public static void main(String[] args) {

		//会員インスタンス作成
		Partner2_1 aPartner = new Partner2_1();

		aPartner.modifyPartnerInfo(args[0], args[1], args[2], args[3]);
		String prv = aPartner.getPartnerString();
		System.out.println(prv);



	}

}
