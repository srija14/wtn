package com.wipro.languagebasics;

public class Ex7 {
	
	public static void main (String[] args)
    {
    int k = args.length;
	if(k==0) {
	System.out.println("No values");
	}else {
	System.out.print(args[0]);
	for(int i=1;i<k;i++){
	System.out.print(","+ args[i]);
	}
	}  
        }
}



