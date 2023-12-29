package OOPs;//Advanced Java Practice Set
//        Question 1: Create an ArrayList and store the names of ten students inside it. Print it using a for each loop.
//
//        Answer 1: As we discussed in the ArrayList tutorial of this playlist, add() method is used to insert element in an ArrayList. Below is the required program :
//
//import java.util.ArrayList;
//public class CWH{
//    public static void main(String[] args) {
//        ArrayList ar = new ArrayList();
//        ar.add("Student 1");
//        ar.add("Student 2");
//        ar.add("Student 3");
//        ar.add("Student 4");
//        ar.add("Student 5");
//        ar.add("Student 6");
//        ar.add("Student 7");
//        ar.add("Student 8");
//        ar.add("Student 9");
//        ar.add("Student 10");
//        for(Object o: ar){
//            System.out.println(o);
//        }
//    }
//}
//Output :
//        Student 1
//        Student 2
//        Student 3
//        Student 4
//        Student 5
//        Student 6
//        Student 7
//        Student 8
//        Student 9
//        Student 10
//        Question 2: Use the Date class in Java to print the time in the following format : 21:47:02.
//
//        Answer 2: In the Date class tutorial, we saw that how get() method can be used to print the dates in our desired format. Below is required program :
//
//        Date d = new Date();
//        System.out.println(d.getHours() + ":" + d.getMinutes() + ":" + d.getSeconds());
//        Output :
//        19:13:17
//        Question 3: Repeat question number 2 using the Calendar class.
//
//        Answer 3: In the Calendar class tutorial, we saw how we can use the Calendar.getInstance() static method to initialize an object of the Calendar class. After creating object, use the get() method to print the date in the desired formate. Below is the required program :
//
//        import java.util.Calendar;
//        import java.util.Date;
//
//public class CWH{
//    public static void main(String[] args) {
//        Calendar c = Calendar.getInstance();
//        System.out.println(c.get(Calendar.HOUR_OF_DAY) + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND));
//    }
//}
//
//
//Output :
//        19:15:26
//        Question 4: Repeat question number 2 using java.time API.
//
//        Answer 4: In the DateTimeFormatter class tutorial, I told you to use the format() method in order to change the date and time in the desired format.
//
//        import java.time.LocalDateTime;
//        import java.time.format.DateTimeFormatter;
//
//public class CWH{
//    public static void main(String[] args) {
//        LocalDateTime dt = LocalDateTime.now(); // This is the date
//        DateTimeFormatter df = DateTimeFormatter.ofPattern("H:m:s"); // This is the format
//        String myDate = dt.format(df); // Creating date string using date and format
//        System.out.println(myDate);
//    }
//}
//
//
//Output :
//        19:27:59
//        Question 5: Create a Set in java. Try to store the duplicate values elements inside this set and verify that only one instance is stored.
//
//        Answer 5: In the Hashset tutorial, we saw that only unique elements can be stored inside a Hashset. Below is the required code :
//
//        import java.util.HashSet;
//
//public class CWH{
//    public static void main(String[] args) {
//        HashSet<Integer> s = new HashSet();
//        s.add(5);
//        s.add(6);
//        s.add(46);
//        s.add(60);
//        s.add(9);
//        s.add(6);
//        System.out.println(s);
//    }
//}
//
//
//Output :
//        [5, 6, 9, 60, 46]
//        Code as described/written in the video :
//        package com.company;
//
//        import java.time.LocalDateTime;
//        import java.time.format.DateTimeFormatter;
//        import java.util.*;
//
//public class cwh_102_ps {
//    public static void main(String[] args) {
//        // PS Q1
//        ArrayList ar = new ArrayList();
//        ar.add("Student 1");
//        ar.add("Student 2");
//        ar.add("Student 3");
//        ar.add("Student 4");
//        ar.add("Student 5");
//        ar.add("Student 6");
//        ar.add("Student 7");
//        ar.add("Student 8");
//        ar.add("Student 9");
//        ar.add("Student 10");
//        for(Object o: ar){
//            System.out.println(o);
//        }
//
//        // PS Q2
//        Date d = new Date();
//        System.out.println(d.getHours() + ":" + d.getMinutes() + ":" + d.getSeconds());
//
//        // PS Q3
//        Calendar c = Calendar.getInstance();
//        System.out.println(c.get(Calendar.HOUR_OF_DAY) + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND));
//
//        // PS Q4
//        LocalDateTime dt = LocalDateTime.now(); // This is the date
//        DateTimeFormatter df = DateTimeFormatter.ofPattern("H:m:s"); // This is the format
//        String myDate = dt.format(df); // Creating date string using date and format
//        System.out.println(myDate);
//
//        // PS Q5
//        HashSet<Integer> s = new HashSet();
//        s.add(5);
//        s.add(6);
//        s.add(46);
//        s.add(60);
//        s.add(9);
//        s.add(6);
//        System.out.println(s);
//    }
//}