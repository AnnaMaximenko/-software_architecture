package Homework_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import Homework_2.Manage.IGameitem;
import Homework_2.Manage.Prize.GemPrize.GemRevard;
import Homework_2.Manage.Prize.GoldPrize.GoldRevard;
import Homework_2.Manage.Prize.RubyPrize.RubyRevard;
import Homework_2.Manage.Prize.SilverPrize.SilverRevard;




public class Main {
    public static void main(String[] args) {
        List<IGameitem> fabricList = new ArrayList<>();

        fabricList.add(new GoldRevard());
        fabricList.add(new GemRevard());
        fabricList.add(new RubyRevard());
        fabricList.add(new SilverRevard());



        createAndOpenReward(fabricList);

    }
    static void createAndOpenReward(List<IGameitem> fabricList){
        Random rnd = ThreadLocalRandom.current();
        for (int i = 0; i < 20; i++) {
            IGameitem fabric = fabricList.get(Math.abs(rnd.nextInt()%fabricList.size()));
            fabric.open();
        }
    }
    
}
