# 위치 속성
- 어디에 위치할지 지정하는 속성

### 함께 적용 가능한 속성들
  - ```top``` : y 축 상단 기준
  - ```bottom``` : y축 하단 기준
  - ```left``` : x축 좌측 기준
  - ```right``` : x축 우측 기준
  - ```z-index``` : z축 위치 상 우선순위 변경( z-index : 숫자가 클수록 상위 순서에 배치 1 ~ 9999까지 존재)

### 위치 지정의 중요한 값들
- ```static``` 
 1. 부여하지 않아도 적용되는 기본 값(정적 위치 지정 방식)
 2. 다른 박스에 영향을 주며 작성한 순서대로 나열(위치 지정 불가)
 3. top, left, right, bottom의 영향을 받지 않음

- ```relative```
1. 상대 좌표와 함께 위치를 지정(상대 위치 지정 방식)
2. 태그가 만들어진 순서대로 나열
3. 다른 박스에 영향을 주며 작성한 순서대로 나열(위치 지정 가능), **부모 박스의 역활로 주로 사용** 
4. top, left의 영향을 받음

- ```absolute```
1.  절대 좌표와 함께 위치를 지정(절대 위치 지정 방식)
2.  html 화면 기준(x, y)을 기준으로 위치가 지정
3.  만들어진 순서대로 위쪽에 배치 (위치 지정 가능)
4.  top, left, right, bottom의 영향을 받음


- ```fixed```
1. 절대 좌표와 함께 위치를 지정(고정 위치 지정 방식)
2. 고정된 상태로 위치가 지정
3. 스크롤과 상관없이 html 화면 기준 좌측 상단을 기준으로 좌표 고정
4. top, left, right, bottom의 영향을 받음


