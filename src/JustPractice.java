import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class JustPractice {

    static int staticValue = 10;
    public static void main(String[] args) {


//        List<String> list = List.of("1","3","4");
        List<Integer> list = List.of(1,3,4);


        list.stream().mapToInt(z->z).sum();
//        Stream stream = Arrays.stream(new String[]{"1", "2", "1","3","5"});
//
//        int sum = stream.mapToDouble(i->i).average();


    }


}

