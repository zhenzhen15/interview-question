package arithmetic;

import java.util.Arrays;

/**
 * ʵ������a[1000]������������ͬ����
 * ���ַ�����
 * @author ����
 *
 */

public class SearchDemo {
	//nihao 
	//���ö��ֲ�����ͬ��Ԫ��
	public static void result(int data[]){
		Arrays.sort(data);
		for (int i = 0; i < data.length; i++) {
			int target = data[i];
			data[i]=0;
			int result = binaryFind(data, target);
			if(result!=-1){
				System.out.println("��ͬԪ��Ϊ��"+data[result]);
				break;
			}
		}
	}
	//ʵ�ֶ����㷨jjjj
	public static int binaryFind(int[]data,int target){
		int start = 0;
		int end = data.length-1;
		while(start<=end){
			int middleIndex = (start+end) /2;
			if(target==data[middleIndex]){
				return  middleIndex;
			}
			if(target>=data[middleIndex]){
				start = middleIndex +1 ;
			}else{
				end = middleIndex -1;
			}
		}
		return -1;
	}
}
 