package com.training;

import java.util.ArrayList;
import java.util.List;

public class Collection {
     public static void main(String args[]) {
    	 User user=new User();
    	 User user1=new User();
    	 List<User> list=new ArrayList();
    	 user.setId(11);
    	 user.setName("chandrika");
    	 user.setEmail("chandri7114@gmail.com");
    	 list.add(user);
    	 user1.setId(22);
    	 user1.setName("sana");
    	 user1.setEmail("sana34@gmail.com");
    	 list.add(user1);
    	 System.out.println(list);
    	 int index=list.indexOf(22);
    	 for(int i=index;i<index+3;i++) {
    		 list.remove(i);
    	 }
    	 System.out.println(list);
    	 
     }
}
