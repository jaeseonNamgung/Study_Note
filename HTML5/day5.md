# CSS 속성
## 글자 관련 속성

- ```color```: 색상을 뜻하며 정확히는 글자 색상을 뜻한다.
- ```font-size``` : 글자 사이즈 - px, em, pt... 단위
- ```font-weight``` : 글자의 굵기 - 100 ~ 900 [100-300 : 가늘게], [400-600 : 중간], [700-900 : 굵게]
- ```font-family``` : 글꼴 - 내 컴퓨터에 저장된 글자가 표현(웹 폰트 예외)
- ```font-style``` : 글자 스타일 - italic, normal 등
- ```line-height``` : 행간, 줄 간격 - px, em, pt, %...단위
- ```letter-spacing``` : 자간, 글자 사이의 간격 - 숫자 입력(px, %...)
- ```text-align``` : 문단 정렬(글자 정렬) - left, right, center
- ```text-decoration``` : 선으로 글자를 꾸며주는 속성 - [none : 기본값], [overline : 위에 선을 배치], [underline : 아래에 선을 배치],[line-through : 중간에 선을 배치]

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
        .text{
            color:rgb(6, 50, 139);
            font-siZe:20px;  
            font-weight:900;
            line-height:60px;
            font-family:"궁서";
            font-style:italic; 
            letter-spacing:10px;
            text-align:left; 

        }
        a{
            text-decoration:none; 
            color:rgb(6, 50, 139);
        }
    </style>
</head>
<body>

    <h1 class="text">글자 관련 <a href="#">속성</a></h1>
    <p>
        글자 관련 속성에 대해 알아 봅시다!<br/>
        글자 속성들의 종류
    </p> 
</body>

```
![image](https://user-images.githubusercontent.com/84066249/134308886-23c9e20e-76e8-4d8f-abeb-4f644e99a5f7.png)

## 배경 관련 속성

- ```background-color``` : 배경 색상
- ```background-image:url(이미지 경로)``` : 배경 이미지 속성 -> url(이미지 경로)를 사용해 이미지를 가져온다. / 이미지 사이즈가 부모의 사이즈 보다 작을 때 반복되는 성격을 지님 / 공간, 내용물이 있는 상태에서 나타남
- ```background-repeat``` : 배경 이미지 반복 속성 - [repeat : 반복, 기본 값], [no-repeat : 반복되지 않는 원본 한 장], [repeat-x : 가로 반복], [repeat-y : 세로 반복]
- ```background-size``` : 배경 이미지 사이즈 속성 - [x : 가로 폭], [y : 세로 폭], px, %...

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
        body{
            background-color:rgb(111, 150, 111);
            background-repeat:no-repeat; 
            background-size:50%; 
            background-image:url(img/v_bg.png);
            background-size:5%;
            background-repeat:repeat-y; /*세로 방향으로 이미지 반복*/

           
        }
        p{
            background-image:url(img/bg.png); /*p 태그 문단에서 이미지 추가(반복 속성)*/
        }
    </style>
</head>
<body>

    <h1>배경 관련 속성</h1>
    <p>
        배경 색을 넣거나 배경 이미지를 넣어서 공간을 활용  
    </p>
</body>
```

![image](https://user-images.githubusercontent.com/84066249/134311656-00b7cf6b-9016-4600-8e7a-25d3fb690dfd.png)




