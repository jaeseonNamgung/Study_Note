# flex 박스 레이아웃

플렉스 박스 레이아웃(flex box layout)이란 그리드 레이아웃을 기본으로 해 플렉스 박스를 원하는 위치에 배치하는 것이다. 이 플렉스 박스를 이용하면 여유 공간에 따라 너비나 높이, 위치를 자유롭게 변형할 수 있다. 



## flex 레이아웃 사용방법

```html
<style>
 .box{
        display:flex;
      }
</style>
<html>
  <div class="box box01">
        <div></div>
        <div></div>
        <div></div>
  </div>
</html>
<div class="box box01">
        <div></div>
        <div></div>
        <div></div>
    </div>
```

- flex 레이아웃은 display  속성을 이용해 flex 레이아웃을 지정한다.  flex 레이아웃은 block속성과 inline속성과 달리 레이아웃을 지정하려는 위치에 직접 레이아웃을 지정하는 것이 아니라 부모 태그에 flex 레이아웃을 지정해줘야 한다.
- flex 레이아웃은 기본적으로 왼쪽에서 오른쪽으로 수평 방향으로 박스가 나열된다. (inline 레이아웃과 같은 속성을 갖는다.) 
- flex 레이아웃의 진행 반향을 주축이라고 하며 주축의 반대 방향을 교차축이라고한다.



### flex-레이아웃 용어

| 속성 값                             | 설명                                                         |
| ----------------------------------- | ------------------------------------------------------------ |
| **플렉스 컨테이너(flex container)** | **플렉스 레이아웃을 사용하기 위한 부모 컨테이너이다.**       |
| **플렉스 항목(flex intem)**         | **플레스 컨테이너안에 위치를 정렬시킬 자식 박스이다. (여러개 사용 가능)** |
| **주축(main axis)**                 | **플렉스 레이아웃의 배치되는 방향을 주축이라고 한다.**       |
| **교차축(cross axis)**              | **주축의 반대 방향을 교차축이라고 한다.**                    |







## justify-content과 align-item

```html
<style>
       .box{margin-bottom:100px; padding:20px; background-color: pink;
            display:flex;
        }
        .box>div{width:100px; height:100px; background-color:skyblue;
            border:1px solid black;
        }
   		.box01{justify-content: flex-start;}
        .box01{justify-content: flex-end;}
        .box01{justify-content: center;}
        .box01{justify-content: space-around;}
        .box01{justify-content: space-evenly;}
        .box01{justify-content: space-between;}
</style>
<html>
    <div class="box box01">
        <div></div>
        <div></div>
        <div></div>
    </div>
</html>
```


