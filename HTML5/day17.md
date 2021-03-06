# form
- ```<입력 양식 태그 = 서식>```
  - 웹 페이지에서의 입력 양식을 의미
  - 회원가입 등 사용자가 정보 등을 입력받아 웹 서버로 전송하는 일을 하며, 전달받은 정보는 웹 서버로 전송되는데 세부적인 작업은 개발자의 담당이다.
  - **정확한 정보를 전달하여 연결하기 위해서는 정보에 맞는 명확한 폼 양식이 필요하다.**

## ```from```
- 웹 페이지에서 입력양식의 그룹
- 원하는 정보를 연결하여 전달받기 위한 명확한 폼 양식

## form 관련 속성
- ```action``` : 폼을 전송할 서버 쪽 스크립트 파일을 지정 / 폼 데이터가 전송되는 경로
  - ex)  
      ```html 
      <form action="/test/file/login_target.php">
      ```
- ```name``` : 폼을 식별하기 위한 이름을 지정 / 폼의 이름(id를 부여하기도 한다.)
  - ex)
    ```html
    아이디 : <input type="text" name="id_lg"/>
    ```
- ```target``` : 서버로 제출된 내용이 열릴 위치를 명시
  - ex)
    ```html
    <form target="_blank">
    ```
- ```method``` : 폼을 서버에 전송할 http 메소드를 지정 / 폼 전송 방식(GET / POST)
  - get : 주소 표시줄에 사용자가 입력한 내용이 그대로 표시 (내부 길이 제한 - 보안상 취약)
  - ex)
    ```html
    alswjd0000.cafe24.com?name=value&name=value&..
    ```
- ```post``` : 대부분의 방식에 사용되며, 내부적으로 보이지 않게 보냄(내용 길이에 제한받지 않는다.)
- ex)
  ```html
  alswjd0000.cafe24.com
  ```
## form 관련 태그
- ```<label>``` : 해당하는 폼 요소의 설명에 해당하는 태그로 "글자와 같은 성격"을 가진다.
- ```<fieldset>``` : 폼 태그 안에 관련 있는 폼 요소(엘리먼트)들을 그룹화할 때 사용
- ```<legend>``` : fieldset 안에서 사용, 폼 그룹 요소에 대한 제목, 태그를 사용하여 그룹화한 폼 엘리먼트들을 목적에 맞게 이름을 지정
 
# 서식 태그
```html
<input type="속성"/>
```
: 글자와 같이 옆으로 나열되는 성격인 inline의 성격을 가지고 있다.

### 서식 속성의 종류
- ```text``` : 가로로 입력받는 기본적인 글자 내용 입력
- ```password``` : 비밀번호 입력 양식, 암호화된 표기로 나타난다.
- ```search``` : 검색 필드 만들 때 사용, 오른쪽 끝에 x 삭제 버튼이 나타난다. 
- ```url``` : 웹 도메인 주소를 입력받는 양식, (value="http://")를 미리 작성하면 사용자가 편리하다. 
- ```email``` : 이메일 입력 양식, 이메일 양식이 맞지 않을 때 @를 첨부하라는 경고문이 등장한다.
- ```tel``` : 전화번호 입력 양식, 모바일상 키 패드로 전환된다.
- ```number``` : 숫자 입력 양식, 숫자 입력이 가능한 위아래 버튼이 등장
  - min = 최소 값 / max = 최대 값 / setp = 단계
- ```range``` : 슬라이드 막대를 움직여 값 입력
  - min = 최소 값 / max = 최대 값
- ```color``` : 색상 선택하는 양식, 컬러 피커창이 나타난다.
- ```date``` : 날짜 입력 양식 / 달력 형태로 표현
- ```time``` : 시간 입력 양식
- ```radio``` : 단일 항목을 고르는 버튼 양식, 여러 개 작성 시 동일한 name을 부여해야 한다.
- ```checkbox``` : 여러 개의 항목을 체크하는 박스
- ```submit``` : 제출 용 버튼, 확인이나 전송 시 사용하는 양식
- ```reset``` : 다시 쓰기 버튼, 취소나 재작성 시 사용하는 양식 
- 
  ```html
  <select>
   <option>항목 나열</option>
  </select>
  ```
 : 셀렉트 박스 - 메뉴를 펼쳐서 나열하여 선택하는 양식
 
- 
  ```html
  <textarea> </textarea>
  ```

: 긴 내용의 글자를 작성할 때 사용하는 양식

- 
  ```html
  <button> </button>
  ```
  : 버튼 태그
- ```button``` : 일반 버튼 양식
- ```submit``` : 제출 버튼 양식
- ```reset``` : 리셋 버튼 양식


### 그 외 속성 종류
- ```name=" "``` : 태그 이름을 지정
- ```readonly=" "``` : 읽기 전용으로 지정
- ```maxlength=" "``` : 해당 태그 최대 글자 수를 지정
- ``` autofocus=" "``` : 웹 페이지가 로딩 후 지정한 포커스로 이동
- ``` placeholder=" "``` : 태그에 입력할 값에 미리 보기 양식 지원, 커서가 들어갔을 때 내용이 사라진다.
- ``` value="미리 작성 양식:``` : 미리 작성된 양식 뒤로 내용을 이 붙일 수 있도록 지원 


```html
<body>
    <from>
        <fieldset>
            <legend>개인 정보 입력</legend>
            <label>id</label>
            <input type="text" name="id" />
        </fieldset>

        <input type="password" name="password" />
        <br /><br />

        <input type="search" name="search" />
        <br /><br />

        <input type="tel" placeholder="010-0000-0000" name="tel" />
        <!-- placeholder : 미리보기 양식 지원 -->
        <br /><br />

        <input type="radio" />
        <br /><br />

        <input type="checkbox" />
        <br /><br />

        <input type="submit" value="확인" />
        <input type="reset" value="취소" />
        <br /><br />

        <textarea></textarea>
    </from>
</body>
```
![image](https://user-images.githubusercontent.com/84066249/135705193-9b58aa61-1d29-4d7f-9e1e-d79c7ad25daf.png)
