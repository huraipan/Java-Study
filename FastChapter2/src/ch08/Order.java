package ch08;

public class Order {
	
		// Date �� Calendar ��ü�� ����� �� �˸� �ð��̳� ��¥ ���� ���� �ش� ��ü�� ����ϸ� �˴ϴ�.
		// ���⼭ ���ڿ� �ش�Ǵ� �ڷ����� String���� ǥ���Ѱ� 0���� ���۵� ���ɼ��� �ִ� ���ڿ� �ش��մϴ�.
		
		public String orderNumber;
		public String customerPhone;
		public String customerAddress;
		public String orderDate;
		public String orderTime;
		public int price;
		public String menuId;
		
		public void showOrderDetail() {
			
			System.out.println("�ֹ� ���� ��ȣ: " + orderNumber);
			System.out.println("�ֹ� �ڵ��� ��ȣ: " + customerPhone);
			System.out.println("�ֹ� �� �ּ�: " + customerAddress);
			System.out.println("�ֹ� ��¥: " + orderDate);
			System.out.println("�ֹ� �ð�: " + orderTime);
			System.out.println("�ֹ� ����: " + price);
			System.out.println("�޴� ��ȣ: " + menuId);
		}

}
