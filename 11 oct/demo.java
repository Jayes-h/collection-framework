/** FOR EACH LOOP WORKING */

//class demo{
//    public static void main(String ar[]){
//        int x=10;
//        for(int i:x){
//            System.out.println(i);
//        }
//    }
//}
//
//OUTPUT : compie time error
//demo.java:4: error: for-each not applicable to expression type
//        for(int i:x){
//        ^
//        required: array or java.lang.Iterable
//        found:    int
//        1 error

//class demo{
//    public static void main(String ar[]){
//        int x[]={10, 20, 30, 40, 50};
//        for(int i:x){
//            System.out.println(i);
//        }
//    }
//}
//
//OUTPUT :
//        G:\ColllectionFramework\11 oct>java demo
//        10
//        20
//        30
//        40
//        50

//class demo{
//    public static void main(String ar[]){
//        Double  x[]={10, 20, 30, 40, 50, 60.5};
//        for(Double i:x){
//            System.out.println(i);
//        }
//    }
//}
//
//OUTPUT :
//        demo.java:37: error: incompatible types: int cannot be converted to Double
//        Double  x[]={10, 20, 30, 40, 50, 60.5};
//        ^
//        demo.java:37: error: incompatible types: int cannot be converted to Double
//        Double  x[]={10, 20, 30, 40, 50, 60.5};
//        ^
//        demo.java:37: error: incompatible types: int cannot be converted to Double
//        Double  x[]={10, 20, 30, 40, 50, 60.5};
//        ^
//        demo.java:37: error: incompatible types: int cannot be converted to Double
//        Double  x[]={10, 20, 30, 40, 50, 60.5};
//        ^
//        demo.java:37: error: incompatible types: int cannot be converted to Double
//        Double  x[]={10, 20, 30, 40, 50, 60.5};
//        ^
//        5 errors

//class demo{
//    public static void main(String ar[]){
//        Number  x[]={10, 20, 30, 40, 50, 60.5};
//        for(Number i:x){
//            System.out.println(i);
//        }
//    }
//}
//
//OUTPUT :
//        10
//        20
//        30
//        40
//        50
//        60.5

//class demo{
//    public static void main(String ar[]){
//        Number  x[]={10, 20, 30, 40, 50, 60.5, 'A'};
//        for(Number i:x){
//            System.out.println(i);
//        }
//    }
//}
//
//OUTPUT :
//        demo.java:81: error: incompatible types: char cannot be converted to Number
//        Number  x[]={10, 20, 30, 40, 50, 60.5, 'A'};
//        ^
//        1 error

//class demo{
//    public static void main(String ar[]){
//        Number  x[]={10, 20, 30, 40, 50, 60.5, "ram"};
//        for(Number i:x){
//            System.out.println(i);
//        }
//    }
//}
//
//OUTPUT :
//        demo.java:96: error: incompatible types: String cannot be converted to Number
//        Number  x[]={10, 20, 30, 40, 50, 60.5, "ram"};
//        ^
//        1 error

/** MAX-MIN VALUE OF DOUBLE */

//class demo{
//    public static void main(String ar[]){
//        System.out.println(Double.MAX_VALUE);
//        System.out.println(Double.MIN_VALUE);
//    }
//}
//
//OUTPUT :
//        1.7976931348623157E308
//        4.9E-324

/** MAX-MIN VALUE OF INT */

//class demo{
//    public static void main(String ar[]){
//        System.out.println(Integer.MAX_VALUE);
//        System.out.println(Integer.MIN_VALUE);
//    }
//}
//
//OUTPUT :
//        2147483647
//        -2147483648

/** PRINT COMMENTS */
/**
//class demo{
//    public static void main(String ar[]){
//// \u000a        System.out.println("ram_1");
//// \u000b        System.out.println("ram_2");
//// \u000c        System.out.println("ram_3");
//// \u000d        System.out.println("ram_5");
//    }
//}
//
//OUTPUT :
//        ram_1
//        ram_5
//
 // // \u000a = unique code character
//    - hexadecimal form m likh skte h
//a = 10 (n)
//a = 13 (r)
 */

/** ARRAY LIST */

//import java.util.*;
//class demo{
//    public static void main(String ar[]){
//        ArrayList al = new ArrayList();
//        al.add(10);
//        al.add(20);
//        al.add(10.8);
//        al.add(10);
//        al.add("ram");
//        al.add(false);
//        al.add('A');
//        al.add(null);
//
//        System.out.println(al);
//    }
//}
//
//OUTPUT :
//        [10, 20, 10.8, 10, ram, false, A, null]

//import java.util.*;
//class demo{
//    public static void main(String ar[]){
//        ArrayList al = new ArrayList();
//        al.add(10);
//        al.add(20);
//        al.add(10.8);
//        al.add(10);
//        al.add("ram");
//        al.add(false);
//        al.add('A');
//        al.add(null);
//
//        for(Object o:al){
//            System.out.println(o);
//        }
//    }
//}
//
//OUTPUT :
//        10
//        20
//        10.8
//        10
//        ram
//        false
//        A
//        null

//import java.util.*;
//class demo{
//    public static void main(String ar[]){
//        ArrayList al = new ArrayList();
//        int x = 10;
//        al.add(x);
//        al.add(20);
//        al.add(10.8);
//        al.add(10);
//        al.add("ram");
//        al.add(false);
//        al.add('A');
//        al.add(null);
//
//        for(Object o:al){
//            System.out.println(o);
//        }
//    }
//}
//
//OUTPUT :
//        10
//        20
//        10.8
//        10
//        ram
//        false
//        A
//        null

/** SAME PROGRAM IN JAVA 1.4 VERSION */

import java.util.*;
class demo{
    public static void main(String ar[]){
        ArrayList al = new ArrayList();
        al.add(new Integer(10));
        al.add(new Integer(20));
        al.add(new Integer(30));
        al.add(new Integer(40));


            System.out.println(al);

    }
}

