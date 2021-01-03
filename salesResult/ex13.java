package salesResult;
import java.util.Arrays;

//41行目 Arraysクラスを使用する為のインポート

class ex13 {
    /**
     * アプリケーションを起動する。
     *
     * @param args
     *            起動パラメータ文字列の配列
     */
    public static void main(String[] args) {
        int[] sales = { 88, 90, 52, 85, 63, 54, 92, 95, 74, 80, 68, 100 };
        //sales.length 12

        int flg = -1;
        int search = 90;

        //バブルソート
        //比較外側
        //length -1 を範囲とするのは、内ループjがiの一つ先との比較を行う為、最後まで回す必要がない。
        for(int i = 0; i < sales.length -1 ; i++) {

        	// 内側処理
        	//-1にするのは、配列が0開始の為。iの-1時の処理とはまた異なる
        	for(int j = sales.length -1  ; j > i ; j--) {
        		//手前と比較して、手前が大きければ、入れ替え処理
        		if(sales[j - 1] > sales[j]) {
                	int tmp = sales[j - 1];
                	sales[j - 1] = sales[j];
                	sales[j] = tmp;
        		}

        	}

        }
    	System.out.println(Arrays.toString(sales));


        //2分探索


    	//中央値
    	int mid = (sales[0] + sales[sales.length - 1]) /2;
    	int pos = sales.length / 2;

    	if( search < mid ) {
    		for(int j = 0 ; j < pos ; j++) {
    			if(search == sales[j]) {
    				flg = j + 1;
    				System.out.println("探索成功 *" + flg);
    				return;
    			}
    		}
    	}else{
				for(int k = sales.length -1 ; k > pos ; k--) {
        			if(search == sales[k]) {
        				flg = k + 1;
        				System.out.println("探索成功 *" + flg);
        				return;
        			}
				}
    	}

    }

 }


