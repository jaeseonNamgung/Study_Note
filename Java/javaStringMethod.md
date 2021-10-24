# 자바 스트링 메서드 
- ```length()```
  - 문자열의 길이를 구할 때 사용한다. 
  - ```length``` 는 문자열에 길이에 +1한 값이 반환된다.(문자열의 첫 글자는 0부터 시작이지만 ```length```는 1부터 시작한다.)
```java
String str = "Hong Gil Dong";
int len = str.length(); // length는 공백도 문자열로 취급한다.
System.out.println("문자열 str의 길이 : " + len); // 13
```

- ```indexOf()```
  - 문자열 맨 앞부터 지정한 문자열의 위치를 찾는 메서드이다.
  - 문자열 위치 인덱스가 반환된다.
```java
String str = "Hong Gil Dong";
int res = str.indexOf('o'); 
System.out.println("맨 앞 o의 위치 : " + res); // 1
```

- ```lastIndexOf()```
  - ```indexOf()```와 같은 동작을 하며 ```lastIndexOf()```는 뒤에서 부터 지정 문자열의 위치 인덱스를 반환한다.

```java
String str = "Hong Gil Dong";
int res = str.lastIndexOf('o');
System.out.println("맨 뒤 o의 위치 : " + res); // 10
```

- ```charAt()```
  - 문자열 인덱스 위치에 있는 문자를 반환하는 메서드이다.
  - 반환받을 데이터 타입은 char 타입이여야 한다.
```java
String str = "Hong Gil Dong";
char ch = str.charAt(6);
System.out.println("6번째 위치의 문자:  " + ch); // i
```

- ```substring(start, end)```
  - 문자열을 자르는 메서드이다.
  - ```start``` : 자를 문자열의 시작 부분, 지정한 인덱스 부터 잘린다.
  - ```end``` : 자를 문자열의 끝 부분, 지정한 인덱스 전 까지 잘린다.
  - ```substring()```의 인덱스를 하나만 지정할 경우 지정한 인덱스 부터 문자열에 끝까지 잘린다.
```java
String str = "Hong Gil Dong";
String str2 = str.substring(2, 8);
System.out.println("잘라낸 문자열 : " + str2); // ng Gil

------------------------------------------------------------------------
String str2 = str.substring(6);
System.out.println("잘라낸 문자열 : " + str2); // il Dong
```

- ```split(String regex, int limit(생략 가능))```
  - 특정문자를 기준으로 문자열을 잘라서 배열에 넣어주는 메서드이다.
  
```java
String str = "Hong Gil Dong";
String[] arrStr = str.split(" "); // 공백 문자열을 기준으로 문자열을 자른다.
System.out.println("잘라낸 문자열 : ");
for (int i = 0; i < arrStr.length; i++) {
	System.out.println(arrStr[i]); // 잘라낸 문자열 :
                                  // Hong
                                  // Gil
                                  // Dong
```

- ```trim()```
  - 문장 맨 앞과 맨 뒤에 있는 의미 없는 공백을 제거
  - 문장 안에 있는 공백은 제거해주지 않는다. (하나의 문자열로 판단하기 때문)

```java
String str = "    Hong Gil Dong              ";
String str2 = str.trim();
System.out.println(str2); //Hong Gil Dong(가운데에 공백은 제거해주지 않는다.)
```

- ```equalsIgnoreCase()```
  - 대소문자를 따지지 않고 값을 비교하는 메서드
```java
String i1 = "apple";
		String i2 = "Apple";
		if(i1.equalsIgnoreCase(i2)) {  // 대소문자를 따지지 않고 값을 비교해주는 메서드
			System.out.println("같습니다.");
		}
```
 