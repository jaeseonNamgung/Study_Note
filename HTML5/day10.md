# 구조 선택자
- 부모의 요소 안에서 특정한 위치의 요소를 선택할 때 사용
- 후손 + 자손 선택자와 함께 많이 사용
- 종류 : 
  - ```:first-child``` : 부모 박스 안에서 형제 관계 중에서 첫 번째에 위치하는 특정한 태그 선택
  - ```:last-child``` : 부모 박스 안에서 형제 관계 중에서 마지막에 위치하는 특정한 태그 선택
  - ```:nth-child(n)``` : 부모 박스 안에서 형제 관계 중에서 앞에서 수열 번째의 특정한 태그 선택(예: 1, 2, 3 / 2n+1(홀수) / 2n(짝수))
  - ```:nth-last-child(n)``` : 부모 박승 안에서 형제 관계 중에서 뒤에서 수열 번째의 특정한 태그 선택

```html
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>

    <style>
        ul {
            overflow: hidden;
        }

        li {
            float: left;
            padding: 10px;
            list-style-type: none;
            /*블릿 제거*/
        }

        li:first-child {
            background-color: darkgreen;
            /*첫 번째 배경색 지정(아메리카노)*/
        }

        li:last-child {
            color: darkmagenta;
            /*마지막 태그 글자색 지정(청포도에이드)*/
        }

        li:nth-child(3) {
            border: 5px solid #000;
            /*3번째 태그에 선을 지정(연유라떼)*/
        }

        li:nth-last-child(2) {
            font-size: 50px;
            /*뒤에서 2번째 태그 font 사이즈 지정(바닐라라떼)*/
        }
    </style>


</head>

<body>

    <div>
        <ul>
            <li>아메리카노</li>
            <li>카페라떼</li>
            <li>연유라떼</li>
            <li>바닐라라떼</li>
            <li>청포도에이드</li>
        </ul>
    </div>


</body>
```
![image](https://user-images.githubusercontent.com/84066249/134866950-9eaac362-bd16-483a-b4ba-ba1592b577d5.png)


# 형태 구조 선택자 
- 일반 구조 선택자와 비슷하지만 태그 형태를 구분 
- 종류 : 
  - ```:first-of-type``` : 부모 박스 안에서 형제 관계 중에서 첫 번째에 위치하는 특정한 태그 선택
  - ```:last-of-type``` : 부모 박스 안에서 형제 관계 중에서 마지막 위치하는 특정한 태그 선택
  - ```:nth-of-type(n)``` : 부모 박스 안에서 형제 관계 중에서 앞에서 수열 번째의 특정한 태그 선택(예: 1, 2, 3 / 2n+1(홀수) / 2n(짝수))
  - ```:nth-last-of-type(n)``` : 부모 박승 안에서 형제 관계 중에서 뒤에서 수열 번째의 특정한 태그 선택

```html
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>

    <style>
        ul {
            overflow: hidden;
        }

        li {
            float: left;
            padding: 10px;
            list-style-type: none;
            /*블릿 제거*/
        }

        li:first-of-type {
            background-color: darkgreen;
            /*첫 번째 배경색 지정(아메리카노)*/
        }

        li:last-of-type {
            color: darkmagenta;
            /*마지막 태그 글자색 지정(청포도에이드)*/
        }

        li:nth-of-type(3) {
            border: 5px solid #000;
            /*3번째 태그에 선을 지정(연유라떼)*/
        }

        li:nth-last-of-type(2) {
            font-size: 50px;
            /*뒤에서 2번째 태그 font 사이즈 지정(바닐라라떼)*/
        }
    </style>


</head>

<body>

    <div>
        <ul>
            <li>아메리카노</li>
            <li>카페라떼</li>
            <li>연유라떼</li>
            <li>바닐라라떼</li>
            <li>청포도에이드</li>
        </ul>
    </div>


</body>
```
![image](https://user-images.githubusercontent.com/84066249/134863875-64caf231-5050-4aa4-8e97-e6fdb549b4cc.png)
