# 공간 분할 태그
## div(Divisioin)
- 웹 사이트의 레이아웃을(전체적인 틀) 구성할 때 주로 사용
- block에 해당하는 태그로 레이아웃 배치 시 CSS를 활용하여 스타일을 적용하여 사용

## div 태그 종류
- width : 넓이를 지정 / 값 : 숫자 입력(px, %, auto)
- height : 높이를 지정 / 값 : 숫자 입력(px, %, auto)
- border : 선 표현 / 값 : 굵기 스타일 색 (단어, 컬러 코드) ex) border:10px solid #000;
- padding : 안쪽 여백(박스 형태에서 -> 안쪽으로 여백을 주고 싶을 때 지정) / 값 :ㅣ 숫자 입력(px, %, auto)
- margin : 바깥 여백(박스 형태에서 -> 바깥으로 여백을 주고 싶거나 밀어 배치를 하고 싶을 때 지정) / 값:숫자입력(px, %, auto) 

![image](https://user-images.githubusercontent.com/84066249/134331158-7f1dd96b-41f4-4e71-9022-9ac47317d82a.png)

``` html
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>div</title>
    <style>
        *{
            margin:0;
            padding:0;
    }
    div{
        background-color:aquamarine;
        font-size:30px;
        font-weight:900;
        /*box-size에 영향을 주는 스타일*/
        width:100px;/*넓이, 가로 폭=px, %, auto*/
        height:100px;/* 높이, 세로 폭=px,%,auto*/
        border:5px solid #000;/*선, 선의 굵기 - 선의 스타일 - 선의 색상*/
        padding:50px;/*안쪽 여백 - 안쪽으로 내용물과 박스 사이의 틈(한자리) 전체 면 적용*/
        margin:50px;/*바깥 여백 - 바깥으로 박스 혹은 다른 요소와의 틈, 간격(한자리 - 전체)*/
       
    }
    </style>
</head>
<body>
    <div>box1</div>
</body>
```
![image](https://user-images.githubusercontent.com/84066249/134329583-a5e2965e-25c2-4ca4-93e1-57b962244ea6.png)

## block 
- block : 박스와 같이 쌓이면서 나타나는 성격
- 화면 전체를 사용하는 태그 -> block element (태그 종류 : div, p, h1~h6, ul,ol, form, table, blockquote...) 

## inline
- inline : 글자와 같이 나열되며 나타나는 성격
- 내용의 폭 값을 가지는 성격을 가짐
- 화면의 일부를 차지하는 태그 -> inline level element (태그 종류 : a, img, span, sub, sup, i, em, b (글자를 꾸미는 태그 종류), input)


```html
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>박스의 성격</title>
    <style>
        div{
            background-color:coral;
            line-height:50px;/* 행간 줄 간격 */
        }
        span{
            background-color: aquamarine;
        }
    </style>
</head>
<body>
    <!--block : 박스와 같이 쌓이면서 나타나는 성격 / 화면 전체를 사용하는 태그 -->
    <div>box1</div>
    <div>box2</div>
    <div>box3</div>

    <br/> <br/> <br/>

    <!-- inline : 글자와 같이 옆으로 나열되며 나타나는 성격 / 내용의 폭 값, 화면의 일부를 차지하는 태그 / width, heght, margin-top, margin-bottom=적용되지 않음! -->
    <span>span1</span>
    <span>span1</span>
    <span>span1</span>
    
</body>
```
![image](https://user-images.githubusercontent.com/84066249/134330707-e96f054d-0554-4475-a38a-1e219177381a.png)


# 여백, 사이즈 


