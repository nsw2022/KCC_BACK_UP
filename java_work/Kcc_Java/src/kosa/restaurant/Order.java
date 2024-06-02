package kosa.restaurant;

public class Order {
	private MenuItem items[] = new MenuItem[10];
	private int count;

	public Order() {
		System.out.println("��������� ���Ű� ȯ���մϴ�!");
	}

	// ����ڿ��� �޴� Ÿ���� �����ϰ� �ϰ� �޴� �׸��� ����Ϸ���.. ����� ���������..
	public void displayMenu() {
		System.out.println("1.����Ÿ����  2.�����ڽ�  3.����Ʈ  4.����");
		System.out.print("�޴��� �����ϼ���: ");
		String choice;
		 do {
	            System.out.println("1.����Ÿ����  2.�����ڽ�  3.����Ʈ  4.����Ȯ��  5.����  6.���� 7.����");
	            System.out.print("�޴��� �����ϼ���: ");
	            choice = DataInput.sc.nextLine();
	            switch (choice) {
	                case "1":
	                case "2":
	                case "3":
	                    selectMenu(choice.equals("1") ? "����Ÿ����" : choice.equals("2") ? "�����ڽ�" : "����Ʈ");
	                    break;

	                case "4":
	                	displayOrder();
	                	getTotalPrice();
	                	break;
	                	
	                case "5":
	                	 removeItem(); 
	                	break;
	                case "6":
	                	payOrder();
	                	break;
	                case "7":
	                    System.out.println("���α׷��� �����մϴ�.");
	                    break;
	                default:
	                    System.out.println("�߸��� �Է��Դϴ�. �ٽ� �������ּ���.");
	                    break;
	            }
	        } while (!choice.equals("7"));
	}

	public void selectMenu(String menuType) {
	        do {
	        	System.out.println(menuType + " �޴��Դϴ�. ��� �޴��� �ʿ��ϽŰ���? (��/�ƴϿ�)");
	            String isVegan = DataInput.sc.nextLine();
	            if (!isVegan.equals("��")&&!isVegan.equals("�ƴϿ�")) {
					System.out.println("�ȹٷ� ��� ���ϸ� ��Ӹ�");
					System.out.println(menuType + " �޴��Դϴ�. ��� �޴��� �ʿ��ϽŰ���? (��/�ƴϿ�)");
					continue;
				}
	            boolean vegan = isVegan.equals("��");
	            int startIndex = vegan ? 0 : 5;
	            int endIndex = vegan ? 4 : 9;

	            for (int i = startIndex; i <= endIndex; i++) {
	                MenuItem item = getMenu(i, menuType);
	                if (item != null) {
	                    System.out.println((i - startIndex + 1) + ". " + item.getName() + " - " + item.getDescription()
	                            + " - ����: " + item.getPrice() + "��");
	                }
	            }

	            System.out.print("�����ϰ� ���� �޴� ��ȣ�� �Է��ϼ���: ");
	            int selectedIndex = Integer.parseInt(DataInput.sc.nextLine()) - 1;
	            if (selectedIndex >= 0 && selectedIndex <= 4) {
	                addItem(getMenu(selectedIndex + startIndex, menuType));
	                System.out.println("�޴��� �ֹ��� �߰��Ǿ����ϴ�.");
	            } else {
	                System.out.println("�߸��� ��ȣ�Դϴ�.");
	            }
	            
	            System.out.println("����ؼ� " + menuType + " �޴��� ���ðڽ��ϱ�? (��/�ƴϿ�)");
	        } while(DataInput.sc.nextLine().equals("��"));
	    }
	// �޴� �׸��� ��ȯ�ϴ� �޼ҵ�
	public MenuItem getMenu(int index, String menuType) {
		// �޴� �׸��� ��� �迭�� ���� �ε����� �׸��� ��ȯ
		switch (menuType) {
		case "����Ÿ����":
			return getAppetizer(index);
		case "�����ڽ�":
			return getMainCourse(index);
		case "����Ʈ":
			return getDessert(index);
		default:
			return null;
		}
	}

