# 이미지 태그
- 이미지를 나타내줄 수 있는 태그
- 단독 태그
- 하나의 폴더 안에 들어가는 것은 "/"를 사용
- 글자와 같이 나열되는 성격을 지니며 이미지의 단락을 구분 지을 때는 ```<br/>```을 사용

## img 태그
```html
<!--사용 방법-->
<img src="이미지 경로"/>
```
```html
<body>
  
    <h1>img 태그</h1>
    
    <img src="img/camera01.png"/><br/>
    <!--지금 작성하는 html 파일과 함께 존재하는 img 폴더 안에(/) 이미지 이름.확장자를 불러서 찾겠다.-->
    
</body>
```
![image](https://user-images.githubusercontent.com/84066249/134152816-0fee87c9-3cdc-46d5-863a-10ef56070f15.png)

### alt
- 주석문, 이미지가 안 보일 때를 대비한 대체 문자
- html5 기본 규칙

```html
<!--사용 방법-->
<img src="이미지 경로" alt="이미지 이름"/>
```
```html
<body>
    
    <!--alt 문법을 사용하지 않았을 때-->
    <img src="camera0.png" /><br/>
    
</body>
```
![image](https://user-images.githubusercontent.com/84066249/134154007-30411c0e-a26c-493b-bb87-9701a0a30e4c.png)

```html
<body>
  
    <!--alt 문법을 사용했을 때-->
    <img src="camera0.png" alt="camera03"/><br/>
    
</body>
```
![image](https://user-images.githubusercontent.com/84066249/134153645-9c213be7-9281-462d-83b6-a16057c31c23.png)

alt 문법을 사용하면 이미지 경로를 잘 못 작성해서 이미지가 깨져서 나와도 그 이미지가 어떤 이미지인지 바로 알 수 있다. 

<body>
  
    <!--이미지 경로를 정확하게 작성했을 때-->
    <img src="camera0.png" alt="camera03"/><br/>
    
</body>

![image](https://user-images.githubusercontent.com/84066249/134156629-9deae572-f348-43fd-b1ff-f919fbe4e7b9.png)

이미지 경로를 정확하게 작성했을 때는 alt 태그에 이미지 이름은 화면 상에 나오지 않는다. 

### figure
- 이미지, 사진, 삽화, 오디오, 비디오 등 콘텐츠를 담을 때 사용

### figcaption
- figure 요소 안에서 사용
- 그 요소에 대한 설명하는 문구를 담는 태그
- figrue 요소에서 한 번만 사용 가능
- 제일 처음이나 마지막에 배치

```html
<!--사용 방법-->
<figure>

  <img src="이미지 경로" alt="이미지 이름"/>
  <figcaption>이미지 설명</figcaption>
  
</figure>
```

```html
<body>
    
    <figure>
        
        <img src="img/in/camera02.png" alt="camera02"/><br/>
        <figcaption>카메라를 올바를게 촬영하는 방법</figcaption>
        
    </figure>
    
</body>
```
![image](https://user-images.githubusercontent.com/84066249/134157160-ed1ae76a-6d87-4669-ad86-1a18cd8a0af0.png)

## 이미지 태그를 url로 연결

```html
<!--사용 방법-->
1. 이미지 하나를 정하고 마우스 우 클릭을 한 다음 이미지 주소 복사를 클릭하고 url 경로를 img 태그에 작성한다. 
2. <img src="url 경로" alt="이미지 이름"/>
```

```html
<body>
    
    <img src="https://t1.daumcdn.net/cfile/tistory/99BE8D355E80991408" alt="url"/>

</body>
```
![image](https://user-images.githubusercontent.com/84066249/134157916-040f7366-0dfc-45a9-ade6-3aa4dbf7d99f.png)

# 하이퍼텍스트 링크

## a 태그, href 태그
- 웹 페이지 연결, url 연결 시 사용
- 다른 페이지의 전환(메뉴 전환), 브라우저 내에서 바로 전환 가능
- 글자와 같이 나열되는 성격
- 링크 연결 시 기본 스타일(글자 색, 밑줄, 손 모양 커서)을 지님

```html
<!--사용 방법-->
<a href="url 주소"> 이름(메뉴 이름, 인터넷 이름 등)</a>
```

### 1. 인터넷 주소 연결

```html
<body>
    
    <!--1. 인터넷 주소, url >> https://(필수!)-->
    <a href="https://www.naver.com/">네이버</a>

</body>
```
![image](https://user-images.githubusercontent.com/84066249/134158853-c0a346d0-a3a3-477f-9457-09dfefee01d3.png)

**네이버를 클릭할 경우 네이버로 창이 열린다.**

### 2. 임시 링크
```html
<a href="#">관련된 이름</a>
```
```html
<body>
    
    <!--02. 임시 링크, #-->
    <a href="#">임시 링크</a> 

</body>
```
![image](https://user-images.githubusercontent.com/84066249/134159124-3782edb9-710a-41ff-a1f9-c3a675fda28b.png)

**href 태그에 #만 작성할 경우 화면 상에 임시 링크가 만들어진다. 임시 링크는 클릭은 되지만 아무 동작을 하지 않는다.**

### 3. 메일(mailto), 전화(tel), 문자(sms)
```html
<!-- 사용 방법-->
<a href="mailto or tel or sms:관련된 정보">관련된 이름</a>
```
```html
<body>
    
    <a href="mailto:sunnamgung8@naver.com">관리자 메일</a>
    
</body>
```
![image](https://user-images.githubusercontent.com/84066249/134159924-7895465c-afab-415f-86f2-79ef9344090a.png)

**페이지에 관리자 메일을 클릭할 경우 메일에 관련된 창이 뜬다.**

### 04 새 창 전환
- ```target``` : 링크된 문서를 클릭했을 때 문서가 열릴 위치를 지정
- ```_self``` : 기본 값 / 현재의 브라우저에서 전환
- ```_blank``` : 새 창 전환 / 새로운 도메인 창을 열 때 

```html
<!--사용 방법-->
<a href="url 주소" target=_self or _blank>url 이름</a>
```
```html
<body>
    
    <!--현재 브라우저에서 전환-->
    <a href="https://www.naver.com/" target=_self>현재 브라우저에서 전환</a><br /><br />
    
    <!--새 창 / 새로운 도메인 창을 열 때-->
    <a href="https://www.naver.com/" target=_blank>새 창</a>

</body>
```
![image](https://user-images.githubusercontent.com/84066249/134161194-d2ddc07a-bc20-489a-8cbc-a63f495303b1.png)

**코드를 작성하고 실행을 해보면 실행 결과를 알 수 있다.**

### 5. 메뉴를 눌러 서브 페이지 전환
- 다른 페이지로 이동할 때 사용 
```html
<!--사용 방법-->
1. <a href="서브 페이지 경로">관련된 이름</a>
2. 서브 페이지를 생성

```
```html
<body>
    
    <a href="sub.html">메뉴1</a>

</body>
```
```html
<!--서브 페이지-->
<body>
    <h2>서브 페이지로 이동했습니다.</h2>
</body>
```
![image](https://user-images.githubusercontent.com/84066249/134161861-97535434-4ba6-4adf-a5e1-908fbe2f5c50.png)

**메뉴를 클릭할 경우 서브페이지가 열린다.**

![image](https://user-images.githubusercontent.com/84066249/134161935-f1bff2ed-b1ba-4fcc-ab37-c7414d659fd2.png)

