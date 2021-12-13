# 세션(Session)
- 내장 객체로서 브라우저마다 한 개씩 존재하고, 고유한 SessionID 생성 후 정보를 추출한다.
- 세션을 사용하면 클라이언트가 웹 서버의 세션에 의해 가상으로 연결된 상태가 된다.
- 웹 브라우저를 닫기 전까지 웹 페이지를 이동하더라도 사용자의 정보가 웹 서버에 보관되어 있어 사용자 정보를 잃지 않는다.

## 세션의 장단점
- jsp에서만 접근할 수 있기 때문에 보안성이 좋고, 저장 용량의 한계가 거의 없다.
- 서버에 데이터를 저장하므로 서버에 부하가 걸릴 수 있다.

**쿠키보다 세션을 쓰는 것이 안정적이고, 안전하지만 세션에 저장할 공간이 부족할 경우 쿠키가 사용된다.**

## 세션 생성 - setAttribute()
```jsp
void setAttribute(String name, Object value);
---------------------------------------------------------
// 메서드 사용 예
session.setAttribute("mamberId", "admin");
```
- 동일한 세션의 속성 이름으로 세션을 생성하면 마지막에 설정한 것이 세션의 속성 값이 된다. 
- 세션 속성 값은  Object 객체 타입만 가능하기 때문에 int, double, char등의 기본 타입은 사용할 수 없다.

## 세션 정보 - getAttribute(), getAttributeNames()
```jsp
Object getAttribute(String name);
---------------------------------------------------------
// 메서드 사용 예
String id = (String)session.getAttribute("memberId");
```
- getAttribute() 메서드는 반환 유형이 Object 형 이므로 반드시 형 변환을 하여 사용해야 한다.
- 만약 세션에 해당 속성 이름이 존재하지 않을 경우 null을 반환한다.


### 다중 세션 정보 얻기 - getAttribute
- 세션에 저장된 여러 개의 속성 이름에 대한 속성 값을 얻어오려면 getAttributeNames() 메서드를 사용해야 한다.
- getAttributeNames() 메서드는 반환 유형이 Enumeration 객체이므로 모든 세션 정보를 얻어오는 데 유용하다.

```jsp
Enumeration getAttributeNames();
-------------------------------------------------------------
// 메서드 사용 예
Enumeration enum = session.getAttributeNames();

while(enum.hasMoreElement()){
    String name = enum.nextElement().toString();
    String value = session.getAttribute(name).toString();
}
```

## 세션 삭제 - removeAttribute(), invalidate()
- 세션에 저장된 하나의 세션 속성 이름을 삭제하려면 removeAttribute() 메서드를 사용해야 한다. 
```jsp
void removeAttribute(String name);
-------------------------------------------------------------
// 메서드 사용 예
session.removeAttribute("memberId");
```
### 다중 세션 삭제 - invalidate()
- 세션에 저장된 모든 세션 속성 이름을 삭제하려면 invalidate() 메서드를 사용해야 한다.

```jsp
void invalidate();
-------------------------------------------------------------
// 메서드 사용 예
session invalidate();
```

## 세션 유효 시간 설정 - setMaxInactiveInterval()
- 세션 유효 시간은 세션을 유지하기 위한 세션의 일정 시간을 말한다.
- 웹 브라우저에 마지막 접근 시간부터 일정 시간 이내에 다시 웹 브라우저에 접근하지 않으면 자동으로 세션이 종료된다.
- 이러한 세션 유효 시간을 설정하기 위해 session 내장 객체의 setMaxInactiveInterval() 메서드를 사용해야 한다.

```jsp
void setMaxInactiveInterval(int value);
------------------------------------------------------------
// 메서드 사용 예
session.setMaxInactiveInterval(60 * 60);
```
- 매개변수 interval은 세션 유효 시간이다.
- 세션 유효 시간은 기본 값이 1,800초이고 초 단위로 설정한다.
- 만약 세션 유효 시간을 0이나 음수로 설정하면 세션 유효 시간이 없는 상태가 된다.

