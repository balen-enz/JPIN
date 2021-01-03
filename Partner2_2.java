
public class Partner2_2 {

	//フィールド情報
	String number;
	String name;
	String address;
	String tel;

	String getPartnerString() {
		//インスタンスフィールドと、文字列データを戻り値にする
		return "会員番号: " + number +" 氏名: " + name + " 住所: " + address + " 電話番号: "+ tel ;
	}

	void modifyPartnerInfo(String paramNumber,String paramName,String paramAddress, String paramTel) {

		number = paramNumber;
		name = paramName;
		address = paramAddress;
		tel = paramTel;


	}


}
