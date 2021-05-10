package com.wpj.home;

import java.util.ArrayList;
import java.util.Iterator;

public class Account {
    private  int balance ;
    private   ArrayList<String > mingxi;





    public Account(int balance) {
        this.balance = balance;
        mingxi = new ArrayList<String>();

    }

    public void  cunqian(int much,String shuoming) {
        balance += much;
        mingxi.add("收入\t" + balance +"\t" + much + "\t " + shuoming );
    }
    public void quqian(int much,String shuoming) {
        balance -= much;
        mingxi.add("支出\t" + balance +"\t" + much + "\t " + shuoming );
    }
    public void dayin() {
        Iterator<String> iterator = mingxi.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}
