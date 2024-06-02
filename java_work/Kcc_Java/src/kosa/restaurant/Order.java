package kosa.restaurant;

public class Order {
	private MenuItem items[] = new MenuItem[10];
	private int count;

	public Order() {
		System.out.println("레스토랑에 오신걸 환영합니다!");
	}

	// 사용자에게 메뉴 타입을 선택하게 하고 메뉴 항목을 출력하려함.. 상당히 길어질듯함..
	public void displayMenu() {
		System.out.println("1.에피타이저  2.메인코스  3.디저트  4.종료");
		System.out.print("메뉴를 선택하세요: ");
		String choice;
		 do {
	            System.out.println("1.에피타이저  2.메인코스  3.디저트  4.내역확인  5.삭제  6.결제 7.종료");
	            System.out.print("메뉴를 선택하세요: ");
	            choice = DataInput.sc.nextLine();
	            switch (choice) {
	                case "1":
	                case "2":
	                case "3":
	                    selectMenu(choice.equals("1") ? "에피타이저" : choice.equals("2") ? "메인코스" : "디저트");
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
	                    System.out.println("프로그램을 종료합니다.");
	                    break;
	                default:
	                    System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
	                    break;
	            }
	        } while (!choice.equals("7"));
	}

	public void selectMenu(String menuType) {
	        do {
	        	System.out.println(menuType + " 메뉴입니다. 비건 메뉴가 필요하신가요? (예/아니오)");
	            String isVegan = DataInput.sc.nextLine();
	            if (!isVegan.equals("예")&&!isVegan.equals("아니오")) {
					System.out.println("똑바로 대답 못하면 대머리");
					System.out.println(menuType + " 메뉴입니다. 비건 메뉴가 필요하신가요? (예/아니오)");
					continue;
				}
	            boolean vegan = isVegan.equals("예");
	            int startIndex = vegan ? 0 : 5;
	            int endIndex = vegan ? 4 : 9;

	            for (int i = startIndex; i <= endIndex; i++) {
	                MenuItem item = getMenu(i, menuType);
	                if (item != null) {
	                    System.out.println((i - startIndex + 1) + ". " + item.getName() + " - " + item.getDescription()
	                            + " - 가격: " + item.getPrice() + "원");
	                }
	            }

	            System.out.print("선택하고 싶은 메뉴 번호를 입력하세요: ");
	            int selectedIndex = Integer.parseInt(DataInput.sc.nextLine()) - 1;
	            if (selectedIndex >= 0 && selectedIndex <= 4) {
	                addItem(getMenu(selectedIndex + startIndex, menuType));
	                System.out.println("메뉴가 주문에 추가되었습니다.");
	            } else {
	                System.out.println("잘못된 번호입니다.");
	            }
	            
	            System.out.println("계속해서 " + menuType + " 메뉴를 보시겠습니까? (예/아니오)");
	        } while(DataInput.sc.nextLine().equals("예"));
	    }
	// 메뉴 항목을 반환하는 메소드
	public MenuItem getMenu(int index, String menuType) {
		// 메뉴 항목이 담긴 배열에 따라 인덱스로 항목을 반환
		switch (menuType) {
		case "에피타이저":
			return getAppetizer(index);
		case "메인코스":
			return getMainCourse(index);
		case "디저트":
			return getDessert(index);
		default:
			return null;
		}
	}

	// 에피타이저 배열을 반환하는메소드
	public MenuItem getAppetizer(int index) {
		// 예시 데이터
		MenuItem[] appetizers = {
				new Appetizer("비건 스프링 롤", "신선한 채소와 때로는 두부나 국수를 넣어 만든 비건 스프링 롤은 가볍고 건강한 시작을 제공합니다.", 3000, 100, true),
				new Appetizer("허머스와 채소 스틱", "풍부한 단백질과 섬유질을 제공하는 허머스는 병아리콩으로 만들며, 채소 스틱과 함께 제공됩니다.", 4500, 150, true),
				new Appetizer("비건 미트볼", "대체육이나 다양한 채소로 만든 미트볼은 비건 친화적이며 토마토 소스와 잘 어울립니다.", 6500, 200, true),
				new Appetizer("가지와 토마토의 브루스케타", "구운 가지와 신선한 토마토 위에 올리브 오일과 바질을 더해 만드는 간단하면서도 맛있는 요리입니다.", 4500, 120,true),
				new Appetizer("비건 치즈 플래터", "비건 치즈는 견과류, 콩, 올리브 등으로 만들어져 다양한 맛과 질감을 제공합니다.", 7500, 250, true),
				new Appetizer("새우 칵테일", "차가운 새우와 매콤한 칵테일 소스를 곁들인 클래식한 에피타이저입니다.", 8500, 120, false),
				new Appetizer("모짜렐라 스틱", "바삭바삭한 튀김 옷에 싸인 부드러운 모짜렐라 치즈가 녹아내립니다. 토마토 소스와 함께 제공됩니다.", 6500, 180, false),
				new Appetizer("치킨 윙", "바삭하게 튀겨진 치킨 윙은 다양한 맛의 소스로 제공되며 맥주와 잘 어울립니다.", 7500, 210, false),
				new Appetizer("감자 스킨", "바삭한 감자 껍질 안에 치즈와 베이컨 조각이 들어가 오븐에서 구워집니다.", 5000, 160, false),
				new Appetizer("낙지 초밥", "신선한 낙지와 부드러운 초밥 밥이 결합된 일본 전통 음식입니다.", 7000, 100, false) };
		// 추가 데이터 필요

		return index >= 0 && index < appetizers.length ? appetizers[index] : null;
	}

