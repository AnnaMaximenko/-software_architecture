package Homework_2.Manage.Prize.GoldPrize;

import Homework_2.Manage.GenItem;
import Homework_2.Manage.IGameitem;

public class GenGoldRevard implements GenItem{
    
    @Override
    public IGameitem createItem(){
        return new GoldRevard();
    }
}
