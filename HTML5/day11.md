# 속성 선택자 
- 속성 선택자를 선택하면 특정 속성이나 특정 속성값을 가지고 있는 HTML 요소를 선택 태그가 가지고 있는 특정한 문자열을 확인
- 종류 : 
  - ```[속성이름="속성값"]``` -> [속성명 + 속성값]
  - ```[속성이름*="속성값"]``` -> [속성명 + 특정 문자 들어간 속성값] (```-```(o), ```_```(o), ```공백```(o), ```합성어```(o))
  - ```[속성이름~="속성값"]``` -> [속성명 + 특정 문자 들어간 속성값] (```-```(x), ```_```(x), ```공백```(o),  ```합성어```(x))
  - ```[속성이름$="속성값"]``` -> [속성명 + 접미사로 끝나는 속성값] (```-```(o), ```_```(o), ```공백```(o),  ```합성어```(o))
  - ```[속성이름^="속성값"]``` -> [속성명 + 접두사로 시작하는 속성값] (```-```(o), ```_```(o), ```공백```(o), ```합성어```(o))
  - ```[속성이름|="속성값"]``` -> [속성명 + 접두사로 시작하는 속성값] (```-```(o), ```_```(x), ```공백```(x),  ```합성어```(x))

```html

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>
        input[type="text"]{
            /* 속성명 + 속성값 */
                background-color: aquamarine;
        }

        img[src$="png"]{
            /* 속성명 + 접미사로 끝나는 속성값 */
            border:3px solid #000;
        }
        img[src$="jpg"]{
            border:3px solid #f00;
        }
        img[src$="gif"]{
            border:3px solid #ff0;
        }
        div[class*="box"]{
            /*특정 문자 들어간 속성값*/
            background-color: chartreuse;
        }
       
    </style>


</head>

<body>

    <input type="text"/>

    <div class="box">
        <img src="img/camera01.png" alt=""/>
        <img src="img/camera02.jpg" alt=""/>
        <img src="img/camera03.gif" alt=""/>

    </div>

</body>
```
![image](https://user-images.githubusercontent.com/84066249/134893397-94eebd17-2008-43df-aaa6-78154bc15e66.png)

# 상태 선택자 
- 마우스의 반응에 따른 속성을 설정
- 종류 : 
  - ```:checkd``` : 체크 상태의 input 태그에 선택
  - ```:focus``` : 초점이 맞춰진 input 태그에 선택
  - ```:enabled``` : 사용 가능한 input 선택
  - ```:disabled``` : 사용 불가능한 input 선택

```html
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>
      
    input:focus{  /*상태 선택자*/
        background-color:darkorchid ;
    }

    div{
        width:500px;
        height:900;
    }
    div>input[type="checkbox"]{  /*자손 선택자 + 속성 선택자*/
        margin-top:30px;
    }

    
    div>input[type="checkbox"]:checked+p{  /*자손 선택자 + 속성 선택자 + 상태 선택자 +  동위 선택자*/
        background-color: yellow;
    }

    p{
        border:3px solid #000;
        overflow:hidden;
    }
    
       
    </style>


</head>

<body>

    <div>
        <input type="text"/>
    </div>

    <div>
        <input type="checkbox"/>

        <p>
            Lorem Ipsum is simply dummy text of the printing and typesetting industry. 
            Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, 
            when an unknown printer took a galley of type and scrambled it to make a type specimen book. 
            It has survived not only five centuries, but also the leap into electronic typesetting, 
            remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets 
            containing Lorem Ipsum passages, and more recently with desktop publishing 
            software like Aldus PageMaker including versions of Lorem Ipsum.
        </p>
    </div>



</body>
```
![image](https://user-images.githubusercontent.com/84066249/134898122-6ea79f26-ba1e-4ff2-a95c-3f18cdd80d6c.png)

입력 박스와 체크 박스를 클릭할 경우 화면 배경 색이 바뀌는 걸 알 수 있다.

# 시작 문자 선택자 
- 종류:
  - ```::first-letter``` : 첫 번째 글자를 선택
  - ```::first-line``` : 첫 번째 줄을 선택

# 가상 요소 선택자
- 선택될 요소(element)의 특별한 상태를 지정하는 선택자로 선택될 요소의 앞 혹은 뒤쪽으로 가상의 요소를 넣어 표현
- 종류 : 
  - ```::before``` : 특정 요소의 앞에 삽입, 내용이나 가상의 요소를 부여
  - ```::after``` : 특정 요소의 뒤에 삽입, 내용이나 가상의 요소를 부여

```html

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>
        div>p {
            border: 3px solid #000;
            width: 300px;
            overflow: hidden;
        }

        /* 시작 문자 선택자 */

        h1::first-letter {
            /* 첫 번째 글자를 선택 */
            font-size: 100px;
            color: tomato;
        }

        h1::first-line {
            /* 첫 번째 줄을 선택 */
            background-color: turquoise;
        }

        /* 가상 요소 선택자 */

        div>p:before {
            /* 특정 요소의 앞에 삽입 */
            content: "(앞)";
            font-size: 30px;
            color: blue;
        }

        div>p:after {
            /* 특정 요소의 뒤에 삽입 */
            content: "(뒤)";
            font-size: 30px;
            color: darkorchid;
        }
    </style>


</head>

<body>

    <div>
        <h1>Lorem Ipsum</h1>
        <p>
            Lorem Ipsum is simply
            dummy text of the printing and typesetting industry.
            Lorem Ipsum has been the industry's standard dummy text ever since the 1500s,
        </p>
    </div>

</body>
```
![image](https://user-images.githubusercontent.com/84066249/134900288-6e097d4e-db80-41d8-ad9f-296b69ff7c61.png)