	// 메인코스 배열을 반환하는 메소드
	public MenuItem getMainCourse(int index) {
		
		MenuItem[] mainCourses = { new MainCoure("스테이크와 감자", "고전적인 그릴 스테이크에 구운 감자를 곁들임", 25000, 600, true),
				new MainCoure("치킨 파스타", "크리미한 소스와 함께 제공되는 풍미 가득한 치킨 파스타", 18000, 500, true),
				new MainCoure("피시 앤 칩스", "바삭하게 튀긴 생선과 감자튀김", 20000, 530, true),
				new MainCoure("라자냐", "세 가지 치즈와 풍부한 미트 소스를 사용한 전통 이탈리안 라자냐", 22000, 700, true),
				new MainCoure("피자 마르게리타", "신선한 모짜렐라, 바질, 토마토 소스가 올라간 클래식 피자", 19000, 550, true),

				// 글루텐을 포함하지 않는 메뉴
				new MainCoure("글루텐 프리 피자", "글루텐 프리 베이스에 신선한 토핑을 올린 피자", 21000, 500, false),
				new MainCoure("쿼리노아 샐러드", "다양한 채소와 함께하는 영양 만점 쿼리노아 샐러드", 17000, 350, false),
				new MainCoure("글루텐 프리 치킨 볼", "글루텐이 없는 옥수수 가루로 튀긴 치킨 볼", 19000, 400, false),
				new MainCoure("글루텐 프리 비프 스튜", "천천히 조리된 부드러운 비프와 야채가 들어간 스튜", 23000, 550, false),
				new MainCoure("글루텐 프리 새우 리조또", "신선한 새우와 함께 제공되는 크리미한 리조또", 25000, 480, false) };
		return index >= 0 && index < mainCourses.length ? mainCourses[index] : null;
	}

	// 디저트 배열을 반환하는 메소드
	public MenuItem getDessert(int index) {
		
		MenuItem[] desserts = { new Dessert("초콜릿 무스", "진하고 크리미한 초콜릿 무스", 7000, 450, true),
				new Dessert("글루텐 프리 초콜릿 케이크", "글루텐을 사용하여 만든 풍미 가득한 초콜릿 케이크", 9500, 450, true),
				new Dessert("애플 파이", "사과와 시나몬이 가득한 따뜻한 파이", 7500, 300, true),
				new Dessert("코코넛 플랜", "부드러운 코코넛 푸딩", 6500, 250, true),
				new Dessert("바닐라 콩 아이스크림", "진짜 바닐라 콩을 사용한 부드러운 아이스크림", 5500, 180, true),
				new Dessert("티라미수", "이탈리아 전통 커피 맛 디저트", 9000, 400, false),
				new Dessert("브라우니", "촉촉하고 진한 초콜릿 브라우니", 6000, 500, false),
				new Dessert("레몬 체스케이크", "상큼한 레몬과 크리미한 치즈의 완벽한 조화", 8500, 370, false),
				new Dessert("카라멜 푸딩", "달콤한 카라멜 소스를 곁들인 부드러운 푸딩", 7000, 320, false),
				new Dessert("베리 타르트", "신선한 베리와 부드러운 크림이 어우러진 타르트", 8000, 350, false) };
		return index >= 0 && index < desserts.length ? desserts[index] : null;
	}

	// 아이템 추가 메소드
	public void addItem(MenuItem item) {
		if (count < items.length) {
			items[count++] = item;
		} else {
			System.out.println("주문 가능한 아이템 수를 초과했습니다.");
		}
	}

	// 메뉴 아이템 삭제 메소드
	public void removeItem() {
		  if (count == 0) {
		        System.out.println("주문 내역이 비어 있습니다.");
		        return;
		    }
		    
		    displayOrder();  // 현재 주문 내역을 표시
		    System.out.print("삭제하고 싶은 메뉴 번호를 입력하세요 (1-" + count + "): ");
		    int itemNumber = Integer.parseInt(DataInput.sc.nextLine()) - 1; // 사용자 입력을 인덱스로 변환
		    
		    if (itemNumber >= 0 && itemNumber < count) {
		        // 배열 요소 이동으로 삭제 처리
		        System.arraycopy(items, itemNumber + 1, items, itemNumber, count - itemNumber - 1);
		        items[--count] = null;  // 마지막 요소 null 처리
		        System.out.println("선택하신 메뉴가 삭제되었습니다.");
		    } else {
		        System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
		    }
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
		        MenuItem item = items[i];
		        String type;
		        if (item instanceof Appetizer) {
		            type = "에피타이저";
		        } else if (item instanceof MainCoure) {
		            type = "메인코스";
		        } else if (item instanceof Dessert) {
		            type = "디저트";
		        } else {
		            type = "알 수 없는 유형";
		        }
		        System.out.printf("%d. %s (%s) - $%d\n", (i + 1), item.getName(), type, item.getPrice());
		    }
		System.out.printf("현재 총 가격 : $%d \n",getTotalPrice());
	}

	// 주문 결제 및 목록 초기화 메소드
	public void payOrder() {
		if (getTotalPrice()==0) System.out.println("아직 주문 안하셧는뎅 ㅠㅜ");
		
		System.out.println("결제되었습니다. 총 금액: $" + getTotalPrice());
		items = new MenuItem[10]; // 주문 목록을 새로 초기화
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
