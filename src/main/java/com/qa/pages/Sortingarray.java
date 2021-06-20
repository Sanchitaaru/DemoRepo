package com.qa.pages;

public class Sortingarray
{

	public static void main(String[] args) 
	{
		int a[]= {10,45,2,1,30};
		int n=a.length;
	    for(int j=0;j<(n);j++)
	    {
	    	for (int i=0;i<(n-1);i++)
	    	{
	    		int temp;
	    		if (a[i]>=a[i+1]) 
	    		{
	    			temp=a[i];
	    			a[i]=a[i+1];
	    			a[i+1]=temp;
	    		}
		 
	    	}
	    }
	    	for(int j=0;j<n;j++)
	    	{
			System.out.println(a[j]);
	    	}
	
	}
	
}
