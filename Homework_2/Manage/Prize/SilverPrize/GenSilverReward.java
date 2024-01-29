package Homework_2.Manage.Prize.SilverPrize;

import Homework_2.Manage.GenItem;
import Homework_2.Manage.IGameitem;

public class GenSilverReward implements GenItem{
    
    @Override
    public IGameitem createItem(){
        return new SilverRevard();
    }
}
