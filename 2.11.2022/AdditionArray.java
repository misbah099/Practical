package array;

public class AdditionArray {

	public static void main(String[] args) {
		//create matrix
int [][]a= {{1,2,5},{3,4,5}};
int [][]b= {{1,2,2},{3,1,5}};
//for storing the addition of 'a'&'b'
int c[][]=new int[2][3];
//doing addition
for(int i=0;i<2;i++) {
	for(int j=0;j<3;j++) {
		c[i][j]=a[i][j]+b[i][j];
		System.out.print(c[i][j]+" ");
	}
	System.out.println();
}
	}

}
