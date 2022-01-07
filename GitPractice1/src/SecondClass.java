
public class SecondClass {

	public static void main(String[] args) {
		int [] num = {3,5,7,4,3,7,9};
		
		for (int i=0;i<num.length-1;i++) {
			for (int j=0;j<num.length-1;j++) {
				if (num[j]>num[j+1]) {
					int temp = num[j];
					num[j]= num[j+1];
					num[j+1] = temp;
				}
			}
			
		}
		for (int i: num) {
			System.out.println(i);
			System.out.println("this line is in master");
		}

	}

}
