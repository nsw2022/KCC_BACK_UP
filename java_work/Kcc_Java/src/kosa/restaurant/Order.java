package kosa.restaurant;

public class Order {
	private MenuItem items[] = new MenuItem[10];
	private int count;

	public Order() {
	}
	
	// 유효성 체크(클루텐 프리, 채식주의자)
	public boolean checdkedType(String type) {
		return type.equals("1") ? true : false;
	}

	// 메뉴 아이템 추가 메소드
	public void addItem(MenuItem item) {
//		System.out.println("귀하는 채식주의자인가요?: ");
//		String check = DataInput.sc.nextLine();
		if (count < items.length) { // 배열이 가득 차지 않았는지 확인
			items[count++] = item; // 아이템을 배열에 추가하고 카운트 증가
		} else {
			System.out.println("주문 가능한 아이템 수를 초과했습니다.");
		}
	}

	// 메뉴 아이템 삭제 메소드
	public void removeItem(MenuItem item) {
		for (int i = 0; i < count; i++) {
			if (items[i].equals(item)) {
				// 아이템을 찾은 경우, 해당 위치에서부터 배열을 앞으로 당김
				System.arraycopy(items, i + 1, items, i, count - i - 1);
				items[--count] = null; // 마지막 아이템을 null로 설정하고 카운트 감소
				return;
			}
		}
		System.out.println("해당 아이템이 주문 목록에 없습니다.");
	}

	// 총 가격 계산 메소드
	public int getTotalPrice() {
		int total = 0;
		for (int i = 0; i < count; i++) {
			total += items[i].getPrice(); // 각 아이템의 가격을 더함
		}
		return total;
	}

	// 주문 내역 표시 메소드
	public void displayOrder() {
		if (count == 0) {
			System.out.println("주문 내역이 비어 있습니다.");
			return;
		}
		System.out.println("주문 내역:");
		for (int i = 0; i < count; i++) {
			System.out.println((i + 1) + ". " + items[i].getName() + " - $" + items[i].getPrice());
		}
	}
	
	// 주문 결제 및 목록 초기화 메소드
    public void payOrder() {
        System.out.println("결제되었습니다. 총 금액: $" + getTotalPrice());
        items = new MenuItem[10]; // 주문 목록을 새로 초기화
        count = 0;
    }

	

}
