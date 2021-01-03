/**
 * セクション(Department)クラスです。
 */
class Section1_1 {
    /** セクション名 */
    String name;



    //setNameは名前を入力するだけのメソッド、
    //戻り値がない為、voidにする。
    void setName(String paramName) {
        name = paramName;
    }

    //インスタンスの名前を取得するメソッド
    String getName() {
        return name;
    }
}