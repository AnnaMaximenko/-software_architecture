package Homework_2.Manage.Prize.SilverPrize;

import Homework_2.Manage.IGameitem;


public class SilverRevard extends IGameitem{
    
    @Override
    public void open(){
        if (isOpen) {
            System.out.println("Сундук уже открыт");
            return;
        }
        System.out.println("Открыли сундук с серебром");
        isOpen=true;
    }

}
