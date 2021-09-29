# 시맨틱 구조(semantic-tags)
- 검색 엔진 같은 프로그램에서 자료를 검색하여 정보의 의미를 분석할 수 있게 도와주는 지능형 웹, 통칭적으로 의미를 가진 구조 = ```Content Model = Semantic```
- 어떤 요소가 어떤 내용 또는 태그를 포함할 수 있는지에 관한 정의 
- 웹 페이지의 구조를 더욱 쉽게 이해

## 의미 요소를 가진 태그
- 자신의 컨텐츠를 명확하게 정의
- 코드의 가독성을 높이고 의미를 명확하게 해주는 장점
- 컴퓨터의 정보를 이해, 논리적인 추론이 가능한 구조

### 시맨틱 구조의 대표적인 태그
- ```header``` : 머리말 의미, 헤더, 로고, 네비게이션 검색창
- ```nav``` : 메뉴를 묶거나 메뉴를 담을 때 사용
- ```section``` : 콘텐츠 / 단락 나눔 주제별 묶기, 제목 태그와 단락 나누며 표현
- ```article``` : 기사를 뜻함 / 웹상의 내용 작성 section 안에서 더 세부적으로 나눌 때 사용
- ```aside``` : 링크, 광고, 사이드 배치
- ```footer``` : 웹 하단 저작권 연락처 등


```html
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link href="csstest.css" rel="stylesheet" type="text/css">
    <!-- 외부 스타일 시트 연결 구문 -->
</head>

<body>
    <header>
        <h1>시맨틱 구조</h1>

        <nav>
            <ul>
                <li>시맨틱 구조의 의미</li>
                <li>시맨틱 구조의 의미 요소를 가진 태그</li>
                <li>시맨틱 구조의 대표적이 태그들</li>
            </ul>
        </nav>
    </header>

    <div id="wrap">
        <section>
            <article>
                <h2>시맨틱 구조의 의미</h2>
                <p>
                    "검색 엔진 같은 프로그램에서 자료를 검색하여 정보의 의미를 분석할  수 있게 도와주는 지능형 웹"
                    통칭적으로 의미를 가진 구조 = Content Model = Semantic
                    어떤 요소가 어떤 내용 또는 태그를 포함할 수 있는지에 관한 정의
                    웹 페이지의 구조를 더욱 쉽게 이해
                </p>
            </article>
            <article>
                <h2>시맨틱 구조의 의미 요소를 가진 태그</h2>
                <p>
                    - 자신의 컨텐츠를 명확하게 정의
                    - 코드의 가독성을 높이고 의미를 명확하게 해주는 장점
                    - 컴퓨터의 정보를 이해, 논리적인 추론이 가능한 구조
                </p>
            </article>
            <article>
                <h2>시맨틱 구조의 대표적이 태그들</h2>
                <p>
                    header - 머리말 의미, 헤더, 로고, 네비게이션 검색창 
                    nav -  메뉴를 묶거나 메뉴를 담을 때 사용  
                    section - 콘텐츠 / 단락 나눔 주제별 묶기,  제목 태그와 단락 나누며 표현 
                    article - 기사를 뜻 /  웹상의 내용 작성 section 안에서 더 세부적으로 나눌 때 사용 
                    aside - 링크, 광고, 사이드 배치 
                    footer - 웹 하단 저작권 연락처 등   
                </p>
            </article>

            <aside>
                이 부분은 광고글입니다.
            </aside>
        </section>
    </div>

    <footer>
        웹 하단 저작권 연락처
    </footer>
</body>

```

```css
*{
    padding:0;
    margin:0;
}

li{list-style-type:none;}

header{
    width:1000px;
    height:100px;
    border:2px solid #000;
    margin:100px auto;
    margin-top:100px;
}

header>h1{
    float:left;
    line-height:100px;
    width:200px;
    text-align:center;
    background-color:azure;
}

nav{
    float:right;
}

li{
    line-height:30px;
    padding-left:20px;
    float:left;
    font-size:15px;
    background-color: beige;
}

#wrap{
    width:1000px;
    margin:0 auto;
    overflow:hidden;
    background-color:chocolate;
}

section{
    width:700px;
    float:left;
    overflow:hidden;
}

aside{
    width:280px;
    float:right;
    overflow:hidden;
    background-color:burlywood;
}

article{
    padding:10px;
    box-sizing:border-box;
    margin-bottom:20px;
    background-color:palegreen;
}

footer{
    width:1000px;
    height:100px;
    border:2px solid #000;
    margin:10px auto;
    text-align: center;
    line-height:100px;
    font-size:20px;
    color:rebeccapurple;
}
```
![image](https://user-images.githubusercontent.com/84066249/135261042-3c2720b4-172c-43a5-87ea-2bbf24863e7a.png)