	// ����Ÿ���� �迭�� ��ȯ�ϴ¸޼ҵ�
	public MenuItem getAppetizer(int index) {
		// ���� ������
		MenuItem[] appetizers = {
				new Appetizer("��� ������ ��", "�ż��� ä�ҿ� ���δ� �κγ� ������ �־� ���� ��� ������ ���� ������ �ǰ��� ������ �����մϴ�.", 3000, 100, true),
				new Appetizer("��ӽ��� ä�� ��ƽ", "ǳ���� �ܹ����� �������� �����ϴ� ��ӽ��� ���Ƹ������� �����, ä�� ��ƽ�� �Բ� �����˴ϴ�.", 4500, 150, true),
				new Appetizer("��� ��Ʈ��", "��ü���̳� �پ��� ä�ҷ� ���� ��Ʈ���� ��� ģȭ���̸� �丶�� �ҽ��� �� ��︳�ϴ�.", 6500, 200, true),
				new Appetizer("������ �丶���� ��罺��Ÿ", "���� ������ �ż��� �丶�� ���� �ø��� ���ϰ� ������ ���� ����� �����ϸ鼭�� ���ִ� �丮�Դϴ�.", 4500, 120,true),
				new Appetizer("��� ġ�� �÷���", "��� ġ��� �߰���, ��, �ø��� ������ ������� �پ��� ���� ������ �����մϴ�.", 7500, 250, true),
				new Appetizer("���� Ĭ����", "������ ����� ������ Ĭ���� �ҽ��� ����� Ŭ������ ����Ÿ�����Դϴ�.", 8500, 120, false),
				new Appetizer("��¥���� ��ƽ", "�ٻ�ٻ��� Ƣ�� �ʿ� ���� �ε巯�� ��¥���� ġ� ��Ƴ����ϴ�. �丶�� �ҽ��� �Բ� �����˴ϴ�.", 6500, 180, false),
				new Appetizer("ġŲ ��", "�ٻ��ϰ� Ƣ���� ġŲ ���� �پ��� ���� �ҽ��� �����Ǹ� ���ֿ� �� ��︳�ϴ�.", 7500, 210, false),
				new Appetizer("���� ��Ų", "�ٻ��� ���� ���� �ȿ� ġ��� ������ ������ �� ���쿡�� �������ϴ�.", 5000, 160, false),
				new Appetizer("���� �ʹ�", "�ż��� ������ �ε巯�� �ʹ� ���� ���յ� �Ϻ� ���� �����Դϴ�.", 7000, 100, false) };
		// �߰� ������ �ʿ�

		return index >= 0 && index < appetizers.length ? appetizers[index] : null;
	}

	// �����ڽ� �迭�� ��ȯ�ϴ� �޼ҵ�
	public MenuItem getMainCourse(int index) {
		
		MenuItem[] mainCourses = { new MainCoure("������ũ�� ����", "�������� �׸� ������ũ�� ���� ���ڸ� �����", 25000, 600, true),
				new MainCoure("ġŲ �Ľ�Ÿ", "ũ������ �ҽ��� �Բ� �����Ǵ� ǳ�� ������ ġŲ �Ľ�Ÿ", 18000, 500, true),
				new MainCoure("�ǽ� �� Ĩ��", "�ٻ��ϰ� Ƣ�� ������ ����Ƣ��", 20000, 530, true),
				new MainCoure("���ڳ�", "�� ���� ġ��� ǳ���� ��Ʈ �ҽ��� ����� ���� ��Ż���� ���ڳ�", 22000, 700, true),
				new MainCoure("���� �����Ը�Ÿ", "�ż��� ��¥����, ����, �丶�� �ҽ��� �ö� Ŭ���� ����", 19000, 550, true),

				// �۷����� �������� �ʴ� �޴�
				new MainCoure("�۷��� ���� ����", "�۷��� ���� ���̽��� �ż��� ������ �ø� ����", 21000, 500, false),
				new MainCoure("������� ������", "�پ��� ä�ҿ� �Բ��ϴ� ���� ���� ������� ������", 17000, 350, false),
				new MainCoure("�۷��� ���� ġŲ ��", "�۷����� ���� ������ ����� Ƣ�� ġŲ ��", 19000, 400, false),
				new MainCoure("�۷��� ���� ���� ��Ʃ", "õõ�� ������ �ε巯�� ������ ��ä�� �� ��Ʃ", 23000, 550, false),
				new MainCoure("�۷��� ���� ���� ������", "�ż��� ����� �Բ� �����Ǵ� ũ������ ������", 25000, 480, false) };
		return index >= 0 && index < mainCourses.length ? mainCourses[index] : null;
	}

