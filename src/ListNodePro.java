
import java.util.Scanner;

public class ListNodePro {
	public static void main(String[] args) {
		
		ListNode[] list = new ListNode[4];
		Scanner sc = new Scanner(System.in);
		for (int j = 0; j < 4; j++) {
			int n = 4;
			ListNode head = null;
			ListNode header = null;

			for (int i = 0; i < n; i++) {
				int x = sc.nextInt();
				if (head == null) {
					ListNode node = new ListNode(x, null);

					head = node;
					header = head;
				} else {
					ListNode node = new ListNode(x, null);
					head.next = node;
					head = head.next;
				}
			}
			list[j] = header;
		}
		sc.close();
		for (int i = 0; i < list.length; i++) {
			ListNode head = list[i];
			while (head != null) {
				System.out.print(head.val);

				
				head = head.next;
				if (head == null) {
					System.out.println("");
				}
				else System.out.print("->");
			}
			head = null;
		}
	}

}
