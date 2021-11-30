# box-sizing 속성 - 박스 너비 기준 정하기
- box-sizing 속성은 콘텐츠 영역의 너비에 패딩과 테두리 크기까지 합쳐서 width 속성을 지정할 수 있다.
```css
box-sizing: content-box | border-box
```
- content-box : width 속성 값을 콘텐츠 영역 너비 값으로 사용한다.(기본 값)
- border-box : width 속성 값을 콘텐츠 영역에 테두리까지 포함한 박스 모델 전체 너비 값으로 사용한다.

# float 속성 - 왼쪽이나 오른쪽으로 배치하기
- float 속성은 '떠 있다' 라는 의미로 외쪽 구석이나 오른쪽 구석에 요소가 배치된다는 뜻이다.
- left : 해당 요소를 왼쪽으로 배치
- right : 해당 요소를 오른쪽으로 배치
- none : 좌우 어느 쪽으로도 배치하지 않는다.

# clear 속성 - float 속성 해제하기 
- float 속성을 이용해 웹 페이지 요소를 왼쪽이나 오른쪽에 배치하면 그 다음에 넣는 다른 요소들에도 똑같은 속성이 전달된다. 따라서 float 속성이 더 이상 유용하지 않다면 clear 속성을 이용해 해제시켜줘야 한다.
- float : left 라면 clear : left를 사용하고 float : right 라면 clear : right를 사용하면 되고 left, right 상관없이 무조건 기본값으로 되돌리고 싶다면 clear : both 속성을 사용하면 된다.

# position 속성 - 배치 방법 지정하기 
- position 속성은 웹 문서 안의 요소들을 자유자재로 배치해 주는 속성으로 THML과 CSS를 이용해 웹 문서를 만들 때 중요하게 사용하는 속성 중 하나이다.
```css
position : static | relative | absolute | fixed
```
- static : 요소를 문서의 흐름에 맞추어 배치, 요소를 나열한 순서대로 배치
- relative : 이전 요소에 자연스럽게 연결해 배치하되(요소를 나열한 순서대로 배치) 위치를 지정
- absolute : 원하는 위치에 지정해 배치
- fixed : 지정한 위치에 고정해 배치, 화면에서 요소가 잘릴 수도 있다.

# visibility 속성 - 요소를 보이게 하거나 보이지 않게 하기
- visibility 속성은 특정 요소를 보이게 하거나 보이지 않게 또는 겹치게 설정하는 속성이다.
```css
visibility : visible | hidden | collapse
```
- visible : 화면에 요소를 표시 (기본 값)
- hidden : 화면에서 요소를 감춘다. **하지만 크기는 그대로 유지하기 때문에 배치에 영향을 미친다.**
- collapse : 표의 행, 열 , 행 그룹, 열 그룹 등에서 지정하면 서로 겹치도록 조절한다. 그 외의 영역에서 사용하면 'hidden' 처럼 처리한다. 

# z-index 속성 - 요소 쌓는 순서 정하기 
- 요소 위에 요소를 쌓을 때 쌓는 순서를 지정하기 위해서 z-index 속성을 사용한다.
- z-index는 값이 작을수록 아래에 쌓이고 z-index 값이 클수록 위에 쌓인다.
```css
z-index : 인덱스 값
```