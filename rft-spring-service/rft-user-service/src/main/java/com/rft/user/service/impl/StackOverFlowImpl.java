package com.rft.user.service.impl;

public class StackOverFlowImpl {

    private  int stackInteger=1;

    public  void stackLeak(){
        stackInteger++;
        stackLeak();
    }

    public static void main(String[] args) throws Throwable{
        StackOverFlowImpl stackOverFlow = new StackOverFlowImpl();
        try {
            stackOverFlow.stackLeak();
        }catch (Throwable e){
            System.out.println("stack length:"+stackOverFlow.stackInteger);
            throw  e;
        }
    }


}
