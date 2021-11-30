package basic2.ex.inventory2;

//IFクラスで宣言すると、 public static　final は省略可能
//
//static　つけると、初期化をしなくても使える＝＝インスタンス化しなくても使える
//
public interface Constants {
    String WIN_10 = "Windows10";
    String WIN_11 = "Windows11";
    String MAC = "Mac";

    //bit
    public static final int BIT_64 = 64;
    int BIT_32 = 32;

}
