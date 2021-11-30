# background-image 속성 - 웹 요소에 배경 이미지 넣기
```css
background-image : url('이미지 경로');
```
# background-repeat 속성 - 배경 이미지 반복 방법 지정하기
```css
background-repeat : repeat | repeat-x | repeat-y | no-repeat
```
- repeat :  브라우저 화면에 가득 찰 때까지 배경 이미지를 가로와 세로로 반복
- repeat-x : 브라우저 창 너비와 같아질 때까지 배경 이미지를 가로로 반복
- repeat-y : 브라우저 창 높이와 같아질 때까지 배경 이미지를 세로로 반복
- no-repeat : 배경 이미지를 한 번만 표시하고 반복하지 않는다.

# background-clip 속성 - 배경 적용 범위 조절하기
```css
background-clip : border-box|padding-box|content-box
```
- border-box : 박스 모델의 가장 외곽인 테두리(border)가지 적용한다.
- padding-box : 박스 모델에서 테두리를 뺀 패딩(padding) 범위까지 적용한다.
- content-box : 박스 모델에서 내용 부분에만 적용한다.

# background-size 속성 - 배경 이미지 크기 조절하기
```css
background-size : auto | contain | cover | <크기값> | <백분율>
```
- auto : 원래 배경 이미지 크기만큼 표시
- contain : 요소 안에 배경 이미지가 다 들어오도록 이미지를 확대/축소
- cover : 배경 이미지로 요소를 모두 덮도록 이미지를 확대/축소

# background-position 속성 - 배경 이미지 위치 조절하기
```css
background-position : <수평위치><수직위치>;
수평위치 : left | center | | right | <백분율> | <길이 값>
수직위치 : top | center | bottom | <백분율> | <길이 값>
```
# background-origin 속성 - 배경 이미지 배치할 기준 조절하기 
- background-position 속성을 이용해 배경 이미지를 배치할 때 기준이 필요하다. 이렇게 배경 이미지를 배치할 기준은 background-origin 속성으로 지정한다.
```css
background-origin : border-box | padding-box | content-box
```
- border-box : 박스 모델의 가장 외곽인 테두리(border)가 기준이 된다.
- padding-box : 박스 모델에서 테두리를 뺀 패딩(padding)이 기준이 된다.
- content-box : 박스 모델에서 내용 부분이 기준이 된다.

