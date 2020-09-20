import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.io.File;


class DayOne {
    public static void main(String args[]) throws Exception {
        File file = new File("numbers.txt");
        Scanner sc = new Scanner(file);
        List<Integer> numList = new ArrayList<>();

        while (sc.hasNext()) {
            int number = sc.nextInt();
            numList.add(number);
        }

        System.out.println(numList.stream().mapToDouble(i -> Math.floor(i/3) -2).sum());
    }
}

// https://github.com/Lukas-Poslusny/Advent-of-code/tree/master/2019/Day%201/src/app