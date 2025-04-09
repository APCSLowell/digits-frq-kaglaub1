import java.util.ArrayList;

public class Digits
{

	private ArrayList<Integer> digitList;
	
	public Digits(int num)
	{ /* to be implemented in part (a) */ 
		digitList = new ArrayList<Integer>();
		boolean done = false;
		while (done == false){
			digitList.add(0, num%10);
			if (num == 0){
				done = true;
			}else{
				num = num/10;
			}
		}
		
	}

	public boolean isStrictlyIncreasing()
	{ /* to be implemented in part (b) */
		boolean inc = true;
		for (int i = 1; i < digitList.size(); i++){
			if (digitList.get(i) <= digitList.get(i-1)){
				inc = false;
			}
		}
		return inc;

	}
	
	public String toString()
	{
		return digitList.toString();
	}
}
