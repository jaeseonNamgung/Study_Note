# caption-side 속성 - 표 제목 위치 정하기
```css
caption-side : top | bottom
```
- top : 캡션을 표의 윗부분에 표시 (기본 값)
- bottom : 캡션을 표의 아랫부분을 표시

# border-collapse 속성 - 테두리 통합 분리하기
```css
border-collapse : collapse | separate
```
- collapse : 테두리를 하나로 합쳐 표시
- separate : 테두리를 따로 표시 (기본 값)

# border-spacing 속성 - 인접한 셀 테두리 사이 거리 지정하기
- border-spacing 속성은 border-collapse: separate를 사용해 셀들을 분리했을 경우, 인접한 셀 테두리 사이의 거리를 지정한다.
```css
border-spacing : <크기>
border-spacing : <크기> <크기> // 수평 수직
```
- 크기 : px이나 em 등 크기와 단위를 직접 지정

# empty-cells 속성 - 빈 셀의 표시 여부 지정하기
- border-collapse : separate를 사용해 셀들을 분리했을 경우, empty-cells 속성을 사용해 내용이 없는 빈 셀들의 표시 여부를 지정한다.

```css
empty-cells : show | hide
```
- show : 빈 셀 주위에 테두리를 그려 빈 셀을 표시한다. (기본 값)
- hide : 빈 셀에 테두리를 그리지 않고 비워둔다.

# table-layout 속성 - 콘텐츠에 맞게 셀 너비 지정하기
```css
table-layout : fixed | auto
```
- fixed : 셀 너비를 고정, 즉 셀 내용에 따라 셀의 너비가 달라지지 않는다.
- auto : 셀 내용에 따라 셀의 너비가 달라진다. (기본 값)

table-layout : fixed로 설정해 너비를 고정하면 셀 너비보다 긴 내용은 셀 밖으로 밀려나간다. 각 셀의 너비를 고정한 상태에서 셀 너비 안에 셀 내용을 표시하려면 ```word-break : break-all``` 속성을 추가해야 한다. 또한 예상하지 못했던 셀의 줄 바뀜이 생기면 높이 값(height)도 예츨하기 쉽지 않기 때문에 셀의 height 속성도 auto로 지정해야 한다.

# text-align 속성 - 셀 안에서 수평 정렬하기
```css
text-align : left | right | center
```

# verticla-align 속성 - 셀 안에서 수직 정렬하기
```css
vertical-align : baseline | top | bottom | middle | sub | super | text-top | text-bottom | <길이 값> | <백분율 값>
```
- baseline : 인라인 요소의 기준선을 부모 요소의 기준선(baseline)에 맞춘다.
- sub : 인라인 요소의 기준선을 부모 요소의 아래 첨자 위치에 맞춘다.
- super : 인라인 요소의 기준선을 부모 요소의 위 첨자 위치에 맞춘다.
- top : 인라인 요소의 윗부분을 무모 요소의 윗부분에 맞춘다.
- middle : 인라인 요소의 중앙 부분을 부모 요소의 기준선에서 x-높이(소문자 x의 높이 값)의 반만큼 올려서 맞춘다.
- bottom : 인라인 요소의 아랫부분을 부보 요소의 아랫부분에 맞춘다.
- text-top : 인라인 요소의 윗부분을 부모 요소 글꼴의 윗부분에 맞춘다.
- text-bottom : 인라인 요소의 아랫부분을 부모 요소 글꼴의 아랫부분에 맞춘다.
- <길이 값> : 기준선을 0px로 생각하고 길이 값이 양수면 기준선 위로 음수면 기준선 아래로 지정한 크기만큼 옮긴다.
- <백분율 값> : 기준선을 0%로 생각하고 line-height의 몇 %에 따라 양수면 위로, 음수면 아래로 옮긴다.

## 표의 셀에서 사용할 경우 
- baseline : 셀의 기준선에 내용의 기준선을 맞춘다.
- top : 패딩의 위쪽 가장자리에 내용의 윗부분을 맞춘다.
- middle : 패딩 박스의 중앙에 내용을 맞춘다.
- bottom : 패딩의 아래쪽 가장자리에 내용의 아랫부분을 맞춘다.