# 웹 폰트
1. webfont :
  -  어떤한 링크, 도메인, 브라우저와 상관없이 웹 페이지 내에서 폰트가 연결되는 것이다.
  -  일반적으로 스타일을 이용해서 연결하는 방법 - 내 컴퓨터 내에 설치된 폰트가 존재 

- 웹 폰트를 적용하지 않았을 때 
```html
<body>
  <h1>웹 폰트</h1>
  <p>
    -  어떤한 링크, 도메인, 브라우저와 상관없이 웹 페이지 내에서 폰트가 연결되는 것이다.<br/>
    -  일반적으로 스타일을 이용해서 연결하는 방법 > 내 컴퓨터 내에 설치된 폰트가 존재   
  </p>
</body>
```
![image](https://user-images.githubusercontent.com/84066249/135739965-8d1d54e0-e69d-4660-8890-5621578ecd0e.png)

- 웹 폰트를 적용했을 때
```html
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>

        .h1_test1{
            font-family:"NanumBarunGothic";
        }
        .p_test1{
            font-family:"NanumMyeongjo";
        }
    </style>


</head>

<body>
  <h1 class="h1_test1">웹 폰트</h1>
  <p class="p_test1">
    -  어떤한 링크, 도메인, 브라우저와 상관없이 웹 페이지 내에서 폰트가 연결되는 것이다.<br/>
    -  일반적으로 스타일을 이용해서 연결하는 방법 - 내 컴퓨터 내에 설치된 폰트가 존재   
  </p>
</body>
```
![image](https://user-images.githubusercontent.com/84066249/135740123-11364bcd-f6e7-48c2-876c-c21288fbd8fe.png)

2. webfont:
  - cdn 즉 링크를 이용해서 서버상의 폰트를 가져와서 웹 페이지에 전달하는 방법 > 느려지거나, 폰트가 나타나지 않은 경우가 생길 수 있다.

- 웹 폰트를 사용하지 않았을 때
```html
<body>
  <h1 class="h1_test1">웹 폰트</h1>
  <p class="p_test1">
    cdn 즉 링크를 이용해서 서버상의 폰트를 가져와서 웹 페이지에 전달하는 방법 <br/>
    > 느려지거나, 폰트가 나타나지 않은 경우가 생길 수 있다.
  </p>
</body>
```
![image](https://user-images.githubusercontent.com/84066249/135740240-c4ee70b2-c18f-482c-b274-d3fd74cf86c9.png)

- 웹 폰트를 사용했을 때

![image](https://user-images.githubusercontent.com/84066249/135740318-f12a2c71-3357-4776-9e98-818e4f7ad969.png)

구글 폰트 사이트에서 마음에 드는 폰트를 하나 선택해서 **Select this style**를 클릭해 준다.

![image](https://user-images.githubusercontent.com/84066249/135740344-19417106-155c-4b3c-80f7-88609d1f475f.png)

링크를 복사한 후 title 밑에 붙여넣기 해준다.

![image](https://user-images.githubusercontent.com/84066249/135740356-5dd736fd-2877-46a1-bdd1-275569f96331.png)

그다음 font를 복사한 후 폰트를 변경하고 싶은 곳에 지정해 주면 된다.

```html
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Nanum+Pen+Script&display=swap" rel="stylesheet">
    
    <style>
        .h1_test1{
            font-family: 'Hi Melody', cursive;
            font-family: 'Nanum Pen Script', cursive;
        }
        .p_test1{
            font-family: 'Nanum Pen Script', cursive;
        }

    </style>


</head>

<body>
  <h1 class="h1_test1">웹 폰트</h1>
  <p class="p_test1">
    cdn 즉 링크를 이용해서 서버상의 폰트를 가져와서 웹 페이지에 전달하는 방법 <br/>
    > 느려지거나, 폰트가 나타나지 않은 경우가 생길 수 있다.
  </p>
</body>
```
![image](https://user-images.githubusercontent.com/84066249/135740431-3aa5f78b-2604-4a78-a6a6-9f7eb8f39214.png)

3. @font-face
  - 폰트 파일을 다운받거나, 가져와 문서와 직접 연결을 하여 폰트를 선언하는 방식
  - 빠르게 웹 사이트에 적용, 오류가 적음
  - 웹 폰트 확장자 종류
    - EOF : IE8 이하
    - TIF : 가장 기본, 압축을 푸는 형태로 많이 사용
    - WOFF : 대부분의 브라우저에서 지원
    - WOFF2 : WOFF보다 압축률이 더 좋다.

- 웹 폰트를 사용하지 않았을 때
```html
<body>
  <h1 class="h1_test1">웹 폰트</h1>
  <p class="p_test1">
    @font-face
        : 폰트 파일을 다운받거나, 가져와 문서와 직접 연결을 하여 폰트를 선언하는 방식
        - 빠르게 웹 사이트에 적용, 오류가 적음
        <br/>
        웹 폰트 확장자 종류
        EOT:IE8 이하
        TTF : 가장 기본, 압축을 푸는 형태로 많이 사용
        WOFF : 대부분의 브라우저에서 지원
        WOFF2 : WOFF보다 압축률이 더 좋다.
  </p>
</body>
```
![image](https://user-images.githubusercontent.com/84066249/135740729-8a04bbfb-13e7-4a25-a1cd-76b8a5aff69e.png)

```html
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>    
    <style>
        @font-face{
            font-family:"font";
            font-weight:500;
            src:url("font/NanumGothicExtraBold.eot"),
            url("font/NanumGothicExtraBold.woff")format("woff");
        }
        .p_test1{
            font-family: "font";
        }

    </style>


</head>

<body>
  <h1 class="h1_test1">웹 폰트</h1>
  <p class="p_test1">
    @font-face
        : 폰트 파일을 다운받거나, 가져와 문서와 직접 연결을 하여 폰트를 선언하는 방식
        - 빠르게 웹 사이트에 적용, 오류가 적음
        <br/>
        웹 폰트 확장자 종류
        EOT:IE8 이하
        TTF : 가장 기본, 압축을 푸는 형태로 많이 사용
        WOFF : 대부분의 브라우저에서 지원
        WOFF2 : WOFF보다 압축률이 더 좋다.
  </p>
</body>
```

![image](https://user-images.githubusercontent.com/84066249/135740791-2d084c9f-bafd-42e5-8ac3-026ce154c251.png)

- 폰트를 두 개 지정할 경우 앞에 폰트가 오류 또는 사용할 수 없는 폰트일 경우 그다음 지정한 폰트가 지정된다. 
- eot는 따로 확장자를 언급할 필요가 없지만 나머지는 **format**을 사용해 확장자를 언급해 줘야 한다.

