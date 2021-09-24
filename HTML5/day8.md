# overflow
- 넘치다, 넘쳐나다 라는 뜻을 가진다.
- 요소 내의 콘텐츠가 너무 커서 요소 내에 모두 보여주기 힘들 때 내용물에 어떻게 보여줄지를 지정하는 속성 

## overflow가 가지는 속성들 
- ```hidden``` : 영역을 벗어나는 부분이 보이지 않게 처리
- ```scroll``` : 영역을 벗어나는 부분의 양에 상관없이 스크롤바가 형성
- ```auto``` : 요소가 영역을 넘지 않으면 스크롤바가 나오지 않고, 요소 안에 내용물이 넘치는 경우에 스크롤바가 형성

```html
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>overflow</title>
        <style>
            *{
                padding:0;
                margin:0;
            }

            .contents1{
                width:200px;
                height:200px;
                border:2px solid #000;
                float:left;
                margin:10px;
            }
            .contents2{
                width:200px;
                height:200px;
                border:2px solid #000;
                float:left;
                margin:10px;
            }

            .contents3{
                width:200px;
                /* height:200px; */
                border:2px solid #000;
                float:left;
                margin:10px;
                overflow:hidden; /*영역을 벗어나는 부분을 보이지 않게 처리
                                    height 존재하지 않을 때 높이를 대신*/
            }

            .contents4{
                width:200px;
                height:200px;
                border:2px solid #000;
                float:left;
                margin:10px;
                overflow:hidden; /*영역을 벗어나는 부분을 보이지 않게 처리
                                    height가 존재할 경우 height 값을 초과했을 때 
                                    나머지 내용은 보이지 않게 된다. */
            }

            .contents5{
                width:200px;
                height:200px;
                border:2px solid #000;
                float:left;
                margin:10px;
                overflow:scroll;  /*안에 콘텐츠가 넘치는 경우 스크롤, 내용물이 넘치지 않으면서 스크롤 생성 */
            }
        </style>

    </head>
    <body>
        <!-- overflow: 부모 박스에서 내용물이 넘치는 경우 어떻게 보여질지 결정하는 속성 -->
        <div class="contents1">
            <h4>콘텐츠양이 일정</h4>
            <p>
                Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has 
                been the industry's standard dummy text ever since the 1500s,
            </p>

        </div>

        <div class="contents2">
            <h4>콘텐츠양이 일정 많거나 유동 흘러 넘침</h4>
            <p> 
                Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has 
                been the industry's standard dummy text ever since the 1500s, Lorem Ipsum is simply dummy text of the printing and 
                typesetting industry. Lorem Ipsum has 
                been the industry's standard dummy text ever since the 1500s,
            </p>

        </div>

        <div class="contents3">
            <h4>콘텐츠의 양에 따라서 높이가 늘어남</h4>
            <p>
                Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has 
                been the industry's standard dummy text ever since the 1500s, Lorem Ipsum is simply dummy text of the printing and 
                typesetting industry. Lorem Ipsum has 
                been the industry's standard dummy text ever since the 1500s,
            </p>

        </div>

        <div class="contents4">
            <h4>박스의 높이의 따라 콘텐츠가 안보이게 처리</h4>
            <p>
                Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has 
                been the industry's standard dummy text ever since the 1500s, Lorem Ipsum is simply dummy text of the printing and 
                typesetting industry. Lorem Ipsum has 
                been the industry's standard dummy text ever since the 1500s,
            </p>
        </div>
        
        <div class="contents5">
            <h4>박스의 스크롤로 보이게 처리</h4>
            <p>
                Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has 
                been the industry's standard dummy text ever since the 1500s, Lorem Ipsum is simply dummy text of the printing and 
                typesetting industry. Lorem Ipsum has 
                been the industry's standard dummy text ever since the 1500s,
            </p>

        </div>
    </body>
```
![image](https://user-images.githubusercontent.com/84066249/134655834-d12ad0ce-bca4-4f46-bf1c-033cbddd36a5.png)

위에 그림에서 살펴보면 height 값을 지정해 주지 않고 hidden 속성을 사용하면 내용물의 크기만큼 공간이 늘어나고 height 값을 지정할 경우 height 크기 보다 초과한
내용들은 화면 상에 보이지 않게 된다. 또한 제일 오른쪽 칸에는 스크롤을 내리면 모든 내용이 담긴 걸 볼 수 있다.

### overflow-x, overflow-y
- ```overflow-x``` : x 축상(가로)의 넘치는 값에 대한 영역에 결정하는 속성  
- ```overflow-y``` : y 축상(세로)의 넘치는 값에 대한 영역에 결정하는 속성

![image](https://user-images.githubusercontent.com/84066249/134659108-c1ff1aaa-79c5-4b34-b4e6-e10e9078acba.png)

x 축상에 hidden 속성으로 지정했기 때문에 넘치는 값은 화면 상에 안 보이게 된다. (y 축도 동일하게 동작)

# list(ul, ol, dl)
- ```ul li```
  - 순서가 없는 목록 태그
  - 앞에 부호가 자동으로 생성(블릿)
  - 주로 메뉴 표현식에 사용
  - ul의 속성 -> ```list-style-type / list-style``` 둘 중 하나 사용해도 무관
    - 종류 : disc(채운 원), circle(빈 원), square(채운 사각형), none(기본 값, 아무것도 생성하지 않음)
 ```html
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>

    <style>
        .ul01 {
            list-style-type: disc;
            /*꽉 찬 원*/
        }

        .ul02 {
            list-style: square;
            /*꽉 찬 사각형*/
        }

        .ul03 {
            list-style-type: circle;
            /*빈 원*/
        }
    </style>


</head>

<body>


    <ul class="ul01">
        <li>회사 소개</li>
        <li>제품 소개</li>
        <li>온라인 문의</li>
        <li>커뮤니티</li>
    </ul>

    <br /><br /><br />

    <ul class="ul02">
        <li>회사 소개</li>
        <li>제품 소개</li>
        <li>온라인 문의</li>
        <li>커뮤니티</li>
    </ul>


    <br /><br /><br />

    <ul class="ul03">
        <li>회사 소개</li>
        <li>제품 소개</li>
        <li>온라인 문의</li>
        <li>커뮤니티</li>
    </ul>

</body>
```
![image](https://user-images.githubusercontent.com/84066249/134661742-12641627-042b-43b5-9eb9-19cb8fdb0d23.png)

- ```ol li```
  - 순서가 있는 목록 태그
  - 앞에 순서가 자동으로 생성(숫자)
  - ol의 속성 -> ```list-style-type / list-style``` 둘 중 하나 사용해도 무관
    - 종류 : decimal(십진수, 1,2,3,...), lower-roman(로마 숫자 소문자), upper-roman(로마 숫자 대문자), lower-alpha(알파벳 소문자), upper-alpha(알파벳 대문자)- ```dl

```html
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>

    <style>
        .ol01 {
            list-style-type: decimal;
            /*기본 값, 1,2,3...*/
        }

        .ol02 {
            list-style: lower-roman;
            /*로마 숫자 소문자*/
        }

        .ol03 {
            list-style-type: upper-alpha;
            /*대문자*/
        }
    </style>


</head>

<body>


    <ol class="ol01">
        <li>회사 소개</li>
        <li>제품 소개</li>
        <li>온라인 문의</li>
        <li>커뮤니티</li>
    </ol>

    <br /><br /><br />

    <ol class="ol02">
        <li>회사 소개</li>
        <li>제품 소개</li>
        <li>온라인 문의</li>
        <li>커뮤니티</li>
    </ol>


    <br /><br /><br />

    <ol class="ol03">
        <li>회사 소개</li>
        <li>제품 소개</li>
        <li>온라인 문의</li>
        <li>커뮤니티</li>
    </ol>

</body>
```
![image](https://user-images.githubusercontent.com/84066249/134662205-dc8d7f82-6674-450f-be36-a06554f51769.png)

- ```dl dt```
  - 정의 목록 태그
  - 용어와 그 뜻을 나열할 때 사용.
  - ```dt``` : 목록의 타이틀로 사용
  - ```dd``` : 목록의 내용 및 설명으로 사용

```html
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>

    <style>
       
    </style>


</head>

<body>

    <dl>
        <dt>목록의 타이틀</dt>
        <dd>목록의 내용 및 설명</dd>
    </dl>



</body>
```
![image](https://user-images.githubusercontent.com/84066249/134662497-e4339d10-8681-48ae-babf-db4a0c0f7c5e.png)


#### ```ul / ol 공통 속성값``` 
- ```inside``` : 블릿이나 숫자를 안쪽으로 들여 쓴다. (좀 더 안쪽)
- ```outside``` : 블릿이나 숫자를 밖으로 내어 쓴다. (좀 더 바깥)
- 기본 초기화 값 : ```list-style``` : none;
