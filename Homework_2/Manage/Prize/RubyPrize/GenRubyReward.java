package Homework_2.Manage.Prize.RubyPrize;

import Homework_2.Manage.GenItem;
import Homework_2.Manage.IGameitem;

public class GenRubyReward implements GenItem{
    
    @Override
    public IGameitem createItem(){
        return new RubyRevard();
    }
}
