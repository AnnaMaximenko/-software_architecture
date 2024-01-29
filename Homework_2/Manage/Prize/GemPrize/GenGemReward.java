package Homework_2.Manage.Prize.GemPrize;

import Homework_2.Manage.GenItem;
import Homework_2.Manage.IGameitem;

public class GenGemReward implements GenItem{
    
    @Override
    public IGameitem createItem(){
        return new GemRevard();
    }
}
