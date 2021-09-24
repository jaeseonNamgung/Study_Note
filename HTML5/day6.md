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
- padding, marjin : pading과 marjin은 상하좌우마다 각각 다른 값을 부여해 크기를 정할 수 있다. 
 한자리 - padding "or" marjin - 방향 값(예 : padding-top ) / 두 자리 - 상하좌우  /  네 자리 - 시계방향 : top -> right -> botton -> left  
 
 1. **한자리만 값을 지정했을 경우** 
 ```html
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>
        div{
            border : 5px solid #000;
            background-color:burlywood;
            width:200px;
            font-size:30px;
            margin-left:50px;
            padding-top:20px;
        }
    </style>
</head>

<body>
   
    <div>box</div>

</body>
```
![image](https://user-images.githubusercontent.com/84066249/134602991-96045884-1e35-4f94-893e-c086657fb464.png)

2.  **두  자리 값을 지정했을 경우** 

```html
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>
        div{
            border : 5px solid #000;
            background-color:burlywood;
            width:200px;
            font-size:30px;
            margin:20px 20px;  /*상하좌우*/
            padding:50px 50pxd;
        }
    </style>
</head>

<body>
   
    <div>box</div>

</body>
```
![image](https://user-images.githubusercontent.com/84066249/134603233-52fa162c-4b3e-4a7c-ad4f-cc26a90770be.png)

3.  **네  자리 값을 지정했을 경우** 

```html
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>
        div{
            border : 5px solid #000;
            background-color:burlywood;
            width:200px;
            font-size:30px;
            margin:10px 20px 30px 50px ;
            padding:20px 40px 30px 10px;
        }
    </style>
</head>

<body>
   
    <div>box</div>

</body>
```

![image](https://user-images.githubusercontent.com/84066249/134603304-97a77107-aa51-40ce-abac-da5a2cfe7005.png)

## border
- border : 선 -> 굵기 스타일 색상 / 개별 부여 가능
- border-color : 선의 색상 -> 전체 적용
- border-style : 선의 스타일 -> 전체 적용
- border-width : 선의 굵기 - 전체 적용
- border-radius : 모서리 둥글게 표현 / px, % (1자리 - 4개의 모서리 전체 / 2자리 - x자에 순으로 방향 결정  / 4자리 - 시계방향(x자에 왼쪽 상단부터 시작)

1. **기본 border 사용법**
```html
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>
        div{
            background-color:burlywood;
            width:200px;
            font-size:30px;
            margin:10px 20px 30px 50px ;
            padding:20px 40px 30px 10px;

            border-color:blue;
            border-style:solid;
            border-width:3px
        }
    </style>
</head>

<body>
   
    <div>box</div>

</body>
```
![image](https://user-images.githubusercontent.com/84066249/134604342-cb8182da-f868-4b89-bea0-dbd38d48b67d.png)

2. **상단에만 선을 지정할 경우**
```html
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>
        div{
            background-color:burlywood;
            width:200px;
            font-size:30px;
            margin:10px 20px 30px 50px ;
            padding:20px 40px 30px 10px;

           border-top:5px solid blueviolet;
        }
    </style>
</head>

<body>
   
    <div>box</div>

</body>
```
![image](https://user-images.githubusercontent.com/84066249/134605079-3e99ef7d-4232-4a06-a87a-c992df6b4a2b.png)

3. **모서리를 둥글게 표현 (개별 값 부여)**

```html
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>
        div{
            background-color:burlywood;
            width:200px;
            font-size:30px;
            margin:10px 20px 30px 50px ;
            padding:20px 40px 30px 10px;

            border-radius:10px 20px 30px 40px;
        }
    </style>
</head>

<body>
   
    <div>box</div>

</body>
```
![image](https://user-images.githubusercontent.com/84066249/134606472-63210c31-dd71-4c93-b1eb-5aac0dc44050.png)

