# animation(애니메이션 속성)
- 동적인 다양한 스타일 전환을 표현하기 위해 사용하는 속성 (부드럽게 스타일 변화)

# @keyframes(키 프레임)
- animation 속성과 함께 사용하는 속성
- 키 프레임 내에 특정한 시간에 따라 표현해야 할 요소의 스타일을 표기
- 애니메이션이 변경되는 지점 설정
- 0% -> 시작 구간
- 30% ~ 50% -> 중간 구간
- 100% -> 끝 구간

#### 사용 방법

```html
@keyframes 이름{
    from, 0%{시작 스타일을 표기}
    to, 100%{끝 스타일을 표기}
}
```

### animation 속성의 종류
- ```animation-name``` : 애니메이션 이름 지정, ex) aa
-  ```animation-delay``` : 애니메이션 효과에 대한 지연 시간 지정, ex) 1s -> 1초 후 시작
- ```animation``` : 애니메이션 동작이 시작되는 방향 설정
  - ```normal``` : 기본 값, 시작 ~ 끝
  - ```alternate from <---> to``` 반복
  -  ```reverse``` : 역방향 움직임
  - ```alternate-reverse``` : 역방향 움직인 후 정 방향 움직임

- ```animation-duration``` : 애니메이션 실행 시간 지정, ex) 1s -> 1초
- ```animation-iteration-count``` : 애니메이션 효과의 반복 설정
  - 숫자 값 = 횟수 반복
  - infinite = 무한 반복

- ```animation-timing-function``` : 애니메이션 이징 효과 / 이징 = 시간당 움직이는 속도의 양 값
  - ```linear``` : 시작부터 끝까지 같은 속도 / 일정한 속도로 진행
  - ```ease``` : 기본 값
  - ```ease-in``` : 시작 속도를 느리게
  - ``` ease-out``` : 끝 속도를 느리게
  ` ``` ease-in-out``` : 느리게 시작하고, 느리게 끝

- ```animation-play-state``` : 애니메이션 효과의 재생 혹은 중지.
  - ```paused``` : 애니메이션을 중지  

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

        body {
            width: 100%;
            height: 100%;
            background-color: beige;
        }

        div {
            width: 300px;
            height: 300px;
            background: cadetblue;
            position: absolute;
            left: 50%;
            top: 50%;
            transform: translate(-150px, -150px);
        }

        .box:hover {
            animation-name: test;
            /*animation 이름*/
            animation-duration: 3s;
            /*3초 동안 동작*/
            animation-delay: 2s;
            /*2초 후에 동작*/
            animation-timing-function: ease-in-out;
            /*천천히 시작 천천히 끝*/
            animation-iteration-count: 2;
            /*2번 반복*/
        }

        @keyframes test {

            /*animation 이름*/
            0% {
                background-color: magenta;
            }

            30% {
                background-color: lightcoral;

            }

            50% {
                border-radius: 30px 0 30px 0;
            }

            100% {
                border-radius: 100px;
            }

        }
    </style>
</head>
<!-- 박스 하나를 생성 -->
<div class="box"></div>

</body>
```
![ezgif com-gif-maker](https://user-images.githubusercontent.com/84066249/136685264-317b0cc2-72be-4e2d-8560-93825b253ed7.gif)


