package basic2.ex.inventory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//IFで宣言しているので、implementsしよう

class ViewStock implements Constants{
    public static void main(String[] args) {

        List<PersonalComputer> personalComputers = new ArrayList<>();

        personalComputers.addAll(Arrays.asList(
                new PersonalComputer("やまだ",1,1,128,Constants.BIT_64,Constants.WIN_10),
                new PersonalComputer("いけだ",2,1,128,Constants.BIT_64,Constants.WIN_11),
                new PersonalComputer("いのうえ",3,1,500,Constants.BIT_64,Constants.WIN_11),
                new PersonalComputer("たむら",4,2,128,Constants.BIT_32,Constants.MAC),
                new PersonalComputer("わだ",5,2,500,Constants.BIT_32,Constants.WIN_10),
                new PersonalComputer("くどう",6,2,256,Constants.BIT_64,Constants.MAC),
                new PersonalComputer("さらど",7,3,256,Constants.BIT_32,Constants.WIN_10),
                new PersonalComputer("あいざわ",8,3,500,Constants.BIT_32,Constants.MAC)

                ));
        System.out.println(personalComputers);
        for (PersonalComputer st : personalComputers){
            System.out.println(st);
        }

    }
}
