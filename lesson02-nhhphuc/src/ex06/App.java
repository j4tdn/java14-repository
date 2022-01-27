package ex06;

public class App {
	public static void main(String[] args) {
		 int i,j,x,m;
		 int count=0;
		 int n[] = new int [200];
        for(i=2;i>=2&&count<200;i++) {
       	 x=0;
   		 for(j=2;j<=i-1;j++) {
	    		 m=i%j;
	             if(m==0) {
		             x=1;
		             break;
	             }
            }
            if(x==0) {
           	 n[count] = i;
           	 //System.out.print(n[count] + " ");
           	 count ++;
            } 
        }
		 //System.out.print("---"+count);
        System.out.println("Số nguyên tố thứ 200 là: "+n[n.length-1]);
	}
}
