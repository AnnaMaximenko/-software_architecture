package Homework_2.Manage.Prize.RubyPrize;

import Homework_2.Manage.IGameitem;


public class RubyRevard extends IGameitem{
    
    @Override
    public void open(){
        if (isOpen) {
            System.out.println("Сундук уже открыт");
            return;
        }
        System.out.println("Открыли сундук с рубинами");
        isOpen=true;
    }

}
