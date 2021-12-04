package 보충수업;

public class Exam01 {

	public static void main(String[] args) {
		int i = 0;
		int sum = 0;
		while (i < 1000) {
			i++;
			sum = sum + i;
			if (sum == 1035) {
				System.out.println("1부터 " + i + "까지 총합: " + sum);
			}
		}
	}
}
          // 1번 노가다
          /*int num=1; //1부터 시작해서 1씩 늘어나는 숫자
           *int sum=0; //총합
           *
           *sum+=num;  //1을 누적 // num=1, sum=1
           *num=num+1;
           *num++;  // num=2;
           *sum= sum+num;   //2를 누적 // num=2, sum=3
           *.... 반복 
           * 
           * */

// 2. while 방법
//int num=1; //1부터 시작해서 1씩 늘어나는 숫자
//int sum=0;
// while(true){
// 반복할 로직
// sum=sum+num;
// num++;
// if(sum>1000){ // 반복문 나갈 조건
//   break;  //만나는 순간 가장 가까운 반복문을 나감.
//   }
//}
// %d: 정수자리  \n: 개행
//System.out.printf("1부터 %d"까지 총합: %d\n",num-1, sum);   //printf ~> %d : 정수가 들어온다는 뜻



	