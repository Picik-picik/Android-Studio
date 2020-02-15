package _03_LearningJavaGrammar;

public class _01_LearningJavaGrammar_3 {

}

/*
① 인터페이스
인터페이스란 서로 다른 장치들을 연결해주는 규격을 의미한다.
예를 들어 컴퓨터와 모니터를 연결해주는 HDMI 규격을 생각하면 된다.
자바에서의 인터페이스는 클래스와 클래스를 연결해주는 규격이며,
추상 메소드와 상수로만 이루어진다. 또한 우리가 클래스를 만들 때 사용한 키워드 class 대신에
interface를 사용하면 된다. 자바에서는 extends 키워드를 통해서 하나의 클래스만
상속받을 수 있다. 이러한 점을 보완해주는 방법이 인터페이스이다. 왜냐하면 인터페이스는
여러 개를 상속(구현)하여 사용할 수 있다. 인터페이스의 경우 상속이라는 용여 대신에 구현이라는
용어를 사용한다.
즉, 하나의 클래스는 하나의 클래스를 상속받고 동시에 여러 개의 인터페이스를 구현하여 사용할 수 있다.
(_02_Robot.java, _03_RobotTest.java 파일 참조)

② 다형성
조상(=부모) 클래스 타입의 참조 변수로 자손(=자식) 클래스의 객체를 참조하는 것이다.
이때 조상 클래스의 참조 변수는 조상 클래스가 가지고 있는 변수나 메소드를 참조할 수 있지만,
자손 클래스만 가지고 있는 변수나 메소드는 참조할 수 없다는 사실을 기억하자.

r1.depth = 50; 문장을 쓰게 되면 오류가 발생한다.
참조 변수 r1은 부모 클래스의 멤버만 참조할 수 있는데, depth는 자손 클래스의 멤버이기 때문이다.
(_04_Robot.java, _05_RobotTest.java 파일 참조)

③ 매개변수의 다형성
매개변수의 다형성을 살펴보면 다형성의 필요성을 이해할 수 있다. 먼저 Robot 클래스를 상속하는
FishRobot, DeronRobot, TankRobot 3개의 클래스를 만든 후에 Purchaser 클래스를 만든다.
Purchaser 클래스 안에는 FishRobot, DronRobot, TankRobot 구매에 대한 처리를 하는
purchase 메소드를 각각 만들어 준다.

매개변수의 다형성을 이용하지 않으면 물고기 로봇(FishRobot)을 구입할 때 purchase(FishRobot f)
메소드를 호출해야 하고, 드론 로봇(DroneRobot)을 구입할 때는 purchase(DroneRobot d) 메소드를
각각 호출해 주어야 한다.

FishRobot, TankRobot, DroneRobot 이외에 새로운 로봇이 만들어질 때마다 Purchaser 클래스
안에서 새로운 purchase 메소드를 추가로 만들어야 하는 불편함이 있다. 하지만 메소드의 매개변수에
다형성을 사용하면 아래처럼 하나의 메소드로 처리할 수 있다.
FishRobot, TankRobot, DroneRobot 클래스는 Robot의 클래스를 상속받았다. 따라서 Robot의
참조 변수는 FishRobot, TankRobot, DroneRobot 클래스들의 객체를 모두 다룰 수 있다
(물론 Robot의 참조 변수는 Robot이 가지고 있는 멤버들만 사용할 수 있다).
(_06_Robot.java, _07_RobotTest.java 파일 참조)

④ 제어문 - 조건문 if
제어문은 조건문과 반복문이 있다. 조건문에는 크게 if 문과 switch 문이 있다.
코딩을 하면서 제일 많이 사용하는 제어문은 조건문(if)이다.
조건문의 여러 가지 형태에 대해서 살펴보도록 하겠다.

(1) 중괄호를 사용한 if~else 문
   if (x > 3) → 조건식 {
      System.out.println("참입니다.");      → 조건식이 참일 때 중괄호 안에 있는 내용들이 실행된다.
      System.out.println("3보다 큽니다.");
   } else {
      System.out.println("거짓입니다.");    → 조건식이 거짓일 때 중괄호 안에 있는 내용들이 실행된다.
      System.out.println("3보다 작습니다.");   else는 "그 밖에"라는 뜻으로 조건식이 맞지 않는 경우를 의미한다.
   }

(2) if_else if 문
   if (score >= 90)   System.out.println("수");
   else if (score >= 80)   System.out.println("우");
   else if (score >= 70)   System.out.println("미");
   else if (score >= 60)   System.out.println("양");
   else   System.out.println("가");

if 문 다음에 중괄호가 없으면 한 줄만 실행을 한다. 즉, 처음에 score가 90점 보다 같거나 크면
"수"를 화면에 출력하고 더 이상 아래 else 구문들을 실행하지 않는다. score가 90점이 안된다면
두 번째 줄에 있는 else if 문을 수행하고 조건식이 80점을 넘는지 확인한다. 80점을 넘게 되면
"우"를 출력하고 더 이상의 else 문을 실행하지 않는다. 80점이 안되면 다시 세 번째 else if 문을
수행하게 된다.

(3) 중첩 if 문
if 문 안에 다시 if문이 들어가는 경우를 중첩 if 문이라고 한다. else는 가장 가까운 if 문과 짝을 이룬다.
   
   if (explainOk==1) // == 같다는 의미이다.
      if (answerOk==1)   System.out.println("정답입니다.");
      else   System.out.println("오답입니다.");

혼동을 피하기 위해서 중괄호를 사용하는 방법을 권장한다.
이전 코드를 아래와 같이 써도 같은 코드가 된다.

   if (explainOk==1) {
      if (answerOk==1)   System.out.println("정답입니다.");
      else   System.out.println("오답입니다.");
   }

즉, 위에 2개의 코드는 explainOk 값이 1이 아니면 아무것도 수행을 하지 않게 된다.

① 논리 연산자 ||
앞뒤에 있는 2개의 논리값을 평가하여 하나라도 true(참)일 경우 true  값을 반환한다.
2개 모두 false(거짓)이면 false를 반환한다. ||은 OR(또는) 연산자이다.

   if (explainOk==1 || menu==1) {
      if (answerOk==1)   System.out.println("정답입니다.");
      else   System.out.println("오답입니다.");
   }

explainOk 값이 1이거나 menu 값이 1이면,
둘 중에 하나만 조건이 맞으면 중괄호 안에 있는 코드가 실행된다.

② 논리 연산자 결과표
x       y       x && y       x || y
true   true    true          true
true   false   false          false
false  true    false          true
false  false   false          false

③ 논리 연산자 !
NOT 연산자이며 "아니다"라는 부정을 의미한다.

   if (explainOk!=0) {
      if (answerOk==1)   System.out.println("정답입니다.");
      else   System.out.println("오답입니다.");
   }
   
explainOk 값이 0이 아니면 중괄호 안에 있는 코드가 실행된다.

⑤ 제어문 - 조건문 switch
경우의 수가 많은 경우에는 switch 문을 사용하면 편리하다. 아래 예제에서 level 값이 1일 경우
case 1 줄에 있는 System.out.println("수준 1입니다."); break; 문장이 실행된다.
  
   switch (level) {
      case 1 : System.out.println("수준 1입니다."); break;
      case 2 : System.out.println("수준 2입니다."); break;
      case 3 : System.out.println("수준 3입니다."); break;
      case 4 : System.out.println("수준 4입니다."); break;
      case 5 : System.out.println("수준 5입니다."); break;
      default : System.out.println("레벨이 없습니다."); break;
   }
   
break 문을 만나면 switch 문을 벗어난다. break를 사용하지 않으면 다음 문장도 출력이 되기 때문에
반드시 break를 사용하도록 한다. default는 아무것도 해당 사항이 없으면 실행되는 부분으로,
예를 들어 level 값이 6이면 실행화면에는 "레벨이 없습니다."가 출력된다.

⑥ 제어문 - 반복문 for
(1) for 문 구조

   for (①초기값; ②조건식; ④증감식) {
      ③ // 반복 실행되는 부분
   }

① 초기값 : 보통 int i = 0 또는 int i = 1 로 시작한다. 처음 초기값 i 를 지정하며 처음 한번만 실행된다.
② 조건식 : 예를 들어 i < 10 이런 식으로 조건이 주어진다. i 값이 조건에 참이면 ③ 부분을 실행한다.
   실행 후 ④를 실행해서 i 값을 증가시키거나 감소시킨 후 ② 조건식을 보고 참이면 ③을 실행하고
   ④를 실행한다. 조건이 거짓이면 for 문을 빠져나간다.
④ 증감식 : 증감(증가 또는 감소)은 보통 i++ 또는 i-- 를 사용한다. i++ 은 i 값을 1씩 증가시킨다는
   의미이고, i-- 는 i 값을 1씩 감소시킨다는 의미이다.
   
(2) for 문을 활용한 1부터 10까지의 합
   int sum = 0; // 합을 담을 변수
   for (int i = 1; i <= 10; i++) { // i++ 은 i 값을 1씩 증가시킨다.
      sum = sum + i;
   }

i 값       sum + i       sum
1          0 + 1         1
2          1 + 2         3
3          3 + 3         6
4          6 + 4         10
5          10 + 5        15
6          15 + 6        21
7          21 + 7        28
8          28 + 8        36
9          36 + 9        45
10         45 + 10       55

1부터 10까지 더하는 코드를 다음과 같이 바꿀 수 있다.

   int sum = 0; // 합을 담을 변수
   for (int i = 10; i >= 1; i--) { // i-- 은 i 값을 1씩 감소시킨다.
      sum = sum + i;
   }

⑦ 제어문 - 반복문 while
while 문은 for 문과 같이 일정한 부분을 반복 수행하게 만들 수 있으며 사용방법이 for 문 보다 간편하다.

(1) while 문 구조
   while (조건식) {
      // 조건식 true(참)일 경우 반복 실행되는 부분
   }
   
(2) while 문을 활용한 1부터 10까지의 합
   int sum = 0;
   int i = 1;
   while (i <= 10) {
      sum = sum + i;
      i++;   // i 값을 1씩 증가시킨다.
   }

(3) while 문과 for 문을 활용한 무한반복 만들기
안드로이드 앱 제작할 때 자주 사용되는 구문이므로 제대로 알고 있어야 한다.
   while (true) {                        for ( ; ; ) {
      // 무한 반복할 문장       =          // 무한 반복할 문장
   }                                      }
   
⑧ 반복문 벗어나기
(1) break 문
break 문은 가장 가까운 반복문을 벗어나게 해준다. while(true) 무한반복문 안에서 10까지 합을
구하는 코드를 만들어 보겠다. break 문은 switch 문과 반복문(for, while)에서 사용된다.
   
   int sum = 0;
   int i = 0;
   while (true) {
      sum = sum + i;
      i++; // i 값을 1씩 증가시킨다.
      if (i==11) break; // break 문을 만나면 반복문을 빠져 나간다.
   }
   
(2) continue 문
continue 문은 반복문(for, while)에서만 사용된다. continue를 만나면 반복문을 벗어나는게 아니라
반복문의 끝으로 이동한다. 다음 예문은 1부터 10까지의 숫자 중 홀수값만 출력하도록 한 코드이다.

   for (int i = 1; i <= 10; i++) {
      if (i % 2 == 0) continue;
      // 2로 나누어 떨어지면 for 구문의 마지막으로 이동을 해서 화면에 i 값이 출력되지 않는다.
      System.out.println(i + " ");  // 한 칸을 띄우기 위해서 " "을 사용함.
   }
*/