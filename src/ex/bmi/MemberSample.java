package ex.bmi;

import basic.sample.enumsample.Gender;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MemberSample {
    public static void main(String[] args) {
        List<Member> members = new ArrayList<>();
        members.addAll(Arrays.asList(
                new Member("Kさん", Gender.OTHER, 28, 1.5, 51.3),
                new Member("Aさん", Gender.MEN, 35, 1.7, 80.8)


        ));

        Comparator <Member> order=Comparator.comparing(Member::getName);

        for (Member m : members) {
            System.out.println(m);
            members.sort(order);
            System.out.println(m);
            if (m.getBodyShape().equals("判定：肥満(1度)")) {
                System.out.println("yabai");
        }
                   }
        }




}
