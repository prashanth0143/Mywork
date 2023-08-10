package StringsWithSubset;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Subset {
    public static void main(String[] args) {
        String name = "abc";

        //subSeq("", name);

        ArrayList<String> lsit = subSeqReturnAcc("",name);
        System.out.println(lsit);
//        String word = "aaaba";
//
//        int count = run(name,word);
//
//        System.out.println(count);

//        String ans = subset(name);
//
//        System.out.println(ans);

        //System.out.println(sunset2("", name));
    }

    static int run(String name, String word){
        int count = 0;

        if(name.isEmpty()){
            return count;
        }

        if(name.startsWith(word)){
            count+=1;
            return count + run(name.substring(word.length()), word);
        }else {
            return 0 + run(name.substring(1),word);
        }
    }

    static String subset(String name){

        if(name.isEmpty()){
            return name;

        }
        char ch =  name.charAt(0);

        if(ch == 'a'){
           return subset(name.substring(1));
        }else {
           return ch + subset(name.substring(1));
        }
    }

    static String sunset2(String empty, String name){

        if(name.isEmpty()){
            return empty;

        }

        char ch = name.charAt(0);

        if(ch == 'a'){
            return sunset2(empty , name.substring(1));
        }else {
            return sunset2(empty + ch , name.substring(1));
        }
    }


    static void subSeq(String empty, String name){

        if(name.isEmpty()){
            System.out.println(empty);
            return;
        }
        char ch = name.charAt(0);
        subSeq(empty+ch, name.substring(1));
        subSeq(empty,name.substring(1));
    }


    static ArrayList<String> subSeqReturn(String empty, String name){
        ArrayList<String> ne = new ArrayList<>();
        if(name.isEmpty()){
            ArrayList<String> list =  new ArrayList<>();
            list.add(empty);
            return list;
        }
        char ch = name.charAt(0);
       ArrayList<String> left =  subSeqReturn(empty+ch, name.substring(1));
        ArrayList<String> right = subSeqReturn(empty,name.substring(1));

        left.addAll(right);
        ne.addAll(left);
        return ne;


    }

    static ArrayList<String> subSeqReturnAcc(String empty, String name){
        ArrayList<String> ne = new ArrayList<>();
        if(name.isEmpty()){
            ArrayList<String> list =  new ArrayList<>();
            list.add(empty);
            return list;
        }
        char ch = name.charAt(0);
        ArrayList<String> left =  subSeqReturnAcc(empty+ch, name.substring(1));
        ArrayList<String> right = subSeqReturnAcc(empty,name.substring(1));
        ArrayList<String> ok  =  subSeqReturnAcc(empty +(ch+0), name.substring(1));

        left.addAll(right);
        left.addAll(ok);
        ne.addAll(left);
        return ne;


    }
}