1. static 특징 
```html
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>position</title>
    <style>
        *{padding:0;margin:0;}
        .p1{
            width:300px;
            height:300px;
            background-color: aquamarine;
            text-align:center;
            line-height: 300px;
            font-size:30px;
            position:absolute;
            /* 위치 지정 시 사용 가능한 속성 -left, right, top, bottom
               static - 기본 값(위치 영향을 받지 않음) 
               relative - 상대 위치(박스가 나열되는 순서대로 위치가 지정 top, left
               absolute - 절대 위치(html 화면 기준으로 위치가 지정 - 위치 값 모두 적용
               부모가 존재할 때 부모의 기준으로 위치가 지정
               fixed - 고정 위치(html 화면 기준으로 위치가 지정 - 위치 모두 적용)
               고정된 상태로 표현! - 메뉴, 배너
            */
        }

        .pbox{
            width:200px;
            height:200px;
            background-color: aquamarine;
            text-align: center;
            line-height: 200px;
            position:absolute;
            top:30px;
            left:30px;
        }
        .pbox:nth-child(1){
            z-index: 3;
            /* 위치 요소의 우선순위를 변경하는 속성 1 ~ 9999 */
        }
        .pbox:nth-child(2){
            background-color: beige;
            position:absolute;
            top:60px;
            left:60px;
            z-index:4;
        }
        .pbox:nth-child(3){
            background-color: burlywood;
            position:absolute;
            top:90px;
            left:90px
        }
        #position{
            width:400px;
            height: 200px;
            background-color: #bcbc2c;
            
            position:relative; /*부모 기준을 삼으며, 다른 박스의 영향을 받아 
            레이아웃이 제대로 표현될 수 있게*/
        }
        .nav{
            width:100%;
            height:200px;
            text-align:center;
            background-color: aquamarine;
        }
    </style>
</head>
<body>
    <!-- <h1>position</h1>
    <p>: 요소를 특정한 위치로 지정하여 배치하는 속성 / 어떻게 위치할 지 결정하는 속성</p>

    <div class="p1">
        position
    </div> -->

    <div class="nav">
        menu
    </div>

    <!-- 위치 값 사용하는 방법 -->
    <div id="position">
        <div class="pbox">box1</div>
        <div class="pbox">box2</div>
        <div class="pbox">box3</div>
    </div>
</body>
```
![image](https://user-images.githubusercontent.com/84066249/135995651-e4fcfc89-e2d2-4d08-a7db-9c244fb4ad00.png)

static은 기본 값으로 각 박스들의 아무런 위치 변화가 없다.

2. relative 특장

```html
     <style>
        *{padding:0;margin:0;}
        .box{
            width:200px;
            height:200px;
            background-color: aquamarine;
            text-align:center;
            line-height: 200px;
            position:relative; /*상대 좌표와 함께 위치를 지정(상대 위치 지정 방식)*/
            
            top:50px; /*top, left의 영향만 받는다.*/
            left:50px;
        }

        .box:nth-child(2){
            background-color: beige;
        }
        .box:nth-child(3){
            background-color: coral;
        }

    </style>
```
![image](https://user-images.githubusercontent.com/84066249/135996512-cd678728-5b52-4bff-862b-3c02d60787c1.png)

relative는 상대 지정 위치 방식으로 top과 left의 영향만 받는다. 

3. absolute 특징

```html
<style>
        *{padding:0;margin:0;}
        .box{
            width:200px;
            height:200px;
            background-color: aquamarine;
            text-align:center;
            line-height: 200px;
            position:absolute;
        }

        .box:nth-child(2){
            background-color: beige;
        }
        .box:nth-child(3){
            background-color: coral;
        }

 </style>
```
![image](https://user-images.githubusercontent.com/84066249/136001912-9c3bea1a-c636-4e2f-b612-0c7e8d78dab2.png)

위에 코드에서 position 속성을 absolute로 변경하게 되면 박스 형태의 특징을 완전히 무시한 체 순서상 제일 마지막에 위치한 박스가 제일 위에 올라오면서 박스가 쌓이게 된다.

2-1. z-index 사용법

```html
<style>
        *{padding:0;margin:0;}
        .box{
            width:200px;
            height:200px;
            background-color: aquamarine;
            text-align:center;
            line-height: 200px;
            position:absolute;
        }
        .box:nth-child(1){
            top:30px;
            left:30px;
            
        }

        .box:nth-child(2){
            background-color: beige;
            top:60px;
            left:60px;
        }
        .box:nth-child(3){
            background-color: coral;
            top:90px;
            left:90px;
        }

    </style>
```

![image](https://user-images.githubusercontent.com/84066249/136010302-e5588086-b740-4e7e-b4d2-f2fa63b735b7.png)

box1 z-index : 1,  box2 z-index : 2, box3 z-index : 3

```html
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>    
    <style>
        *{padding:0;margin:0;}
        .box{
            width:200px;
            height:200px;
            background-color: aquamarine;
            text-align:center;
            line-height: 200px;
            position:absolute;
        }
        .box:nth-child(1){
            top:30px;
            left:30px;
            z-index:5;
            
        }

        .box:nth-child(2){
            background-color: beige;
            top:60px;
            left:60px;
            z-index:4;
        }
        .box:nth-child(3){
            background-color: coral;
            top:90px;
            left:90px;
        }

    </style>

```
![image](https://user-images.githubusercontent.com/84066249/136010617-abdb2c0a-44d6-4422-8cb3-84ab4c7c3eaf.png)

z-index는 값이 클수록 화면상에서 제일 위로 오게 된다. 즉 box2의 index가 4이고 box3 index가 3이기 때문에 box2가 제일 위에 오게 되고 box1의 index가 5이기 때문에 box2보다 위에 오게 된다.

4. fixed 특징

```html
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>    
    <style>
        *{padding:0;margin:0;}
        .box{
            width:200px;
            height:200px;
            background-color: aquamarine;
            text-align:center;
            line-height: 200px;
            position:absolute;
        }
        .box:nth-child(1){
            top:30px;
            left:30px;
            z-index:5;
            
        }

        .box:nth-child(2){
            background-color: beige;
            top:60px;
            left:60px;
            z-index:4;
        }
        .box:nth-child(3){
            background-color: coral;
            top:90px;
            left:90px;
        }
        #position{
            background-color: darkmagenta;
            width:400px;
            height: 200px;
            margin:100px;
        }


    </style>


</head>

<body>
    <div id="position">
        <div class="box">box1</div>
        <div class="box">box2</div>
        <div class="box">box3</div>
    </div>
</body>
```
![image](https://user-images.githubusercontent.com/84066249/136011928-3c84ba3e-6508-4843-8480-5de53cc7ab13.png)
 
부모 div를 만들어 box1, 2, 3를 부모 안에 넣고 부모 div에 배경 색을 주고 marginr 값을 100px을 주고 결과를 보게 되면 box1, 2, 3들의 위치와 부모 박스 위치의 영향을 받지 않는다는 걸 알 수 있다.

```html
#position{
            background-color: darkmagenta;
            width:400px;
            height: 200px;
            margin:100px;
            position:absolute;
        }
```
![image](https://user-images.githubusercontent.com/84066249/136012532-bddefa0d-1794-4652-a857-56cec1fdf744.png)

부모 박스와 자식 박스들이 서로 영향을 주기 위해서는 부모 박스에도 position 속성을 지정해 줘야 한다.

### relative와 absolute의 

```html
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>    
    <style>
        *{padding:0;margin:0;}
        .box{
            width:200px;
            height:200px;
            background-color: aquamarine;
            text-align:center;
            line-height: 200px;
            position:absolute;
        }
        .box:nth-child(1){
            top:30px;
            left:30px;
            
        }

        .box:nth-child(2){
            background-color: beige;
            top:60px;
            left:60px;
        }
        .box:nth-child(3){
            background-color: coral;
            top:90px;
            left:90px;
        }
        #position{
            background-color: darkmagenta;
            width:400px;
            height: 200px;
            position:absolute;
            top:0;
            left:0;
        }
        .nav{
            width:100%;
            height:200px;
            background-color: grey;
        }


    </style>


</head>

<body>

    <div class="nav">menu</div>
    <div id="position">
        <div class="box">box1</div>
        <div class="box">box2</div>
        <div class="box">box3</div>
    </div>
</body>
```
![image](https://user-images.githubusercontent.com/84066249/136013534-a3c72e4d-6dcd-4259-9e23-8485042cbbbe.png)

absolute를 사용하면 다른 박스에 영향을 받지 않아 박스가 서로 겹치게 된다. 

```html
#position{
            background-color: darkmagenta;
            width:400px;
            height: 200px;
            position:relative;
            top:0;
            left:0;
        }
```
![image](https://user-images.githubusercontent.com/84066249/136013849-30542e6a-7b10-4d42-a8a5-c11ee6e97094.png)

박스의 영향을 받게 해서 서로 겹치지 않게 하기 위해서는 absolute를 사용해야 한다.

4. fixed
```html
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>    
    <style>
        *{padding:0;margin:0;}
        .box{
            width:200px;
            height:200px;
            background-color: aquamarine;
            text-align:center;
            line-height: 200px;
            position:fixed;
            bottom: 50px;
            right: 50px;
        }
        body{
            height:3000px;
        }

    </style>


</head>

<body>

    <h1>position</h1>
    <p>fixed</p>

    <div class="box">box1</div>
       
   
</body>
```
![image](https://user-images.githubusercontent.com/84066249/136014797-c5bc88fc-b343-46c1-9e75-fadd905340e6.png)

![image](https://user-images.githubusercontent.com/84066249/136014849-3cc5d080-eafa-41e4-8b46-d4cc847b92b8.png)

fixed는 고정된 위치를 말한다. 위에 그림을 보게 되면 스크롤을 움직여도 box1의 위치는 고정되는 것을 알 수 있다.

