
public class Exercise2_3 {

	public static void main(String[] args) {
		//起動パラメータが4個以外であれば、プログラム終了。
		if(args.length != 4) {
			return;
		}

		//会員インスタンス作成
		Partner2_1 aPartner = new Partner2_1();

		aPartner.modifyPartnerInfo(args[0], args[1], args[2], args[3]);
		String prv = aPartner.getPartnerString();
		System.out.println(prv);



	}

}
