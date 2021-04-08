package com.kiran.java.mockito.HandsOnLMSRefactoring;

import java.util.ArrayList;

public class TransactionDAO {
	ArrayList<Transaction> transactionList =  new ArrayList<Transaction>();
	
	public void addTransaction(Transaction obj){
		
	    transactionList.add(obj);
	}
	
	public void removeTransaction(Transaction obj)
	{
	    transactionList.remove(obj);
	}
	


	
	public void viewTransaction(){
		if (transactionList.isEmpty()){
            System.out.println("Transaction List is empty");
		}
        else{
            transactionList.forEach(System.out::println);
        }
		
	}
	

}
