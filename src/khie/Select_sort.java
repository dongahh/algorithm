package khie;

//선택 정열: 제일 작은 수를 선택해서 앞으로 보내는작업.
public class Select_sort {

	public static void main(String[] args) {
		int array[] = {5,6,7,34,6,2,4,9};
		
		int i, j, min, max, index, temp;
		
		
		
		for(i=0; i<array.length;i++) {
			min=999;
			for(j=i+1; j<array.length; j++) {
				if(array[i]>array[j]) {
					temp = array[i];
					array[i]=array[j];
					array[j]=temp;				
				}				
			}			
		}
		
		for(i=0;i<array.length; i++) {
			
			System.out.println((i+1)+"번째 수 >>"+array[i]);
		}
		
	}

}
