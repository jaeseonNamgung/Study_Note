# 반응형 웹 - 미디어 쿼리(media query)
- 반응형 웹을 구현하기 위해 가장 많이 사용하는 방법으로, 기기의 종류와 화면의 크기의 조건에 따라 스타일을 작성할 수 있는 쿼리문

## min-width
- 최소 넓이 값(넓이 값 ~ 부터) / 지정한 사이즈 보다 넓은 경우
  - 화면 사이즈 기준 100%에서부터 화면 사이즈를 줄일 때 최소 ~ 유지하겠다는 뜻이다. 
## min-height
- 최소 높이 값
  - 요소의 높이에 최소 높이 설정

## max-width
- 최대 넓이 값(넓이 값 ~ 까지) / 지정한 사이즈 보다 작을 경우
  - 화면 사이즈 기준 0px부터 화면 사이즈를 줄였을 때 최대 ~ 유지하겠다는 뜻이다.
## max-height
- 최대 높이 값
  - 요소의 높이에 최대 높이 설정

# 미디어 쿼리 구문 ※(주로 스타일 시트를 따로 빼서 진행)

## 구문 설명
```@media 1.screen 2.and (조건){스타일 지정}```

1. 미디어 타입
- all : 전부
- screen : 스크린 화면
- print : 프린터
- tv : 텔레비전

2. 조건 연결 and 
- 조건은 늘릴 수 있다.
- and 앞뒤에는 띄어쓰기를 해줘야 한다. 
- (조건) 안에는 세미콜론(";")을 사용하지 않는다.


```@media screen and (조건) and (조건) {스타일 지정}```


**ex)** 
```html
@media screen and (min-width:1024px)
```

### 일반적인 해상도 기준
- min-width:1024px : pc 기준
- (min-width:768px) and (max-width:1023px) : 태블릿 기준
- (min-width:320px) and (max-width:767px) : 모바일 기준

# 반응형과 관련된 단위
- 폰트와 관련된 단위
  - em : 부모 요소를 기준으로 배수 값이 변환되는 단위
    - ex) 부모 요소의 font-size:10px; --> 1em = 10px, 2em = 30px 
  - rem : 제일 상단부모 요소를 기준으로 배수 값이 변환되는 단위
    - ex) html, body의 font-size:15px --> 1em = 15px, 2em = 30px

```html
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link href="web_style.css" rel="stylesheet" type="text/css">
</head>

<body>
    <!-- nav -->
    <nav>
        <h1>html5</h1>
        <ul>
            <li><a href="#">menu1</a></li>
            <li><a href="#">menu2</a></li>
            <li><a href="#">menu3</a></li>
            <li><a href="#">menu4</a></li>
            <li><a href="#">menu5</a></li>
        </ul>
    </nav>
    <!-- //nav -->
    <!-- mainBg -->
    <div id="main"></div>
    <!-- //mainBg -->

    <!-- section -->
    <section>
        <article>banner1</article>
        <article>banner2</article>
        <article>banner3</article>
        <article>banner4</article>
        <article>banner5</article>
        <article>banner6</article>
    </section>
    <!-- //section -->
</body>

</html>
```
```css
*{padding:0;margin:0;}
ul{list-style:none;}
a{text-decoration: none;}
nav{
    width:100%; 
    overflow:hidden;
    background-color:#482884 ;
}
nav>h1{
    float:left;
    width:20%;
    line-height: 100px;
    color:#fff;
    text-align:center;
}
nav > ul{
    float:right;
    width:40%;
    line-height: 100px;
    margin-right:2%;

}

nav li{
    float:left;
    width:20%;
    text-align:center;
}
nav li a{
    color:#fff;
    font-size:18px;
    font-weight: 900;
}

#main{
    width:100%;
    min-height: 400px;
    background-image: url(작업파일/main.jpg);
    background-size:100%;
    /* background-repeat: no-repeat; */
}

section{
    width:63%;
    overflow:hidden;
    margin:80px auto;
}

article{
    width:33.3%;
    float:left;
    line-height: 300px;
    background-color:coral;
    text-align:center;
}

article:nth-child(2n){
    background-color:darksalmon;    
}

@media screen and (max-width:1023px){

    nav>h1{display:none;}

    nav>ul{
        float:none;
        margin:0 auto;
        width:63%;
    }

    #main{
        background-image:url(작업파일/mainBg.jpg);
        min-height: 400px;
    }

    article{
        width:50%;
        margin-bottom:10px;

    }
}

@media screen and (max-width:767px){
    /* em - 특정한 폰트 사이즈 기준의 배수 값 : 부모 기준
       rem - 특정한 폰트 사이즈 기준의 배수 값 : 최상단 html,body 기준 */
    /* ex) nav li{font-size:15px;} */
   *{
       font-size:10px;/*원래 기본 값 16px*/
    }


    nav li a{ 
        font-size:1.3rem;/*10*1 = 10px*/
    }

    #main{
        min-height: 250px;
    }
    article{
        width:100%;
        font-size:1.5rem;
    }
}
```