package �������;

public class Exam01 {

	public static void main(String[] args) {
		int i = 0;
		int sum = 0;
		while (i < 1000) {
			i++;
			sum = sum + i;
			if (sum == 1035) {
				System.out.println("1���� " + i + "���� ����: " + sum);
			}
		}
	}
}
          // 1�� �밡��
          /*int num=1; //1���� �����ؼ� 1�� �þ�� ����
           *int sum=0; //����
           *
           *sum+=num;  //1�� ���� // num=1, sum=1
           *num=num+1;
           *num++;  // num=2;
           *sum= sum+num;   //2�� ���� // num=2, sum=3
           *.... �ݺ� 
           * 
           * */

// 2. while ���
//int num=1; //1���� �����ؼ� 1�� �þ�� ����
//int sum=0;
// while(true){
// �ݺ��� ����
// sum=sum+num;
// num++;
// if(sum>1000){ // �ݺ��� ���� ����
//   break;  //������ ���� ���� ����� �ݺ����� ����.
//   }
//}
// %d: �����ڸ�  \n: ����
//System.out.printf("1���� %d"���� ����: %d\n",num-1, sum);   //printf ~> %d : ������ ���´ٴ� ��



	