package ex.inspection;

import basic.sample.enumsample.Gender;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ViewResult {
    public static void main(String[] args) {

        List<Result> results = new ArrayList<>();

        results.addAll(Arrays.asList(
                new Result("202110100905", "伊達政宗", "2021-10-05-T13:30:15",
                        38.8, 100, 100, 80,Gender.MEN,"視力低下のため片目に眼帯をしている"),
                new Result("201905040218", "上杉謙信", "2020-06-08-T16:44:44",
                        36.5, 180, 201, 120,Gender.MEN,"高血圧注意。塩分摂取量注意")
        ));

        for (Result r : results) {
            System.out.println(r);
        }
    }
}