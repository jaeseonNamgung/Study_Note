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
            float:left;  /*왼쪽으로 나열*/
        }
    </style>
</head>

<body>
   
    <div>box1</div>
    <div>box1</div>
    <div>box1</div>

</body>
```
![image](https://user-images.githubusercontent.com/84066249/134621104-e29f5b2f-5e0b-4955-b7e9-3c86601cfc1d.png)

2. 오른쪽으로 나열

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
            float:right;  /*오른쪽으로 나열*/
        }
    </style>
</head>

<body>
   
    <div>box1</div>
    <div>box1</div>
    <div>box1</div>

</body>
```
![image](https://user-images.githubusercontent.com/84066249/134621195-daa9709c-b748-4e38-a7a5-ca1c829ee989.png)

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
        div{
            font-size : 30px;
            width:200px;
            height:200px;
            border:5px solid #000;
            margin:20px;
            float:left;  
        }

        .box{
            clear:left; /*box3의 왼쪽 float를 제거*/
        }

        
    </style>
</head>

<body>
   
    <div>box1</div>
    <div>box2</div>
    <div class="box">box3</div>



</body>
```
![image](https://user-images.githubusercontent.com/84066249/134623391-a22b5aca-3ff2-466f-a718-cec06364d31b.png)

float의 외쪽으로 나열돼 있던 box3이 clear의 left 속성을 지정해 왼쪽 float가 제거된 것을 알 수 있다.


