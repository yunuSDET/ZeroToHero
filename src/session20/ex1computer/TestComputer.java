package session20.ex1computer;

import java.util.ArrayList;
import java.util.Arrays;

public class TestComputer {


    public static void main(String[] args) {


        Computer computer1=new Computer("Brand1","i3",1000);
        Computer computer2=new Computer("Brand2","i5",1700);
        Computer computer3=new Computer("Brand3","i7",3000);
        Computer computer4=new Computer("Brand4","i9",3500);
        Computer computer5=new Computer("Brand5","i3",1500);

        ArrayList<Computer> computers=new ArrayList<>(Arrays.asList(computer1,computer2,computer3,computer4,computer5));

        computers.forEach(Computer::open);

        System.out.println("-".repeat(100));

        computers.stream()
                .filter(i->i.cpu.equals("i3"))
                .forEach(Computer::close);

        System.out.println("-".repeat(100));

        computers.stream()
                .filter(i->i.isOpened)
                .forEach(System.out::println);


    }
}
