# 반응형 웹(RESPONSIVE WEB) - 가변 그리드
- 다양한 디바이스의 등장으로 웹 페이지 구현 방법을 위해 고안된 것으로, 하나의 웹 페이지를 데스크탑, 태블릿, 그리고 모바일 등의 다양한 기기에서 최적화된 화면으로 볼 수 있다는 것

## 반응형 웹의 장점
- 모든 스마트 기기에서 접속 가능
- 가로 모드에 맞추어 레이아웃 변경 가능
- 사이트 유지/보수에 용이
- 다양한 기기에서의 호환 (사용성을 높임)

# 가변 그리드 - Fluid Grid
- 화면 사이즈에 따라 가변이 가능한, 즉 자유롭게 변형이 가능한 그리드를 말하며, 퍼센트(%)로 제작하는 방법

**[단위]**
1. ```px``` : px 사용 시 반응형에서 기기의 너비에 따라 고정되면 안 되기 때문에 레이아웃 설정 시 지양한다. (가변이 가능하지 않다. = 고정 값)
2. ```%``` : 비율에 따른 유동적인 값 / auto와 유사 (화면에서 차지하는 비율(%)로 요소를 만드는 것이 필수적이다.)

### 가변 그리드 공식
``` 
(요소의 넓이 / 요소의 부모 넓이) * 100 = 넓이 값(%)
```

- px(고정 값)를 사용할 경우 
```html
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>가변 그리드</title>
    <style>
        *{padding:0;margin:0;}

        div{
            width:1200px;
            height:500px;
            background-color:beige;
            margin:0 auto;
            margin-top:200px;
        }

        header{
            width:1200px;
            height:100px;
            background: cadetblue;
            font-size:20px;
            text-align:center;
            line-height: 90px;

        }
        section{
            width:600px;
            height:300px;
            background-color:coral;
            float:left;
            font-size:50px;
            text-align:center;
            line-height: 250px;
        }
        aside{
            width:600px;
            height:300px;
            background-color:khaki;
            float:right;
            font-size:50px;
            text-align:center;
            line-height: 250px;
        }

        footer{
            width:1200px;
            height:100px;
            background-color: mediumpurple;
            clear:right;
            font-size:50px;
            text-align:center;
            line-height: 90px;
        }
    </style>
</head>
<body>
  
    <div>
        <header><h1>header</h1></header>
        <section>section</section>
        <aside>aside</aside>
        <footer>footer</footer>
    </div>
</body>
```

- %(비율에 따른 유동적인 값)로 사용할 경우

```html
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>가변 그리드</title>
    <style>
        *{padding:0;margin:0;}

        div{
            width:63.15%;
            height:500px;
            background-color:beige;
            margin:0 auto;
            margin-top:200px;
        }

        header{
            width:100%;
            height:100px;
            background: cadetblue;
            font-size:20px;
            text-align:center;
            line-height: 90px;

        }
        section{
            width:50%;
            height:300px;
            background-color:coral;
            float:left;
            font-size:50px;
            text-align:center;
            line-height: 250px;
        }
        aside{
            width:50%;
            height:300px;
            background-color:khaki;
            float:right;
            font-size:50px;
            text-align:center;
            line-height: 250px;
        }

        footer{
            width:100%;
            height:100px;
            background-color: mediumpurple;
            clear:right;
            font-size:50px;
            text-align:center;
            line-height: 90px;
        }
    </style>
</head>
<body>
  
    <div>
        <header><h1>header</h1></header>
        <section>section</section>
        <aside>aside</aside>
        <footer>footer</footer>
    </div>
</body>
```

결과는 직접 코드를 작성하고 브라우저에 크기를 조절해 보면 가변 그리드에 특징과 가변 그리드가 아닐 때 특징을 바로 알 수 있다.