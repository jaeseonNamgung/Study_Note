# color - 색상 관련된 속성
- ```hex``` 
  - 가장 많이 사용되는 색상 코드 방법
  - 숫자 영문 조합의 6자리 코드(16진수 색상)
  - 반복되는 2자리는 병합하여 사용 가능 ex) ```#ff0000 -> #f00```

- 단어 기입 방법
  - 특정 단어로 기입하는 방법
  - 기본 단어 외에는 사용하는 것을 추천하지 않음 ex) ```black, white...```

- ```rgb(red, green, blue)```
  - 총 red, green, blue의 256가지 색상을 숫자 값으로 표기
  - 256가지 = 0 ~ 255까지 ex) ```rgb(0, 0, 255)``` = blue 100%의 양

- ```rgba(red, green, blue, alpha)```
  - 총 red, green, blue의 256가지 색상을 숫자 값에 투명도가 더해진 표기
  - alpha = 0 ~ 1 사이의 소수점으로 표기 ex) ```rgba(0, 0, 255, 0.5)``` = blue 100%의 투명도 50%

- ```hsl(hue, saturation, lightness)```
  - ```hue``` = 색상(색조 + 색)
    - 0 ~ 360 사이의 숫자(= 색깔 방향)
    - 0(= 360)은 빨간색, 120은 녹색, 240은 파란색
  - ```saturation```
    - 채도(컬러의 정도)
      - 0 ~ 100%
  - ```lightness```
    - 명도(밝기)
      - 0 ~ 100%

  - ```hsl(hue, saturation, lightness, alpha)```
    - hue + saturation + lightness에 투명도가 들어간 값


## opacity와 alpha의 차이점
- ```opacity``` : 투명도를 나타내는 속성으로 요소와 요소가 담고 있는 컨텐츠 까지 투명하게 처리 
- ```alpha``` : 색상에 대한 투명도를 부여하는 값
```opacity```**는 안에 컨텐츠를 투명하게 부여하고** ```alpha```**는 색상에 대한 투명도를 부여한다.**  

```html
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>다양한 색상 표현</title>
    <style>
        * {
            padding: 0;
            margin: 0;
        }

        div {
            width: 100%;
            height: 100px;
            font-size: 20px;
            text-align: center;
            line-height: 100px;
            /*글자의 높이가 부모 박스의 높이와 동일하면 상하 선상 중심 배치, 글자가 한 줄일 때만!*/
        }

        /*공통된 빨간색 부여*/
        #word {
            background-color: red;
        }

        #hex {
            background-color: #ff0000;
            /*반복되는 2자리는 한자리로 표현 가능 예)f00 */
        }

        #rgb {
            background-color: rgb(255, 0, 0);
            /*레드 그린 블루*/
            /*256개 / 0 ~ 255*/
        }

        #rgba {
            background-color: rgba(255, 0, 0, 0.5);
            /*색상에 대한 투명도 - 0~1 사이의 소수점*/
        }

        #hsl {
            background-color: hsl(0, 100%, 50%);
            opacity: 0.5;
            /*요소의 투명도를 부여하는 속성, 0~1 사이의 소수점=값
            상속 = 자식 요소를 포함한 모든 부분의 투명도가 적용*/
        }

        #hsla {
            background-color: hsla(0, 100%, 50%, 0.5);
        }

        
    </style>
</head>

<body>
    <div id="word">단어 : 단어로 입력하는 방식</div>
    <div id="hex">컬러코드 : #웹 번호로 입력하는 방식</div>
    <div id="rgb">rgb : red, green, blue의 숫자 값을 입력하는 방식</div>
    <div id="rgba">rgba : rgb 표현 방식에 alpha 값이 추가</div>
    <div id="hsl">hsl : hue, saturation, lightness의 양값을 입력하는 방식</div>
    <div id="hsla">hsla : hsl 표현 방식에 alpha 값이 추가</div>

</body>
```

![image](https://user-images.githubusercontent.com/84066249/135200043-331e819f-ab26-4635-8476-5396fd709893.png)


