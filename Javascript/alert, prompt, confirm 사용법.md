# alert
alert 함수는 메시지가 있는 작은 모달 창이라고 부른다. 즉 arlert 함수를 실행하면 확인 취소 버튼이 있는 창이 뜨게 된다. 

```javascript
alert("값을 입력하세요");  
```
# prompt 
브라우저에서 제공한는 prompt는 두 개의 인수를 받는다. 
```javascript
result = prompt(title, [default]);
```
prompt는 인자를 두 개 받는다 앞에 title은 사용자에게 보여줄 문자열이고 뒤에 있는 [default]는 입력창 안에 보여줄 문자열이다. 

**[]** : default에 감싸는 대괄호는 선택사항이라는 뜻을 지닌다. 

```javascript
result = prompt('숫자를 입력하세요', "1 ~ 100까지 입력");
alert(`당신이 입력한 숫자는 ${result}입니다.`);
```

# confirm

confirm 함수는 질문과 함께 확인 취소 버튼이 있는 모달 창을 보여준다. 

```javascript
result = confirm("당신은 대학생이신가요?");
```


