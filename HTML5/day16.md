# table
- 표를 만드는 태그 
  - 기본적으로 몇 줄(행) 몇 칸(열)이라고 불린다(행, 열).
  - 표를 이용한 형태를 만들 때 사용하는 태그
- table 구조 : ```table > tr > td``` -> table > 행 > 열
- table 관련 태그들
  - ```table``` : table 전체를 감싸는 태그
  - ```tr``` : (table row), 테이블의 행을 의미하는 태그, 자손으로 th나 td가 반드시 있어야 한다. 
  - ```td``` : (table data), 테이블의 일반 셀(칸)을 의미하는 태그, 부모인 tr 안에 있어야 한다.
    - base style : 왼쪽 정렬(text-align : left)
  - ```th``` : (table header), 테이블의 제목 셀(칸)을 의미하는 태그, 부모인 tr 안에 있어야 한다.
    - base style : 중앙 정렬(text-align : center), 두껍게(font-weight : bold)
  - ```caption``` : table의 제목이나 설명을 작성하는 태그
    - base style : 중앙 정렬(text-align : center)
    - figcaption : 표에 제목을 붙일 때 사용, 제목이 중앙에 표시되지 않음

- 셀 병합 속성
  - ```rowspan="합쳐지는 열의 개수"``` : 가로 셀의 합
  - ```colspan="합쳐지는 행의 개수``` : 세로 셀의 합

- 표의 구조 
  - ```thead``` : 제목 부분
  - ```tbody ``` : 표의 부분(본문)
  - ```tfoot``` : 표의 하단 부분(요약)

1. table 기본 구조  
```html
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>

    <style>

        td,th{
            border:1px solid #000;
            width:300px;
            height:100px;
            font-size:30px;
        }

        caption{
            font-size:50px;
        }
    </style>
</head>

<body>
   <table>

        <caption>table 구조 예제</caption>

       <tr>
           <th>table 제목1</th> 
           <th>table 제목2</th>
           <th>table 제목3</th>
       </tr>
       <tr>
           <td>table01</td>
           <td>table02</td>
           <td>table03</td>
       </tr>
       <tr>
           <td>table04</td>
           <td>table05</td>
           <td>table06</td>
       </tr>
   </table>
</body>

```
![image](https://user-images.githubusercontent.com/84066249/135417664-4709d912-bf91-4150-957f-0416e9ff94e8.png)

1-1 thead, tbody, tfoot를 사용했을 때
```html
<table>


    <caption>table 구조 예제</caption>
    <thead>
        <tr>
            <th>가로 셀 병합</th>
            <th>table 제목2</th>
            <th>table 제목3</th>
        </tr>
    </thead>
    <tbody>
        <tr>
            <td>세로 셀 병합</td>
            <td>table02</td>
            <td>table03</td>
        </tr>
    </tbody>

    <tfoot>
        <tr>
            <td>table04</td>
            <td>table05</td>
            <td>table06</td>
        </tr>
    </tfoot>
</table>
```

2. table 셀 병합

```html
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>

    <style>

        td,th{
            border:1px solid #000;
            width:300px;
            height:100px;
            font-size:30px;
        }

        caption{
            font-size:50px;
        }
    </style>
</head>

<body>
   <table>

        <caption>table 구조 예제</caption>

       <tr>
           <th colspan="3">가로 셀 병합</th> <!--세로 셀 병합-->
           <!-- <th>table 제목2</th>
           <th>table 제목3</th> -->
       </tr>
       <tr>
           <td rowspan="2">세로 셀 병합</td>  <!--가로 셀 병합-->
           <td>table02</td>
           <td>table03</td>
       </tr>
       <tr>
           <!-- <td>table04</td> -->
           <td>table05</td>
           <td>table06</td>
       </tr>
   </table>
</body>
```
![image](https://user-images.githubusercontent.com/84066249/135418464-ff5180b1-5777-4870-894e-6fc7302c08ad.png)


