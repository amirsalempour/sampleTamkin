package ir.sadad.baam.learning.sample;

import java.lang.reflect.Array;
import java.util.*;

public class ClassLoaderSample {
    Map<User, List<String>> userListMap;
    User mirmir;
    User ehnamehnam ;
    User ooh;
    public ClassLoaderSample() {

         mirmir = new User("mir", "sp");
        ehnamehnam = new User("ehnam", "njm");
         ooh = new User("ohammad", "our");
        List<String> amirCourceList = Arrays.asList("mirT", "mirB", "mirC");
        List<String> behnamCourceList = Arrays.asList("ehnam agha", "ehnam khan", "ehnamC", "ehnamD");
        List<String> mohCourceList = Arrays.asList("mMohT", " ohB", "ohammadC");
        userListMap = new HashMap<User, List<String>>();
        userListMap.put(mirmir, amirCourceList);
        userListMap.put(ehnamehnam, behnamCourceList);
        userListMap.put(ooh, mohCourceList);

    }

    public void getFirstStudentCource() {

        User amir = new User("Amir", "sp");
        User behnam = new User("Behnam", "Anjom");
        User moh = new User("Mohammad", "Pour");
        List<String> amirCourceList = Arrays.asList("AmirT", "AmirB", "AmirC");
        List<String> behnamCourceList = Arrays.asList("Behnam agha", "behnam khan", "BehnamC", "behnamD");
        List<String> mohCourceList = Arrays.asList("mr MohT", " MohB", "MohammadC");

        Map<User, List<String>> userListMap = new HashMap<User, List<String>>();
        userListMap.put(amir, amirCourceList);
        userListMap.put(behnam, behnamCourceList);
        userListMap.put(moh, mohCourceList);
        UserCource userCources = new UserCource(userListMap);
        System.out.println("userCource is ::" + userCources);

    }

    public Map<String,List<String>> getSecondWay(List<String> nameFamily){
//        List<String> nameFamily = Arrays.asList("jhjh","ghj");
        Map<String,List<String>> userCourse = new HashMap<String, List<String>>();
        List<String> courses1 =  Arrays.asList("Riazi", "Adabiat");
        List<String> course2 = Arrays.asList("Farsi"," geography", "Zaban");
        for (String s : nameFamily){
            if (s.startsWith("s")|| s.startsWith("A")) userCourse.put(s,courses1);
            else userCourse.put(s,course2);
        }
        return userCourse;

    }
}
