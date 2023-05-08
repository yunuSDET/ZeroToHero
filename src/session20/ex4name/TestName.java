package session20.ex4name;

import java.util.ArrayList;
import java.util.Arrays;

public class TestName {

    public static void main(String[] args) {

        Name name1=new Name("yunus","the meaning of yunus",'M');
        Name name2=new Name("burak","the meaning of burak",'M');
        Name name3=new Name("ayse","the meaning of ayse",'F');
        Name name4=new Name("yeliz","the meaning of yeliz",'F');
        Name name5=new Name("ali","the meaning of ali",'M');
        Name name6=new Name("onur","the meaning of onur",'M');
        Name name7=new Name("gül","the meaning of gül",'F');

        ArrayList<Name> names=new ArrayList<>(Arrays.asList(name1,name2,name3,name4,name5,name6,name7));

        /*
        for (Name each : names) {
            if(each.gender=='M') System.out.println(each.name);
        }

        System.out.println("-".repeat(100));

        for (Name each : names) {
            if(each.gender=='F') System.out.println(each.name+" "+each.meaning);
        }
*/





        //Second solution
        names.stream()
                .filter(i->i.gender=='M')
                .forEach(i-> System.out.println(i.name));

        System.out.println("-".repeat(100));

        names.stream()
                .filter(i->i.gender=='F')
                .forEach(i-> System.out.println(i.name + "  "+i.meaning));


    }
}
