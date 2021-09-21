# CSS
CSS란 각 요소들이 어떻게 보이는가를 정의하는 데 사용되는 스타일 시트 언어로, 홈페이지의 스타일 즉 디자인 요소를 담당한다.

## CSS 기본 구조
1. 외부 스타일 시트(External style sheet)
  - 외부에 작성된 .CSS 문서 즉 스타일 시트 파일을 연결하여 적용하는 방법

```html
<head>
  <link rel="stylesheet" href="/examples/media/expand_style.css">
</head>
```
2. 내부 스타일 시트(Internal style sheet)
  - <head>태그에<style>태그를 사용하여 CSS 스타일을 적용하는 방법
  
```html
<head>
  <style>
    body{ background-color: lightyellow; }
  </style>
</head>    
```

3. 인라인 스타일(Inline style}
  - HTML 요소 내부에 style 속성을 사용하여 CSS 스타일을 적용하는 방법 (실무에서는 권장하지 않음)
  
```html
  <h1 style="color:green">
```

# 선택자 
특정한 요소를 **선택** 해주는 것 -> 선택자라는 것을 통해 **특정 요소들을 선택하여 스타일을 적용**    

## 전체 선택자
- ```*```/ html 등장하는 모든 형태를 선택하는 선택자(초기화, 기본 설정값)
 
```html
<!--사용 방법-->
<head>
  <style>
  *{
      내용....
    }
  </style>  
</head>
<body>
  태그 내용...
</body>
```
    
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
            color:dodgerblue;
        }
    </style>
</head>
<body>
    
    <h1>전체 선택자</h1>
    <p>html 내에 등장하는 모든 형태를 선택하는 선택자.(초기화, 기본 설정값)</p>

</body>
```
![image](https://user-images.githubusercontent.com/84066249/134176754-8033f1d3-2dfb-425a-b790-529deeeb7568.png)
  
## 태그 선택자 
- ```h1, h2, p, a, img...``` / html 내에 등장하는 특정한 태그를 선택하는 선택자.
    
```html
<!--사용 방법-->
<head>
  <style>
  특정 태그{
      내용....
    }
  </style>  
</head>
<body>
  <특정 태그>내용</특정 태그>
</body>
```
    
``` html
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>
        h1{
            color: coral; /*글자색 부여: 단어, 컬러 코드(hex)*/
        }
        p{
            color:cornflowerblue;  
        }
    </style>
</head>
<body>
    
    <h1>태그 선택자</h1>
    <p>h1,h2,p,a,img.../ html 내에 등장하는 특정한 태그를 선택하는 선택자.</p>

</body>    
```
![image](https://user-images.githubusercontent.com/84066249/134177480-e30e255a-5cf5-4d5c-85a5-eddf7125e645.png)
    
## 아이디 선택자 
- ```id``` / 특정한 이름을 부여하는 선택자
- 본문(id="name") / 스타일(#아이디 이름)
- html 화면 내에서 하나의 이름으로 **한 번만** 사용 가능
- 주로 큰 단락, 부모에서 사용
- 위치 이동, 이름 등
```html
<!--사용 방법-->
<head>
  <style>
    #아이디 이름{
      내용....
    }
  </style>  
</head>
<body>
  <태그 id="아이디 이름">내용</태그>
</body>    
```
```html
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>
        #aa{
            color:firebrick;
        }
    </style>
</head>
<body>
    
    <h1 id="aa">아이디 선택자</h1> <!--특정한 이름을 부여하는 선택자-->
    <p>
        : 본문(id="name") / 스타일(#) <br/>
        특정한 이름을 부여하여 선택하는 선택자로, html 화면 내에서 하나의 이름으로 한 번만 사용 가능!
        주로 큰 단락, 부모에서 사용, 위치이동, 이름
    </p>

</body>  
```
![image](https://user-images.githubusercontent.com/84066249/134178684-2e82f57e-d797-4d33-8f40-3ec01a3f4b8b.png)
    
## 클래스 선택자
- 본문(class="name") / 스타일(.클래스 이름)
- 특정한 이름을 부여하여 선택하는 선택자
- html 화면 내에서 하나의 이름으로 여러 군데 여러 번 사용 가능
- 주로 작은 요소, 작은 단락, 변화가 잦을 스타일에서 사용
    
```html
<!--사용 방법-->
<head>
  <style>
    .클래스 이름{
      내용....
    }
  </style>  
</head>
<body>
  <태그 class="클래스 이름">내용</태그>
</body>    
```
```html
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>
        .cc{
            color:seagreen;
        }
    </style>
</head>
<body>
    
    <h1 class="cc">클래스 선택자</h1>
    <p style="color:blue">
        : 본문(class="name") / 스타일(.) <br/>
        특정한 이름을 부여하여 선택하는 선택자로, html 화면 내에서 하나의 이름으로 여러군데 여러 번 사용가능 <br/>
        주로 작은 요소, 작은 단락, 변화가 잦을 스타일 
    </p>

</body>
```
![image](https://user-images.githubusercontent.com/84066249/134179636-293888a6-31dc-4c3c-8bb0-3fb18ca8b918.png)
    
```html
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>
        .cc{
            color:blue;
        }
    </style>
</head>
<body>
    
    <h1 class="cc">클래스 선택자</h1>
    <h2 class="cc">두 번째 클래스</h2>
    <p>
        : 본문(class="name") / 스타일(.) <br/>
        특정한 이름을 부여하여 선택하는 선택자로, html 화면 내에서 하나의 이름으로 여러군데 여러 번 사용가능 <br/>
        주로 작은 요소, 작은 단락, 변화가 잦을 스타일 
    </p>
</body>
```
![image](https://user-images.githubusercontent.com/84066249/134181330-7b308556-92ce-4456-86b7-e0f7f18272ef.png)
    
**하나의 클래스 이름으로 여러 개의 스타일 설정 가능하다.**
    

