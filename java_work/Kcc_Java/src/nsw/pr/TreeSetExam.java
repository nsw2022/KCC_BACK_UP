package nsw.pr;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExam {
	public static void main(String[] args) {
		//TreeSet �÷��� �ϼ�
		TreeSet<Integer> scores = new TreeSet<Integer>();
		
		// Integer ��ü ����
		scores.add(87);
		scores.add(98);
		scores.add(75);
		scores.add(95);
		scores.add(80);
		
		// ���ĵ� Integer ��ü�� �ϳ��� ��������
		for (Integer s : scores) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		// Ư�� Integer ��ü�� ��������
		System.out.println("���� ���� ���� : " + scores.first());
		System.out.println("���� ���� ���� : " + scores.last());
		System.out.println("95�� �Ʒ� ���� : " + scores.lower(95));
		System.out.println("95�� ���� ���� : " + scores.higher(95));
		System.out.println("95�� �̰ų� �ٷ� �Ʒ� ���� : " + scores.floor(95));
		System.out.println("85���̰ų� �ٷ� ���� ���� : " + scores.ceiling(85) + "\n");
		
		// ������������ �����ϱ�
		NavigableSet<Integer> descendingScores = scores.descendingSet();
		for (Integer s : descendingScores) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		// ���� �˻�( 80 <= )
		NavigableSet<Integer> rangeSet = scores.tailSet(80, true);
		for (Integer s : rangeSet) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		// ���� �˻� ( 80 <= s3core < 90)
		rangeSet = scores.subSet(80, true, 90, false);
		for (Integer s : rangeSet) {
			System.out.print(s + " ");
		}
		System.out.println();
	}
}
