# 후손 선택자 & 자손 선택자
- 후손 선택자 : 해당 요소의 하위 요소에 있는 특정한 요소를 모두 선택
  - 사용 방법 :  ```선택자A 선택자B```
- 자손 선택자 : 해당 요소의 바로 밑에 위치하는 특정한 요소를 선택
  - 사용 방법 : ```선택자A > 선택자B```

![프레젠테이션1](https://user-images.githubusercontent.com/84066249/134760214-5c335a93-58ae-4521-b9e0-26c4a3eb09d2.png)

```html
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>

    <style>
        div>h1 {
            color: blue;
            /*자손 선택자*/
        }

        ul>li {
            color: sandybrown;
            /*ul의 자손 선택자*/
        }
    </style>

</head>

<body>

    <div>
        <h1>자손 선택자 & 후손 선택자</h1>
        <p>
            It has survived not only five centuries, but also the leap into electronic typesetting, remaining
            essentially unchanged.
            It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and
            more recently
            with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.
            Why do we use it?
            It is a long established fact that a reader will be distracted by the readable content
            of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal
            distribution of
            letters, as opposed to using 'Content here, content here', making it look like readable English. Many
            desktop publishing
            packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem
            ipsum' will uncover
            many web sites still in their infancy. Various versions have evolved over the years, sometimes by accident,
            sometimes on purpose (injected humour and the like).
        </p>
        <ul>
            <li>회사 소개</li>
            <li>제품 소개</li>
            <li>온라인 문의</li>
            <li>커뮤니티</li>
        </ul>
    </div>


</body>
```
![image](https://user-images.githubusercontent.com/84066249/134760804-b409ad03-8765-43d4-b916-4424b4af7fed.png)

```html
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>

    <style>
        /*후손 선택자*/
        div p {
            color: rgb(252, 18, 18);
        }

        div li {
            background-color: green;
        }
    </style>

</head>

<body>

    <div>
        <h1>자손 선택자 & 후손 선택자</h1>
        <p>
            It has survived not only five centuries, but also the leap into electronic typesetting, remaining
            essentially unchanged.
            It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and
            more recently
            with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.
            Why do we use it?
            It is a long established fact that a reader will be distracted by the readable content
            of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal
            distribution of
            letters, as opposed to using 'Content here, content here', making it look like readable English. Many
            desktop publishing
            packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem
            ipsum' will uncover
            many web sites still in their infancy. Various versions have evolved over the years, sometimes by accident,
            sometimes on purpose (injected humour and the like).
        </p>
        <ul>
            <li>회사 소개</li>
            <li>제품 소개</li>
            <li>온라인 문의</li>
            <li>커뮤니티</li>
        </ul>
    </div>


</body>
```
![image](https://user-images.githubusercontent.com/84066249/134760979-c41bb7d1-e47e-41c4-828a-3c2fb9e13c42.png)

# 동위 선택자
- 동위 관계에 있는 요소 중에서 해당 요소보다 뒤에 있는 요소를 선택하는 방법
- 사용 방법 : 
  - ```선택자A + 선택자B(인접 동위 선택자)``` -> 선택자A 뒤에 존재하는 선택자 B만을 선택
  - ```선택자A ~ 선택자B(일반  동위 선택자)``` -> 선택자A 뒤에 존재하는 선택자 B 모두를 선택

 

#### 동위 관계란?
- 부모 요소 안에 존재하는 동일한 형태의 요소를 형제라고 하며, 형제를 동위 관계라고 한다. 

```html
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>

    <style>
        h1+p{
            color:blue;
            /*선택자A 뒤에 존재하는 선택자B만을 선택*/
        }

        h1~ul{
            background-color: aquamarine;
            /*선택자A 뒤에 존재하는 선택자B 모드를 선택*/
        }
    </style>

</head>

<body>

    <div>
        <h1>자손 선택자 & 후손 선택자</h1>
        <p>
            It has survived not only five centuries, but also the leap into electronic typesetting, remaining
            essentially unchanged.
            It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and
            more recently
            with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.
            Why do we use it?
            It is a long established fact that a reader will be distracted by the readable content
            of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal
            distribution of
            letters, as opposed to using 'Content here, content here', making it look like readable English. Many
            desktop publishing
            packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem
            ipsum' will uncover
            many web sites still in their infancy. Various versions have evolved over the years, sometimes by accident,
            sometimes on purpose (injected humour and the like).
        </p>
        <ul>
            <li>회사 소개</li>
            <li>제품 소개</li>
            <li>온라인 문의</li>
            <li>커뮤니티</li>
        </ul>
    </div>


</body>
```
![image](https://user-images.githubusercontent.com/84066249/134761491-b13601c7-1ed0-43e4-9360-73d199f66412.png)

# 반응 선택자 
- 사용자가 마우스로 특정한 행동을 취했을 때 CSS 속성을 지정할 수 있는 선택
- 태그 종류 : 
  - ```:hover``` : 마우스를 올려놓으면 선택
  - ```:active``` : 마우스를 클릭하면 선택
  - ```:visited``` : 클릭하여 방문하였을 때 선택
  - ```:link``` : 방문하지 않은 링크 적용

```html
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>

    <style>
        ol>.menu1:hover {
            color: blue;
            /*마우스를 올려놓으면 선택*/
        }

        .menu2:active {
            background-color: crimson;
            /*마우스를 클릭하면 선택*/
        }
    </style>

</head>

<body>

    <div>
        <ol>
            <li class="menu1">아메리카노</li>
            <li class="menu2">카페라떼</li>
            <li class="menu3">아이스티</li>
            <li class="menu4">스무디</li>
            <li class="menu5">과일주스</li>
        </ol>
    </div>


</body>
```
반응 선택자 결과는 직접 코드를 작성하고 결과를 확인하면 되겠습니다!!!

