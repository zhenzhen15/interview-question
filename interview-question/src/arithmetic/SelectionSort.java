package arithmetic;

import static unit.SortUnit.swap;

/**
 * ���1-100�����������
 * ���򹤾��ࣨѡ������
 * @author ����
 *
 */
public class SelectionSort {
	public static void selectSort(int[] number){
		for (int i = 0; i < number.length-1; i++) {
			int m = i;
			for (int j = i+1; j < number.length; j++) {
				if(number[j]<number[m])
					m = j;
			}
			if(i!= m){
				swap(number,i,m);
			}
		}
	}
}
