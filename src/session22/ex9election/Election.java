package session22.ex9election;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Election {
    public static Map<String, Integer> electionMap = new TreeMap<>();

    public static void main(String[] args) {

        electionMap.put("yunus", 0);
        electionMap.put("burak", 0);
        electionMap.put("ayşe", 0);
        electionMap.put("tugba", 0);
        electionMap.put("caglar", 0);
        electionMap.put("nesrin", 0);



        addVotes("yunus");
        addVotes("yunus");
        addVotes("burak");
        addVotes("yunus");
        addVotes("ayşe");
        addVotes("yunus");
        addVotes("tugba");
        addVotes("yunus");
        addVotes("caglar");
        addVotes("yunus");
        addVotes("yunus");
        addVotes("ayşe");
        addVotes("burak");
        addVotes("caglar");
        addVotes("nesrin");
        addVotes("yunus");


        determineTheWinner();



    }




    public static void addVotes(String name) {
        int newValue = electionMap.get(name) + 1;
        electionMap.put(name, newValue);
    }

    public static void retrieveVote(String name) {
        System.out.println(name+" has " + electionMap.get(name)+ " votes");
    }

    public static void determineTheWinner() {
        int maxVote = 0;
        String winner = "";
        for (Map.Entry<String, Integer> each : electionMap.entrySet()) {
            if (maxVote < each.getValue()) {
                maxVote = each.getValue();
                winner = each.getKey();
            }
        }


        for (Map.Entry<String, Integer> each : electionMap.entrySet()) {
            retrieveVote(each.getKey());
        }
        System.out.println("The winner is " + winner + " with " + maxVote + " votes.");

    }

}
