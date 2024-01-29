package Homework_2.Manage.Prize.GoldPrize;

import Homework_2.Manage.IGameitem;

public class GoldRevard extends IGameitem{
    
    @Override
    public void open(){
        if (isOpen) {
            System.out.println("Сундук уже открыт");
            return;
        }
        System.out.println("Открыли сундук с золотом");
        isOpen=true;
    }
}
