package edu.fju.exam;

public class Bubble {

	public static void main(String[] args) {
		int tmp = 0;
		int numbers[] = {7, 13, 26, 53, 36, 28, 47};
		//         0   1   2   3   4   5   6
		for(int i=0; i < numbers.length-1;i++){
			for(int j=i+1; j < numbers.length;j++){
				if(numbers[i]<numbers[j]){
					tmp=numbers[i];
					numbers[i]=numbers[j];
					numbers[j]=tmp;
				}
			}
		}
		for(int k=0;k<numbers.length;k++){
		System.out.print( numbers[k]+" ");
		}

	}
		
	

}
