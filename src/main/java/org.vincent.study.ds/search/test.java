package org.vincent.study.ds.search;

public class test {
	public static void main(String[] args) {
		String[] str={"wo","ai","bei","jing","tian","an","men","tian","an","men","shang","tai","yang","sheng","!"};
		int[] num={8,17,26,32,40,72,87,99};
		SeqSearch.Search(str, "tian");//˳����� 
		SeqSearch.Search(str, "!");//˳�����
		
		BinarySearch.Search(num, 40);//�۰����
		BinarySearch.Search(num, 11);//�۰����
		System.out.println(BinarySearch_recur.Search(num, 0, num.length-1, 40));
		System.out.println(BinarySearch_recur.Search(num, 0, num.length-1, 11));
	}
}