	// ����Ʈ �迭�� ��ȯ�ϴ� �޼ҵ�
	public MenuItem getDessert(int index) {
		
		MenuItem[] desserts = { new Dessert("���ݸ� ����", "���ϰ� ũ������ ���ݸ� ����", 7000, 450, true),
				new Dessert("�۷��� ���� ���ݸ� ����ũ", "�۷����� ����Ͽ� ���� ǳ�� ������ ���ݸ� ����ũ", 9500, 450, true),
				new Dessert("���� ����", "����� �ó����� ������ ������ ����", 7500, 300, true),
				new Dessert("���ڳ� �÷�", "�ε巯�� ���ڳ� Ǫ��", 6500, 250, true),
				new Dessert("�ٴҶ� �� ���̽�ũ��", "��¥ �ٴҶ� ���� ����� �ε巯�� ���̽�ũ��", 5500, 180, true),
				new Dessert("Ƽ��̼�", "��Ż���� ���� Ŀ�� �� ����Ʈ", 9000, 400, false),
				new Dessert("�����", "�����ϰ� ���� ���ݸ� �����", 6000, 500, false),
				new Dessert("���� ü������ũ", "��ŭ�� ����� ũ������ ġ���� �Ϻ��� ��ȭ", 8500, 370, false),
				new Dessert("ī��� Ǫ��", "������ ī��� �ҽ��� ����� �ε巯�� Ǫ��", 7000, 320, false),
				new Dessert("���� Ÿ��Ʈ", "�ż��� ������ �ε巯�� ũ���� ��췯�� Ÿ��Ʈ", 8000, 350, false) };
		return index >= 0 && index < desserts.length ? desserts[index] : null;
	}

	// ������ �߰� �޼ҵ�
	public void addItem(MenuItem item) {
		if (count < items.length) {
			items[count++] = item;
		} else {
			System.out.println("�ֹ� ������ ������ ���� �ʰ��߽��ϴ�.");
		}
	}

	// �޴� ������ ���� �޼ҵ�
	public void removeItem() {
		  if (count == 0) {
		        System.out.println("�ֹ� ������ ��� �ֽ��ϴ�.");
		        return;
		    }
		    
		    displayOrder();  // ���� �ֹ� ������ ǥ��
		    System.out.print("�����ϰ� ���� �޴� ��ȣ�� �Է��ϼ��� (1-" + count + "): ");
		    int itemNumber = Integer.parseInt(DataInput.sc.nextLine()) - 1; // ����� �Է��� �ε����� ��ȯ
		    
		    if (itemNumber >= 0 && itemNumber < count) {
		        // �迭 ��� �̵����� ���� ó��
		        System.arraycopy(items, itemNumber + 1, items, itemNumber, count - itemNumber - 1);
		        items[--count] = null;  // ������ ��� null ó��
		        System.out.println("�����Ͻ� �޴��� �����Ǿ����ϴ�.");
		    } else {
		        System.out.println("�߸��� ��ȣ�Դϴ�. �ٽ� �Է����ּ���.");
		    }
	}

	// �� ���� ��� �޼ҵ�
	public int getTotalPrice() {
		int total = 0;
		for (int i = 0; i < count; i++) {
			total += items[i].getPrice(); // �� �������� ������ ����
		}
		return total;
	}

	// �ֹ� ���� ǥ�� �޼ҵ�
	public void displayOrder() {
		if (count == 0) {
			System.out.println("�ֹ� ������ ��� �ֽ��ϴ�.");
			return;
		}
		System.out.println("�ֹ� ����:");
		  for (int i = 0; i < count; i++) {
		        MenuItem item = items[i];
		        String type;
		        if (item instanceof Appetizer) {
		            type = "����Ÿ����";
		        } else if (item instanceof MainCoure) {
		            type = "�����ڽ�";
		        } else if (item instanceof Dessert) {
		            type = "����Ʈ";
		        } else {
		            type = "�� �� ���� ����";
		        }
		        System.out.printf("%d. %s (%s) - $%d\n", (i + 1), item.getName(), type, item.getPrice());
		    }
		System.out.printf("���� �� ���� : $%d \n",getTotalPrice());
	}

	// �ֹ� ���� �� ��� �ʱ�ȭ �޼ҵ�
	public void payOrder() {
		if (getTotalPrice()==0) System.out.println("���� �ֹ� ���ϼ˴µ� �Ф�");
		
		System.out.println("�����Ǿ����ϴ�. �� �ݾ�: $" + getTotalPrice());
		items = new MenuItem[10]; // �ֹ� ����� ���� �ʱ�ȭ
		count = 0;
	}

	public MenuItem[] getItems() {
		return items;
	}

	public void setItems(MenuItem[] items) {
		this.items = items;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

}
