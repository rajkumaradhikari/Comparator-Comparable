import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Demo {
    public static void main(String[] args) {

        Comparator<Integer> comp = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
               if (o1%10> o2%10){
                   return 1;
               }  else
                   return -1;
            }
        };

        List<Integer> nums = new ArrayList<>();

        nums.add(10);
        nums.add(18);
        nums.add(19);
        nums.add(15);
        nums.add(11);
        nums.add(16);


        //Sort according to ascending order
        Collections.sort(nums,comp);

        //Sort according to descending order
//       Collections.sort(nums,Comparator.reverseOrder());

        System.out.println(nums);
    }
}
