package _04_LearningJavaGrammar;

public class _01_LearningJavaGrammar_4_ {

}

/*
① 배열
동일한 타입의 여러 변수를 하나의 묶음으로 하고 하나의 변수로 다루는 것을 배열이라고 한다.
예를 들어, 학생의 총점을 저장하는 변수를 만들 경우 학생수가 100명이라면 변수를 100개를 만들어서
다루어야 한다.

(1) 배열을 사용하지 않는 경우
각각의 학생의 총점을 저장하기 위해서 100개의 정수형 변수가 필요하다.
(int s1 ~ s100 까지 하나씩 만들어야 함)
만약 학생 수가 1000명이 넘는다면 비효율적인 코딩이 될 것이다.

(2) 배열을 사용하는 경우
배열을 사용하는 경우 학생 수와 관계없이 아래처럼 한 줄에 해결할 수 있다.
  
   int [] s = new[100];   // 100개의 정수형 값을 저장할 수 있는 배열 생성
   
생성된 배열에 값을 넣는 방법 : []안에 들어가는 인덱스는 0부터 시작하므로

   s[0] = 500; s[1] = 550; s[2] = 600 ........ s[99] = 670;
   
처럼 넣는다. 즉, s[99]는 100번째 학생의 총점이 들어간다.

(3) 배열을 선언과 동시에 초기화하기
new를 사용하지 않고도 초기값을 넣어 배열을 생성할 수 있다.

   int [] s = {100, 200, 400, 300, 500};
   
(4) 배열 사용 예

   int [] s = {100, 200, 400, 300, 500};
   for (int i = 0; i < s.length; i++) {  // length는 배열의 크기를 가지고 있는 변수이다.
      System.out.println(s[i]);  // 여기서 length는 s 배열의 크기인 5 값을 가지고 있다.
   }

>> 실행 결과
   100200400300500

(5) 향상된 for 문
향상된(enhanced) for 문을 이용하면 배열에 있는 내용들을 좀 더 간결하게 처리할 수 있다.

   for (타입 변수명 : 배열) {
      // 반복 처리할 문장
   }

위에 일반 for 문을 사용할 문장을 향상된 for 문을 이용해서 처리해 보겠다.

   int [] s = {100, 200 400, 300, 500};
   for (int tmp : s) {  // 정수형 변수 tmp는 s 배열에서 인덱스 0부터 마지막까지 하나씩 값을 가져온다.
      System.out.println(s[i]);
   }

>> 실행 결과
   100200400300500

② ArrayList
배열의 단점은 사용 중간에 크기를 조절할 수 없다는 점이다. 인덱스에 따른 요소 값만 바꿀 수가 있다.
하지만 ArrayList 클래스를 이용해서 배열을 만들면 중간에 요소(element)를 추가하거나 삭제할 수도
있다. ArrayList를 보면 처음에 대문자로 시작하는 것을 볼 수 있다. 우리는 이것을 통해 ArrayList가
클래스임을 알 수 있고, 클래스를 사용하기 이해서는 객체를 생성해야 함을 학습했었다.
마찬가지로 ArrayList를 사용하기 위해서 new 연산자를 이용해서 객체를 생성해야 한다.

(1) ArrayList 형식
   ArrayList <자료형> list = new ArrayList< >();  // ArrayList 객체를 생성함.
   
자료형이 정수형인 경우에는 int가 아니라 Integer를 써야 하고 또한 문자형을 사용할 경우 String을
사용한다. 자료형에는 클래스가 사용될 수 있다.

(2) ArrayList에 자료를 추가하는 방법
   ArrayList <자료형> list = new ArrayList< >();
   - list.add("홍길동");  // 데이터 추가 list[0]에는 "홍길동" 문자열이 저장됨.
   
(3) ArrayList에 자료를 삭제하는 방법
   ArrayList <자료형> list = new ArrayList< >();
   - list.remove(2);  // 인덱스 2의 요소를 삭제한다. 즉 List객체의 3번째 자료 삭제
   
(4) ArrayList 클래스를 가지고 있는 기타 메소드
   - size() : 현재 저장된 요소의 개수를 얻는다.
   - get(i) : 인덱스 i 번에 저장된 데이터를 얻는다.
   
(5) ArrayList 이용한 예제 (_02_ArrayList.java 파일 참조)

③ 프로세스(Process)와 쓰레드(Thread)
사용자가 어떤 프로그램을 실행시키면 메모리에 올라오게 되고 CPU가 이를 처리하게 된다.
이때 프로그램이 메모리에 올라와 있는 상태를 프로세스라고 부른다. Ctrl + Alt + Del 키를 동시에
누르면 메모리에 올라와 있는 프로세스를 확인할 수 있다. 1개의 프로세스에는 최소한 1개의 쓰레드
(실제 작업을 수행하는 일꾼)를 가지고 있다. 지금까지 우리가 자바에서 다룬 예제들은 main이라는
하나의 쓰레드로 구성된 프로그램이었다. 2개 이상의 쓰레드를 가진 프로세스는 CPU의 사용률을
향상 시킬 수 있다.

(1) 쓰레드(Thread)가 필요한 이유
지금까지 우리는 하나의 main 쓰레드를 이용하였다. 그런데 main 쓰레드에서 데이터를 송신하고
있는 도중에 사용자가 사진을 보려고 버튼을 터치할 경우에 데이터 송신 작업이 끝날 때까지
기다렸다가 사진을 보아야 될 것이다. 사용자는 버튼을 터치했는데도 반응을 하지 않아 답답함을
느끼게 될 것이다. 이런 문제를 해결하기 위해서는 데이터 전송을 전담으로 하는 별도의 쓰레드를
추가로 만들어 주면 될 것이다. CPU가 쓰레드를 번갈아 사용한다면 사용자는 답답함을 경험하지
않아도 될 것이다.

(2) 쓰레드(Thread) 사용하기
① Thread 클래스를 상속받는 Thread1 클래스를 만들고 run() 메소드를 재정의한다.
② main 쓰레드가 있는 MThread 클래스에서 Thread1 클래스 객체(t)를 만들고 start() 메소드를
이용해서 Thread1 쓰레드를 실행시킨다.

실행 결과의 일부를 확인해보면, main 쓰레드와 Thread1 쓰레드가 섞어가면서 실행이 되는 것을
확인할 수 있다. 쓰레드가 다 실행될 때까지 기다렸다가 메인에 있는 for 문이 실행되는 것이 아니라는
것을 확인할 수 있다.
(_03_MThread.java 파일 참조)

④ 무명 클래스
무명 클래스는 이름이 없는 클래스이며 하나의 객체만 생성할 경우 사용된다.
보통 부모 클래스를 상속 받거나 인터페이스를 구현해서 사용되며 특히 버튼을 처리할 때 자주
사용되는 방법이다. 표기 방법이 조금 난해하지만 무명 클래스를 사용해서 인터페이스를 구현하면
코드가 매우 간결해진다. 앞쪽에서 인터페이스를 구현했었는데 그 내용을 일부 수정해서 만들어 보겠다.

(1) 무명 클래스 형식

   인터페이스 객체명 = new 인터페이스() {
      // 인터페이스 메소드 구현
   };

(2) 클래스를 만들고 인터페이스를 구현하는 경우
다음은 무명 클래스를 사용하지 않은 코드이다.

   interface Robot {
   
      abstract void mySituation();
   
   }

   class FishRobot implements Robot {
   
      int depth;
      int x, y;
      
      public void mySituation() {
      
         System.out.println("나의 위치는 X좌표 : 100" + " Y좌표 : 200 입니다.");
      
      }
   
   }
   
   public class RobotTest {
   
      public static void main(String[] args) {
      
         FishRobot fish1 = new FishRobot();
         
         fish1.mySituation();
      
      }
   
   }

(3) 무명 클래스를 이용해서 만든 경우
인터페이스를 구현해서 클래스를 만든 것과 동일한 기능을 한다.
코드가 매우 간결해진 것은 확인할 수 있다.

   interface Robot {
   
      abstract void mySituation();
   
   }
   
   public class RobotTest {
   
      public static void main(String[] args) {
      
         Robot r1 = new Robot() {
         
            public void mySituation() {
      
               System.out.println("나의 위치는 X좌표 : 100" + " Y좌표 : 200 입니다.");
      
            }
         
         };
         // 인터페이스 Robot을 구현하는 클래스를 별도로 만들지 않고 바로 인터페이스를 구현하는 기술이다.
         
         fish1.mySituation();
      
      }
   
   }

>> 실행 결과
   나의 위치는 X좌표 : 100 Y좌표 : 200 입니다.

Tip
- 무명 클래스의 마지막 부분에 세미콜론(;)을 해주어야 오류가 발생하지 않는다.

⑤ 내부 클래스
클래스 안에 클래스를 넣을 수가 있는데 이때 안에 있는 클래스를 내부 클래스라고 한다.
외부 클래스에서 내부 클래스의 메소드를 이용하기 위해서는 내부 클래스의 객체를 생성해서
접근해야 한다. 또한 내부 클래스에서 외부 클래스의 멤버 변수를 변경하고자 할 때는
내부 클래스 메소드 안에서만 가능하다.
(_04_Inner.java 파일 참조)

더 알아보기
- 자바에서는 클래스명이 파일명과 동일해야 한다. 하나의 파일에 여러 개의 class를 사용할 수 있는데
1개의 클래스 파일에는 public을 사용하도록 하자. 이 경우 public이 붙은 클래스명이 파일명이 되어야 한다.

   public class A {
      // 파일명 : A.java
   }
   
   class B {
   }
   
   class C {
   }
   
위에 내부 클래스 예시 소스는 inner.java 파일로 지정되어야 한다.
-> _04_Inner.java로 변경함.

⑥ 기본형 매개변수(=파라미터)와 참조형 매개변수

(1) 기본형 매개변수
기본형(boolean, char, byte, short, int, long, float, double)을 매개변수로 사용하는 경우에는
값만 넘겨주게 되고 넘겨준 값이 변하지는 않는다.
(_05_Robot.java 파일 참조)

(2) 참조형 매개변수
참조변수 r은 생성된 객체의 주소를 가지고 있다. changeName() 메소드의 매개변수(Robot r)가
값이 아니라 값이 저장된 주소를 넘겨 주었기 때문에 메소드 안에서 값을 변경하면 전달되는
값이 변경된다.
(_06_ParameterTest.java 파일 참조)

⑦ this와 super

(1) this
this는 객체 자신을 의미하며 super는 상속관계에서 부모 클래스의 객체를 가리킨다.
다음 예시에서 사용된 this.x = x; 문장에서 x는 매개변수로 받은 값을 의미하고
this.x는 Robot 클래스 멤버변수 x를 의미한다. 즉, this는 객체 자신을 나타낸다.

   public class Robot {
    
      int x, y;
      int power;
      int price;
      String name;
      
      Robot(int x, int y, int price, String name) {
       
         this.x = x;
         this.y = y;
         this.price = price;
         this.name = name;
       
      }
    
   }

(2) super
조상 클래스의 멤버 변수와 메소드를 사용하고 싶다면 앞에 super를 쓰면 된다.
만약 조상 클래스의 showMe() 메소드를 사용하려면 super.showMe(); 라고 하면 된다.
조상의 생성자를 호출하는 super()와 비교하여 이해해야 한다.
(_07_RobotTest.java 파일 참조)

⑧ 접근 제어자 public, private, default, protected

(1) 접근 제어자
접근 보안성이 public, protected, default, private 순으로 높아진다.

접근 제어자     기능
public           public으로 선언된 변수와 메소드는
                 다른 클래스에서도 접근이 가능하며 어디에서나 접근할 수 있다.
protected      동일한 패키지에 속하는 클래스에서 접근할 수 있다.
default         접근 제어자를 사용하지 않으면 자동으로 default 속성이 된다.
                 동일한 패키지에 속하는 클래스에서 접근할 수 있지만
                 자식 클래스에서 상속해서 사용할 수 없다.
private         private으로 선언된 멤버를 다른 클래스에서 접근할 수 없다.
                 해당 멤버가 선언된 클래스 안에서만 사용이 가능하고
                 private으로 선언된 변수와 메소드는 상속해서 사용할 수 없다.                 
(_08_Robot.java 파일 참조)

(2) 외부 클래스에서 내부 클래스 메소드 접근하기
(_09_Inner.java 파일 참조)

⑨ 문자를 숫자로, 숫자를 문자로 바꾸기
프로그램을 만들 때 많이 사용되는 기능이므로 잘 익혀두기 바란다.

(1) 문자를 숫자로 바꾸기
Integer 클래스의 parseInt() 메소드를 활용한다.
parseInt() 메소드 안에 큰따옴표를 이용해서 문자열을 넣는다.

   int score;
   score = Integer.parseInt("100");
   double d1;
   double d1 = Double.parseDouble("3.14");

(2) 숫자를 문자로 바꾸기
문자로 바꾸는 방법은 간단하다. 숫자에 " " 큰따옴표 2개를 붙여서 사용하면 된다.

   String sumText = sum + "";
   
⑩ try~catch

(1) 자바 오류의 종류

컴파일 에러
- 소스 코드(Robot.java)를 컴파일하게 되면 클래스 파일(Robot.class)파일이 생긴다.
컴파일 하는 동안 오타나 잘못된 구문인지 체크해서 컴파일 에러를 발생시킨다.

런타임 에러
- 프로그램 실행 중에 발생하는 에러이다. 런타임시(실행시) 발생할 수 있는 프로그램 오류는
에러(error)와 예외(exception)로 나눌 수 있다.
예외(exception)는 코드를 통해서 수습할 수 있는 미약한 에러이다.
try~catch 블록을 사용해서 에러를 해결할 수 있다.

(2) 에러 발생
0으로 나누면 에러가 발생한다. 일부러 에러를 발생시켜보겠다.
(_10_TryCatch.java 파일 참조)

다음과 같이 에러가 발생하고 실행 도중에 비정상적으로 종료된다.

>> 실행 결과
   Exception in thread "main" java.lang.ArithmeticException: / by zero
	at _04_LearningJavaGrammar._10_TryCatch.main(_10_TryCatch.java:9)
	
ArithmeticException 오류는 산술연산 과정에서 오류가 발생했다는 의미이다.
어떤 수를 0으로 나누었기 때문에 생기는 오류이다.

(3) try - catch - finally 형식
이런 비정상적인 종료를 막기 위해서 다음과 같이 try - catch 문을 사용한다.

   try {
      // 예외가 발생할 수도 있는 코드
   } catch (ArithmeticException e) {
      // 예외가 발생하면 실행되는 코드
      System.out.println("0으로 나누면 안됩니다.");
   } finally {
      // 예외가 발생하든 안하든 무조건 실행되는 코드(선택사항)
   }

(4) try - catch 사용하기
(_11_TryCatch.java 파일 참조)

실행 도중에 비정상적으로 종료되는 것 대신에 "0으로 나누면 안됩니다." 라는 메시지가 나오도록
하였다. ArithmeticException 클래스의 객체 e와 getMessage() 메소드를 이용해서 오류 원인을
찾을 수 있다.

>> 실행 결과
   오류 이유 : / by zero
   0으로 나누면 안됩니다.

(5) try - catch - finally 사용하기
(_12_TryCatchFinally.java 파일 참조)
*/