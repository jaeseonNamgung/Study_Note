# 박스 나열

## float 
float은 띄우다, 나열하다라는 뜻으로 말 그대로 박스를 나열하고자 할 때 사용하는 속성이다. 

### float 기본 속성 

- none : 나열하지 않음
- left : 외쪽으로부터 나열
- right : 오른쪽으로부터 나열
- initial : 기본 값으로 설정
- inherit : 부모 요소로부터 상속 

1. 왼쪽으로 나열
```html
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>
        div{
            font-size : 30px;
            width:200px;
            height:200px;
            border:5px solid #000;
            margin:20px;
            float:left;  
        }

        
    </style>
</head>

<body>
   
    <div>box1</div>
    <div>box2</div>
    <div>box3</div>

</body>
```
![image](https://user-images.githubusercontent.com/84066249/134623726-c63c8674-db56-46a2-8527-dfb2afc3a76d.png)

2. 오른쪽으로 나열

```html

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>
        div {
            font-size: 30px;
            width: 200px;
            height: 200px;
            border: 5px solid #000;
            margin: 20px;
            float: right;
        }
    </style>
</head>

<body>

    <div>box1</div>
    <div>box2</div>
    <div>box3</div>

</body>
```
![image](https://user-images.githubusercontent.com/84066249/134623814-20f5e912-34e8-4ec7-8de5-22c83dba6088.png)

## clear

- "해제한다"라는 의미를 갖는다.
- float와 함께 사용
- float을 제거할 때 사용

### clear 기본 속성  
- left : 좌측 나열을 제거
- right : 우측 나열을 제거
- both : 양쪽 나열을 제거 

```html
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>
        div {
            font-size: 30px;
            width: 200px;
            height: 200px;
            border: 5px solid #000;
            margin: 20px;
            float: left;
        }

        .box {
            clear: left;
            /*box3의 왼쪽 float를 제거*/
        }
    </style>
</head>

<body>

    <div>box1</div>
    <div>box2</div>
    <div class="box">box3</div>

</body>
```
![image](https://user-images.githubusercontent.com/84066249/134623862-f3ecbfa5-96c8-4bf5-94b9-b641f4dad42d.png)

float의 외쪽으로 나열돼 있던 box3이 clear의 left 속성을 지정해 왼쪽 float이 제거된 것을 알 수 있다.

# display

## inline과 block의 차이
- inline : 줄 바꿈 없이 글자와 같이 나열되는 성격, 내용물에 따라 폭이 결정되는 성격 
  (a, span, i, em)
- block : 박스와 같이 쌓이는 성격, 화면 전체의 폭을 사용하는 성격
  (div, h, table, ul, ol)
  
**inline과 block의 차이 **
1. 
```html
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>
        *{
            margin:0;
            padding:0;
        }
        div{
            border:3px solid #000;
        }
        span{
            border:3px solid #000;
        }
        
    </style>
</head>

<body>

    <div>box01</div>
    <div>box01</div>
    <div>box01</div>

    <span>span01</span>
    <span>span02</span>
    <span>span03</span>

</body>
```
![image](https://user-images.githubusercontent.com/84066249/134641399-6b2a3e93-dfdc-4684-8a7e-1057ed0ea1b7.png)

2.
```html
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>
        *{
            margin:0;
            padding:0;
        }
        div{
            border:3px solid #000;
            width:200px;
            height:50px;
            margin:50px;
        }
        span{
            border:3px solid #000;
            width:200px;
            height:200px;
            margin:50px;
        }
        
    </style>
</head>

<body>

    <div>box01</div>
    <div>box01</div>
    <div>box01</div>

    <span>span01</span>
    <span>span02</span>
    <span>span03</span>

</body>
```

![image](https://user-images.githubusercontent.com/84066249/134641899-5cd6d5c3-ed59-4c81-8260-c6c7e7bc88ad.png)

위에 그림에서 알 수 있듯이 **블록은 모든 CSS가 적용되지만 인라인은 폭, width, height, margin-top, margin-bottom등이 적용되지 않는다.**

## display
- 요소를 어떤 성격으로 보여줄지 결정하는 속성

1. block -> inline / inline -> block 으로 속성 변경 

```html
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>
        * {
            margin: 0;
            padding: 0;
        }

        div {
            border: 3px solid #000;
            width: 200px;
            height: 50px;
            margin: 50px;
            display: inline;
            /* block -> inline */
        }

        span {
            border: 3px solid #000;
            width: 200px;
            height: 50px;
            margin: 50px;
            display: block;
            /* inline -> block */
        }
    </style>
</head>

<body>

    <div>box01</div>
    <div>box01</div>
    <div>box01</div>

    <span>span01</span>
    <span>span02</span>
    <span>span03</span>

</body>
```
![image](https://user-images.githubusercontent.com/84066249/134642853-813c37bd-2d53-4927-b31a-7d4b4860dd7b.png)

### inline-block 
- 인라인과 블록의 합성 성격
- 인라인과 같이 한 줄에 표현하면서도 block과 같이 정의가 이루어진 표현 -> margin, width, height 적용가능
- inline-block을 지정한 요소는 성격 자체는 인라인(inline) 요소처럼 동작하지만 해당 요소 내부에서는 블록(block) 요소처럼 동작  
- 주로 요소를 나열하는 경우 사용되기도 한다. 

```html

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>
        * {
            margin: 0;
            padding: 0;
        }

        div {
            border: 3px solid #000;
            width: 300px;
            height: 50px;
            margin: 50px;
            display: inline-block;
            text-align: center;
            /*inline 속성의 텍스트 속성을 사용해 글자를 중앙에 배치한 형태*/
        }

        span {
            border: 3px solid #000;
            display: inline-block;
            /*모든 css 속성 사용이 가능하며 inline 속성으로 나열된 형태*/
            width: 200px;
            height: 50px;
            margin: 50px;
        }
    </style>
</head>

<body>

    <div>box01</div>
    <div>box01</div>
    <div>box01</div>

    <span>span01</span>
    <span>span02</span>
    <span>span03</span>

</body>

```
![image](https://user-images.githubusercontent.com/84066249/134646026-2552422e-65d6-4f86-bb94-ea105a16c1e8.png)

