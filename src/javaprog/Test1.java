package javaprog;

abstract interface Father{
	abstract void vehical();
	abstract void  money();
	
}

abstract interface Mother{
	abstract void jwells();
	abstract void  money();
	
}

class Kids implements Father,Mother
{
	
	public void vehical()
	{
		System.out.println("father's vehical");
	}
	public void jwells()
	{
		System.out.println("mother's jwells");
	}
	public void money()
	{
		System.out.println("money");
	}
	public static void main(String[]args)
	{ 
		Kids k=new Kids();
		k.vehical();
		k.jwells();
		k.money();
	}
}
