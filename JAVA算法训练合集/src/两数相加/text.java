package �������;
//�������� �ǿ� ������������ʾ�����Ǹ������������У����Ǹ��Ե�λ���ǰ��� ���� �ķ�ʽ�洢�ģ��������ǵ�ÿ���ڵ�ֻ�ܴ洢 һλ ���֡�
//��������ǽ��������������������᷵��һ���µ���������ʾ���ǵĺ͡�
//�����Լ���������� 0 ֮�⣬���������������� 0 ��ͷ��
//ʾ����
//���룺(2 -> 4 -> 3) + (5 -> 6 -> 4)
//�����7 -> 0 -> 8
//ԭ��342 + 465 = 807
public class text {
	//����ڵ�
	public static class ListNode
	{
	    int val;
	    ListNode next;
	    
	    public ListNode(int x){
	        val=x;
	    }
	    //��ӡ
	    public static String print(ListNode l) {
	    	StringBuffer sb = new StringBuffer();
	    	while(l!=null) {
	    		sb.append(l.val);
	    		l=l.next;
	    	}
	    	return sb.toString();
	    }
	  
	}
			//�������
			public static ListNode addTwoNumbers(ListNode l1,ListNode l2) {
					if(l1==null && l2==null) {
						return null;
					}
					ListNode dummy = new ListNode(0);
					ListNode head = dummy;
					int addOne = 0;
					while(l1 != null || l2 != null || addOne !=0) {
						int val1 = l1 == null ? 0 : l1.val;
						int val2 = l2 == null ? 0 : l2.val;
						int sum =val1 + val2 +addOne;
						head.next = new ListNode(sum% 10);
						head = head.next; //ͷ�ڵ�ǰ��
						addOne = sum/10;  //�Ƿ��λ
						if(l1 != null) {l1 = l1.next;} 	//ǰ��һλ
						if(l2 != null) {l2 = l2.next;}	//ǰ��һλ
					}
				return dummy.next;
				
			}
			
			
			public static void main(String[] args) {
				ListNode l1 = new ListNode(2);
				ListNode l2 = new ListNode(5);
				l1.next = new ListNode(4);
				l1.next.next = new ListNode(3);
				l2.next = new ListNode(6);
				l2.next.next = new ListNode(4);
				System.out.println(ListNode.print(addTwoNumbers(l1, l2)));
			}
			
	}
