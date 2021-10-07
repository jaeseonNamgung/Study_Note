# transform
- html 요소의 형태나 위치 등을 자유롭게 바꿀 수 있는 변형 가능한 값

## transform 속성
- ``` translate``` : 요소를 축을 중심으로 이동에 대한 변환
- 표현 가능한 속성
  - ```translate(x축, y축)``` : 특정한 위치로 이동
  - ```translateX(x축)``` : x축만큼 이동
  - ```translateY(y축)``` : y축만큼 이동
  - ```translateZ(z축)``` : z축만큼 이동
  - ```translate3d(x, y, z)```

- ```scale``` : 요소를 축의 중심으로 확대 혹은 축소의 변환
- 표현 가능한 속성
  - ```scale(x축, y축)``` : 사이즈 확대, 축소 ( 0.9 < 1 < 1.5 )
  - ```scaleX(x축)``` : x축 값만큼 확대, 축소
  - ```scaleY(y축)``` : y축 값만큼 확대, 축소
  - ```scaleZ(z축)``` : y축 값만큼 확대, 축소
  - ```scale3d(x축, y축, z축)``` 

- ``` rotate ``` : 요소를 축의 중심으로 회전화여 변환 (각도 : deg)
- 표현 가능한 속성
  - ```rotate(x축deg, y축deg)``` : 특정한 값만큼 회전
  - ```rotateX(x축deg)``` : x축 기점으로 회전
  - ```rotateY(y축deg)``` : y축 기점으로 회전
  - ```rotateZ(z축deg)``` : z축 기점으로 회전
  - ```rotate3d(x축deg, y축deg, z축deg)```

- ```skew``` : 요소를 기울이거나, 왜곡을 부여하여 변환 (각도 : deg)
- 표현 가능한 속성
  - ```skew(x축deg, y축deg)``` : 특정한 각도를 기울이기, 왜곡
  - ```skewX(x축deg)``` : x축 기울이기
  - ```skewY(y축deg)``` : y축 기울이기

- ```transform-origin``` : 변환 중심 축을 설정하는 속성
- 표현 가능한 속성
  - ```transform-origin : x축 y축 z축
    - 백분율(%), 단어로 입력 가능
    - x = left, right, center
    - y = top, bottom, center

- ```perspective``` : 3D 효과를 위한 원근감을 표현할 수 있는 속성(원근 효과를 주기 위한 부모 값에 부여), 숫자가 커질수록 멀리서 보는 느낌으로 나타난다.

### matrix : perspective를 제외한 요소들을 한 번에 적용 가능한 속성
```ex) transform : matrix(scaleX, skewX, skewY, scaleY, translateX, translateY);```

- translate, scale, rotat, skew 사용 예제
```html
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>
        * {
            padding: 0;
            margin: 0;
        }

        #div {
            border: 5px solid #000;
            width: 200px;
            height: 200px;
            margin: 50px;
        }

        .translate {
            width: 200px;
            height: 200px;
            font-size: 30px;
            font-weight: 900;
            text-align: center;
            line-height: 150px;
            background-color: gray;
        }

        .translate:hover {
            transition-duration: 0.5s;
            transform: translate(30px, 30px);
        }

        .scale {
            width: 200px;
            height: 200px;
            font-size: 30px;
            font-weight: 900;
            text-align: center;
            line-height: 150px;
            background-color: greenyellow;

        }

        .scale:hover {
            transition-duration: 0.5s;
            transform: scaleX(1.5);
        }

        .rotate {
            width: 200px;
            height: 200px;
            font-size: 30px;
            font-weight: 900;
            text-align: center;
            line-height: 150px;
            background-color: hotpink;

        }

        .rotate:hover {
            transition-duration: 0.5s;
            transform: rotate(90deg);
        }


        .skew {
            width: 200px;
            height: 200px;
            font-size: 30px;
            font-weight: 900;
            text-align: center;
            line-height: 150px;
            background-color: lightskyblue;

        }

        .skew:hover {
            transition-duration: 0.5s;
            transform: skew(30deg, 30deg);
        }
    </style>


</head>

<body>

    <div id="div">
        <div class="translate">
            translate
        </div>
    </div>
    <div id="div">
        <div class="scale">
            scale
        </div>
    </div>
    <div id="div">
        <div class="rotate">
            rotate
        </div>
    </div>
    <div id="div">
        <div class="skew">
            skew
        </div>
    </div>
</body>
```
![image](https://user-images.githubusercontent.com/84066249/136366791-36317ef7-feb0-4821-9549-5b26f6b1bc68.png)

왼쪽 -> transform 사용 전
오른쪽 -> transform 사용 후





