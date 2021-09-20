# 글자를 꾸며주는 태그들

##  볼드체 표현 
- 경고, 주의사항과 같이 중요한 내용물을 강조할 떄 보통 사용
- 글자를 굵게 사용하고 싶을 때
```html
<!-- 사용 방법-->
<strong>글자 내용</strong> 
        or
<b>글자 내용</b>
```

```html
<body>
  
    경고, 주의사항과 같이 중요한 내용물을 강조할 때<br/> 
    <strong>경고, 주의사항과 같이 중요한 내용물을 강조할 때</strong><br/>
    글자를 굵게 표현하고 싶을 때!<br/>
    <b>글자를 굵게 표현하고 싶을 때!</b>
    
</body>
```
![image](https://user-images.githubusercontent.com/84066249/133979765-3cc646f3-5a3f-48da-999c-3d914b87fedc.png)

## 이탤릭체 표현
- 주위 텍스트에 비해서 강조된 부분이나 저자의 생각을 강조할 떄
- 이탤릭체로 표현하고 싶을 때

```html
<!-- 사용 방법-->
<em>글자 내용</em>
    or
<i>글자 내용</i>
```
```html
<body>

    주위 텍스트에 비해서 강조된 부분이나 저자의 생각~강조!<br/> 
    <em>주위 텍스트에 비해서 강조된 부분이나 저자의 생각~강조!</em><br/>
    이탤릭체를 표현하고 싶을때!<br/>    
    <i>이탤릭체를 표현하고 싶을때!</i>
    
</body>
```
![image](https://user-images.githubusercontent.com/84066249/133980276-d7fb9f2c-c1fc-47b6-9a8e-5a243e59efa5.png)

## 인용 표현
- 인용할 문구를 표현
- **따옴표가 같이 나타난다**
- 글자와 같이 나열되어지며 짧은 부분의 인용을 표현할 때 사용**(blockquote 태그는 긴 인용을 표현할 때 사용!)**

```html
<!--사용 방법-->
<q>글자 내용</q>
```
```html
<body>

    인용할 문구를 표현, 따옴표가 나타남! 글자와 같이 나열되어지며 짧은 부분의 인용을 표현할 때 사용!</br/>
    <q>인용할 문구를 표현, 따옴표가 나타남! 글자와 같이 나열되어지며 짧은 부분의 인용을 표현할 때 사용!</q>
    
</body>
```
![image](https://user-images.githubusercontent.com/84066249/133980982-b484a8af-7456-444c-beac-cbfee9babfc1.png)

## 형광팬 효과
- 중요한 부분을 강조할 때 사용
- 형광팬으로 줄을 그은 것처럼 노란 배경색이 나타난다.

```html
<!-->사용 방법<-->
<mark>글자 내용</mark>
```
```html
<body>
    
    중요한 부분을 강조할 때 사용 >> 형광팬으로 줄을 그은 것처럼 노란 배경색이 나타남!<br/>
    <mark>중요한 부분을 강조할 때 사용 >> 형광팬으로 줄을 그은 것처럼 노란 배경색이 나타남!</mark>
    
</body>
```
![image](https://user-images.githubusercontent.com/84066249/133981323-5e1fdb04-bec7-4508-ac7d-365e37e631cd.png)

## 동아시아 글자 표현
- 동아시아 국가들 주석(발음) 내용을 표기하기 위해 사용

```html
<!--사용 방법-->
<ruby> 글자<rp>(</rp><rt>주석(발음) 글자</rt><rp>)</rp>
```
```html
<body>

    <ruby>
           韓國<rp>(</rp><rt>한국</rt><rp>)</rp>
    </ruby>
    
</body>
```
![image](https://user-images.githubusercontent.com/84066249/133985940-73be78e4-7a03-4c71-b42a-c6dd89000db5.png)

## 취소선, 중간선
- 문서에서 삭제된 텍스트나 지워야 할 부분을 강조할 때 사용

```html
<!--사용 방법-->
<del>글자 내용</del>
```
```html
<body>

    문서에서 삭제된 텍스트나 지워야 할 부분 강조<br/>
    <del>문서에서 삭제된 텍스트나 지워야 할 부분 강조</del>
    
</body>
```
![image](https://user-images.githubusercontent.com/84066249/133986316-48041e52-f77a-4cd5-b01c-5c3b952948d4.png)

## 밑줄
- 문서에서 나타난 텍스트에 강조하거나 밑줄 표현시 사용

```html
<!--사용 방법-->
<ins>글자 내용</ins>
```
```html
<body>

    문서에 나타난 텍스트에 강조하거나 밑줄 표현 시 사용!<br/>
    <ins>문서에 나타난 텍스트에 강조하거나 밑줄 표현 시 사용!</ins>
    
</body>
```
![image](https://user-images.githubusercontent.com/84066249/133986594-5290fe66-b448-4b9f-8418-4fd124e9f9c4.png)

## 위첨자, 아래첨자

```html
<!--사용 방법-->
1. 위첨자 : <sup>글자 내용</sup>
2. 아래첨자 : <sub>글자 내용</sub>
```

```html
<body>

    글자의 위로 붙는 <sup>위첨자</sup><br/>
    글자의 아래로 붙는 <sub>아래첨자</sub>
    
</body>
```
![image](https://user-images.githubusercontent.com/84066249/133987022-7a698c53-571d-4df0-b5c2-57a7d1d939e2.png)

