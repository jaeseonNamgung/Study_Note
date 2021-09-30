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

# table - 표의 스타일 
**기본적으로 표를 표현하기 위해서는 border처리를 해야한다.**

### td 특징
- td : display : table-cell의 성격을 가지고 있다.
  - table-cell이란? 갯수가 몇 개가 되든 동일한 간격으로 영역을 가지게 된다. (내용물에 따라 약간의 차이가 생길 수 있다.)
  
### table의 기본 값
```css
table{
  border-collapse: separate;
  border-spacing: 2px;
}

```

- border-collapse
  - 표의 바깥 테두리와 셀의 각 테두리가 떨어져 있는 것을 합칠 것인지 그대로 둘 것인지를 조정하는 속성
  - ```collapse``` : 테두리를 하나로 합쳐 표시(초기화 시킬 때 사용)
  - ```separate``` : 테두리를 따로 표시 (기본 값)


```css
.tableStyle1{
            border-collapse:separate; /*테두리를 따로 표시*/
        }

.tableStyle2{
            border-collapse:collapse; /*테두리를 하나로 합쳐 표시*/
        }

```
![image](https://user-images.githubusercontent.com/84066249/135442688-f29ee3d5-ec3d-4d11-9611-1d19fb979d0a.png)



- border-spacing
  - table 태그의 속성을 사용했을 때 기본 값인 테두리와 셀들의 간격을 지정하는 값, px / em등 크기나 단위를 직접 지정
  - (2개지 지정) 수평거리 수직거리 (ex : 20px 30px)

```css
.tableStyle1{
            border-spacing:50px 20px; /*수평거리 수직거리*/
        }
```
![image](https://user-images.githubusercontent.com/84066249/135443142-862f3a88-3e6a-40a7-8fde-52b3e6bbec3d.png)


- empty-cells
  - table 태그에서 내용이 없는 빈 셀들이 존재할 때 표시 여부를 지정
  - ```show``` : 빈 셀 주위에 테두리를 표시하여 빈 셀을 나타냄 (기본 값)
  - ```hide``` : 빈 셀에 테두리를 그리지 않고 비워둠

```css
 .tableStyle1{
           empty-cells:hide; /*빈 셀에 테둘리를 그리지 않고 비워둠*/
        }

 .tableStyle2{
            empty-cells:show; /*빈 셀을 나타냄*/
        }
```
![image](https://user-images.githubusercontent.com/84066249/135443750-42babfc0-2734-424b-811f-cd55e22abb5f.png)



- vertical-align
  - 셀 안에서의 수직 정렬을 어떻게 보이게 할 것인지 지정
  - baseline 셀의 기준선에 내용의 기준선을 맞춤
    - ```top``` : 상단 정렬
    - ```bottom``` : 하단 정렬
    - ```middle``` : 중앙 정렬

```css
td,th{
            border:1px solid #000;
            width:300px;
            height:100px;
            font-size:30px;
            text-align:center;
            vertical-align:top;  /*상단 정렬*/
            
        }
```

![image](https://user-images.githubusercontent.com/84066249/135444313-c7259627-d1d8-4e7a-ac12-e23f0f1811a3.png)



