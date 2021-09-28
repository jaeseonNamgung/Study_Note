# 배경 이미지 

- ```background-image: url("이미지의 경로")``` : 배경 이미지를 불러오는 속성, 쉼표(,)로 구분 지었을 때는 2개 이상의 이미지가 적용(먼저 작성한 이미지가 상당에 표현)
- ```background-repeat : no-repeat``` : 반복하지 않은 원본 한 장
  - ```:repeat-x``` : 가로 반복
  - ```:repeat-y``` : 세로 반복

- ```background-size: 배경 이미지 사이즈 ``` : %(가로 상의 비율), px
   - ```: 두 자리 입력 시 x y``` : ex) 100px 200px
   - ``` : cover``` : 이미지의 고정비를 유지하면서 크게 설정, 이미지의 고정비가 요소와 다를 시 잘라내어 빈 공간이 생기지 않게 설정
   - ```: contain```  : 이미지가 잘리거나 형태가 무너지지 않는 한도 내에서 제일 크게 설정

- ```background-attachment``` : 배경 이미지를 뷰 포트 내에서 고정할지, 아니면 요소와 함께 스크롤할지 지정한는 속성
  - ```:fixed``` : 고정 값
  - ```:scroll``` : 기본 값

- ```background-position``` : 배경 이미지의 위치를 지정하여 표현하는 속성
  - ```x``` : 가로 축, 단어 : left, center, right, 숫자 : %, px
  - ```y``` : 세로 축, 단어 : top, center, bottom, 숫자 : %, px
 
- background로 통일하여 작성 가능 : 배경색 배경이미지 배경이미지반복 배경이미지위치; (띄어쓰기로 구분)
  - ex) 
    ```html 
    background: #09C url('image.png') no-repeat 10px center;
    ```
    
```html
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>
        
        *{
            padding:0px;
            margin:0px;
        }

        body{
            background-image:url(img/cat_bg.png); /*배경 이미지*/
            background-repeat:no-repeat; /*반복하지 않은 원본 한 장*/
            background-size:500px 400px; /*배경 이미지 사이즈 , x y축 각각 지정*/
           /* background-attachment:fixed; 배경 이미지를 뷰포트 내에서 고정*/
            background-position: center top;/*배경 이미지 위치 지정(중앙 상단 지정)*/
        }

    </style>


</head>

<body>
</body>
```
![image](https://user-images.githubusercontent.com/84066249/135054276-b4df1a0f-4d68-436d-b957-7169b9d3f972.png)
