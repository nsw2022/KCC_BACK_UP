package nsw.collection;

import java.util.ArrayList;

public interface Main {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();

		// 1. ����� ����
		System.out.println("��� ���� : " + list.size());

		// 2. ��� �߰�
		String s = new String("aa");
		list.add(s);
		list.add(new String("bb"));
		list.add("cc"); // �ڵ� new String()
		System.out.println("��� ���� : " + list.size());

		// 3. ��� ������
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));

		// 4. ��� ����
		list.remove(1);
		System.out.println("��� ���� : " + list.size());
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		// System.out.println( list.get(2) ); //Exception�߻�

		// 5. Ư����ġ�� ����߰�
		list.add(1, "dd"); // 1���濡 "dd"���ڿ� ����
		System.out.println("��� ���� : " + list.size());
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));

		// 6. ������� �Ҷ� �ε��� ��ȣ�� �ƴ϶� ��ü���������ε� ���� ����
		String s2 = new String("Test");
		list.add(s2);
		System.out.println("��� ���� : " + list.size());
		list.remove(s2);
		System.out.println("��� ���� : " + list.size());

		// 7. ��� ��� �����
		list.clear();
		System.out.println("��� ���� : " + list.size());

		// 8. �ߺ��� ������ �߰� ������.
		list.add("aa");
		list.add("aa");
		list.add("aa");
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));

		// 9. ����� �˻� ���� ��ɵ�.
		System.out.println(list.contains("aa")); // �� �����Ͱ� �����ϴ��� ����[true/false]
		System.out.println(list.contains("bb"));

		list.clear();
		System.out.println(list.isEmpty()); // ����Ʈ�� ����ִ��� ����

		// 10. �ѹ��� ������ҵ��� �߰��ϱ�.
		list.add("aa");
		list.add("bb");
		list.add("cc");

		// �� �ٸ� ����Ʈ��ü
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("kk");
		list2.add("ss");

		// �ٸ� ����Ʈ�� ��ҵ��� �ѹ濡 �߰���Ű�� ���
		list.addAll(list2);
		System.out.println(list.toString()); // �ڵ� ��ҵ��� [,,,]�ؼ� ���ڿ��� ��������

		// 10.1 ������Ҹ� �ѹ濡 �߰��Ҷ� Ư����ġ�� ������ �����ϱ�.
		list.addAll(1, list2);
		System.out.println(list.toString());
		// 11. Ư����ҵ��� �ѹ濡 �����ϱ�

		// ���� ����� ���� ����Ʈ��ü - ������Ʈ (�����)
		ArrayList<String> list3 = new ArrayList<String>();
		list3.add("aa");
		list3.add("kk");

		list.removeAll(list3);
		System.out.println(list.toString());

		// 12. Ư����ҵ鸸 ����� ��� ����..
		ArrayList<String> list4 = new ArrayList<String>();
		list4.add("ss");

		list.retainAll(list4);
		System.out.println(list.toString());

		// 13. Ư�� ��ҵ��� ��� ���ԵǾ� �ִ��� ��.
		list.clear();

		list.add("aa");
		list.add("bb");
		list.add("cc");
		list.add("dd");
		list.add("ee");
		list.add("ff");
		list.add("cc");
		list.add("aa");
		list.add("gg");
		// �˻��� �����͵��� ���� �� �ٸ� ����Ʈ��ü
		ArrayList<String> list5 = new ArrayList<String>();
		list5.add("aa");
		list5.add("bb");
		System.out.println(list.containsAll(list5)); // true

		list5.add("kk");
		System.out.println(list.containsAll(list5)); // false

	}

}
