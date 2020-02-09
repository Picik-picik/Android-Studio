package _01_LearningJavaGrammar;
public class _01_LearningJavaGrammar_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

/*
01 > 자바 문법 익히기(1)

① 클래스 개념 익히기
안드로이드용 앱 제작에 있어 자바 언어에 대한 기본 이해가 요구된다.
앱 제작에 필요한 자바 문법을 살펴보도록 하겠다. 
자바의 기본 단위는 클래스로 이루어져 있고 클래스는 객체를 생성하는데 필요한 설계도이며
생성자, 필드, 메소드로 구성되어 있다. 클래스명은 파일명과 동일하다.
자바 문법을 학습하기 위해 Eclipse를 활용하기를 추천한다.

클래스
- 설계도 또는 틀이라고 생각하면 된다. 클래스 이름은 처음 시작할 때 대문자를 사용하도록 하고,
메소드의 경우에는 소문자로 시작한다. 둘의 혼동을 막기 위해서 이 규칙을 지키는것이 바람직하다.
클래스는 생성자, 멤버 변수(=필드)와 멤버 메소드로 구성되어 있으며 합쳐서 멤버라고 부른다.

객체
- 클래스를 가지고 있으며 new 연산자를 통해 객체를 생성해서 사용할 수 있다.

(1) 클래스
   public class Robot {
   
   }

클래스 이름이 Robot이며 대문자로 시작한다. 메소드와 다르게 괄호 ()를 쓰지 않는다.
클래스 앞에 쓰인 public은 다른 클래스에서도 사용할 수 있도록 공개되었다는 뜻이다.

(2) 메소드 만들기
   void moveRight () {
   
   }
메소드의 이름은 소문자로 시작하며, 메소드 앞에는 메소드가 리턴하는 자료형태를 적어야한다.
void는 텅 비어있다는 뜻으로 moveRight 메소드는 반환하는 값이 없다는 뜻이다.
메소드는 메소드 이름 다음에 소괄호를 사용해야하고, 클래스 안에서 사용된다.

(3) 한눈에 보는 클래스 구조
   public class Robot {
   
      int x, y;				멤버 변수
      int power;			- 필드라고도 한다.
      int price;			- 객체의 상태를 나타내며 아래 메소드에서 사용할 수 있는 변수이다.
      String name;	
      
         Robot(int x, int y, int price, String name) {
            this.x = x;			생성자
            this.y = y;			- 멤버 변수들을 초기화 하는데 사용된다.
            this.price = price;		- 처음에 객체 생성시 한 번 실행된다.
            this.name = name;
         }
         
         void moveRight() {
            x += 5;			// x 값을 5만큼 증가시키기
         }								멤버 메소드
   									- 객체의 동작을 나타낸다.
         void moveLeft() {						- 메소드 따로 사용할 수는 없으며 클래스 안에서만 사용된다.
            x -= 5;			// x 값을 5만큼 감소시키기		
         }
   }													

class 키워드 다음에 대문자로 시작하는 클래스 이름을 적는다. 메소드와는 달리 클래스 이름 뒤에는
소괄호를 사용하지 않고 중괄호를 바로 사용해서 클래스를 만든다. 클래스는 생성자, 멤버 변수(=필드)
그리고 멤버 메소드로 구성된다.

더 알아보기
- 클래스는 멤버 변수와 멤버 메소드로 이루어져있다. 다른 표현으로 클래스는 필드와 메소드들의
집합이라고 정의할 수 있다. 멤버 변수는 자료형과 변수 이름으로 이루어져 있으며 변수에 자료값을
담을 수 있다. 예를 들어 멤버 변수 int x = 3; 이라고 적으면 x라는 변수에 3이라는 값이 저장된다.
int는 자료형을 의미하며 모든 문장의 끝은 세미콜론(;)으로 끝난다.
//은 주석으로서 코드 설명을 돕는 것으로 프로그램에 영향을 주지 않는다.

(4) 메소드 이해하기
C언어에서 사용하는 함수는 자바의 메소드와 유사하다. 메소드의 경우는 클래스 안에서 사용된다는
점에서 차이가 있다. 변수는 어떤 값(속성)을 저장하는 것이라면 메소드는 어떤 기능(동작)을 한다고
생각하면 된다. 메소드는 입력을 받아서 처리결과를 반환하는 역할을 한다(입력 값이 없을 수도 있고
반환되는 처리결과 값도 없을 수도 있다).

   x = 100		→	int add(int x, int y) {
   y = 200		→	   return x + y;
                                }
                    
더 알아보기
- add라는 이름을 가진 메소드는 앞에 int가 존재한다. 이 메소드는 반환하는 데이터가 존재하고
그 데이터가 정수형이라는 의미이며 return을 사용해서 int형 값을 반환한다. 만약 반환하는 값이
없는 경우 return이 필요 없으며 반환 타입 int 대신에 반환하는 값이 없다는 void(비어 있는)를
메소드명 앞에 적으면 된다.

(5) 메소드 구조
   int showMe(int x, int y) {
      return x + y;
   }
   
Tip
- return 값이 없는 경우 반환 타입에 void를 써야 한다. 반환 타입이 void가 아닌 경우에
메소드 안에는 return이 반드시 들어가야 한다.

② 변수

(1) 변수
변수는 데이터를 저장하는 그릇이라고 생각하자. 그릇 종류가 다양하듯이 변수의 종류도 다양하다.
변수 타입에 따라 변수는 다양한 데이터를 담을 수 있다. 예를 들어 정수를 담을 수 있는 변수 타입에는
byte, short, int long이 있다. 본 책에서는 변수 타입 int를 주로 다루었다.

   int x;	// 변수명이 x인 변수 선언
   변수 타입  변수 이름(=변수명)
   (=자료형)  변수 x는 자료형의 값을 저장할 수 있는 그릇이다.

(2) 변수의 초기화
   int x = 10;	// 변수 x에 10을 넣는다.
   		// x = 는 대입연산자로서 오른쪽에 있는 값을 왼쪽에 넣는다.

Tip
- ==는 같다는 의미이고, =는 오른쪽에 있는 값을 왼쪽에 대입하라는 뜻이다.

(3) 변수의 종류
구분		변수 타입
문자형            char             한 글자만 입력 가능
                  String          여러 글자(문자열) 입려 가능
정수형             byte            -127에서 127까지 입력 가능
                  short           -32768에서 32767까지 입력 가능
                  int             약 -21억에서 약 21억까지 입력 가능
                  long            -2의 63승에서 2의 63승-1까지 입력 가능(매우 큰 수)
실수형            float           실수를 입력
                  double          float 형보다 많이 쓰이며 더 정확한 실수를 처리 가능
불리언형           boolean         true 또는 false 값을 사용

(4) 변수 사용의 예
구분		변수 타입		사용 예
문자형            char               char txt = '조';
                  String            String myHobby = 'soccer';
정수형             byte              byte level = 100;
                  short             short num = -30000;
                  int               int money = 3000000;
                  long              long population = 2313213213;
실수형            float             float f = 3.14f;
                  double            double d = 1.234;
불리언형           boolean           boolean b = true;

Tip
- class, int, for, if 등을 예약어 또는 키워드라고 한다. 이러한 이름은 이미 자바에서 예약되어
사용되는 이름이기 때문에 변수명으로 사용하면 안 된다.

③ 클래스 맛보기
처음 자바를 접하는 독자에겐 아직까지 무슨 말인지 이해하기 어려울 수 있다.
직접 예를 들어서 살펴보도록 하겠다.

이클립스 화면에서 [File]-[new]-[Java Project]를 선택한다.

Project name에 studyclass라고 입력하고 이 프로젝트 안에 여러 개의 클래스 파일들을 만들어서
사용한다. 입력 후 [Finist] 버튼을 클릭한다.

(1) 클래스 파일 만들기
이제 클래스 파일을 만들어 보겠다. 클래스 파일을 만들기 위해서 프로젝트 studyclass 위에
마우스 오른쪽을 클릭하여 [src]-[new]-[Class]을 선택한다.

Name 칸에 클래스 파일 이름을 쓴다. 여기서는 'Robot'이라고 한다.

Robot.java 파일 안에 다음과 같은 코드를 넣는다. 클래스 안에 있는 필드(=멤버 변수)와 메소드에
대해서 잘 익혀두기 바란다. (위에 기입한 Robot 코드에 조금 더 추가함.)

이제 클래스를 하나 더 만들고 그 안에서 Robot 객체를 생성해 보도록 하겠다.
Robot.java 파일을 만든 것과 같은 방법으로 RobotTest.java 파일을 생성하고 그 안에 다음과 같은
코드를 넣는다.

자바에서 main()은 제일 먼저 실행되는 중요한 메소드이다. 안드로이드 스튜디오에서는 다른
방법을 사용하여 제일 먼저 실행되는 Activity 파일을 지정해준다. 추후 자세히 살펴볼 것이다.

Tip
- 객체를 생성하는 방법
① 선언 및 생성을 따로 한다.
   Robot robot 1; // 객체 선언
   robot 1 = new robot(); // 객체 생성
② 선언 및 생성을 한 번에 한다.
   Robot robot 1 = new robot();
이렇게 하면 Robot 클래스(설계도)를 통해 로봇이 만들어진다.

(2) RobotTest.java 코드 분석하기
앞에서 제작한 Robot 클래스는 설계도에 불과하며 아직 사용할 수 있는 로봇이 아니다.
실제 로봇을 만들기 위해서는 new 연산자를 사용해서 Robot 클래스의 객체를 생성해야 한다.
생성한 객체의 멤버와 메소드는 참조변수 r1, r2를 통해 접근한다.

Tip
- 생성된 객체의 멤버 변수와 멤버 메소드를 사용하기 위한 방법
dot operator(.)을 사용하여 생성된 객체의 변수와 메소드를 호출한다.
- 객체명(=참조 변수).멤버 변수
- 객체명.메소드

new 연산자를 통해 생성된 r2 인스턴스(=객체)의 멤버 변수 name에 짱가를 넣었다.
이제 로봇은 이름을 가지게 된 것이다. 객체명.메소드로 moveLeft 메소드와 showMe 메소드를
실행하였다.

>> 실행 결과
   나의 이름은 마징가입니다.
   5
   나의 이름은 짱가입니다.
   -5

(3) 객체 생성 더 알아보기
객체를 생성하고 직접 코딩을 해보는 작업을 해 보았다. 여기서는 객체를 생성하는 방법을 좀 더 자세히
살펴보도록 하겠다. new 연산자를 사용하여 객체를 생성하게 되면 멤버 변수값들이 0 또는 null로
초기화 된다. 예를 들어 정수형의 경우 값이 0으로 저장되며 String의 경우 null로 초기화 된다.
new 연산자를 사용하게 되면 메모리에 객체가 생성된다.

① Robot r1 = new Robot();				② Robot r2 = new Robot();
x	   0						x	    0
y	   0						y	    0
power      0						power	    0
price      0						price	    0
name	   null						name 	    null
moveRight()						moveRight()				
moveLeft()						moveLeft()
showMe()						showMe()

Tip
- r1, r2 2개의 객체는 서로 다른 별도의 메모리 공간을 차지하게 된다. r1과 r2는 참조 변수이며
객체의 주소값을 가지고 있다. 멤버 변수는 객체마다 따로 메모리 공간을 차지하고 이름이 같은
멤버 메소드는 공유하여 사용한다.

변수를 기초 변수(primitive variable)와 참조 변수(reference variable)로 나눌 수 있다.
int(정수), float(실수) 등은 기초 변수에 해당되며 직접 변수에 값을 담을 수 있다. 반면 참조 변수는
객체를 참조할 때 사용하는 변수로서 객체의 참조값이 저장된다. 본 예제에서 사용된 r1 참조 변수에는
객체가 저장되어 있는 메모리 주소 0x100(여기서는 0x100이라고 가정함)이 저장된다.
즉, 참조 변수가 가지고 있는 값(참조값)은 데이터들이 저장되어 있는 메모리 주소이다.

③ r1.name = "마징가";				④ r2.name = "짱가";
x		0				   x		  0
y		0			           y		  0
power		0				   power	  0
price		0				   price	  0
name		마징가				 name 	       짱가
moveRight()					   moveRight()				
moveLeft()					   moveLeft()
showMe()					   showMe()

⑤ r1.moveRight();					⑥ r2.moveLeft();
x		5					x		-5
y		0					y		0
power		0					power		0
price		0					price		0
name		마징가                                   name 	     짱가
moveRight()						moveRight()				
moveLeft()						moveLeft()
showMe()						showMe()

④ 생성자
이전 예제에서 로봇 2개의 객체를 생성해 보았다. 객체를 생성한 후에 r1.name="마징가", r2.name=
"짱가" 구문을 이용해서 로봇의 이름을 각각 "마징가", "짱가"라고 지정해 주었다. 하지만
생성자라는 특수한 메소드를 이용하면 객체를 생성할 때 멤버 변수를 초기화 할 수 있다.

생성자는 다음과 같은 규칙을 따른다.

   ① 생성자의 이름은 클래스의 이름과 같아야 한다.
   ② 메소드와 달이 return 값이 없다. 따라서 생성자 이름 앞에는 int, void와 같은 반환타입을
   적지 않는다.

객체를 생성할 때 생성자에 인수를 넘겨주는 방법으로 생성자를 사용할 수 있다.
 예) Robot r1 = new Robot (0, 0, 100, "마징가");
     Robot r2 = new Robot (100, 0, 100 "아산로봇");
     
다음 2개는 생성자가 없을 때와 생성자가 있을 때의 동일한 코드이다.

매개변수 없이 객체를 생성할 경우
   Robot r1 = new Robot();
   Robot r2 = new Robot();
   r1.x = 0;
   r1.y = 0;
   r1.price = 100;
   r1.name = "마징가";
   r2.x = 100;
   r2.y = 0;
   r2.price = 100;
   r2.name = "짱가";

생성자에 매개변수를 넘겨주며 객체를 생성할 때
   Robot r1 = new Robot(0, 0, 100, "마징가");
   Robot r2 = new Robot(100, 0 100, "아산로봇");
   
객체 생성시 매개변수를 넘겨주면 코드가 간결해지는 모습을 볼 수 있다.
(_04_Robot, _05_RobotTest 클래스 파일 참조)

⑤ 생성자 오버로딩
오버로딩이라는 것은 동일한 메소드명을 사용하지만 전달되는 매개변수의 개수를 다르게 하여 객체를
생성할 때 사용하는 방법이다. 즉, 이름이 같은 메소드를 여러 개 정의하는 것이며 매개변수는
달라야 한다. 이러한 방법은 메소드 오버로딩에게도 같은 방법으로 적용된다.

Robot 클래스에서 매개변수 개수가 다르게 여러 개의 생성자를 만들었다.

RobotTest 클래스 안에서 다음과 같이 Robot 클래스의 객체를 생성하였다.
참조 변수 r3의 경우에는 로봇의 좌표인 x = 200, y = 200을 넣었다. 이 경우 로봇의 가격과
로봇의 이름은 초기화 하지 않고 로봇의 위치만 초기화가 필요한 경우 이 생성자를 사용하면 된다.
(_06_Robot, _07_RobotTest 클래스 파일 참조)

⑥ 변수의 종류
변수의 종류에는 클래스 변수(=static 변수, 전역 변수, 공유 변수), 인스턴스 변수, 지역 변수가 있다.
어느 위치에 쓰이는지에 따라 구분이 된다. 멤버 변수를 제외한 변수들은 지역 변수이며
지역 변수는 일반적으로 메소드나 for 구문 안에서 쓰인다.

인스턴스 변수
- 클래스의 인스턴스(객체)를 생성할 때 만들어진다. 객체를 여러 개 생성했을 때 각각 독립된 저장
공간을 가지기 때문에 값이 다를 수 있다.

static 변수
- 변수 앞에 static을 붙여서 사용한다. 객체를 생성하지 않고도 사용할 수 있으며 생성된 객체들의
경우 공통된 저장 공간을 가지고 사용할 수 있다. 즉, 여러 객체들을 생성했을 때 static 변수는
그 객체들이 공유하여 사용하게 된다. 한 객체에서 이 변수값을 바꾸면 다른 객체도 바뀐 값들을
사용하게 된다. static 변수를 사용하는 방법은 클래스명.변수이다.

지역 변수
- 메소드, 생성자 안에서 사용되는 변수이며, 그 안에서만 사용가능하고 메소드 실행이 끝나면 값이
자동으로 사라져서 사용할 수 없게 된다.

   public class Robot {
      int x;
      int y;
      int price;
      String color;		// 인스턴스 변수 → 멤버 변수
      
      Static int totalNumber;	// static 변수 → 멤버 변수
      
      void rightMove() {
         int x = 0;		// 지역 변수
      }
   }

⑦ static 변수
static 변수는 모든 객체가 공통적으로 사용할 수 있으며 클래스 변수(=정적 변수)라고 부른다.
클래스 변수는 객체를 생성하지 않고도 사용할 수 있다. 사용하는 방법은 객체를 생성하지 않기 때문에
클래스이름.변수명으로 사용하면 된다.
(_08_Robot, _09_RobotStatic 클래스 파일 참조)
*/
