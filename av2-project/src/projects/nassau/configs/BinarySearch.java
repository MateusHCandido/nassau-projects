package projects.nassau.configs;

import projects.nassau.entities.Book;
import projects.nassau.entities.User;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class BinarySearch {

    public static boolean enrollmentSearch(List<User> users, Integer enrollments) {
        Scanner input = new Scanner(System.in);
        //lambda expression to sort stripe by user registration
        Comparator<User> computer = ((o1, o2) -> o1.getEnrollment(enrollments).compareTo(o2.getEnrollment(enrollments)));
        users.sort(computer);
        //binary search of enrollments users
        boolean found = false;
        int init = 0;
        int finish = users.size();
        int middle = 0;

        while (init <= finish) {
            middle = (int) (init + finish) / 2;
            if (Objects.equals(users.get(middle).getEnrollment(enrollments), enrollments)) {
                found = true;
                break;
            } else if (users.get(middle).getEnrollment(enrollments) < enrollments) {
                init = middle + 1;
            } else {
                finish = middle - 1;
            }
        }
        if (found) {
            System.out.println("USER FOUND");
            System.out.println(users.get(middle).toString());
        } else System.out.println("ERROR 04: USER NOT FOUND");

        return found;
    }

}
