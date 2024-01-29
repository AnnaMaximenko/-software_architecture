package Homework_2.Manage.Prize.GemPrize;

import Homework_2.Manage.IGameitem;


public class GemRevard extends IGameitem{
    
    @Override
    public void open(){
        if (isOpen) {
            System.out.println("Сундук уже открыт");
            return;
        }
        System.out.println("Открыли сундук с изумрудами");
        isOpen=true;
    }

}
