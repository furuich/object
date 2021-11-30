package basic2.ex.inventory2;

//enumのように列挙型変数ではなく、IFで宣言した型を使う

import org.w3c.dom.ls.LSOutput;

class PersonalCompurter {
    private String UserName;
    private int pcNO;
    private int storageNo;
    private int price;
    private int bit;
    private String OS;

    public PersonalCompurter(String userName, int pcNO, int storageNo, int price, int bit, String OS) {
        UserName = userName;
        this.pcNO = pcNO;
        this.storageNo = storageNo;
        this.price = price;
        this.bit = bit;
        this.OS = OS;

    }

    public String getUserName() {
        return UserName;
    }

    public int getPcNO() {
        return pcNO;
    }

    public int getStorageNo() {
        return storageNo;
    }

    public int getPrice() {
        return price;
    }

    public int getBit() {
        return bit;
    }

    public String getOS() {
        return OS;
    }

    //toString を使わないとsoutしてもハッシュ値がでる
    @Override
    public String toString() {
        return String.format("%s %d %d %d %d %s ",
                UserName,pcNO,storageNo,price,bit,OS);
    }
}