![screencapture-127-0-0-1-5500-day15-0509-test01-html-2022-05-09-19_17_14](https://user-images.githubusercontent.com/84066249/167390291-59cd3086-3d18-455f-9beb-8576192700e6.png)

- justify-content: 주축 방향 플렉스 항목 배치 속성
- aling-item: 교차축 플렉스 항목 배치 속성

| 속성 값           | 설명                                                         |
| :---------------- | ------------------------------------------------------------ |
| **flex-start**    | **주축의 시작점을 기준으로 배치**                            |
| **flex-end**      | **주축의 끝점을 기준으로 배치**                              |
| **center**        | **주축의 중앙에 배치**                                       |
| **space-around**  | **모든 플렉스 항목의 양 옆은 동일한 마진 값을 갖는다.**      |
| **space-evenly**  | **모든 플렉스 항목의 양 옆을 같은 간견으로 배치**            |
| **space-between** | **첫번째 플렉스 항목은 시작점에 마지막 플렉스 항목은 끝점에 배치후 중앙 항목들은 같은 간격으로 배치** |



## flex-direction 속성 - 플렉스 방향 지정

```
flex-direction : row | row-reverse | column | column-reverse
```

```html
<style>
    .box01{flex-direction: row;}
    .box01{flex-direction: row-reverse;}
    .box01{flex-direction: column;}
    .box01{flex-direction: column-reverse;}
</style> 
<html>
     <h1>flex-direction</h1>

    <h1>row</h1>
    <div class="box box01">
        <div></div>
        <div></div>
        <div></div>
    </div>
    
    <h1>row-reverse</h1>
    <div class="box box02">
        <div></div>
        <div></div>
        <div></div>
    </div>
    
    <h1>column</h1>
    <div class="box box03">
        <div></div>
        <div></div>
        <div></div>
    </div>
    
    <h1>column-reverse</h1>
    <div class="box box04">
        <div></div>
        <div></div>
        <div></div>
    </div>
</html>
```


 ![1](https://user-images.githubusercontent.com/84066249/167391900-fffe8b02-ab22-44c0-90c2-d86f8335546a.png)

| 속성 값            | 설명                                                         |
| :----------------- | ------------------------------------------------------------ |
| **row**            | **가로로 배치**                                              |
| **row-reverse**    | **주축을 가로로 배치하되 끝점에서 시작점으로 배치( 플렉스 항목도 끝점을 시작으로 시작점을 마지막으로 요소 정렬)** |
| **column**         | **위에서 아래로 세로로 배치**                                |
| **column-reverse** | **아래에서 위로 배치(플렉스 항목도 아래에서 위로 요소 정렬)** |

** align-item: stretch -> 플렉스 항목을 플렉스 컨테이너 크기만큼 교차축을 확장한다. 기본값 **



## flex-wrap 속성 - 플렉스 항목을 한 줄 또는 여러 줄로 배치

```
flex-wrap : nowrap | wrap | wrap-reverse
```

```html
<style>
    .box01{flex-wrap: nowrap;}
    .box02{flex-wrap: wrap;}
    .box03{flex-wrap: wrap-reverse;}
</style>
<html>
    <h1>flex-wrap</h1>

    <h1>nowrap</h1>
    <div class="box box01">
        <div>box01</div>
        <div>box02</div>
        <div>box03</div>
        <div>box04</div>
        <div>box05</div>
        <div>box06</div>
        <div>box07</div>
        <div>box08</div>
        <div>box09</div>
        <div>box10</div>
    </div>
    <h1>wrap</h1>
    <div class="box box02">
        <div>box01</div>
        <div>box02</div>
        <div>box03</div>
        <div>box04</div>
        <div>box05</div>
        <div>box06</div>
        <div>box07</div>
        <div>box08</div>
        <div>box09</div>
        <div>box10</div>
    </div>
    <h1>wrap-reverse</h1>
    <div class="box box03">
        <div>box01</div>
        <div>box02</div>
        <div>box03</div>
        <div>box04</div>
        <div>box05</div>
        <div>box06</div>
        <div>box07</div>
        <div>box08</div>
        <div>box09</div>
        <div>box10</div>
    </div>
</html>
```
![1](https://user-images.githubusercontent.com/84066249/167393842-62880af8-11a2-4494-894a-6e928aa96886.png)
![2](https://user-images.githubusercontent.com/84066249/167393848-d7eef560-6e7e-406e-ab1e-5461c5acb167.png)

wrap 속성은 화면이 줄어들때 플렉스 요소들의 배치 방법을 지정할 때 사용한다.



| 속성 값          | 설명                                             |
| ---------------- | ------------------------------------------------ |
| **nowrap**       | **플렉스 항목들을 한줄로 배치 *기본값***         |
| **wrap**         | **플렉스 항목들이 공간이 없을 경우 아래로 배치** |
| **wrap-reverse** | **wrap 속성을 반대로 배치**                      |



## order 속성 - 플렉스 항목 배치 순서 지정

```
order: 0 | 숫자 
```


```html
<style>
    .box01{order:3;}
    .box02{order:1;}
    .box03{order:2;}
</style>
<html>
    <div class="box">
        <div class="box01">box01</div>
        <div class="box02">box02</div>
        <div class="box03">box03</div>
    </div>
</html>
```
![1](https://user-images.githubusercontent.com/84066249/167396032-62f57bc7-e4c2-4a30-8ef0-41667993d4ab.png)

- order 속성은 플렉스 컨테이너 안에 플렉스 항목에서 지정해야 한다. order 값이  0일경우 기본값으로 그 순서대로 배치된다.



## flex 속성 - 플렉스 항목 크기 조정

```
flex : [flex-grow | flex-shrink | flex-basis] | auto | initial
```

- 첫번째 숫자는 늘릴 비율  | 두번째 숫자는 줄일 비율 | 세번째 숫자는 기본 값
- flex 속성은 따로 사용하는것 보다 묶어서 사용하는것을 권장한다.

| 속성 값     | 설명                                                         |
| ----------- | ------------------------------------------------------------ |
| flex-grow   | 플렉스 항목의 너비를 얼마나 늘릴지를 숫자로 지정             |
| flex-shrink | 플렉스 항목의 너브를 얼마나 줄일지를 숫자로 지정             |
| flex-basis  | 플렉스 항목의 기본 크기를 지정, width 속성 처럼 너비 값을 지정할 수 있고 0이나 auto 를 지정할 수 도 있다. 0일 경우 , flex-grow와 flex-shrink의 인수 값을 함께 사용하고  auto일 경우 플렉스 항목의 너비 값을 사용한다. |
| flex-shrink | 플렉스 항목의 너비를 얼마나 줄일지를 숫자로 지정             |
| flex-basis  | 플렉스 항목의 기본 크기를 지정, width 속성 처럼 너비 값을 지정할 수 있고 0이나 auto를 지정할 수 도 있다. 0일 경우, flex-grow와 flex-shrink의 인수 값을 함께 사용하고  auto일 경우 플렉스 항목의 너비 값을 사용한다. |
| auto        | 항목의 width/height 값에 의해 크기가 결정되며 플렉스 컨테이너의 공간이 부족할 경우, 최소 크기까지 줄인다. |
| initial     | 항목의 whdth/height 값에 의해 크기가 결정되지만 플렉스 컨테이너의 공간에 따라 늘이거나 줄인다. |

```html
<style>
        .box01{flex:2 2 0;}
        /* 2배 줄이거나 2배 늘린다. */
</style>
<html>
    <div class="box">
        <div class="box01">box01</div>
        <div>box</div>
        <div>box</div>
        <div>box</div>
        <div>box</div>
        <div>box</div>
        <div>box</div>
        <div>box</div>
        <div>box</div>
        <div>box</div>
  </div>
</html>
```




![1](https://user-images.githubusercontent.com/84066249/167400005-516e5240-12b4-4437-9e63-3a826da70544.png)

<img src="https://user-images.githubusercontent.com/84066249/167400011-b0298c93-3bde-4064-acb5-f9191b3c4340.png" alt="2"  />

-> 화면을 줄였을 경우

##  align-self - 교차축 기준의 특정 플렉스 항목에 위치 배치

``` 
align-self : auto | stretch | flex-start | flex-end | center | baseline
```



- 교차축에서 특정 플렉스 항목에 위치를 배치하고 싶을 때 사용하며 지정하려는 플렉스 항목에 직접 align-self 속성을 지정한다.

## align-content 속성 - 여러 줄일 때의 배치 지정(두 줄 이상일 때 적용 가능)

```
align-content : flex-start | flex-end | center | space-between | space-around
```

- 교차축에서 플렉스 항목에 위치를 배치할 때 사용(justify-content 속성 값과 동일)

-  align-content는 두 줄 이상일 때 사용하고(flex-wrap : wrap속성일 경우 ) align-item은 한 줄일 경우 사용한다.

  



