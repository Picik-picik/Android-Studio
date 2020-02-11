package _02_LearningJavaGrammar;

public class _01_LearningJavaGrammar_2 {

}

/*
02 > 자바 문법 익히기 (2)

① 상속
기존 클래스가 가지고 있는 필드(멤버 변수)와 메소드를 그대로 사용할 수 있는 방법이 상속이다.
본 예제에서는 Robot 클래스를 상속받는 FishRobot와 DroneRobot 클래스를 만들었다.
이때 Robot 클래스는 조상 클래스가 되고 FishRobot과 DroneRobot 클래스는 자손 클래스가 된다.
조상 클래스는 자손 클래스들의 공통된 요소들을 가지고 있다. 자손 클래스는 extends 키워드를
사용해서 조상 클래스를 상속받을 수 있으며 조상 클래스의 필드와 메소드를 사용할 수 있다.

   DroneRobot.java          < Robot.java >          FishRobot.java
   int altitude;               int x, y;                int depth;
   fly()                       int power;               swim()
                               int price;
                               String name;
                               void mySituation()
                               
                               상속관계
                               
                                 Robot
                               ↗     ↖
                      DroneRobot       FishRobot
                               
                               상속계층도
                               
더 알아보기
- 자손 클래스들은 또한 조상 클래스가 가지고 있지 않은 자신들만의 필드와 메소드를 만들어
사용할 수 있다. 본 예제에서 로봇(Robot 클래스)의 멤버는 위치값(x, y)와 로봇의 가격(price) 및
위치를 나타내는 메소드 mySituation()으로 구성하였다. FishRobot 클래스는 Robot 클래스를 상속하여
Robot 클래스의 변수와 메소드를 사용할 수 있다. 그리고 자신만의 메소드인 swim() 메소드를 만들어서
사용할 수 있다. DroneRobot 클래스도 자신만의 메소드인 fly() 메소드를 만들어서 사용했다.
(_02_Robot.java, _03_RobotTest.java 파일 참조)

Tip
- FishRobot 클래스와 DroneRobot 클래스는 멤버 변수(x, y, power, name)와
멤버 메소드(mySituation)가 없다. 하지만 extends 키워드를 사용해서 Robot 클래스를 상속받기 때문에
조상 클래스의 멤버 변수(x, y, power, name)와 멤버 메소드(mySituation)를 사용할 수 있다.
안드로아디 앱을 제작할 때 상속을 이용한다면 이미 만들어진 다양한 메소드들을 쉽게 사용할 수 있을
것이다.

② 오버라이딩(overriding)
조상 클래스를 상속받게 되면 조상 클래스의 멤버 변수와 멤버 메소드를 사용할 수 있다고 배웠지만,
경우에 따라서는 조상 클래스의 메소드를 재정의(변경)해서 사용할 필요가 있다.
이렇게 조상 클래스의 메소드를 자손 클래스에서 변경해서 사용하는 것을 오버라이딩이라고 한다.
(_04_Robot.java, _05_RobotTest.java 파일 참조)

③ super()
super()는 조상의 생성자를 호출하는데 사용되는 키워드이다. 이번 예제를 통해 조상의 생성자를
사용하는 방법을 살펴보겠다. 자식의 생성자를 호출하게 되면 부모의 생성자를 호출하게 된다.
자식 클래스의 객체를 생성하게 되면 부모 클래스의 생성자가 먼저 실행이 되고 자식 클래스의
생성자가 실행된다. 부모 클래스의 생성자를 통해서 부모 클래스의 멤버들이 초기화가 이루어지기
때문이다. 부모 클래스 멤버들의 초기화가 끝나면 자식 클래스의 생성자가 실행되어 자식 클래스
멤버들의 초기화가 진행된다.
(_06_Robot.java, _07_RobotTest.java 파일 참조)

④ super() 좀 더 알아보기
(_08_Robot.java, _09_RobotTest.java 파일 참조)

⑤ 추상 클래스
완전하게 구현되지 않은 메소드를 가지고 있는 클래스를 추상 클래스라고 한다.
메소드가 완전하게 구현되어 있지 않기 때문에 객체를 생성할 수 없는 클래스이기도 하다.
안드로이드 앱을 제작할 때 인터페이스를 구현할 때가 많기 때문에 인터페이스를 이해하기 전 단계인
추상 클래스를 이해할 필요가 있다. 추상 클래스를 상속받는 자식 클래스에서 미완성된 메소드를
구현하면 된다. 추상 클래스를 상속받는 클래스는 반드시 미완성된 메소드를 구현해야 자식 클래스의
객체를 생성하여 활용할 수 있다.
(_10_Robot.java, _11_RobotTest.java 파일 참조)
*/
