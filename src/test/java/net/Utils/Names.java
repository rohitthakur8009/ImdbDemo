package net.Utils;

public class Names {
	
    String [] names = {"Lionel", "LeBron", "Novak", "Roger", "Tiger", "Virat", "Sachin", "Conor", "Serena", "Maria"};
    
    public String getName(int factor)
    {
    	return names[factor%10];
    }
    }
