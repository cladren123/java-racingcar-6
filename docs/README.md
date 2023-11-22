# 자동차 경주



## 핵심 기능

경주 자동차와 시도 회수를 입력 받아 차수별 실행 결과와 우승자를 출력합니. 



## 기능 소개

### RacingCarController

사용자의 입력값으로 서비스를 실행하고 결과값을 반환합니다. 

- [ ] startRacing() : 경주 게임을 시작합니다. 
- [ ] inputCar() : 경주 할 자동차의 이름을 입력 받고 검증된 결과값을 받습니다.
- [ ] inputTryNumber() : 시도할 횟수를 입력 받고 검증된 결과값을 받습니다. 
- [ ] racing() : 레이싱 게임을 진행한 후 결과값을 반환 받아 OutputView로 전달합니다. 
- [ ] winner() : 최종 우승자 값을 반환 받아 OutputView로 전달합니다. 



### InputView 

사용자로부터 경주 할 자동차의 이름과 시도할 회수를 입력 받습니다. 

- [X] InputCar() : 경주 할 자동차의 이름을 입력 받습니다.
- [X] InputTryNumber() : 시도할 횟수를 입력 받습니다. 



### TryNumber

시도할 횟수를 저장하는 도메인 클래스 입니다. 

- [X] getTryNumber() : 시도할 횟수를 반환합니다. 단, 직접 값을 반환하는게 아니라 새로운 변수에 담아 반환합니다. 



### Car

자동차를 저장하는 도메인 클래스 입니다. 자동차 이름과 현재 전진 횟수를 저장합니다. 

- [X] getName() : 자동차 이름을 반환합니다.
- [X] getLocation() : 현재 위치를 반환합니다.
- [X] move() : 무작위 값을 발생시켜 조건에 맞으면 전진 횟수를 하나 증가합니다.
- [X] getLocationString() : 현재 위치를 - 로 나타냅니다. 



### Race

Car의 List를 가지고 있습니다. 

- [X] move() : List의 Car를 조건에 맞으면 전진시킵니다. 
- [X] round() : List의 Car의 현재 결과를 취합해서 반환합니다. 
- [X] winner() : 우승자를 계산해 반환합니다. 



### RaceService

화면단에 필요한 정보를 취합하고 반환합니다. 

- [X] inputCar() : 입력 받은 자동차를 검증하고 저장합니다.
- [X] inputTryNumber() : 입력 받은 시도할 횟수를 저장합니다. 
- [ ] round() : 시도할 횟수만큼 자동차를 움직이고 결과값을 저장한 후에 반환한다.
- [ ] winner() : 우승자를 계산해 반환합니다. 



### OutputView

컨트롤러에서 값을 받은 다음 결과를 반환합니다. 

- [ ] printRound() : 라운드 결과를 출력합니다.
- [ ] printWinner() : 최종 우승자를 출력합니다. 



### Validate

검증 작업을 합니다.

- [X] validateNumber() : 숫자인지 검증합니다. 
- [X] validateCarNameLength() : 자동차 이름이 5자 이하인지 검증합니다. 



### Converter

변환 작업을 합니다.

- [X] inputToCars() : 입력값을 변환하여 자동차 리스트로 반환합니다. 


### Enum 클래스

- [X] InputMessage : 입력 화면에 쓰일 메세지를 관리합니다. 
- [X] OutputMessage : 출력 화면에 쓰일 메세지를 관리합니다. 
- [X] NumberConstant : 기능 구현에 필요한 숫자 상수들을 관리합니다. 
- [X] ConfigConstant : 기능 구현에 필요한 상수들을 관리합니다. 





















