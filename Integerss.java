import java.util.Scanner;
public class Integerss {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n,i,j,sum=0,n1,k;
		n=sc.nextInt();
		int arr[]=new int[n];
		k=sc.nextInt();
		for(i=0;i<n;i++){
			arr[i]=i+1;
	System.out.println(arr[i]);
			}
	
			for(j=0;j<k;j++){
				sum=sum+arr[j];
			}
			System.out.println(sum);
			}
}
