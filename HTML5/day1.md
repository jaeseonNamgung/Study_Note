# TAG 구조와 문법
**태그 사용법**
```html
<태그 명령어></태그 명령어>
```
태그는 꺾쇠를 이용해서 사용하고 앞에 <>가 시작 태그이고 뒤에</>는 끝 태그이다.

## html 기본 구조
1. ```<!DOCTYPE html>``` : 지금 사용하는 문서 타입은 HTML 형식을 사용한다.
2. ```<html lang="ko">``` : HTML 문서의 시작을 알리며 lang 속성을 사용해 문서에서 사용할 언어를 지정한다.
  - **휴먼 랭귀지란?** lang는 휴먼 랭귀지를 뜻하며 language의 약자이다. [한국(korean) : ko, 영어(english) : en, 일본(japan) : ja, 중국(china) : zh]
3. ```<head>``` : 문서 서두에 해당, CSS를 비롯한 자바스크립트, 외부 페이지 연결 등의 구성을 하는 부분이다.
4. ```<meta charset="utf-8"/>``` : 언어 캐릭터 셋 
  - **언어 캐릭터 셋 :** HTML로 저장된 파일 내부에는 태그를 포함한 텍스트의 콘텐츠이다.
5. ```<meta name="viewport" content="width=device-width, initial-scale=1.0">``` :  페이지의 너비를 기기의 스크린 너비로 설정, 처음 페이지 로딩 시 확대/축소가 되지 않은 원래 크기를 사용 

6. ``` <meta name="viewport" content="width=device-width, initial-scale=1.0">``` : IE 버전이 다르더라도 같은 화면을 볼 수 있도록 하는 것을 의미 
8. ```<title></title>``` : 브라우저 탭 또는 즐겨찾기에 표시되는 제목 영역
9. ```</head>``` : head 끝부분
10. ```<body>``` : 실제 브라우저 화면에 표시되는 영역이다.
11. ```</body>``` : body 끝부분
12. ```</html>``` : html 끝부분

 
## 문서를 만들거나, 폴더를 만들 때 주의사항(이름, 문서, 폴더, 파일, 선택자 --> 전부 적용)
- 영문으로 작성해야 한다.
- 대소문자를 구분해야 한다.
- 한글 사용이 불가능하다.
- 띄어쓰기는 불가능하다.
- 특수문자는 ```-```, ```_``` 만 가능하다.
- 영문 뒤에 숫자 사용을 권장한다. 
  

# 태그 종류

## 주석
1. 코멘트 용도 
  - 코드에 대한 설명
  - 프로그램한 것들을 기록
2. 디버깅 용도
  - 코드를 잠시 사용하지 않을 때
```html
<!--주석 내용-->
```

## 제목 태그 
- 제목 태그는 작성한 순서대로 위에서 아래로 쌓이는 형태이다. 
- h1 ~ h6 : 숫자가 뒤로 갈수록 글자 사이즈가 줄어든다. 
- **타이틀에 사용** 

```html
    <h1>header-1</h1>
    <h2>header-1</h2>
    <h3>header-1</h3>
    <h4>header-1</h4>
    <h5>header-1</h5>
    <h6>header-1</h6>
```
![image](https://user-images.githubusercontent.com/84066249/133821778-98af93bb-fc9c-4563-a20e-0d96a2fc3a55.png)


## 단락(p)
본문에서 구분하거나 나타낼 때 사용, 주로 글자를 담아서 표현
```html
<p>제목 내용</p>
```
```html
<body>
 
        Lorem Ipsum is simply dummy text of the printing and typesetting industry.
        Lorem Ipsum has been the industry's standard
        dummy text ever since the 1500s,
        when an unknown printer took a galley of type and scrambled it to make a type specimen book

</body>
```
![image](https://user-images.githubusercontent.com/84066249/133959550-79c6fd73-c668-43a8-82e2-7ea96f4f8f48.png)

html에서는 마음대로 줄바꿈을 하거나 띄어쓰기를 할 수 없다. 

```html
   <p>
    Lorem Ipsum is simply dummy text of the printing and typesetting industry.
    Lorem Ipsum has been the industry's standard
   </p>

   <p>
    dummy text ever since the 1500s,
    when an unknown printer took a galley of type and scrambled it to make a type specimen book
   </p>
```
![image](https://user-images.githubusercontent.com/84066249/133823749-8f268456-1cb9-40bc-9411-cfd6a761d77f.png)

p 태그를 사용할 경우 단락을 구분할 수 있다. 

### 줄바꿈 <br/>

```html
내용... <br/>
내용... <br/>
```
![image](https://user-images.githubusercontent.com/84066249/133823928-51c7b436-d5e2-4785-a987-edde763be7df.png)
 
 br을 띄어쓰기가 가능해진다. 
 
 ## 수평선 <hr/>
 - 수평선을 나타내는 태그
 - 단락의 구분
 - 주제가 바뀔 때
 - 입체적
 
 ```html
<hr/>
```

![image](https://user-images.githubusercontent.com/84066249/133824664-c8ca5f1d-afeb-4519-91dd-ad79a46d1edb.png)
 
 ## 인용문 <blockquote>
 - 긴 인용문을 나타낼 때 사용하는 태그
 - 들여쓰기
  
```html
    <h2>header-2</h2>
    <P>What is Lorem Ipsum</P>
    <blockquote>
        Lorem Ipsum used since the 1500s is reproduced below for those interested.
    </blockquote>
    
```
 
 ![image](https://user-images.githubusercontent.com/84066249/133959662-ccd9ce38-f766-4134-bc34-ca3c0bd9ee5b.png)

Lorem Ipsum used since the 1500s is reproduced below for those interested. 부분이 들여쓰기 된 걸 확인할 수 있다.

## 공백이나 줄바꿈 등이 그대로 표현되는 태그 <pre>

```html
    <p>Lorem Ipsum</p>
    <pre>
        Contrary to popular belief, Lorem Ipsum is not simply random text. 
        It has roots in a piece of classical Latin literature from 45 BC, 
        making it over     2000 years old.
    </pre>
```
![image](https://user-images.githubusercontent.com/84066249/133960001-349f706b-39f6-4d17-a789-1f7ad37fddfd.png)

