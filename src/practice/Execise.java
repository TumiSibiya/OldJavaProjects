package practice;

import java.util.List;
	import java.util.ArrayList;
	
class Execise{

	public ArrayList<Integer> findCommonElements(int[] arr1, int[] arr2){
		ArrayList<Integer> commonElements = new ArrayList<>();
		
		/*for(int countArr1 =0, countArr2 =0; countArr1 < arr1.length && 
		countArr2 < arr2.length; countArr1++, countArr2++){
			if(arr1 == arr2){	
                            System.out.println("countArr1 is "+ countArr1 +"\nAnd"+
                                    " countArr2 is "+ countArr2);
                            System.out.println(arr1 +" and "+arr2 +"is common");
				commonElements.add(arr1[countArr1]);break;
				}*/
                
                 for (int i = 0; i < arr1.length; i++) {
        for (int j = 0; j < arr2.length; j++) {
            if (arr1[i] == arr2[j]) {
                System.out.println( arr1[i] + " and "+ arr2[j] + " are common");
                commonElements.add(arr1[i]);
                break;
            }
        }
    }
		
	 return commonElements;
	}
	public static void main(String[] args){
	//new Execise().findCommonElements(new int[]{1,2,3,4}, new int[]{0,2,5,8});
            Execise access = new Execise();
            access.findCommonElements(new int[]{1,2,3,4}, new int[]{2,2,1,5});
	}
}