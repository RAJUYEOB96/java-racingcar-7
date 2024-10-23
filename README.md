# java-racingcar-precourse
>  ### 1. 사용자의 입력에 따른 자동차 이름과, 시도 횟수 설정.

* 사용자에게 자동차 이름 입력을 요청합니다.
* 사용자에게 시도 횟수 입력을 요청합니다.
* 쉼표(,)를 통해 자동차 이름을 구분합니다.

        예시)
        경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)
        pobi,woni,jun

        시도할 횟수는 몇 회인가요?
        5

</br>

>  ### 2. 전진하는 조건 설정 후 이동 결과를 출력.

* 0에서 9 사이의 무작위 값을 생성하고, 값이 4 이상일 때만 자동차가 전진하는 로직을 구현한다.
* 각 시도 횟수마다 자동차의 이름과 현재 위치를 출력하는 기능을 구현한다.

  예시)
  시도할 횟수는 몇 회인가요?
  5
  실행 결과
  pobi : -
  woni :
  jun : -

        pobi : --
        woni : -
        jun : --
        
        pobi : ---
        woni : --
        jun : ---
        
        pobi : ----
        woni : ---
        jun : ----
        
        pobi : -----
        woni : ----
        jun : -----

  </br>

>  ### 3. 우승자 결정, 공동 우승의 경우 구분 기능

* 모든 시도 횟수가 끝난 후 가장 멀리 이동한 자동차를 우승자로 판별하고 출력하는 기능을 구현한다.
* 공동 우승자가 있을 경우, 여러 명의 우승자를 출력할 수 있도록 한다. (쉼표(,)로 구분한다.)

        최종 우승자 : pobi, jun

  </br>

>  ### 4. 예외 처리 기능

* 입력값이 유효하지 않을 경우 IllegalArgumentException을 발생시키고 프로그램을 종료하는 기능을 구현한다. (자동차 이름 5자 이상, 시도 횟수에 숫자가 아닌 값 입력)

        자동차 이름 입력 : "abcdef"
        예외 발생 : IllegalArgumentException
        
        시도할 횟수 입력 : a
        예외 발생 : IllegalArgumentException